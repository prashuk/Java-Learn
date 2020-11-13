public class InsertNode {
    class Node {
        int val;
        Node left, right;

        public Node(int item) {
            val = item;
            left = right = null;
        }
    }

    Node insertNode(Node root, int key) {
        if(root == null) return new Node(key);

        if(key < root.val) {
            root.left = insertNode(root.left, key);
        } else if(key > root.val) {
            root.right = insertNode(root.right, key);
        }
        return root;
    }
}
