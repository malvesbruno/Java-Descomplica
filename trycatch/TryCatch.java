package trycatch;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o divitendo: ");
        int dividendo = scanner.nextInt();
        System.out.println("Digite o divisor: ");
        int divisor = scanner.nextInt();
        try {
            int quociente = dividendo / divisor;
            System.out.println("O quociente é: " + quociente);
        } catch (Exception e) {
            System.out.println("Erro ao realizar divisão: " + e.getMessage());
        }

        System.out.println("Digite o divitendo: ");
        dividendo = scanner.nextInt();
        System.out.println("Digite o divisor: ");
        divisor = scanner.nextInt();
        
        // Capturando multiplas exeções
        try {
            int quociente = dividendo / divisor;
            System.out.println("O quociente é: " + quociente);
        } catch (ArithmeticException e) {
            System.out.println("Erro ao realizar divisão: " + e.getMessage());
        } 
        catch (InputMismatchException e){
            System.out.println("Erro ao ler valor: " + e.getMessage());
        }
        catch (Exception e){
            System.out.println("Erro inesperado: " + e.getMessage());
        }
        finally{
            System.out.println("Fim do programa");
        }
    }
}
