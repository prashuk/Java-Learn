public class DeleteNode {
    class Node {
        int val;
        Node left, right;

        public Node(int item) {
            val = item;
            left = right = null;
        }
    }

    public static void main(String[] args) {

    }

    Node deleteRec(Node root, int key) {
        if(root == null) return null;

        if(key < root.val) {
            root.left = deleteRec(root.left, key);
        } else if (key > root.val) {
            root.right = deleteRec(root.right, key);
        } else {
            if(root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            } else {
                root.val = minValue(root.right);
                root.right = deleteRec(root.right, root.val);
            }
        }
        return root;
    }

    int minValue(Node root) {
        int min = root.val;
        while (root.left != null) {
            min = root.left.val;
            root = root.left;
        }
        return min;
    }
}
