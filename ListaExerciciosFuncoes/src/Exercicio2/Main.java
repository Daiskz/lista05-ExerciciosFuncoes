package Exercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int numeroInteiro = entrada.nextInt();
            if (numeroInteiro <= 0||numeroInteiro > 10) {
                System.out.println("Número inteiro inválido, digite um número de 1 a 9");
            } else {
                Imprime2.imprimir2(numeroInteiro);
            }
        entrada.close();
    }
}
