import java.util.ArrayList;
import java.util.Scanner;

public class CarteiraDigital {
    private double saldo;
    private ArrayList<String> historico;

    public CarteiraDigital() {
        this.saldo = 0.0;
        this.historico = new ArrayList<>();
    }

    public void adicionarSaldo(double valor) {
        if (valor > 0) {
            saldo += valor;
            historico.add("Adicionado: R$ " + valor);
            System.out.println("R$ " + valor + " adicionados à carteira com sucesso!");
        } else {
            System.out.println("Valor inválido para adição de saldo.");
        }
    }

    public void realizarPagamento(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            historico.add("Pagamento: R$ " + valor);
            System.out.println("Pagamento de R$ " + valor + " realizado com sucesso!");
        } else if (valor > saldo) {
            System.out.println("Saldo insuficiente para realizar o pagamento.");
        } else {
            System.out.println("Valor inválido para pagamento.");
        }
    }

    public double verificarSaldo() {
        return saldo;
    }

    public void historicoTransacoes() {
        if (historico.isEmpty()) {
            System.out.println("Nenhuma transação registrada.");
        } else {
            System.out.println("Histórico de transações:");
            for (String transacao : historico) {
                System.out.println("- " + transacao);
            }
        }
    }
}
