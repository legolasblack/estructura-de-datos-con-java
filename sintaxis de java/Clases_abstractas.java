public class Clases_abstractas {

    /*
     * En esta clase se define una clase abstracta, en resumen una clase abstracta
     * es aquella que posee
     * metodos abtractos los cuales con metodos que no estan definidos en la clase
     * padre pero se esta
     * obligado a definir estos metodos en las clases hijo, las clases abstractas no
     * puede ser instanciadas
     * mayor definicion en la parte final del codigo
     * 
     * en este caso hicimoe la clase abstracta animal y las clases perro y gato la heredan 
     * teniendo un metodo abstracto el cual es forzoso declararlo para que el codigo no tenga 
     * errores
     */

    public static void main(String[] args) {
        Perro perro = new Perro();
        Gato gato = new Gato();
        perro.eat();
        gato.eat();

    }

}

// definicion de clases

abstract class Animal_abstract {

    public void Make_Sound() {
        System.out.println("grrrr");
    }

    public abstract void eat();
}

class Perro extends Animal_abstract {

    public void Make_Sound() {
        System.out.println("guau");
    }

    public void eat() {
        System.out.println("croquetas para perro");
    }

}

class Gato extends Animal_abstract {

    public void Make_Sound() {
        System.out.println("miau");
    }

    public void eat() {
        System.out.println("pescado");
    }
}

/*
 * Notas:
 * link:
 * https://codigofacilito.com/articulos/clases-abstractas-interfaces-java
 * 
 * Clases abstractas
 * Comencemos hablando de clases abstractas.
 * 
 * Habrá ocasiones en las cuales necesitemos crear una clase padre donde
 * únicamente coloquemos la estructura de una abstracción, una estructura muy
 * general, dejando que sean las clases hijas quienes definan los detalles. En
 * estos casos haremos uso de las clases abstractas.
 * 
 * Una clase abstracta es practicamente identica a una clase convencional; las
 * clases abstractas pueden poseer atributos, métodos, constructores, etc ... La
 * principal diferencia entre una clases convencional y una clase abstracta es
 * que la clase abstracta debe poseer por lo menos un método abstracto. Ok, pero
 * ahora, ¿ Qué es un método abstracto? Verás, un método abstracto no es más que
 * un método vacío, un método el cual no posee cuerpo, por ende no puede
 * realizar ninguna acción. La utilidad de un método abstracto es definir qué se
 * debe hacer pero no el cómo se debe hacer.
 * 
 * Veamos un ejemplo para que nos quede más en claro.
 * 
 * public class Figura {
 * 
 * private int numeroLados;
 * 
 * public Figura() {
 * 
 * this.numeroLados = 0;
 * }
 * 
 * public float area() {
 * return 0f;
 * }
 * }
 * En este caso la clase posee una atributo, un constructor y un método, a
 * partir de esta clase podré generar la n cantidad de figuras que necesite, ya
 * sean cuadrados, rectangulos, triangulos, circulos etc...
 * 
 * Dentro de la clase encontramos el método área, método que se encuentra
 * pensado para obtener el área de cualquier figura, sin embargo cómo sabemos
 * todas las figuras poseen su propia fórmula matemática para calcular su área.
 * Si yo comienzo a heredar de la clase Figura todas las clases hijas tendrían
 * que sobre escribir el método área e implementar su propia formula para así
 * poder calcular su área. En estos casos, en los casos la clase hija siempre
 * deba que sobreescribir el método lo que podemos hacer es convertir al método
 * convencional en un método abstracto, un método que defina qué hacer, pero no
 * cómo se deba hacer. 😃
 * 
 * public abstract float area();
 * Ahora que el método área es un método abstracto la clase se convierte en una
 * clase abstracta.
 * 
 * public abstract class Figura {
 * Es importante mencionar que las clases abstractas pueden ser heredadas por la
 * n cantidad de clases que necesitemos, pero no pueden ser instanciadas. Para
 * heredar de una clase abstracta basta con utilizar la palabra reservada
 * extends.
 * 
 * public class Triangulo extends Figura {
 * Al nosotros heredar de una clase abstracta es obligatorio implementar todos
 * sus métodos abstractos, es decir debemos definir comportamiento, definir cómo
 * se va a realizar la tarea.
 */