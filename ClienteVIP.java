import java.util.Date;

public class ClienteVIP extends Cliente {
    private float percentualDesconto;

    public ClienteVIP(String nome, Date nascimento, int codigo, float percentualDesconto) {
        super(nome, nascimento, codigo);
        this.percentualDesconto = percentualDesconto;
    }

    public float getPercentualDesconto() {
        return percentualDesconto;
    }

    @Override
    public void imprimeDados() {
        super.imprimeDados();
        System.out.println("O percentual de desconto é: " + this.percentualDesconto + "%");
    }
}
