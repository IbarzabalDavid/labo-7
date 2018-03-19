package collections;

/**
 * Created by Ibada1731710 on 2018-03-19.
 */
public class LinkedList <T> {
    private Node head;
    private Node tail;
    private int tailleList=0;

    public void add(T contenu){
        if (tailleList==0){
            tail=new Node(contenu);
            head=tail;
        }
        else {
            tail.setNext(new Node(contenu));
            tail=tail.getNext();
        }
        tailleList++;

    }
    public void add(T contenu, int index){
        int i=0;
        if (index==0){
            Node tempo=new Node(contenu);
            tempo.setNext(head);
            head=tempo;
        }
        else if (index<=tailleList && index>=0){
            Node tempo=head;
            while (i<index-1){
                tempo=tempo.getNext();
                i++;
            }
            Node tempo2=tempo.getNext();
            tempo.setNext(new Node(contenu));
            tempo.getNext().setNext(tempo2);

        }
        else {
            System.out.println("Impossible");
        }
        tailleList++;
    }
    public T get(int index){
        int i=0;
        if (index<tailleList && index>=0){
            Node tempo=head;
            while (i<index){
                tempo=tempo.getNext();
                i++;
            }
            return (T) tempo.getContenu();
        }
        else {
            System.out.println("Impossible");
            return null;
        }

    }
    public void set(int index, T contenu){
        int i=0;
        if (index<tailleList && index>=0){
            Node tempo=head;
            while (i<index){
                tempo=tempo.getNext();
                i++;
            }
            tempo.setContenu(contenu);
        }
        else {
            System.out.println("Impossible");
        }
    }
    public int size(){
        return tailleList;
    }
    public void clear(){
        tailleList=0;
    }
    public void remove(int index){
        int i=0;
        if (index<tailleList && index>=0){
            Node tempo=head;
            while (i<index-1){
                tempo=tempo.getNext();
                i++;
            }
            tempo.setNext(tempo.getNext().getNext());
            tailleList--;
        }
        else {
            System.out.println("Impossible");
        }
    }
}
