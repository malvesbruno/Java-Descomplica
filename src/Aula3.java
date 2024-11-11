package src;

public class Aula3 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.setNome("Bruno");
        aluno.setProva(10.0);
        aluno.setTeste(7.0);
        System.out.println(aluno.getNome());
        System.out.println(aluno.getMedia());

        Professor professor = new Professor();
        professor.setNome("ricardo");
        professor.setSalario(5000.0);
        System.out.println(professor.getNome());
        System.out.println(professor.getSalarioLiquido());
    }
}
