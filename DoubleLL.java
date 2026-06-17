import java.util.Scanner;

class Node {
    int data;
    Node next;
    Node prev;

    Node() {
        data = 0;
        next = null;
        prev = null;
    }

    Node(int d) {
        data = d;
        next = null;
        prev = null;
    }
}

class DLL {
    Node head = null;

    Scanner sc = new Scanner(System.in);

    public void insertStart(int d) {
        Node nn = new Node(d);

        if (head == null) {
            head = nn;
        } else {
            nn.next = head;
            head.prev = nn;
            head = nn;
        }
    }

    public void insertEnd(int d) {
        Node nn = new Node(d);

        if (head == null) {
            head = nn;
        } else {
            Node temp = head;

            while (temp.next != null) {
                temp = temp.next;
            }

            temp.next = nn;
            nn.prev = temp;
        }
    }

    public void insertBetween(int d) {
        Node nn = new Node(d);

        if (head == null) {
            head = nn;
            return;
        }

        Node temp = head;

        System.out.print("Enter key after which you want to insert: ");
        int key = sc.nextInt();

        while (temp != null && temp.data != key) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Key not found");
            return;
        }

        nn.next = temp.next;
        nn.prev = temp;

        if (temp.next != null) {
            temp.next.prev = nn;
        }

        temp.next = nn;
    }

    public void deleteStart() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head.next == null) {
            head = null;
            return;
        }

        head = head.next;
        head.prev = null;
    }

    public void deleteEnd() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head.next == null) {
            head = null;
            return;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.prev.next = null;
    }

    public void deleteBetween() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        System.out.print("Enter node value to delete: ");
        int key = sc.nextInt();

        Node temp = head;

        while (temp != null && temp.data != key) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Node not found");
            return;
        }

        if (temp == head) {
            deleteStart();
            return;
        }

        if (temp.next == null) {
            deleteEnd();
            return;
        }

        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;
    }

    public void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        DLL l = new DLL();

        int choice, d;
        char ch;

        System.out.println("1. Insert at Start");
        System.out.println("2. Insert at End");
        System.out.println("3. Insert Between");
        System.out.println("4. Delete from Start");
        System.out.println("5. Delete from End");
        System.out.println("6. Delete Between");
        System.out.println("7. Display");

        do {
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter value: ");
                    d = sc.nextInt();
                    l.insertStart(d);
                    break;

                case 2:
                    System.out.print("Enter value: ");
                    d = sc.nextInt();
                    l.insertEnd(d);
                    break;

                case 3:
                    System.out.print("Enter value: ");
                    d = sc.nextInt();
                    l.insertBetween(d);
                    break;

                case 4:
                    l.deleteStart();
                    break;

                case 5:
                    l.deleteEnd();
                    break;

                case 6:
                    l.deleteBetween();
                    break;

                case 7:
                    l.display();
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

            System.out.print("Do you want to continue (Y/N)? ");
            ch = sc.next().charAt(0);

        } while (ch == 'Y' || ch == 'y');

        sc.close();
    }
}
