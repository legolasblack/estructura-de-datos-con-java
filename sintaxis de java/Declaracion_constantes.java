public class Declaracion_constantes {
    /*En esta programa corto declararemos rapidamente 
     * un programa que utilice una constante 
     * 
     * Las constantes reservaciones en memoria similar 
     * a una variable a diferencia que este no cambia 
     * su valor durante la ejecucion del programa y es utilizada
     * para fijar valores estaticos como la conversion entre 
     * medidas unitarias.
     */
    public static void main(String[] args) {

        //para declarar una variable constante solo se necesita 
        //poner la palabra final antes de tipo de dato 
        final float LIBRA= (float) 2.20462;
        int peso=100;
        float pesolibra=0;

        pesolibra= peso *LIBRA;


        System.out.println("El peso del toro es: "+ peso +" kilos.");
        System.out.println("El peso del toro en libras es :"+ pesolibra +" libras.");
    }
    
}
