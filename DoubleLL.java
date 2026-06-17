public class DoublyLL {

    class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    Node head;
    Node tail;
    int size = 0;

    // Add First
    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    // Add Last
    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    // Remove First
    public int removeFirst() {

        if (head == null) {
            System.out.println("DLL is empty");
            return Integer.MIN_VALUE;
        }

        int val = head.data;

        if (head == tail) {
            head = tail = null;
            size = 0;
            return val;
        }

        head = head.next;
        head.prev = null;

        size--;
        return val;
    }

    // Remove Last
    public int removeLast() {

        if (head == null) {
            System.out.println("DLL is empty");
            return Integer.MIN_VALUE;
        }

        int val = tail.data;

        if (head == tail) {
            head = tail = null;
            size = 0;
            return val;
        }

        tail = tail.prev;
        tail.next = null;

        size--;
        return val;
    }

    // Print Forward
    public void print() {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    // Print Reverse
    public void printReverse() {

        Node temp = tail;

        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.prev;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        DoublyLL dll = new DoublyLL();

        dll.addFirst(2);
        dll.addFirst(1);
        dll.addLast(3);
        dll.addLast(4);

        System.out.println("Original DLL:");
        dll.print();

        System.out.println("Removed First = " + dll.removeFirst());
        dll.print();

        System.out.println("Removed Last = " + dll.removeLast());
        dll.print();

        System.out.println("Reverse:");
        dll.printReverse();

        System.out.println("Size = " + dll.size);
    }
}
