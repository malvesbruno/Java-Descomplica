package src;

import java.util.Scanner;

public class Aula2 {
    public static void main(String[] args) {
        // Exemplo de uso de Strings e Arrays
        Scanner input = new Scanner(System.in);
        System.out.println("Nome:");
        String nome = "bruno";
        System.out.println(nome);

        //Array

        int[] lista_notas = new int[3];
        lista_notas[0] = 10;
        lista_notas[1] = 10;
        lista_notas[2] = 8;

        System.out.println(lista_notas[0]);

        //matriz
        int[][] matriz = new int[2][2];
        matriz[0][0] = 1;
        matriz[0][1] = 0;
        matriz[1][0] = 0;
        matriz[1][1] = 1;
        System.out.print("["+matriz[0][0] + " ");
        System.out.println(matriz[0][1] + "]");
        System.out.print("[" + matriz[1][0] + " ");
        System.out.print(matriz[1][1] + "]");
        System.err.println("");
        for (int[] line:matriz){
            for (int i:line){
                System.out.print(i + " ");
                }
        }
        System.err.println("");
        String [] objetos = {"garrafa","copo","litro"};

        for (int tam = objetos.length - 1; tam >= 0; tam--){

                 System.out.println(objetos[tam] + " ");

        }
    }
}
