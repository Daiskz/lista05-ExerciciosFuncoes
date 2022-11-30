package Exercicio_9;

import java.util.Scanner;

public class ReversoNumero {
    public static void numeroReverso() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        String numeroReverso = entrada.next();
        for (int i = numeroReverso.length(); i > 0; i--) {
            System.out.print(numeroReverso.charAt(i-1));
        }
        System.out.println("");
        entrada.close();
    }
}
