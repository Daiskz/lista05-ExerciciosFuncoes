package Exercicio_13;

public class Main {
    public static void main(String[] args) throws Exception {
        desenharMoldura(10, 10);
    }

    public static void desenharMoldura(int a, int b) {
        for (int i = 0; i < b; i++) {
            if (i == 0||i == (b - 1)) {
                for (int j = 0; j < a - 1; j++) {
                    if(j == 0){
                        System.out.print("+");
                    } else {
                        System.out.print("-");
                    }
                }
                System.out.println("+");
            } else {
                for (int j = 0; j < a - 1; j++) {
                    if(j == 0){
                        System.out.print("|");
                    }else{
                        System.out.print(" ");
                    }
                }
                System.out.println("|");
            }
        }
    }
}