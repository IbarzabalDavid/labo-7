import collections.ArrayList;
import collections.LinkedList;

/**
 * Created by ibada1731710 on 2018-03-15.
 */
public class Test {
    public static void main(String[] args) {
        ArrayList<String> liste=new ArrayList<String>();
        liste.add("Salut");
        liste.add(1,"pet");
        //System.out.println(liste.get(0));
        LinkedList<String> listou=new LinkedList<String>();
        listou.add("Salut");
        listou.add("Salut");
        listou.add("SSSSS");
        listou.add("SSSSS");
        listou.add("SSSSS");
        listou.add("SSSSS");
        listou.add("SSSSS");
        listou.add("SSSSS");
        listou.add("SSSSS");
        listou.add("SSSSS");listou.add("SSSSS");
        listou.add("SSSSS");
        listou.add("SSSSS");
        listou.add("SSSSS");
        listou.add(2,"PPPP");
        System.out.println(listou.get(2));

    }
}
