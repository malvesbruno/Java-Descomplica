package multithreading;

public class ListaNumeros {
    // Se a palavra synchronized estiver no começo, o código rodará uma thread de cada vez, já sem, ele faz os dois ao mesmo tempo
    synchronized  void printable(int n){
        for (int i = 1; i <= 10; i++){
            System.out.println(i + n);
            try {
                Thread.sleep(300);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
