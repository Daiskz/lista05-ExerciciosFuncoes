package Exercicio6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int op;
        do {
            System.out.println("Digite as horas: ");
            int horas = entrada.nextInt();
            System.out.println("Digite os minutos: ");
            int minutos = entrada.nextInt();
            ConversorHoras.conversorDeHora(horas, minutos);
            System.out.println("Deseja continuar com a operação?\n1 - Sim\n2 - Não");
            op = entrada.nextInt();
        } while (op != 2);
        entrada.close();
    }
}
