import com.sun.source.tree.Tree;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinaryTree2 {
    TreeNode root;

    BinaryTree2() {
        this.root = null;
    }

    public static void main(String[] args) {
        BinaryTree2 tree = new BinaryTree2();
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
        System.out.println();
        tree.levelOrder(tree.root);
        System.out.println();
        tree.verticalOrder(tree.root);
        System.out.println();
        tree.topView(tree.root);
        System.out.println();
        tree.leftView(tree.root);
        System.out.println();
        tree.bottomView(tree.root);
        System.out.println();
        tree.rightView(tree.root);
    }

    void inOrder(TreeNode node) { // LVR
        if (node == null) {
            return;
        }

        Stack<TreeNode> s = new Stack<>();
        TreeNode curr = node;

        while (curr != null || s.size() > 0) {
            while (curr != null) {
                s.push(curr);
                curr = curr.left;
            }

            curr = s.pop();
            System.out.print(curr.val + " ");

            curr = curr.right;
        }
    }

    void preOrder(TreeNode node) { // VLR
        if (node == null) {
            return;
        }

        Stack<TreeNode> s = new Stack<>();
        s.push(root);

        while (!s.isEmpty()) {
            TreeNode temp = s.pop();
            System.out.print(temp.val + " ");

            if (temp.right != null)
                s.push(temp.right);

            if (temp.left != null)
                s.push(temp.left);
        }
    }

    void postOrder(TreeNode node) { // LRV
        if (node == null) {
            return;
        }

        Stack<TreeNode> s1 = new Stack<>();
        Stack<TreeNode> s2 = new Stack<>();

        s1.push(node);

        while(!s1.isEmpty()) {
            node = s1.pop();
            s2.push(node);
            if (node.left != null)
                s1.push(node.left);
            if (node.right != null)
                s1.push(node.right);
        }

        while(!s2.isEmpty()) {
            node = s2.pop();
            System.out.print(node.val + " ");
        }
    }

    void levelOrder(TreeNode node) {

    }

    void verticalOrder(TreeNode node) {

    }

    void topView(TreeNode node) {
        class QueueObj {
            TreeNode node;
            int hd;

            QueueObj(TreeNode node, int hd) {
                this.node = node;
                this.hd = hd;
            }
        }

        Queue<QueueObj> q = new LinkedList<>();
        HashMap<Integer, TreeNode> m = new HashMap<>();

        if (node == null) {
            return;
        }

        q.add(new QueueObj(node, 0));

        while(!q.isEmpty()) {
            QueueObj temp = q.poll();
            if(!m.containsKey(temp.hd)) {
                m.put(temp.hd, temp.node);
            }

            if(temp.node.left != null) {
                q.add(new QueueObj(temp.node.left, temp.hd - 1));
            }

            if(temp.node.right != null) {
                q.add(new QueueObj(temp.node.right, temp.hd + 1));
            }
        }

        for(int i : m.keySet()) {
            System.out.print(m.get(i).val + " ");
        }
    }

    void leftView(TreeNode node) {

    }

    void bottomView(TreeNode node) {

    }

    void rightView(TreeNode node) {

    }
}
