class LinkedList3 {
    Node header;

    static class Node {
        int data;
        Node next = null;
    }

    LinkedList3() {
        header = new Node();
    }

    void append(int d) {
        Node end = new Node();
        end.data = d;
        Node n = header;
        while (n.next != null) {
            n = n.next;
        }
        n.next = end;
    }

    void delete(int d) {
        Node n = header;
        while (n.next != null) {
            if (n.next.data == d) {
                n.next = n.next.next;
            } else {
                n = n.next;
            }
        }
    }

    void retrieve() {
        Node n = header.next;
        while (n.next != null) {
            System.out.print(n.data + " -> ");
            n = n.next;
        }
        System.out.println(n.data);
    }

    Node getFirst() {
        return header;
    }
}

public class foundK {
    public static void main(String[] args) {
        LinkedList3 ll = new LinkedList3();
        ll.append(1);
        ll.append(2);
        ll.append(3);
        ll.append(4);
        ll.retrieve();

        int k = 2;
        KthToLast(ll.getFirst(), k);
    }


    private static int KthToLast(LinkedList3.Node n, int k) {
        if (n == null) {
            return 0;
        }

        int count = KthToLast(n.next, k) + 1;
        if (count == k) {
            System.out.println(k + "th to last node is " + n.data);
        }
        return count;
    }
}
