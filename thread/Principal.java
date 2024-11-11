package thread;

public class Principal {
    public static void main(String[] args) {
        // Criação de threads
        ThreadJava minhaThread = new ThreadJava();
        Thread thread = new Thread(minhaThread);
        thread.start();
        System.out.println("Thread Principal");

    }
}
