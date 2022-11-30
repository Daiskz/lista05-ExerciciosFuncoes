package Exercicio_7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner (System.in)) {
            double vPrestacao;
            boolean opt = true;
            double total = 0;
            int qtdPrestacao = 0;
            while (opt == true) {
                System.out.println("Digite o valor da prestação: ");
                vPrestacao = entrada.nextDouble();
                if (vPrestacao != 0) {
                    System.out.println("Digite quantos dias teve de atraso: ");
                    int dias = entrada.nextInt();
                    System.out.println("Valor a se pagar é: " +Pagamento.valorPagamento(vPrestacao, dias));
                    total += Pagamento.valorPagamento(vPrestacao, dias);
                    qtdPrestacao++;
                } else {
                    System.out.println("A quantidade de prestações é: "+qtdPrestacao+"\nValor total das prestações pagas do dia é: " +total);
                    opt = false;
                }
            }
        }
    }
}
