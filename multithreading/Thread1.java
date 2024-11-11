package multithreading;

public class Thread1 extends Thread {
    ListaNumeros listaNumeros;

    public Thread1(ListaNumeros listaNumeros) {
        this.listaNumeros = listaNumeros;
    }
    
    public void run(){
        listaNumeros.printable(0);
    }
}
