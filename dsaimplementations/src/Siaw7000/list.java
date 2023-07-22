class ListNode {
    int value;
    ListNode next;

    public ListNode(int value) {
        this.value = value;
        this.next = null;
    }
}

   class LinkedList {
    ListNode head;

    public LinkedList() {
        this.head = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void append(int value) {
        ListNode newNode = new ListNode(value);
        if (head == null) {
            head = newNode;
        } else {
            ListNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void prepend(int value) {
        ListNode newNode = new ListNode(value);
        newNode.next = head;
        head = newNode;
    }

    public void delete(int value) {
        if (head == null) {
            return;
        }

        if (head.value == value) {
            head = head.next;
            return;
        }

        ListNode current = head;
        while (current.next != null) {
            if (current.next.value == value) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }

    public boolean search(int value) {
        ListNode current = head;
        while (current != null) {
            if (current.value == value) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public void display() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.value + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        System.out.println("Is the list empty? " + linkedList.isEmpty()); // Output: true

        linkedList.append(1);
        linkedList.append(2);
        linkedList.append(3);

        linkedList.prepend(0);

        linkedList.delete(2);

        System.out.println("Search 2 in the list: " + linkedList.search(2)); // Output: false

        linkedList.display(); // Output: 0 -> 1 -> 3 -> null
    }
}
