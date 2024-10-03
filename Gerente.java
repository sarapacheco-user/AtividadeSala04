import java.util.Date;

public class Gerente extends Funcionario {
    public Gerente(String nome, Date nascimento, float salario) {
        super(nome, nascimento, salario);
    }
    @Override
    public double calculaImposto() {
        return this.salario * 0.05; 
    }
    @Override
    public void imprimeDados() {
        super.imprimeDados();
        System.out.println("O imposto do gerente é: " + this.calculaImposto());
    }
}
