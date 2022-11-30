package Exercicio1;

public class Imprime {
    public static void imprimir(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if(j == i||j > i){
                    System.out.println(i);
                }else{
                    System.out.print(i);
                }
            }
        }
    }
}
