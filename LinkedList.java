// create a linkedList and reverse it using recurssion 

public class LinkedList {
    
    class Node {
        int data;
        Node next;
        Node(int data) { this.data = data; }
    }
    
    private Node head;
    
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) current = current.next;
            current.next = newNode;
        }
    }
    
    public void reverse() {
        head = reverseRecursive(head);
    }
    
    private Node reverseRecursive(Node node) {
        if (node == null || node.next == null) return node;
        
        Node reversedHead = reverseRecursive(node.next);
        node.next.next = node;
        node.next = null;
        return reversedHead;
    }
    
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
    
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(1); list.add(2); list.add(3); list.add(4); list.add(5);
        
        System.out.println("Original:");
        list.display();
        list.reverse();
        System.out.println("Reversed:");
        list.display();
    }
}

