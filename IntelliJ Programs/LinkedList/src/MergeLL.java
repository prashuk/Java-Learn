import java.util.*;

class MergeLL {
    static class Node {
        int data;
        Node next;
    }

    static Node newNode(int key) {
        Node temp = new Node();
        temp.data = key;
        temp.next = null;
        return temp;
    }

    static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    static Node merge(Node n1, Node n2) {
        if(n1 == null)
            return n2;

        if(n2 == null)
            return n1;

        if(n1.data <= n2.data) {
            n1.next = merge(n1.next, n2);
            return n1;
        } else {
            n2.next = merge(n1, n2.next);
            return n2;
        }
    }

    static Node mergeItrCopy(Node n1, Node n2) {
        if(n1 == null)
            return n2;

        if(n2 == null)
            return n1;

        Node merged = new Node();
        Node head  = merged;

        while (n1 != null || n2 != null) {
            if (n1 == null) {
                merged.next = n2;
                n2 = n2.next;
            } else if (n2 == null) {
                merged.next = n1;
                n1 = n1.next;
            } else {
                if (n1.data <= n2.data) {
                    merged.next = n1;
                    n1 = n1.next;
                } else {
                    merged.next = n2;
                    n2 = n2.next;
                }
            }
            merged = merged.next;
        }

        return head.next;
    }

    static Node mergeItrInplace(Node n1, Node n2) {
        return newNode(1);
    }

    static Node mergeUtil(Node n1, Node n2) {
        if(n1 == null)
            return n2;

        if(n2 == null)
            return n1;

        if(n1.data < n2.data) {
            return mergeItrInplace(n1, n2);
        } else {
            return mergeItrInplace(n2, n1);
        }
    }

    public static void main(String[] args) {
        Node head1 = newNode(1);
        head1.next = newNode(2);
        head1.next.next = newNode(3);

        Node head2 = newNode(2);
        head2.next = newNode(5);
        head2.next.next = newNode(7);
        head2.next.next.next = newNode(9);

        Node merged = mergeItrCopy(head1, head2);

        printList(merged);

    }
}