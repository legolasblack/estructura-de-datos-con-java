public class Arrays {
    public static void main(String[] args) {
        /*en este ejercicio se citaran diferentes maneras 
         * de declarar un array y las diferentes maneras de 
         * recorrerlos.
         */
        /*para definir un array se necesitan 
        los siguientes elementos  */
        //primera mandera de declarar
        int[] primer_arreglo=new int[5];
        primer_arreglo[0]=15;
        primer_arreglo[1]=25;
        primer_arreglo[2]=8;
        primer_arreglo[3]=-7;
        primer_arreglo[4]=92;


        //segunda manera de declarar 
        int[] segundo_arreglo={1, 38, -45, 5, 23};


        //realizando un arreglo de estring para recorrer con 
        //foreach
        String[] paises=new String[8];

        paises[0]="Mexico";
        paises[1]="España";
        paises[2]="Estados Unidos";
        paises[3]="Colombia";
        paises[4]="Chile";
        paises[5]="Argentina";
        paises[6]="Brasil";
        paises[7]="Noruega";



        /*para recorrer un array podemos utilizar el ciclo for o 
         * foreach, aunque existen mas opciones para recorrerlo
         */

        for(int i=0;i<primer_arreglo.length;i++){
            System.out.println("posicion -> "+(i+1)+" con el valor-> "+primer_arreglo[i]);
        }
        System.out.println("Segundo arreglo para imprimir:");
        for(int i=0;i<segundo_arreglo.length;i++){
            System.out.println("posicion -> "+(i+1)+" con el valor-> "+segundo_arreglo[i]);
        }


        /*reccorriendo arreglo de paises con foreach */
        //se seleciona una palabra clave qie reconocera el forech 
        //y se iguala al nombre del arreglo en este caso elemnto : paises 
        for(String elemento:paises){
            System.out.println(elemento);
        }

    }
}
