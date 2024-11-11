package collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class Collection1 {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Ola");
        lista.add("Mundo");
        lista.add("Java");
        lista.add("Bruno");
       
        // Iterator 
        Iterator<String> iterator = lista.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        
        //Comparator
        Comparator<String> comparator = Collections.reverseOrder();
        Collections.sort(lista,comparator);
        System.err.println(lista);
    }
}
