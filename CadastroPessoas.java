import java.util.Scanner;

public class CadastroPessoas {
    private PessoaService pessoaService = new PessoaService();
    private Scanner scanner = new Scanner(System.in);

    public void iniciar() {
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

            try {
                switch (escolha) {
                    case 1:
                    
                        pessoaService.cadastrarCliente();
                        break;
                    case 2:
                        pessoaService.cadastrarFuncionario();
                        break;
                    case 3:
                        pessoaService.cadastrarGerente();
                        break;
                    case 4:
                        pessoaService.listarPessoas();
                        break;
                    case 5:
                        pessoaService.acessarPessoaPorIndice();
                        break;
                    case 6:
                        System.out.println("Saindo...");
                        scanner.close();
                        return;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                }
            } catch (QuantidadeExcedidaException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
