

import java.util.LinkedList;
import java.util.Queue;

class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        // Add elements to the queue
        queue.add("John");
        queue.add("Mary");
        queue.add("Bob");

        // Print the contents of the queue
        System.out.println("Queue: " + queue);

        // Remove the head of the queue
        String head = queue.remove();
        System.out.println("Head of the Queue: " + head);

        // Print the contents of the queue again
        System.out.println("Queue: " + queue);
    }
}


