public class Practica_array {
    /*En este programa calculamos en una matriz los intereses que se acumularian sobre un saldo inicial 
     * al pasar de varios años en diferentes porcentaje de interes el ejemplo fue tomado de el video 
     * pildoras informaticas - curso de java - video 26- arrays bidimencionales II.0
     */
    public static void main(String[] args) {
        double saldo_inicial = 10000.00;
        double[] porcentajes = { .10, .11, .12, .13, .14, .15 };
        String[] años = { "2020", "2021", "2022", "2023", "2024", "2025", "2026" };
        double[][] saldos_calculados = new double[porcentajes.length][años.length];
        double acumulador_saldo = 0;

        System.out.println("cuanto es años length "+años.length);
        for (int columna = 0; columna < porcentajes.length; columna++) {
            acumulador_saldo = saldo_inicial;
            for (int fila = 0; fila < años.length; fila++) {
                saldos_calculados[columna][fila] = acumulador_saldo + (acumulador_saldo * porcentajes[columna]);
                acumulador_saldo = saldos_calculados[columna][fila];
            }
        }

        System.out.println("el calculo correspondiente por año de interese es el siguiente:");
        System.out.println("con un saldo inicial de: $" + saldo_inicial);

        for(int fila=0;fila<años.length;fila++){
            System.out.println();
            for(int columna=0;columna<porcentajes.length;columna++){
                System.out.print("año: "+años[fila]+" $"+saldos_calculados[columna][fila]+" ");
            }
        }
        /*
         * for (int i = 0; i < porcentajes.length; i++) {
         * acumulador_saldo = saldo_inicial;
         * for (int j = 0; j < años.length; j++) {
         * saldos_calculados[i][j] = acumulador_saldo + (porcentajes[j] *
         * acumulador_saldo);
         * }
         * }
         * 
         * System.out.
         * println("el calculo correspondiente por año de interese es el siguiente:");
         * System.out.println("con un saldo inicial de: $" + saldo_inicial);
         * for(int j=0;j<porcentajes.length;j++){
         * for (int i = 0; i < años.length; i++) {
         * System.out.println("este es el rendimiento $" + saldos_calculados[j][i] +
         * " en el año " + años[i] + "");
         * }
         * }
         */

    }
}
