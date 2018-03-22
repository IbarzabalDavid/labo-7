package collections;

/**
 * Created by ibada1731710 on 2018-03-15.
 */
public class ArrayList <T> implements List<T>{
    private T[] tab=(T[]) new Object[10];
    private int tailleList=0;
    private int tailleTab=10;


    public void add(int index, T objet){
        int i=0;
        if (index<=tailleList && index>=0){
            if (index==tailleList){
                tab[index]=objet;
            }
            else {
                while (i<(tailleList-index)){
                    tab[tailleList-i]=tab[tailleList-(i+1)];
                    i++;
                }
                tab[index]=objet;
            }
            tailleList++;
            if (tailleList==tailleTab){
                grow();
            }
        }
        else {
            System.out.println("Impossible");
        }

    }
    public void add(T objet){
        tab[tailleList]=objet;
        tailleList++;
        if (tailleList==tailleTab){
            grow();
        }
    }
    public void set(int index,T objet){
        if (index<=tailleList-1 && index>=0){
            tab[index]=objet;
        }
        else {
            System.out.println("Impossible");
        }
    }
    public T get(int index){
        if (index<=tailleList-1 && index>=0){
            return tab[index];
        }
        else {
            return null;
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
        if (index<=tailleList-1 && index>=0){
            while (i<tailleList-1-index){
                tab[index+i]=tab[index+i+1];
            }
        }
        else{
            System.out.println("Impossible");
        }
    }
    private void grow(){
        int i=0;
        tailleTab=tailleTab*2;
        T[] tabGrow=(T[])new Object[tailleTab];
        while (i<tailleList){
            tabGrow[i]=tab[i];
            i++;
        }
        tab=tabGrow;
    }
}
