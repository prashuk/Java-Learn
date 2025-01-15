public class BinaryTree {
    TreeNode root;

    BinaryTree() {
        this.root = null;
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(3);
        tree.root.left.left = new TreeNode(4);
        tree.root.left.right = new TreeNode(5);

        tree.preOrder(tree.root);
        System.out.println();
        tree.inOrder(tree.root);
        System.out.println();
        tree.postOrder(tree.root);
    }

    void inOrder(TreeNode node) { // LVR
        if (node == null) return;

        inOrder(node.left);
        System.out.print(node.val + " ");
        inOrder(node.right);
    }

    void preOrder(TreeNode node) { // VLR
        if (node == null) return;

        System.out.print(node.val + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    void postOrder(TreeNode node) { // LRV
        if (node == null) return;

        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.val + " ");
    }

}

class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
        this.left = this.right = null;
    }
}