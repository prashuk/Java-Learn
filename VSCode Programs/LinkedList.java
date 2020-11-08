import java.util.HashSet;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Arrays;

class LinkedList 
{ 
    Node head;

    /****************************** PRINTING LIST ******************************/
    public void wrapperPrintList(Node head) {
        Node focusNode = head;
        while(focusNode != null) {
            System.out.print(focusNode.data + " ");
            focusNode = focusNode.next;
        }
    }
    public void printList() {
        if(!detectLoop2()) {
            wrapperPrintList(head);
        } else {
            System.out.print("List has loop");
        }
    }

    /****************************** INSERT AT FIRST ******************************/
    public void insertAtFirst(int key) {
        Node new_node = new Node(key);
        new_node.next = head;
        head = new_node;
    }

    /****************************** INSERT AT POSITION ******************************/
    public void insertAtPosition(int key, Node previousNode) {
        Node new_node = new Node(key);

        if(previousNode == null) {
            return;
        }

        new_node.next = previousNode.next;
        previousNode.next = new_node;
    }

    /****************************** INSERT AT LAST ******************************/
    public void insertAtLast(int key) {
        Node new_node = new Node(key);

        if(head == null) {
            head = new_node;
            return;
        }

        Node focusNode = head;
        while(focusNode.next != null) {
            focusNode = focusNode.next;
        }
        focusNode.next = new_node;
        new_node.next = null;
    }

    /****************************** DELETE BY KEY ******************************/
    public void deleteByKey(int key) {
        Node focusNode = head;
        Node prev = null;

        if (focusNode.data == key && head != null) {
            focusNode.next = head;
            return;
        }

        while(focusNode.data != key && focusNode != null) {
            prev = focusNode;
            focusNode = focusNode.next;
        }

        if (focusNode == null) {
            return;
        }

        prev.next = focusNode.next;
    }

    /****************************** DELETE BY POSITION ******************************/
    public void deleteByPosition(int pos) {
        if (pos == 0) {
            head = head.next;
            return;
        }

        Node focusNode = head;
        for(int i = 0; focusNode != null && i < pos-1; i++) {
            focusNode = focusNode.next;
        }

        if (focusNode == null || focusNode.next == null) {
            return;
        }

        focusNode.next = focusNode.next.next;
    }

    /****************************** DELETE LIST ******************************/
    public void deleteList() {
        head = null;
    }

    /****************************** LIST SIZE ITER ******************************/
    public int sizeOfLLIter() {
        int count = 0;
        Node focusNode = head;

        if (head == null) {
            return 0;
        }

        while (focusNode != null) {
            focusNode = focusNode.next;
            count++;
        }
        return count;
    } 

    /****************************** LIST SIZE REC ******************************/
    public int wrapperSizeOfLLRec(Node node) {
        if (node == null) {
            return 0;
        }
        return 1 + wrapperSizeOfLLRec(node.next);
    }
    public int sizeOfLLRec() {
        return wrapperSizeOfLLRec(head);
    }

    /****************************** FIND ELEMENT ITER ******************************/
    public boolean findElementIter(int key) {
        Node focusNode = head;

        while(focusNode != null) {
            if(focusNode.data == key) {
                return true;
            }
            focusNode = focusNode.next;
        }
        return false;
    }

    /****************************** FIND ELEMENT REC ******************************/
    public boolean wrapperFindElementRec(Node node, int key) {
        if(node == null) {
            return false;
        }
        
        if (node.data == key) {
            return true;
        }

        return wrapperFindElementRec(node.next, key);
    } 
    public boolean findElementRec(int key) {
        return wrapperFindElementRec(head, key);
    }

    /****************************** GET NTH ELEMENT FROM STARTING ITER ******************************/
    public int getNthNodeFromStartingIter(int index) {
        Node focusNode = head;
        int count = 0;

        while (focusNode != null) {
            if (count == index) {
                return focusNode.data;
            }
            count++;
            focusNode = focusNode.next;
        }
        return -1;
    }

    /****************************** GET NTH ELEMENT FROM STARTING REC ******************************/
    public int wrapperGetNthNodeFromStartingRec(Node node, int index) {
        if (index == 0) {
            return node.data;
        }

        if (node == null) {
            return -1;
        }

        return wrapperGetNthNodeFromStartingRec(node.next, index - 1);
    }
    public int getNthNodeFromStartingRec(int index) {
        return wrapperGetNthNodeFromStartingRec(head, index);
    }

    /****************************** PRINT MIDDLE ******************************/
    public int middleElement() {
        Node slow = head;
        Node fast = head;
        if (slow == null) {
            return -1;
        }
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow.data;
    }

    /****************************** DETECTING IF A LOOP IS THERER ******************************/
    public boolean detectLoop1() {
        HashSet<Node> s = new HashSet<>();
        Node focusNode = head;

        if (focusNode == null) {
            return true;
        }

        while (focusNode != null) {
            if (s.contains(focusNode)) {
                return true;
            }
            s.add(focusNode);
            focusNode = focusNode.next;
        }
        return false;
    }
    public boolean detectLoop2() { // Floyd’s Cycle-Finding
        Node slow = head;
        Node fast = head;

        if (slow == null) {
            return true;
        }

        while (fast != null && fast.next != null && slow != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) {
                return true;
            }
        }
        return false;
    }

    /****************************** PRINT START OF CIRCULAR ******************************/
    public void intersect() {
        if (detectLoop2()) {
            HashSet<Node> s = new HashSet<Node>();
            Node focusNode = head;

            while (focusNode != null) {
                if (s.contains(focusNode)) {
                    System.out.print(focusNode.data);
                    return;
                }
                s.add(focusNode);
                focusNode = focusNode.next;
            }
        } else {
            System.out.print("No loop");
            return;
        }
    }

    /****************************** PRINT LENGTH OF CIRCULAR ******************************/
    public int lengthOfLoop() {
        Node slow = head;
        Node fast = head;
        Node temp = head;
        int count = 0;
        while (fast != null && fast.next != null && slow != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) {
                temp = slow;
                break;
            }
        }

        if (fast == null || fast.next == null) {
            return -1;
        }

        do {
            count++;
            slow = slow.next;
        } while (temp != slow);

        return count;
    }

    /****************************** PALINDROM LINKED LIST ******************************/
    public boolean wrapperIsPalindrome(Node right) {
        Node left = head;
        
        // stop recursion when right become null
        if (right == null) {
            return true;
        }

        boolean isp = wrapperIsPalindrome(right.next);

        if (isp == false) {
            return false;
        }

        boolean isp2 = right.data == left.data;

        left = left.next;
        return isp2;
    }
    public boolean isPalindrom(Node right) {
        boolean result = wrapperIsPalindrome(head);
        return result;
    }

    /****************************** REVERSE LINKED LIST ******************************/
    public void reverseLinkedList() {
        wrapperReverseLinkedList(head);
    }
    public Node wrapperReverseLinkedList(Node node) {
        Node curr = head;
        Node prev = null;
        Node next = null;

        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        node = prev;
        return node;
    }

    /****************************** MERGE 2 SORTED LIST ******************************/
    public Node mergeList(Node list1, Node list2) {
        if (list1 == null) {
            return list2;
        }

        if (list2 == null) {
            return list1;
        }

        if(list1.data > list2.data) {
            list2.next = mergeList(list2.next, list1);
            return list2;
        } else {
            list1.next = mergeList(list1.next, list2);
            return list1;
        }
    }

    /****************************** NTH NODE FROM ENDING ******************************/
    public Node nthFromEnd(int n) {
        Node focusNde = head;
        int count = 0;
        while(focusNde != null) {
            count++;
            focusNde = focusNde.next;
        }
        if(n > count || n < 0) {
            return null;
        }

        int n1 = count - n;
        focusNde = head;
        for(int i = 0; i < n1; i++) {
            focusNde = focusNde.next;
        }

        return focusNde;
    }

    public Node nthFromEndRec(int n) {
        return wrappernthFromEndRec(head, n);
    }
    public Node wrappernthFromEndRec(Node head, int n) {
        if (head == null) {
            return null;
        }
        return wrappernthFromEndRec(head.next, n-1);
    }

    /****************************** Main / Driver Function ******************************/
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.head = new Node(0);
        list.insertAtLast(1);
        list.insertAtLast(2);
        list.insertAtLast(3);
        list.insertAtLast(4);
        list.insertAtLast(5);
        list.insertAtLast(6);
        list.insertAtLast(7);
        list.insertAtLast(8);
        list.insertAtLast(9);
        list.insertAtLast(10);
        list.insertAtLast(11);
        //list.head.next.next.next.next.next.next.next.next.next.next.next = list.head.next;
        
        Node x = list.nthFromEndRec(3);
        if (x == null) {
            System.out.println("Not found");
        } else {
            System.out.println(x.data);
        }
        
    }
}

class Node 
{ 
    int data; 
    Node next; 
        
    Node(int d)
    {
        data = d; next = null;
    } 
}