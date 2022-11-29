package Exercicio7;

public class Pagamento {
    public static double valorPagamento(double valorP, int dias) {
        double valor;
        if(dias == 0){
            valor = valorP;
        }else{
            valor = valorP + ((valorP * 0.03) + (0.01 * dias));
        }
        return valor;
    }
}