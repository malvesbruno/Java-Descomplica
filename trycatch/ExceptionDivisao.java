package trycatch;
import java.util.Scanner;

public class ExceptionDivisao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o divitendo: ");
        int dividendo = scanner.nextInt();
        System.out.println("Digite o divisor: ");
        int divisor = scanner.nextInt();
        try{
            int resultado = divisao(dividendo, divisor);
            System.out.println("Resultado: " + resultado);
        } catch(DivisaoPorZeroException e){
            System.out.println("Erro ao realizar divisão: " + e.getMessage());
        }
    }

    private static int divisao(int dividendo, int divisor) throws IllegalArgumentException, ArithmeticException{
        if (dividendo == 0 || divisor == 0){
            throw new DivisaoPorZeroException("Divisão por zero não é permitida.");
        }
        int quociente = dividendo / divisor;
        return quociente;
    }
}

class DivisaoPorZeroException extends IllegalArgumentException {
    public DivisaoPorZeroException(String mensagem) {
        super(mensagem);
    }
}
