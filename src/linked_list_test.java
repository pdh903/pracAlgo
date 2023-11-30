class Node1 {
    int prev, next;
    int data;

    Node1(int prev, int next, int data) {
        this.prev = prev;
        this.next = next;
        this.data = data;
    }
}

public class linked_list_test {
    static int unused = 1;
    static Node1[] n = new Node1[1000005];

    public static void insert(int addr, int num) {
        n[unused] = new Node1(addr, n[addr].next, num);
        if (n[addr].next != -1) {
            n[n[addr].next].prev = unused;
        }
        n[addr].next = unused;
        unused++;
    }

    public static void erase(int addr) {
        n[n[addr].prev].next = n[addr].next;
        if (n[addr].next != -1) {
            n[n[addr].next].prev = n[addr].prev;
        }

    }

    public static void traverse() {
        int cur = n[0].next;
        while(cur != -1){
            System.out.print(n[cur].data + " ");
            cur = n[cur].next;
        }
        System.out.println();
    }

    public static void insert_test() {
        System.out.println("****** insert_test *****");
        insert(0, 10); // 10(address=1)
        traverse();
        insert(0, 30); // 30(address=2) 10
        traverse();
        insert(2, 40); // 30 40(address=3) 10
        traverse();
        insert(1, 20); // 30 40 10 20(address=4)
        traverse();
        insert(4, 70); // 30 40 10 20 70(address=5)
        traverse();
    }

    public static void erase_test() {
        System.out.println("****** erase_test *****");
        erase(1); // 30 40 20 70
        traverse();
        erase(2); // 40 20 70
        traverse();
        erase(4); // 40 70
        traverse();
        erase(5); // 40
        traverse();
    }

    public static void main(String[] args) {
        n[0] = new Node1(-1, -1, 0);
        insert_test();
        erase_test();
    }
}
//import java.util.*;
//
//public class Main {
//    public static void main(String[] args) {
//        LinkedList<Integer> L = new LinkedList<>(Arrays.asList(1, 2));
//        ListIterator<Integer> t = L.listIterator();
//        t.next(); // t는 1을 가리키는 중
//
//        L.addFirst(10); // 10 1 2
//        System.out.println(t.previous()); // t가 가리키는 값 = 1을 출력
//        t.next(); // 다시 t를 1을 가리키게 함
//
//        L.addLast(5); // 10 1 2 5
//        t.add(6); // t가 가리키는 곳 앞에 6을 삽입, 10 6 1 2 5
//        t.next(); // t를 1칸 앞으로 전진, 현재 t가 가리키는 값은 2
//
//        t.next(); // t를 1칸 앞으로 전진, 현재 t가 가리키는 값은 5
//        t.remove(); // t가 가리키는 값을 제거, 10 6 1 5, t가 가리키는 값은 5
//        System.out.println(t.previous()); // 5을 출력
//        t.next(); // 다시 t를 5를 가리키게 함
//
//        for(Integer i : L) System.out.print(i + " ");
//        System.out.println();
//
//        for(ListIterator<Integer> it = L.listIterator(); it.hasNext();)
//            System.out.print(it.next() + " ");
//    }
//}