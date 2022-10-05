package entidade;

public class Node {
    private Colection value;
    private Node next;

    public Node(Colection value) {
        this.value = value;
        this.next = null;
    }

    public Colection getValue() {
        return value;
    }

    public void setValue(Colection value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
