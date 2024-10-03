import java.util.Scanner;

public class TestaCodigo {
    public static void main(String[] args) {
        CadastroPessoas cadastro = new CadastroPessoas();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Cadastrar Cliente");
            System.out.println("2. Cadastrar Funcionário");
            System.out.println("3. Cadastrar Gerente");
            System.out.println("4. Listar Pessoas");
            System.out.println("5. Acessar Pessoa por Índice");
            System.out.println("6. Sair");

            int escolha = scanner.nextInt();
            scanner.nextLine(); 

            switch (escolha) {
                case 1:
                    cadastro.cadastrarCliente();
                    break;
                case 2:
                    cadastro.cadastrarFuncionario();
                    break;
                case 3:
                    cadastro.cadastrarGerente();
                    break;
                case 4:
                    cadastro.listarPessoas();
                    break;
                case 5:
                    cadastro.acessarPessoaPorIndice();
                    break;
                case 6:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
