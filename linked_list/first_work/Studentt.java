public final class Studentt {
    private Node head;
    private Node tail;
    private int size;

    private final boolean isEmpty() {
        return this.size == 0;
    }

    public String toString() {
        return this.isEmpty() ? "Empty list" : String.valueOf(this.head);
    }

    public final Studentt push(Object value) {
        Node q = new Node(value, (Node) null, this.head, 2, null);
        System.out.println(q);
        this.head = new Node(value, this.head, (Node) null, 4, null);
        if (this.tail == null) {
            this.tail = this.head;
        }

        int var10001 = this.size++;
        return this;
    }
}
