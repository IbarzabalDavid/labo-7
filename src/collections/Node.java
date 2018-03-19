package collections;

/**
 * Created by Ibada1731710 on 2018-03-19.
 */
public class Node <T> {
    private T contenu;
    private Node next;

    public Node(T contenu) {
        this.contenu = contenu;
    }

    public T getContenu() {
        return contenu;
    }

    public void setContenu(T contenu) {
        this.contenu = contenu;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
