package leetcode;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author <a href="mailto:csandiga@uolinc.com">Makoto Sandiga</a>
 * @since 2017-07-28
 */
public class ReplaceWords {


    public static String execute(List<String> dict, String sentence) {
        SuffixTree suffixTree = new SuffixTree();
        suffixTree.build(dict);

        StringBuilder result = new StringBuilder();

        for (String word : sentence.split(" ")) {
            String successor = suffixTree.find(word);
            if ("".equals(successor)) {
                result.append(word).append(" ");
            } else {
                result.append(successor).append(" ");
            }
        }
        return result.toString().trim();
    }

    static class SuffixTree {

        TreeNode root = new TreeNode();

        private void build(List<String> sentence) {
            for (String word : sentence) {
                build(word);
            }
        }

        public String find(String word) {

            StringBuilder result = new StringBuilder();

            Map<Character, TreeNode> children = root.children;

            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);

                if (!children.containsKey(c)) {
                    return "";
                }
                result.append(c);

                TreeNode treeNode = children.get(c);

                if (treeNode.isword) {
                    return result.toString();
                }
                children = treeNode.children;
            }
            return "";
        }

        private void build(String word) {
            Map<Character, TreeNode> children = root.children;

            for (int i = 0; i < word.length(); i++) {

                char c = word.charAt(i);
                TreeNode node = children.get(c);

                if (node == null) {
                    node = new TreeNode(c);
                    children.put(c, node);
                }

                if(node.isword){
                    break;
                }
                if (i == word.length() - 1) {
                    node.isword = true;
                }

                children = node.children;
            }
        }

    }

    static class TreeNode {
        Map<Character, TreeNode> children = new HashMap<>();
        char c;
        boolean isword;

        public TreeNode() {
        }

        public TreeNode(char c) {
            this.c = c;
        }
    }
}
