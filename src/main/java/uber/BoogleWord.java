package uber;

import java.util.*;

public class BoogleWord {

    public static List<String> findWordBruteForce(String[] dict, String[][] boogle) {

        Set<String> dicSet = new HashSet<>(Arrays.asList(dict));

        List<String> result = new ArrayList<>();

        for (int i = 0; i < boogle.length; i++) {
            for (int j = 0; j < boogle[i].length; j++) {
                findWordBruteForce(
                        i, //
                        j, //
                        dicSet, //
                        boogle, //
                        new boolean[boogle.length][boogle[i].length], //
                        result,
                        new StringBuilder());
            }
        }

        return result;
    }

    private static void findWordBruteForce(int i,
                                           int j,
                                           Set<String> dicSet,
                                           String[][] boogle,
                                           boolean[][] visited,
                                           List<String> result,
                                           StringBuilder sb) {


        if (i < 0 || j < 0 || i >= boogle.length || j >= boogle[i].length) {
            return;
        }

        if (visited[i][j]) {
            return;
        }

        visited[i][j] = true;

        sb.append(boogle[i][j]);
        if (dicSet.contains(sb.toString())) {
            result.add(sb.toString());
        }

        findWordBruteForce(i, j + 1, dicSet, boogle, visited, result, sb); // right
        findWordBruteForce(i + 1, j + 1, dicSet, boogle, visited, result, sb); // right left
        findWordBruteForce(i + 1, j, dicSet, boogle, visited, result, sb); // down
        findWordBruteForce(i + 1, j - 1, dicSet, boogle, visited, result, sb); // down left
        findWordBruteForce(i, j - 1, dicSet, boogle, visited, result, sb); // left
        findWordBruteForce(i - 1, j - 1, dicSet, boogle, visited, result, sb); // up left
        findWordBruteForce(i - 1, j, dicSet, boogle, visited, result, sb); // up
        findWordBruteForce(i - 1, j + 1, dicSet, boogle, visited, result, sb); // up right
        sb.delete(sb.length() - 1, sb.length());
        visited[i][j] = false;
    }

    public static List<String> findWordOptimal(String[] dict, char[][] boogle) {

        SuffixTree suffixTree = new SuffixTree(dict);
        List<String> result = new ArrayList<>();

        for (int i = 0; i < boogle.length; i++) {
            for (int j = 0; j < boogle[i].length; j++) {
                findWordOptimalRecursion(i, j, suffixTree.root, boogle, result, new StringBuilder());
            }
        }
        return result;
    }

    private static void findWordOptimalRecursion(int i,
                                                 int j,
                                                 TreeNode treeNode,
                                                 char[][] boogle,
                                                 List<String> result,
                                                 StringBuilder word) {

        if (i < 0 || j < 0 || i >= boogle.length || j >= boogle[i].length) {
            return;
        }

        word.append(boogle[i][j]);

        if (treeNode.map.containsKey(boogle[i][j])) {

            TreeNode iter = treeNode.map.get(boogle[i][j]);

            if (iter.isWord) {
                result.add(word.toString());
            }

            findWordOptimalRecursion(i, j + 1, iter, boogle, result, word); // right
            findWordOptimalRecursion(i + 1, j + 1, iter, boogle, result, word); // right left
            findWordOptimalRecursion(i + 1, j, iter, boogle, result, word); // down
            findWordOptimalRecursion(i + 1, j - 1, iter, boogle, result, word); // down left
            findWordOptimalRecursion(i, j - 1, iter, boogle, result, word); // left
            findWordOptimalRecursion(i - 1, j - 1, iter, boogle, result, word); // up left
            findWordOptimalRecursion(i - 1, j, iter, boogle, result, word); // up
            findWordOptimalRecursion(i - 1, j + 1, iter, boogle, result, word); // up right
        }
        word.delete(word.length() - 1, word.length());
    }

    public static class SuffixTree {
        TreeNode root;

        SuffixTree(String[] dict) {
            root = new TreeNode();
            build(dict);
        }

        private void build(String[] dict) {
            for (String word : dict) {
                build(word);
            }
        }

        private void build(String word) {
            TreeNode iter = root;

            int i = 0;
            for (char c : word.toCharArray()) {

                TreeNode treeNode = iter.map.get(c);

                if (treeNode == null) {
                    treeNode = new TreeNode();
                }

                if (i == word.length() - 1) {
                    treeNode.isWord = true;
                }

                iter.map.put(c, treeNode);
                iter = treeNode;
                i++;
            }
        }

    }

    public static class TreeNode {
        Map<Character, TreeNode> map = new HashMap<>();
        boolean isWord;
    }


}

