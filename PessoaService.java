import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class PessoaService {
    private Cliente[] clientes = new Cliente[10];
    private ClienteVIP[] clientesVip = new ClienteVIP[10];
    private Funcionario[] funcionarios = new Funcionario[7];
    private Gerente gerente;
    private int numeroClientes = 0;
    private int numeroClientesVip = 0;
    private int numeroFuncionarios = 0;
    private Scanner scanner = new Scanner(System.in);
    private SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

    public void cadastrarCliente() {
        System.out.println("Deseja cadastrar um Cliente VIP? (s/n)");
        String opcao = scanner.nextLine();

        if (opcao.equalsIgnoreCase("s")) {
            cadastrarClienteVip();
        } else {
            cadastrarClienteNormal();
        }
    }

    private void cadastrarClienteNormal() {
        if (numeroClientes >= clientes.length) {
            System.out.println("Número máximo de clientes alcançado.");
            return;
        }

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
        scanner.nextLine(); 

        Cliente cliente = new Cliente(nome, dataNascimento, codigo);
        clientes[numeroClientes++] = cliente;
        System.out.println("Cliente cadastrado com sucesso!");
    }

    private void cadastrarClienteVip() {
        if (numeroClientesVip >= clientesVip.length) {
            System.out.println("Número máximo de clientes VIP alcançado.");
            return;
        }

        System.out.println("Digite o nome do Cliente VIP:");
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

        System.out.println("Digite o código do Cliente VIP:");
        int codigo = scanner.nextInt();
        scanner.nextLine(); // Consumir nova linha

        System.out.println("Digite o percentual de desconto:");
        float percentualDesconto = scanner.nextFloat();
        scanner.nextLine(); // Consumir nova linha

        ClienteVIP clienteVip = new ClienteVIP(nome, dataNascimento, codigo, percentualDesconto);
        clientesVip[numeroClientesVip++] = clienteVip;
        System.out.println("Cliente VIP cadastrado com sucesso!");
    }

    public void cadastrarFuncionario() throws QuantidadeExcedidaException {
        if (numeroFuncionarios >= funcionarios.length) {
            throw new QuantidadeExcedidaException("Número máximo de funcionários excedido (7).");
        }

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
        scanner.nextLine(); 

        Funcionario funcionario = new Funcionario(nome, dataNascimento, salario);
        funcionarios[numeroFuncionarios++] = funcionario;
        System.out.println("Funcionário cadastrado com sucesso!");
    }

    public void cadastrarGerente() throws QuantidadeExcedidaException {
        if (gerente != null) {
            throw new QuantidadeExcedidaException("Já existe um gerente cadastrado.");
        }

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

        gerente = new Gerente(nome, dataNascimento, salario);
        System.out.println("Gerente cadastrado com sucesso!");
    }

    public void listarPessoas() {
        System.out.println("Clientes cadastrados:");
        for (int i = 0; i < numeroClientes; i++) {
            clientes[i].imprimeDados();
        }

        System.out.println("Clientes VIP cadastrados:");
        for (int i = 0; i < numeroClientesVip; i++) {
            clientesVip[i].imprimeDados();
        }

        System.out.println("Funcionários cadastrados:");
        for (int i = 0; i < numeroFuncionarios; i++) {
            funcionarios[i].imprimeDados();
        }

        if (gerente != null) {
            System.out.println("Gerente cadastrado:");
            gerente.imprimeDados();
        } else {
            System.out.println("Nenhum gerente cadastrado.");
        }
    }

    public void acessarPessoaPorIndice() {
        System.out.println("Digite o tipo de pessoa a acessar (1: Cliente, 2: Cliente VIP, 3: Funcionário):");
        int tipo = scanner.nextInt();
        scanner.nextLine(); 

        System.out.println("Digite o índice:");
        int indice = scanner.nextInt();
        scanner.nextLine(); 

        try {
            switch (tipo) {
                case 1:
                    if (indice < numeroClientes) {
                        System.out.println("Acessando Cliente:");
                        clientes[indice].imprimeDados();
                    } else {
                        System.out.println("Índice inválido para Cliente.");
                    }
                    break;
                case 2:
                    if (indice < numeroClientesVip) {
                        System.out.println("Acessando Cliente VIP:");
                        clientesVip[indice].imprimeDados();
                    } else {
                        System.out.println("Índice inválido para Cliente VIP.");
                    }
                    break;
                case 3:
                    if (indice < numeroFuncionarios) {
                        System.out.println("Acessando Funcionário:");
                        funcionarios[indice].imprimeDados();
                    } else {
                        System.out.println("Índice inválido para Funcionário.");
                    }
                    break;
                default:
                    System.out.println("Tipo inválido!");
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Índice inválido! Não existe pessoa cadastrada nesse índice.");
        }
    }
}
