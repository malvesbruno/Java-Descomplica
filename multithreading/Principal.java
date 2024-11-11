package multithreading;

public class Principal {
    public static void main(String[] args) {
        ListaNumeros listaNumeros = new ListaNumeros();
        Thread1 thread1 = new Thread1(listaNumeros);
        Thread2 thread2 = new Thread2(listaNumeros);
        thread1.start();
        thread2.start();

    }
}
