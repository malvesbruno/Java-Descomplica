package thread;

public class ThreadJava extends Thread {
    public void run(){
        System.out.println("thread secudária");
    }
    public static void main(String[] args) {
        ThreadJava minhaThread = new ThreadJava();
        minhaThread.start();
        System.out.println("Thread Principal");
    }
    
}