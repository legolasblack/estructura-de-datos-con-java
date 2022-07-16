
public class Herencia {
    /*
     * esta practica ejemplificara la herencia entre clases la cual consta de que
     * una clase puede coger los
     * atributos de otra y de esta manera hacerlos propia, se planea tener dos
     * clases en las cual la primera
     * reservara los datos de un empleado y a continuacion una clase que sea en
     * especifico cajero para cambiar
     * algunos datos relevantes como las contraseñas para cobrar en el sistema y
     * para poder hacer cortes diarios
     * y sus horarios.
     * AL final se utilizara la clase main para imprimir los datos que se tengan
     * dentro de las clases demostrando
     * como la clase hijo puede acceder a sus propios datos declarados en la clase
     * padre.
     */

    /*
     * Notas:
     * 
     * para poder crear un constructor dentro de la herencia se necesita declarar en
     * la clase padre un constructor en blanco
     * y para poder crear un constructor en la clase hijo se utiliza la expresion
     * super con la cual es permitido llamar a cualquier
     * constructor de la clase padre.
     * Al momento de declarar las clases se declaran por fuera de la clase herencia para evitar problemas 
     * al instanciar de lo contratio se tendria que utilizar la siguiente sintaxis 
     * 
     * Herencia practica=new Herencia();
     * Cajero empleado1= practica.new Empleado();
     * 
     * las instancias entre padres e hijos se puede declarar tipo de dato padre y al instanciarlo 
     * se puede instanciar con la clase hijo como muestra el siguiente ejemplo(este es un concepto que se 
     * explicara en el polimorfismo consulta la practica polomorfismo.java):
     * 
     * Empleado empleado2 =new Cajero();
     * 
     * para una acomodo mas correcto de las clases es conveniente que cada clase se encontrase 
     * en un archivo diferente para cada clase de este modo se logra una mejor organizacion.
     */

    public static void main(String[] args) {
        Empleado empleado1 = new Cajero("enriqueto", "98243", "admin", "root", 400);
        //Cajero empleado2 = new Cajero("diego", "01238", "root", "admin", 500);
        System.out.println(empleado1.get_Name());
        System.out.println("Sueldo: "+ empleado1.get_sueldo());
        System.out.println("Sueldo con comisiones: " + empleado1.get_sueldo());
    }

}

class Empleado {

    protected String nombre;
    protected String nss;
    protected int sueldo;

    public Empleado(String nom, String numss, int suel) {
        this.nombre = nom;
        this.nss = numss;
        this.sueldo = suel;
    }

    public Empleado() {
    }

    public void set_Name(String nom) {
        this.nombre = nom;
    }

    public void set_Nss(String numss) {
        this.nss = numss;
    }

    public void set_Sueldo(int suel) {
        this.sueldo = suel;
    }

    public String get_Name() {
        return this.nombre;
    }

    public String get_Nss() {
        return this.nombre;
    }

    public int get_sueldo() {
        return this.sueldo;
    }

}

class Cajero extends Empleado {
    private String user;
    private String pass;

    public Cajero() {
        super();
    }

    public Cajero(String name, String numss, String us, String password, int suel) {
        super(name, numss, suel);
        this.user = us;
        this.pass = password;

    }

    public void set_User(String us) {
        this.user = us;
    }

    public void set_Nss(String password) {
        this.pass = password;
    }

    public String get_User() {
        return this.user;
    }

    public String get_Pass() {
        return this.pass;
    }

    public int get_sueldo(int comision) {
        int sueldo_total;
        sueldo_total = super.get_sueldo() + comision;
        return sueldo_total;
    }

}
