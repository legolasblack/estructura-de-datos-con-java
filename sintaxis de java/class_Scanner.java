import java.util.Scanner;

public class class_Scanner {
    public static void main(String[] args) {
        String nombre_usuario;
        int edad;
        Scanner  entrada= new Scanner(System.in);

        System.out.println("Introduce tu nombre:");
        
        nombre_usuario=entrada.nextLine();

        System.out.println("Introduce tu edad:");

        edad=entrada.nextInt();

        System.out.println("hola "+ nombre_usuario);
        System.out.println("tu edad es : "+ edad);

        entrada.close();
         
    }
  
}
