import java.util.LinkedList;
import java.util.Queue;

public class ex_queue {
    public static void main(String[] args) {
        Queue<Integer> Q = new LinkedList<>();
        Q.offer(10); // 10
        Q.offer(20); // 10 20
        Q.offer(30); // 10 20 30
        System.out.println(Q.size()); // 3
        if(Q.isEmpty()) System.out.println("Q is empty");
        else System.out.println("Q is not empty"); // Q is not empty
        Q.poll(); // 20 30
        System.out.println(Q.peek()); // 20
        System.out.println(((LinkedList<Integer>) Q).getLast()); // 30
        Q.offer(40); // 20 30 40
        Q.poll(); // 30 40
        System.out.println(Q.peek()); // 30
    }
}
