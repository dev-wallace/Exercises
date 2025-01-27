// Este programa deve erenciar transações bancárias, calculando o saldo final e exibindo a lista de transações com o uso de classes e streams.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RegistroTransacoesComStream {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lê o saldo inicial
        double saldo = scanner.nextDouble();
        
        // Lê a quantidade de transações
        int quantidadeTransacoes = scanner.nextInt();

        List<Transacao> transacoes = new ArrayList<>();

        for (int i = 1; i <= quantidadeTransacoes; i++) {
            // Lê o tipo da transação
            char tipoTransacao = scanner.next().charAt(0);
            
            // Lê o valor da transação
            double valorTransacao = scanner.nextDouble();

            // Cria uma nova transação e adiciona à lista de transações
            Transacao transacao = new Transacao(tipoTransacao, valorTransacao);
            transacoes.add(transacao);

            // Verifica e atualiza o saldo da conta com base no tipo de transação
            if (transacao.getTipo() == 'D' || transacao.getTipo() == 'd') {
                saldo += valorTransacao;
            } else if (transacao.getTipo() == 'S' || transacao.getTipo() == 's') {
                saldo -= valorTransacao;
            }
        }

        // Filtra as transações válidas (tipo 'D' ou 'S')
        transacoes.stream()
                .filter(t -> t.getTipo() == 'D' || t.getTipo() == 'd' || t.getTipo() == 'S' || t.getTipo() == 's');

        // Imprime o saldo final
        System.out.println("Saldo : " + saldo);

        // Formata e imprime a lista de transações
        System.out.println("Transacoes:");
        transacoes.stream()
                .map(transacao -> transacao.getTipo() + " de " + transacao.getValor())
                .collect(Collectors.toList())
                .forEach(System.out::println);

        // Fecha o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}

class Transacao {
    private char tipo;
    private double valor;

    public Transacao(char tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;
    }

    public char getTipo() {
        return tipo;
    }

    public double getValor() {
        return valor;
    }

  
}