import java.util.ArrayList;
import java.util.EmptyStackException;

class Stack<E> {
    private ArrayList<E> items;

    public Stack() {
        items = new ArrayList<>();
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }

    public void push(E item) {
        items.add(item);
    }

    public E pop() {
        if (!isEmpty()) {
            return items.remove(items.size() - 1);
        } else {
            throw new EmptyStackException();
        }
    }

    public E peek() {
        if (!isEmpty()) {
            return items.get(items.size() - 1);
        } else {
            throw new EmptyStackException();
        }
    }

    public int size() {
        return items.size();
    }
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        System.out.println("Is the stack empty? " + stack.isEmpty()); // Output: true

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Stack size: " + stack.size()); // Output: 3

        System.out.println("Top element of the stack: " + stack.peek()); // Output: 3

        int poppedItem = stack.pop();
        System.out.println("Popped item from the stack: " + poppedItem); // Output: 3

        System.out.println("Is the stack empty? " + stack.isEmpty()); // Output: false
    }
}


