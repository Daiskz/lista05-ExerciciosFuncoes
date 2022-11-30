package E2;

public class Imprime2 {
    public static void imprimir2(int n) {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    if (j == i||j > i) {
                        System.out.println(j);
                    } else {
                        System.out.print(j);
                    }
                }
            }
        }
    }