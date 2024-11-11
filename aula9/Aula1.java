package aula9;

public class Aula1 {
    public static void main(String[] args) {
        String nome = "Bruno";
        String sobrenome = new String("Bruno");

        // O método de == compara o local que a variável referencia
        if (nome == sobrenome){
            System.out.println("nome e sobrenome são iguais");
        }
        else{
            System.out.println("nome e sobrenome são diferentes");
        }
        // o método .equals compara o conteúdo das variáveis
        if (nome.equals(sobrenome)){
            System.out.println("nome e sobrenome são iguais");
        }
        else{
            System.out.println("nome e sobrenome são diferentes");
            }
        
        
        StringBuffer buffer = new StringBuffer();
        buffer.append(nome);
        buffer.append(" Massuete");
        String nomeCompleto = buffer.toString();
        System.out.println(nomeCompleto);
        String desc = "descomplica";
        System.out.println(desc.substring(1, 5));

    }
}
