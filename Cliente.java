import java.util.Date;

public class Cliente extends Pessoa {
    public int codigo;

    public Cliente(String nome, Date nascimento, int codigo) {
        super(nome, nascimento);
        this.codigo = codigo;
    }

    @Override
    public void imprimeDados() {
        System.out.println("O nome é: " + this.nome);
        System.out.println("A data de nascimento é: " + this.nascimento);
        System.out.println("O código é: " + this.codigo);
    }
}
