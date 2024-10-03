import java.util.Date;

public abstract class Pessoa {
    public String nome;
    public Date nascimento;

    public Pessoa(String nome, Date nascimento) {
        this.nome = nome;
        this.nascimento = nascimento;
    }

    abstract void imprimeDados();
}
