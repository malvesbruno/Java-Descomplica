package arquivos;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;


public class Arquivos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o path para seu arquivo: ");
        String nome = scanner.next();
        File arquivo = new File(nome);
        if (arquivo.exists()) {
            if (arquivo.isFile()){
                System.out.println("Arquivo encontrado!");
                System.out.println("Nome do arquivo: " + arquivo.getName());
                System.out.println("tamanho do arquivo: " + arquivo.length());
            }
        } else{
            System.out.println("Arquivo não encontrado!");
        }

        // Escrevendo arquivo

        String nome_aluno, matricula;
        int faltas;
        double notas, teste;
        try{
            FileWriter arq = new FileWriter("D:\\java descomplica\\arquivos\\texto.txt");
            PrintWriter gravarArq = new PrintWriter(arq);
            System.out.println("Digite o nome do aluno: ");
            nome_aluno = scanner.next();
            System.out.println("Digite a matricula do aluno: ");
            matricula = scanner.next();
            System.out.println("Digite o número de faltas do aluno: ");
            faltas = scanner.nextInt();
            System.out.println("Digite a nota do aluno: ");
            notas = scanner.nextDouble();
            System.out.println("Digite a nota do teste do aluno: ");
            teste = scanner.nextDouble();

            double media = ((teste + notas) / 2) - (faltas * 0.1);

            gravarArq.println(matricula);
            gravarArq.println(nome_aluno);
            gravarArq.println("faltas: " + faltas + " Nota: " + notas + " teste: " + teste);
            gravarArq.println("media: " + media);
            arq.close();
            
        }
        catch (Exception e){
            System.out.println("Erro ao criar arquivo!");
        }

        // Binário
        try{
            FileOutputStream arquivo2 = new FileOutputStream("D:\\java descomplica\\arquivos\\texto2.dat");
            DataOutputStream gravarArq = new  DataOutputStream(arquivo2);
            System.err.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-");

            System.out.println("Digite o nome do aluno: ");
            nome_aluno = scanner.next();
            System.out.println("Digite a matricula do aluno: ");
            matricula = scanner.next();
            System.out.println("Digite o número de faltas do aluno: ");
            faltas = scanner.nextInt();
            System.out.println("Digite a nota do aluno: ");
            notas = scanner.nextDouble();
            System.out.println("Digite a nota do teste do aluno: ");
            teste = scanner.nextDouble();

            gravarArq.writeUTF(matricula);
            gravarArq.writeUTF(nome_aluno);
            gravarArq.writeDouble(notas);
            gravarArq.writeDouble(teste);
            gravarArq.writeInt(faltas);

            arquivo2.close();

        } catch(Exception e){
            System.out.println("Erro ao criar arquivo!");
        }

}}

