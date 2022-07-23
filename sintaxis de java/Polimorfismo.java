/**
 * Polimorfismo
 * 
 * Existen tres maneras diferentes de instanciar clases cuando hablamos de
 * herencia, y esta aunado
 * a un concepto llamado polimorfismo :
 * las siguientes ejemplicaciones obedecen a tener una clase animal que seria la
 * padre
 * y una clase leon que hereda de animal
 * esto nos ayuda a sobreescribir metodos que en las diferentes instancias
 * realizan cosas diferentes.
 * 
 * class Animal{
 * .
 * .
 * .
 * }
 * 
 * class Leon extends Animal{
 * .
 * .
 * .
 * }
 * 
 * Animal leon=new Animal();
 * Animal leon=new Leon();
 * Leon leon=new Leon();
 * 
 * 
 * en la primera manera de declararlo:
 * Animal leon=new Animal();
 * Podemos acceder solo a los atributos y metodos de la clase padre o super clase.
 * 
 * en la segunda manera de declararlo:
 * Animal leon=new Leon();
 * se puede acceder a los metodos y atributos de la clase padre y a los metodos
 * que sobrescribes en la clase hijo de esta manera acceder a las dos clases sin 
 * poder acceder a los atributos de la clase hijo solo los sobrescritos.
 * al igual que los atributos del hijo, los metodos sobrescritos en el hijo es
 * el polimorfismo muchas
 * formas para un solo metodo
 * 
 * en la tercer manera
 * Leon leon=new Leon();
 * se acceden solo a los metodos del hijo
 */
public class Polimorfismo {
    public static void main(String[] args) {
        Animal leon = new Animal();
        Animal perro = new Perro();
        Gato gato = new Gato();
        Perro p2 = new Perro();

        // g.Make_Sound();
        // p.Make_Sound();
        // leon.Make_Sound();
        // p2.Make_Sound();
        leon.Make_Sound();
        perro.Name_animal();
        perro.Make_Sound();

        gato.Make_Sound();

    }

}

class Animal {

    public void Make_Sound() {
        System.out.println("grrrr");
    }

    public void Name_animal() {
        System.out.println("Soy un animal");
    }
}

class Perro extends Animal {

    public void Make_Sound() {
        System.out.println("guau");
    }

    public void Name_perro() {
        System.out.println("Soy un perro");
    }
}

class Gato extends Animal {

    public void Make_Sound() {
        System.out.println("miau");
    }

    public void Name_gato() {
        System.out.println("Soy un gato");
    }
}