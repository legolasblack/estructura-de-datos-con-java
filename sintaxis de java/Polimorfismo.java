/**
 * Polimorfismo
 * 
 * Existen tres maneras diferentes de instanciar  clases cuando hablamos de herencia, y esta aunado 
 * a un concepto llamado polimorfismo :
 * las siguientes ejemplicaciones obedecen a tener una clase animal que seria la padre 
 * y una clase leon que hereda de animal
 * esto nos ayuda a sobreescribir metodos que en las diferentes instancias realizan cosas diferentes. 
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
 * Podemos acceder solo a los atributos y metodos de la clase padre.
 * 
 * en la segunda manera de declararlo:
 * Animal leon=new Leon();
 * se puede acceder a los metodos y atributos de la clase padre y a los metodos sobresescritos del hijo
 * al igual que los atributos del hijo, los metodos sobrescritos en el hijo es el polimorfismo muchas 
 * formas para un solo metodo 
 * 
 * en la tercer manera 
 * Leon leon=new Leon();
 * se acceden solo a los metodos del hijo 
 */
public class Polimorfismo {
    public static void main(String[] args) {
        Animal g= new Gato();
        Animal p= new Perro();
        Animal leon= new Animal();
        Perro p2=new Perro();

        g.Make_Sound();
        p.Make_Sound();
        leon.Make_Sound();
        p2.Make_Sound();
    }
    
}

class Animal{

    public void Make_Sound(){
        System.out.println("grrrr");
    }
}

class Perro extends Animal{
    
    public void Make_Sound(){
        System.out.println("guau");
    }
}

class Gato extends Animal{
    
    public void Make_Sound(){
        System.out.println("miau");
    }
}