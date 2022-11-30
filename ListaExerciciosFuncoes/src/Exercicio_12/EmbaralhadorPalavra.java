package Exercicio_12;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.util.Collections;

public class EmbaralhadorPalavra {
    public static void embaralhaPalavra() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Insira uma palavra para embaralhar: ");
        String palavraInicial = entrada.nextLine();
        String palavraMaiscula = palavraInicial.toUpperCase();
        List<Character> palavraEmbaralhada = new ArrayList<Character>();
        for (int i = 0; i < palavraMaiscula.length(); i++) {
            palavraEmbaralhada.add(palavraMaiscula.charAt(i));
        }
        Collections.shuffle(palavraEmbaralhada);
        System.out.println("A palavra embaralhada: ");
        for (Character character : palavraEmbaralhada) {
            System.out.print(character);
        }
        System.out.println("");
        entrada.close();
    }
}
