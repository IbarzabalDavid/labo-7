package collections;

/**
 * Created by ibada1731710 on 2018-03-22.
 */
public class Pile <T>{
    private LinkedList list=new LinkedList();

    public void push(T contenu){
        list.add(contenu);
    }
    public T pop(){
        T tempo;
        tempo=(T) list.get(list.size()-1);
        list.remove(list.size()-1);
        return tempo;
    }
    public T peek(){
        return (T)list.get(list.size()-1);
    }
    public void clear(){
        list.clear();
    }
    public int size(){
        return list.size();
    }
}
