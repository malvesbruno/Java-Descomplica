package src;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        // Operadores
        System.out.println(4 + 2);
        System.out.println(4 - 2);
        System.out.println(4 * 2);
        System.out.println(4 / 2);
        System.out.println(5 % 2);
        System.out.println(5.0 / 2);

        System.err.println("-==-=-=-=-===-=-==-=-=-=-=-=-=-=-=-=-=-=-");
        // tipagem de dados
        byte x = 3; // menor tipo
        short y = 2; // segundo menor
        int z = 5; // médio
        long w = 10; // maior tipo
        float a = 3.5f; // tipo de ponto flutuante
        double b = 3.5; // tipo de ponto flutuante com maior precisão
        boolean isTrue = true;

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(w);
        System.err.println(a);
        System.err.println(b);
        System.err.println(isTrue);

        // Exercício
        System.out.println("-==-=-=-=-===-=-==-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("Exercício");
        double nota1 = 8.0;
        double nota2 = 9.0;
        double media = (nota1 + nota2) / 2;
        System.out.println(media);
        System.out.println("<><><>");
        int num1 = 11;
        System.out.println("<><><>");
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um número: ");
        num1 = teclado.nextInt(); // pegar o int digitado no teclado
        System.err.println(num1%2);

        if (num1 >= nota1){
            System.out.println("Você passou");
        } else{
            System.out.println("Você não passou");
        }

    }
}
