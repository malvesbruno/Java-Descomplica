package collections;
import java.util.ArrayList;

public class Array {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Hola");
        lista.add("Mundo");
        lista.add("Java");
        lista.add("Programacion");
        for (String obj : lista) {
            System.out.println(obj);
        }

    }
}
