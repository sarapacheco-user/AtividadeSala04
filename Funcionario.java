import java.util.Date;

public class Funcionario extends Pessoa {
    public float salario;

    public Funcionario(String nome, Date nascimento, float salario) {
        super(nome, nascimento);
        this.salario = salario;
    }

    public double calculaImposto() {
        return this.salario * 0.03;
    }

    @Override
    public void imprimeDados() {
        System.out.println("O nome é: " + this.nome);
        System.out.println("A data de nascimento é: " + this.nascimento);
        System.out.println("O Salário é: " + this.salario);
        System.out.println("O imposto é: " + this.calculaImposto());
    }
}
