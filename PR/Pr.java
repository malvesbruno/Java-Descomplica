package PR;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Pr {
    public static void main(String[] args) {
        ArrayList<Integer> minhaLista = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running){
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("Deseja adicionar um item à lista?\n1)sim\n2)não");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        int escolha = scanner.nextInt();
        if (escolha == 1) {
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            System.out.println("Digite o valor do item: ");
            int valor = scanner.nextInt();
            minhaLista.add(valor);
        }
        else if (escolha == 2) {
            running = false;
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            System.out.println("Lista criada com sucesso!");
        }
        else {
            System.out.println("Opção inválida!");
            }
    }
    int soma = 0;
    Iterator<Integer> iterator = minhaLista.iterator();
    while (iterator.hasNext()){
        soma += iterator.next();
    }

    System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
    System.out.println("O valor dos itens da lista são: ");
    System.out.println(minhaLista);
    System.out.println("E a soma dos valores é igual à: ");
    System.out.println(soma);
    System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

}

}
