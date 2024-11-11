package multithreading;

public class Thread2 extends Thread{
    ListaNumeros listaNumeros;

    public Thread2(ListaNumeros listaNumeros) {
        this.listaNumeros = listaNumeros;
    }
    
    public void run(){
        listaNumeros.printable(100);
    }
}
