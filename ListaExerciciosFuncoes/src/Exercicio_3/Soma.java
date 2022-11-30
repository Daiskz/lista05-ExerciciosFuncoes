package Exercicio_3;

import java.util.Scanner;

public class Soma {
    public static void soma() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o primeiro número inteiro: ");
        int num1 = entrada.nextInt();
        System.out.println("Digite o segundo número inteiro: ");
        int num2 = entrada.nextInt();
        System.out.println("Digite o terceiro número inteiro: ");
        int num3 = entrada.nextInt();
        System.out.println("A soma dos três números é: " + (num1 + num2 + num3));
        entrada.close();
    }
}
