import javax.swing.JOptionPane;

public class class_jpotionpane {
    public static void main(String[] args) {
        
        String nombre_usuario;
        int edad_usuario;

        nombre_usuario=JOptionPane.showInputDialog("Introduce tu nombre, porfavor:");
        System.out.println("hola "+ nombre_usuario);
        edad_usuario=Integer.parseInt(JOptionPane.showInputDialog("Introduce tu edad porfavor"));
        System.out.println("tu edad es : "+ edad_usuario);
 

        double num;
        double num_raiz;

        num=Double.parseDouble(JOptionPane.showInputDialog("Introduce un numero para sacarle raiz cuadrada:"));
        num_raiz=Math.sqrt(num);
        System.out.print("la raiz cuadrada de "+ num + " es ");
        System.out.printf("%1.2f", num_raiz);

    }

}
