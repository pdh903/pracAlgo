import java.util.Stack;

public class ex_stack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // 원소를 스택에 넣음(push)
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("Initial Stack: " + stack);

        // 스택의 최상위 원소를 확인(peek)
        int top = stack.peek();
        System.out.println("Top element: " + top);

        // 스택의 최상위 원소를 제거(pop)
        int popped = stack.pop();
        System.out.println("Popped element: " + popped);
        System.out.println("Updated Stack: " + stack);

        // 스택이 비어있는지 확인(empty)
        boolean isEmpty = stack.empty();
        System.out.println("Is the stack empty? " + isEmpty);

        int sized = stack.size();
        System.out.println(sized);
    }
}
