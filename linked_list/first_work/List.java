
final class Node {
    private Object value;
    private Node next;
    private Node before;

    public Node(Object var1, Node var2, Node var3) {

    }

    public String toString() {
        return this.next != null ? this.value + " -> " + this.next : String.valueOf(this.value);
    }

    public final Object getValue() {
        return this.value;
    }

    public final void setValue(Object var1) {
        this.value = var1;
    }

    public final Node getNext() {
        return this.next;
    }

    public final void setNext( Node var1) {
        this.next = var1;
    }

    public final Node getBefore() {
        return this.before;
    }

    public final void setBefore( Node var1) {
        this.before = var1;
    }

    public Node(Object value, Node next, Node before, int i, Object o) {
        this.value = value;
        this.next = next;
        this.before = before;
    }

    // $FF: synthetic method
    public Node(Object var1, Node var2, Node var3, int var4) {
        if ((var4 & 2) != 0) {
            var2 = (Node)null;
        }

        if ((var4 & 4) != 0) {
            var3 = (Node)null;
        }

    }

    public final Object component1() {
        return this.value;
    }

    public final Node component2() {
        return this.next;
    }

    public final Node component3() {
        return this.before;
    }

    public final Node copy(Object value,  Node next, Node before) {
        return new Node(value, next, before, 4, null);
    }

    // $FF: synthetic method
    public static Node copy$default(Node var0, Object var1, Node var2, Node var3, int var4, Object var5) {
        if ((var4 & 1) != 0) {
            var1 = var0.value;
        }

        if ((var4 & 2) != 0) {
            var2 = var0.next;
        }

        if ((var4 & 4) != 0) {
            var3 = var0.before;
        }

        return var0.copy(var1, var2, var3);
    }

    public int hashCode() {
        Object var10000 = this.value;
        int var1 = (var10000 != null ? var10000.hashCode() : 0) * 31;
        Node var10001 = this.next;
        var1 = (var1 + (var10001 != null ? var10001.hashCode() : 0)) * 31;
        var10001 = this.before;
        return var1 + (var10001 != null ? var10001.hashCode() : 0);
    }

    public boolean equals(Object var1) {
        if (this != var1) {
            if (var1 instanceof Node) {
                Node var2 = (Node)var1;
                if ((this.value == var2.value) && (this.next == var2.next) && (this.before == var2.before)) {
                    return true;
                }
            }

            return false;
        } else {
            return true;
        }
    }
}
// _18Kt.java

public final class List {
    public static final void main() {
        Studentt list = new Studentt();
        list.push(3).push(2).push(1);
        System.out.println(list);
    }

    // $FF: synthetic method
    public static void main(String[] var0) {
        main();
    }
}
