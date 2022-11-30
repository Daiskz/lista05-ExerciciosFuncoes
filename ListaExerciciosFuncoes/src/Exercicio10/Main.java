package Exercicio10;

import java.util.Random;

public class Main{
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++);
            System.out.println("Os dados são jogados");
            int pontuacao = jogarDado();
            System.out.println("\n Pontuação: " + pontuacao);
            
            if (pontuacao == 7 || pontuacao == 11) {
                System.out.println("\n Pontuação: " + pontuacao);
                System.out.println("Você ganhou!");
            } else if (pontuacao == 2 || pontuacao == 3 || pontuacao == 12) {
                System.out.println("\n Pontuação: " + pontuacao);
                System.out.println("Você perdeu!");
            } else {
                int ponto = pontuacao;
                System.out.println("\n Ponto: " + ponto);
                while (true) {
                    pontuacao = jogarDado();
                    System.out.println("\n Nova pontuação: " + pontuacao);
                    if (pontuacao == ponto) {
                        System.out.println("\n Você ganhou!");
                        break;
                    }
                    if (pontuacao == 7) {
                        System.out.println("\n Você perdeu!");
                        break;
                    }
                }
            }
    }
    public static int jogarDado() {
        Random rollDado = new Random();
        int dado1 = rollDado.nextInt(6) + 1;
        int dado2 = rollDado.nextInt(6) + 1;
        System.out.println("\n Dado 1: " + dado1 + " e   Dado 2: " + dado2);
        return dado1 + dado2;
    }
}