import java.util.ArrayList;

public class Clases_Genericas {
    /*
     * Las clases genericas nos permiten reutilizar codigo
     * y de esta manera almacenar diferentes tipos de datos
     * como se utilizan los tamplates en c++, en java podemos
     * utilzar la clase ArrayList utilizando caracteristicas especiales
     * por ejemplo:
     * 
     * ArrayList<TipodeDato>
     * 
     * de esta manera el array list puede almacenar cualquier tipo de dato
     * que quicieramos almacenar, en el siguiente codigo veremos ejemplos y
     * como utlizar esta tecnica de programacion.
     * 
     * En esta practica se plantean dos arraylist, no se necesita para poder instanciar
     * la clase mas que el jdk y el paquete java util , en la practica contamos con dos tipos 
     * diferentes de listas una para strings y otra que almacena la clase Empleado 
     * definida en este mismo archivo, realizamos un pase de informacion de uno a otro.
     */

    public static void main(String[] args) {
        ArrayList<String> nombres_empeleados = new ArrayList<>();
        ArrayList<Empleado> empleados = new ArrayList<>();

        empleados.add(new Empleado("diego", "123455"));
        empleados.add(new Empleado("anallely", "123456"));
        empleados.add(new Empleado("dahlia", "123457"));
        empleados.add(new Empleado("gabriela", "123458"));

        for (int i = 0; i < empleados.size(); i++) {
            nombres_empeleados.add(empleados.get(i).getNombre());

        }
        for (int i = 0; i < nombres_empeleados.size(); i++) {
            System.out.println(nombres_empeleados.get(i));
        }
    }

}

class Empleado {
    private String nombre;
    private String nss;

    public Empleado(String nombre, String nss) {
        this.nombre = nombre;
        this.nss = nss;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNss(String nss) {
        this.nss = nss;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNss() {
        return nss;
    }

}
