package Exercicio_11;

import java.util.Scanner;

public class ConversorData {
    public static void mesExtenso() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite uma data no formato (DD/MM/AAAA): ");
        String data = entrada.next();
        String dia = data.substring(0, 2);
        String mes = data.substring(2, 4);
        String ano = data.substring(4);
        switch (mes) {
            case "01":
                System.out.println(dia+" de "+"Janeiro"+" de "+ano);
                break;
            case "02":
                System.out.println(dia+" de "+"Fevereiro"+" de "+ano);
                break;
            case "03":
                System.out.println(dia+" de "+"Março"+" de "+ano);
                break;
            case "04":
                System.out.println(dia+" de "+"Abril"+" de "+ano);
                break;
            case "05":
                System.out.println(dia+" de "+"Maio"+" de "+ano);
                break;
            case "06":
                System.out.println(dia+" de "+"Junho"+" de "+ano);
                break;
            case "07":
                System.out.println(dia+" de "+"Julho"+" de "+ano);
                break;
            case "08":
                System.out.println(dia+" de "+"Agosto"+" de "+ano);
                break;
            case "09":
                System.out.println(dia+" de "+"Setembro"+" de "+ano);
                break;
            case "10":
                System.out.println(dia+" de "+"Outubro"+" de "+ano);
                break;
            case "11":
                System.out.println(dia+" de "+"Novembro"+" de "+ano);
                break;
            case "12":
                System.out.println(dia+" de "+"Dezembro"+" de "+ano);
                break;
            default:
             System.out.println("Data Inválida");
                break;
        }
        entrada.close();
    }
}
