package collections;

import java.util.LinkedList;
import java.util.List;


public class MinhaLinkedList {
    public static void main(String[] args) {
        List<String> listaNome = new LinkedList<>();
        listaNome.add("João");
        listaNome.add("Maria");
        listaNome.add("Pedro");
        listaNome.addLast("Bruno");
        System.out.println(listaNome);
        listaNome.removeFirst();
        listaNome.removeLast();
        System.out.println(listaNome);
        
    }
}
