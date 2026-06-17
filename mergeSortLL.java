public class LinkedList {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    // Add Last
    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    // Print LL
    public void print() {
        if (head == null) {
            System.out.println("LL is Empty");
            return;
        }

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }

        System.out.println("null");
    }

    // Find Mid
    private Node getMid(Node head) {

        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    // Merge Two Sorted Linked Lists
    private Node merge(Node head1, Node head2) {

        Node mergedLL = new Node(-1);
        Node temp = mergedLL;

        while (head1 != null && head2 != null) {

            if (head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
            }

            temp = temp.next;
        }

        while (head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }

        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }

        return mergedLL.next;
    }

    // Merge Sort
    public Node mergeSort(Node head) {

        // Base Case
        if (head == null || head.next == null) {
            return head;
        }

        // Find Mid
        Node mid = getMid(head);

        // Divide
        Node rightHead = mid.next;
        mid.next = null;

        // Sort Left & Right
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);

        // Merge
        return merge(newLeft, newRight);
    }

    public static void main(String[] args) {

        LinkedList ll = new LinkedList();

        ll.addLast(5);
        ll.addLast(2);
        ll.addLast(8);
        ll.addLast(1);
        ll.addLast(3);

        System.out.println("Original LL:");
        ll.print();

        head = ll.mergeSort(head);

        System.out.println("Sorted LL:");
        ll.print();
    }
}
