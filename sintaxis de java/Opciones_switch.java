import java.util.Scanner;

public class Opciones_switch {
    public static void main(String[] args) {
        int   opcion_elegida;
        Scanner entrada= new Scanner(System.in);
        System.out.println("1.- cuadrado \n2.- circulo \n3.- rectangulo \n4.- triangulo");
        /*En este caso de los dos rnglones comentados tratamos de hacer enfasis que en caso necesario
         * se puede utilizar una variable de reserva para la opsion o de no serlo se puede tomar la variable
         * directa al vuelo desde la funcion nextInt() con la instancia de Scanner con nombre entrada.
         */
        //opcion_elegida=entrada.nextInt();
       // switch(opcion_elegida){
        switch(entrada.nextInt()){
            case 1:
            System.out.println("elegiste el cuadrado");
            break;
            case 2:
            System.out.println("elegiste el circulo");
            break;
            case 3:
            System.out.println("elegiste el rectangulo");
            break;
            case 4:
            System.out.println("elegiste el triangulo");
            break;
            default:
            System.out.println("esta opcion no existe goodbye.");
        }    
    }
}
