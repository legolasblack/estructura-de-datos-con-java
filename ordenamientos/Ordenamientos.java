
package ordenamientos;


import java.util.Random;

public class Ordenamientos {

    private int[] arreglo_de_int;

    public Ordenamientos() {
        this.arreglo_de_int = new int[10];
        Random r = new Random();
        for (int i = 0; i < this.arreglo_de_int.length; i++) {
            this.arreglo_de_int[i] = r.nextInt(9) + 1;
        }
        System.out.println("estoy inicalizado");
    }

    public void Imprime_el_Arreglo() {
        for (int d = 0; d < this.arreglo_de_int.length; d++) {
            System.out.println("Posicion del arreglo: " + d + " con el numero Random: " + this.arreglo_de_int[d]);
        }
    }

}

/*
 * funcion recibe arreglos public static void OrdenamientoBurbuja(int[]
 * arreglo){ vamos a ordenar el arreglo que nos manden con un burbuja for(int
 * i=0; i<=arreglo.length;i++){ System.out.
 * println("hello word en cada parte del arreglo estamos en la vuelta: "+ i ); }
 * 
 * }
 */
