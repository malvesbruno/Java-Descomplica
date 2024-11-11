package arquivos;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileReader;


public class LendoArquivo {
    public static void main(String[] args) {
        String nomeArquivo = "D:\\java descomplica\\arquivos\\texto.txt";
        try{
            FileReader leitor = new FileReader(nomeArquivo);
            BufferedReader leitura = new BufferedReader(leitor);

            String linha = leitura.readLine();
            while (linha != null){
                System.out.println(linha);
                linha = leitura.readLine();
            }
            leitor.close();
        } catch(Exception e){
            System.out.println("Erro ao ler arquivo!");
        }

        //Binário
        String nomeArquivo2 = "D:\\java descomplica\\arquivos\\texto2.dat";
        try{
            FileInputStream arq = new FileInputStream(nomeArquivo2);
            DataInputStream leitor2 = new  DataInputStream(arq);
            String matricula = leitor2.readUTF();
            String nome = leitor2.readUTF();
            Double notas = leitor2.readDouble();
            Double teste = leitor2.readDouble();
            int faltas = leitor2.readInt();
            System.out.println("=-=-=-=-=-=-=-==-=-=-==-");
            System.out.println("Matricula: "+matricula);
            System.out.println("Nome: " + nome);
            System.out.println("notas: " + notas + " teste: " + teste + " media: " + (((notas + teste) / 2) - (faltas * 0.1)));
            System.out.println("faltas: " + faltas);

    } catch (Exception e){
        System.out.println("Erro ao ler arquivo!");
    }
}
}
