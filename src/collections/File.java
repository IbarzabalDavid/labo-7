package collections;

/**
 * Created by ibada1731710 on 2018-03-22.
 */
public class File<T> {
    private LinkedList list=new LinkedList();

    public void add(T contenu){
        list.add(contenu);
    }
    public T remove(){
        T tempo=(T)list.get(0);
        list.remove(0);
        return tempo;
    }
    public T peek(){
        return (T)list.get(0);
    }
    public void clear(){
        list.clear();
    }
    public int size(){
        return list.size();
    }
}
