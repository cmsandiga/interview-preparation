package hackerrank;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by makoto on 09/07/17.
 */
public class TrieContact {

    private TrieNode root;

    public TrieContact() {
        this.root = new TrieNode();
    }

    public void add(String word) {
        HashMap<Character, TrieNode> children = root.children;

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);

            TrieNode t;

            if (children.containsKey(c)) {
                t = children.get(c);
            } else {
                t = new TrieNode(c);
                children.put(c, t);
            }
            children = t.children;

            if (i == word.length() - 1) {
                t.isCompletedWord = true;
            }
        }
    }

    public TrieNode find(String sufix) {
        HashMap<Character, TrieNode> children = root.children;

        TrieNode t = null;
        for (int i = 0; i < sufix.length(); i++) {
            char c = sufix.charAt(i);

            if (children.containsKey(c)) {
                t = children.get(c);
                children = t.children;
            } else {
                return null;
            }
        }
        return t;
    }

    public int countSearch(String suffix){
        TrieNode trieNode = find(suffix);

        if(trieNode == null){
            return 0;
        }

        return count(trieNode) ;
    }

    public int count(TrieNode node){
        if(node == null){
            return 0;
        }

        int count = 0;
        if(node.isCompletedWord){
            count++;
        }

        for (Map.Entry<Character, TrieNode> entry: node.children.entrySet()) {
            count += count(entry.getValue());
        }

        return count;
    }

    public TrieNode getRoot() {
        return root;
    }

    static class TrieNode {
        Character c;
        HashMap<Character, TrieNode> children = new HashMap<>();
        boolean isCompletedWord;

        public TrieNode() {

        }

        public TrieNode(Character c) {
            this.c = c;
        }
    }
}


