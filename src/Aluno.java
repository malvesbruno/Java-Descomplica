package src;

public class Aluno extends Pessoa{
    Double teste, prova;

    public double getMedia(){
        return (teste + prova) / 2;
    }

    public Double getTeste() {
        return teste;
    }

    public void setTeste(Double teste) {
        this.teste = teste;
    }

    public Double getProva() {
        return prova;
    }

    public void setProva(Double prova) {
        this.prova = prova;
    }
}
