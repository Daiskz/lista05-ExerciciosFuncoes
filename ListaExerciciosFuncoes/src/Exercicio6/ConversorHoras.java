package Exercicio6;

public class ConversorHoras {
    public static void conversorDeHora(int horas, int minutos) {
        if (horas < 12) {
            horas += 12;
            ImprimirHoras.imprimeHoras(horas, minutos, "A.M");
        }
        else if (horas > 12) {
            horas -= 12;
            ImprimirHoras.imprimeHoras(horas, minutos, "P.M");
        }
    }
}
