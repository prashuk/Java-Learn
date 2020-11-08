import com.sun.source.tree.Tree;

import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    public static void main(String[] args) {
        TreeNode tree = new TreeNode(1);
        tree.left = new TreeNode(2);
        tree.right = new TreeNode(3);
        tree.left.left = new TreeNode(4);
        tree.left.right = new TreeNode(5);

        BFSTraversal(tree);
    }

    public static void BFSTraversal(TreeNode root) {
        TreeNode curr = root;
        Queue<TreeNode> q = new LinkedList<>();

        q.add(root);

        while (!q.isEmpty()) {
            TreeNode n = q.poll();
            System.out.print(n.val + " ");
            if(n.left != null) q.add(n.left);
            if(n.right != null) q.add(n.right);
        }
    }
}

class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
        left = right = null;
    }
}