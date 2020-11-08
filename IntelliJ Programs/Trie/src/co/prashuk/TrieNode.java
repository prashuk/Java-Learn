package co.prashuk;

import java.util.HashMap;
import java.util.Map;

public class TrieNode {

    private class Trie {
        Map<Character, Trie> children;
        boolean endOfWord;

        public Trie() {
            children = new HashMap<>();
            endOfWord = false;
        }
    }

    Trie root = new Trie();

    public void insert(String word) {
        Trie current = root;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            Trie node = current.children.get(ch);
            if (node == null) {
                node = new Trie();
                current.children.put(ch, node);
            }
        }
        current.endOfWord = true;
    }

    public void insertRecursive(String word) {
        insertRecursive(root, word, 0);
    }

    private void insertRecursive(Trie current, String word, int index) {
        if (index == word.length()) {
            current.endOfWord = true;
            return;
        }

        char ch = word.charAt(index);
        Trie node = current.children.get(ch);

        if (node == null) {
            node = new Trie();
            current.children.put(ch, node);
        }
        insertRecursive(current, word, index+1);
    }

    public boolean search(String word) {
        Trie current = root;
        for(int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            Trie node = current.children.get(ch);
            if (node == null) {
                return false;
            }
            current = node;
        }
        return current.endOfWord;
    }

    public boolean searchRecursive(String word) {
        return searchRecursive(root, word, 0);
    }

    private boolean searchRecursive(Trie current, String word, int index) {
        if(index == word.length()) {
            return current.endOfWord;
        }

        char ch = word.charAt(index);
        Trie node = current.children.get(ch);
        if(node == null) {
            return false;
        }
        return searchRecursive(current, word, index+1);
    }

    public boolean delete(String word) {
        return delete(root, word, 0);
    }

    private boolean delete(Trie current, String word, int index) {
        if(index == word.length()) {
            if(!current.endOfWord) {
                return false;
            }
            current.endOfWord = false;
            return current.children.size() == 0;
        }
        char ch = word.charAt(index);
        Trie node = current.children.get(index);
        boolean shouldDeleteCuurentNode = delete(node, word, index+1);

        if (shouldDeleteCuurentNode) {
            current.children.remove(ch);
            return current.children.size() == 0;
        }
        return false;
    }

    public void display(TrieNode root) {
        
    }
}
