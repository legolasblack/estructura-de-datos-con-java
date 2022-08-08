import java.util.Scanner;

public class class_Scanner {
    /*En esta practica se construye un objeto de tipo Scanner el cual nos va a permitir 
     * mediante sus metodos poder capturar lineas y datos que el usuario 
     * quiera introducir por medio de la consola 
     */
    public static void main(String[] args) {
        String nombre_usuario;
        int edad;
        Scanner  entrada= new Scanner(System.in);
        //Es de vital importancia mandar el parametro System.in 

        System.out.println("Introduce tu nombre:");
        
        nombre_usuario=entrada.nextLine();

        System.out.println("Introduce tu edad:");

        edad=entrada.nextInt();

        System.out.println("hola "+ nombre_usuario);
        System.out.println("tu edad es : "+ edad);

        entrada.close();
         
    }
  
}
