package E1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int numeroInteiro = entrada.nextInt();
            if (numeroInteiro <= 0 || numeroInteiro > 10) {
                System.out.println("Número inválido, digite um número inteiro de 1 a 9");
            } else {
                Imprime.imprimir(numeroInteiro);
            }
        entrada.close();
    }
    
}
