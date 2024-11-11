package collections;
import java.util.*;

public class Mapas {
    public static void main(String[] args) {
        HashMap<String, Integer> funcSal = new HashMap<String, Integer>();
        funcSal.put("Juan", 1000);
        funcSal.put("Michael", 1000);
        funcSal.put("Lucas", 2000);
        // Value nulo e duplicados são permitidos, mas key repetidas não
        System.out.println(funcSal);
        //removendo items
        funcSal.remove("Lucas");
        System.out.println(funcSal);
        //Printando keys
        System.out.println(funcSal.keySet());
        //printando values
        System.out.println(funcSal.values());


        //LinkedHashMap
        LinkedHashMap<String, Integer> funcSal2 = new LinkedHashMap<String, Integer>();
        funcSal2.put("Juan", 1000);
        funcSal2.put("Michael", 1000);
        funcSal2.put("Lucas", 1000);
        System.out.println("Contem key 'Juan'? "+ funcSal2.containsKey("Juan"));
        System.out.println("Contem value '1000'? " + funcSal2.containsValue(1000));


        //TreeMap
        TreeMap<Integer, String> treemap = new TreeMap<Integer, String>();
        treemap.put(1, "Juan");
        treemap.put(20, "Michael");
        treemap.put(3, "Lucas");
        System.out.println(treemap);
    }
}
