package Exercicio_8;

import java.util.Scanner;

public class Digitos {
    public static void quantidadeDigitos() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        String numero = entrada.next();
        int numeroConvertido = numero.length();
        System.out.println("A quantidade de digitos no número é: " +numeroConvertido);
        entrada.close();
    }
}
