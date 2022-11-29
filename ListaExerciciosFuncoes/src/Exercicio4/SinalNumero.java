package Exercicio4;

import java.util.Scanner;

public class SinalNumero {
    public static void sinalNumero() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int numeroInteiro = entrada.nextInt();
           if (numeroInteiro > 0) {
               System.out.println("P");
           }
           else if (numeroInteiro < 0) {
               System.out.println("N");
           }
           else if (numeroInteiro == 0) {
               System.out.println("Número neutro");
           }
        entrada.close();        
    }

}
