class BinaryTree {
    
    Node root;
    
    //******************************Add a Node**************************//
    //O(height)
    public void addNode(int key) {
        Node new_node = new Node(key);

        if(root == null) {
            root = new_node;
            return;
        }

        Node focusNode = root;
        Node  ;
        while (true) {
            parent = focusNode;
            if(key < focusNode.key) {
                focusNode = focusNode.left;
                if(focusNode == null) {
                    parent.left = new_node;
                    return;
                }
            } else {
                focusNode = focusNode.right;
                if(focusNode == null) {
                    parent.right = new_node;
                    return;
                }
            }
        }
    }

    //******************************In Order Traversal**************************//
    public void inOrderTraversal(Node focusNode) {
        if(focusNode != null) {
            inOrderTraversal(focusNode.left);
            System.out.print(focusNode.key + " ");
            inOrderTraversal(focusNode.right);
        }
    }

    //******************************Pre Order Traversal**************************//
    public void preOrderTraversal(Node focusNode) {
        if(focusNode != null) {
            System.out.print(focusNode.key + " ");
            preOrderTraversal(focusNode.left);
            preOrderTraversal(focusNode.right);
        }
    }

    //******************************Post Order Traversal**************************//
    public void postOrderTraversal(Node focusNode) {
        if(focusNode != null) {
            postOrderTraversal(focusNode.left);
            postOrderTraversal(focusNode.right);
            System.out.print(focusNode.key + " ");
        }
    }

    //******************************Find a Node**************************//
    //O(height)
    public boolean findNode(int key) {
        Node focusNode = root;
        
        while(focusNode.key != key) {
            if(key < focusNode.key) {
                focusNode = focusNode.left;
            } else {
                focusNode = focusNode.right;
            }
            if(focusNode == null) {
                return false;
            }
        }
        return true;
    }

    //******************************Delete a Node**************************//
    //O(height)
    public void deleteNode(int key) { 
        root = deleteRec(root, key); 
    } 
  
    public Node deleteRec(Node root, int key) { 
        if (root == null) {
            return root; 
        }

        if (key < root.key) {
            root.left = deleteRec(root.left, key);
        } else if (key > root.key) {
            root.right = deleteRec(root.right, key); 
        } else { 
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            root.key = minValue(root.right); 
            root.right = deleteRec(root.right, root.key); 
        } 
        return root; 
    } 
  
    public int minValue(Node root) 
    { 
        int minv = root.key; 
        while (root.left != null) 
        { 
            minv = root.left.key; 
            root = root.left; 
        } 
        return minv; 
    }

    //******************************Level Order Traversal**************************//
    public void levelOrderTraveral() {
        int h = heightOfTree(root);
        for(int i = 1; i <= h; i++) {
            printGivenLevel(root, i);
        }
    }

    private int heightOfTree(Node root) {
        if(root == null) {
            return 0;
        }
        int lheight = heightOfTree(root.left);
        int rheight = heightOfTree(root.right);

        if(lheight > rheight) {
            return lheight+1;
        } else {
            return rheight+1;
        }
    }

    private void printGivenLevel(Node root, int level) {
        if (root == null) {
            return;
        }
        else if (level == 1) {
            System.out.print(root.key + " ");
        } else if (level > 1) {
            printGivenLevel(root.left, level-1); 
            printGivenLevel(root.right, level-1); 
        }
    }

    public void traverseLevelOrder() {
        if (root == null) {
            return;
        }
     
        Queue<Node> nodes = new LinkedList<>();
        nodes.add(root);
     
        while (!nodes.isEmpty()) {
     
            Node node = nodes.remove();
     
            System.out.print(" " + node.value);
     
            if (node.left != null) {
                nodes.add(node.left);
            }
     
            if (node.right!= null) {
                nodes.add(node.right);
            }
        }
    }

    public void mirrorBT() {
        root = wrapperMirrorBT(root);
    }
    public Node wrapperMirrorBT(Node root) {
        if (root == null) {
            return null;
        }

        Node left = wrapperMirrorBT(root.left);
        Node right = wrapperMirrorBT(root.right);

        root.left = right;
        root.right = left;

        return root;
    }

    public boolean isBST() {
        return wrapperIsBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public boolean wrapperIsBST(Node node, int min, int max) {
        if (node == null) {
            return true;
        }

        if (node.key < min || node.key > max) {
            return false;
        }

        return wrapperIsBST(node.left, min, node.key-1) && wrapperIsBST(node.right, node.key-1, max);
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.addNode(4);
        tree.addNode(2);
        tree.addNode(6);
        tree.addNode(1);
        tree.addNode(3);
        tree.addNode(5);
        tree.addNode(7);

        tree.inOrderTraversal(tree.root);
        System.out.print("\n");
        tree.preOrderTraversal(tree.root);
        System.out.print("\n");
        tree.postOrderTraversal(tree.root);
        System.out.print("\n");

        if(tree.findNode(0)) {
            System.out.print("Found");
            System.out.print("\n");
        } else {
            System.out.print("Not Found");
            System.out.print("\n");
        }

        //tree.deleteNode(4);
        tree.inOrderTraversal(tree.root);
        System.out.print("\n");

        tree.levelOrderTraveral();
    }
}

class Node {
    int key;
    Node right;
    Node left;

    Node(int d) {
        this.key = d;
    }
}