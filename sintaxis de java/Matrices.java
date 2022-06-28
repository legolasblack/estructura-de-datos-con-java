public class Matrices {
    /*
     * en este ejercicio desarrollaremos el ejercicio para
     * declarar y recorrer una matriz de dos dimenciones.
     */
    public static void main(String[] args) {
        int[][] matrix = new int[3][3];

        matrix[0][0] = 10;
        matrix[0][1] = 20;
        matrix[0][2] = 30;

        matrix[1][0] = 40;
        matrix[1][1] = 50;
        matrix[1][2] = 60;

        matrix[2][0] = 70;
        matrix[2][1] = 80;
        matrix[2][2] = 90;

        /* iprimiremos la matriz con un doble for */
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("veamos los valores de la matriz: " + matrix[i][j]);
            }
        }

        /* imprimiendo con foreach el mismo arreglo */

        for (int[] fila : matrix) {
            for (int columna : fila) {

                System.out.println("veamos los valores de la matriz: " + columna);

            }
        }

    }
}
