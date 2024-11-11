package src;

public class Professor extends Pessoa{
    double salario;

    double getInss(){
        return salario * 0.11;
    }

    double getSalarioLiquido(){
        return salario - getInss();
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
}
