package PR;

public class Pr4 {
    
    public static void main(String[] args) {
    int a = 0, b = 0;
    int resultado = divisao(a, b);
    System.out.println(resultado);
    }

    public static int divisao(int a, int b){
        try {
            return a / b;
        } catch (RuntimeException e) {
            return -1;
        } catch (ArithmeticException e) {
            return 0;
        } finally {
          System.out.println("concluído");
        }   
    }
}
