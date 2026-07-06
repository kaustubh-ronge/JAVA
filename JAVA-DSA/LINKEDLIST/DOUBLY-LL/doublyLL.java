public class doublyLL {
    Node head;

    private class Node {
        int val;
        Node next;
        Node prev;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }

    }

    public void insertFirst(int val) {
        Node node = new Node(val);

        node.next = head;
        node.prev = null;

        if (head != null) {
            head.prev = node;
        }

        head = node;
    }

    public void display() {
        Node tempNode = head;

        Node last = null;

        while (tempNode != null) {
            System.out.print(tempNode.val + " -> ");
            last = tempNode;
            tempNode = tempNode.next;
        }
        System.out.println("END");

        while (last != null) {
            System.out.print(last.val + " -> ");
            last = last.prev;
        }
        System.out.println("START");
    }

    public static void main(String[] args) {
        doublyLL dll = new doublyLL();

        dll.insertFirst(1);
        dll.insertFirst(2);
        dll.insertFirst(3);
        dll.insertFirst(4);
        dll.insertFirst(5);

        dll.display();
    }
}
