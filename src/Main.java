import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        CarteiraDigital carteira = new CarteiraDigital();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            exibirMenu();
            int opcao = lerOpcao(scanner);

            switch (opcao) {
                case 1: // Adicionar Saldo
                    System.out.print("Digite o valor a ser adicionado: R$ ");
                    double valorAdicionar = scanner.nextDouble();
                    carteira.adicionarSaldo(valorAdicionar);
                    break;

                case 2: // Realizar Pagamento
                    System.out.print("Digite o valor do pagamento: R$ ");
                    double valorPagamento = scanner.nextDouble();
                    carteira.realizarPagamento(valorPagamento);
                    break;

                case 3: // Verificar Saldo
                    System.out.printf("Saldo atual: R$ %.2f%n", carteira.verificarSaldo());
                    break;

                case 4: // Histórico de Transações
                    carteira.historicoTransacoes();
                    break;

                case 5: // Sair
                    System.out.println("Obrigado por usar a Carteira Digital. Até logo!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    private static void exibirMenu() {
        System.out.println("- Menu da Carteira Digital -");
        System.out.println("1. Adicionar Saldo");
        System.out.println("2. Realizar Pagamento");
        System.out.println("3. Verificar Saldo");
        System.out.println("4. Histórico de Transações");
        System.out.println("5. Sair");
        System.out.print("Escolha uma opção: ");
    }

    private static int lerOpcao(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.println("Entrada inválida. Digite um número.");
            scanner.next();
        }
        return scanner.nextInt();
    }
}
