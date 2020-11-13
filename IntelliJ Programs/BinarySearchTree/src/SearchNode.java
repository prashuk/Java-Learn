public class SearchNode {
    class Node {
        int val;
        InsertNode.Node left, right;

        public Node(int item) {
            val = item;
            left = right = null;
        }
    }

    Node searchNode(Node root, int key) {
        if(root == null) return root;
        if(root.val == key) return root;
        if(key > root.val) {
            return searchNode(root.right, key);
        } else if (key < root.val) {
            return searchNode(root.left, key);
        }
        return root;
    }
}
