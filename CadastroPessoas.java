import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class CadastroPessoas {
    private List<Cliente> clientes = new ArrayList<>();
    private List<Funcionario> funcionarios = new ArrayList<>();
    private List<Gerente> gerentes = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);
    private SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

    public void cadastrarCliente() {
        System.out.println("Digite o nome do Cliente:");
        String nome = scanner.nextLine();
        System.out.println("Digite a data de nascimento (formato: dd/MM/yyyy):");
        String dataNascimentoStr = scanner.nextLine();
        Date dataNascimento;

        try {
            dataNascimento = dateFormat.parse(dataNascimentoStr);
        } catch (ParseException e) {
            System.out.println("Data inválida! Cadastro não realizado.");
            return;
        }

        System.out.println("Digite o código do Cliente:");
        int codigo = scanner.nextInt();
        scanner.nextLine(); // Consumir nova linha

        Cliente cliente = new Cliente(nome, dataNascimento, codigo);
        clientes.add(cliente);
        System.out.println("Cliente cadastrado com sucesso!");
    }

    public void cadastrarFuncionario() {
        System.out.println("Digite o nome do Funcionário:");
        String nome = scanner.nextLine();
        System.out.println("Digite a data de nascimento (formato: dd/MM/yyyy):");
        String dataNascimentoStr = scanner.nextLine();
        Date dataNascimento;

        try {
            dataNascimento = dateFormat.parse(dataNascimentoStr);
        } catch (ParseException e) {
            System.out.println("Data inválida! Cadastro não realizado.");
            return;
        }

        System.out.println("Digite o salário do Funcionário:");
        float salario = scanner.nextFloat();
        scanner.nextLine(); // Consumir nova linha

        Funcionario funcionario = new Funcionario(nome, dataNascimento, salario);
        funcionarios.add(funcionario);
        System.out.println("Funcionário cadastrado com sucesso!");
    }

    public void cadastrarGerente() {
        System.out.println("Digite o nome do Gerente:");
        String nome = scanner.nextLine();
        System.out.println("Digite a data de nascimento (formato: dd/MM/yyyy):");
        String dataNascimentoStr = scanner.nextLine();
        Date dataNascimento;

        try {
            dataNascimento = dateFormat.parse(dataNascimentoStr);
        } catch (ParseException e) {
            System.out.println("Data inválida! Cadastro não realizado.");
            return;
        }

        System.out.println("Digite o salário do Gerente:");
        float salario = scanner.nextFloat();
        scanner.nextLine(); // Consumir nova linha

        Gerente gerente = new Gerente(nome, dataNascimento, salario);
        gerentes.add(gerente);
        System.out.println("Gerente cadastrado com sucesso!");
    }

    public void listarPessoas() {
        System.out.println("Clientes cadastrados:");
        for (Cliente cliente : clientes) {
            cliente.imprimeDados();
        }

        System.out.println("Funcionários cadastrados:");
        for (Funcionario funcionario : funcionarios) {
            funcionario.imprimeDados();
        }

        System.out.println("Gerentes cadastrados:");
        for (Gerente gerente : gerentes) {
            gerente.imprimeDados();
        }
    }

    public void acessarPessoaPorIndice() {
        System.out.println("Digite o tipo de pessoa a acessar (1: Cliente, 2: Funcionário, 3: Gerente):");
        int tipo = scanner.nextInt();
        scanner.nextLine(); // Consumir nova linha

        System.out.println("Digite o índice:");
        int indice = scanner.nextInt();
        scanner.nextLine(); // Consumir nova linha

        try {
            switch (tipo) {
                case 1:
                    System.out.println("Acessando Cliente:");
                    clientes.get(indice).imprimeDados();
                    break;
                case 2:
                    System.out.println("Acessando Funcionário:");
                    funcionarios.get(indice).imprimeDados();
                    break;
                case 3:
                    System.out.println("Acessando Gerente:");
                    gerentes.get(indice).imprimeDados();
                    break;
                default:
                    System.out.println("Tipo inválido!");
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Índice inválido! Não existe pessoa cadastrada nesse índice.");
        }
    }
}
