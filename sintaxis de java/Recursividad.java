public class Recursividad {
    /*
     * La recursividad es una tecnica de programacion que nos ayuda a resolver un problema a travez
     * de la division del mismo y l amisma llemada dentro de la funcion, es decir consta de una funcion
     * que resuelve un problema y dentro de la misma ejecucion se vuelve a llamar a la misma funcion 
     * con efecto de seguir dividiendo el problema, hasta llegar a cumplir una condicion de paro 
     * que nos permita terminar el flujo de division, esta se realiza con un if en el cual se evalua si 
     * sigue repitiendoce la funciono o se detiene. 
     * 
     * en el siguiente ejemplo realizaremos el hola mundo de la recursividad :
     * El calculo de un numero factorial 
     * un numero factorial es aquel que se multiplica desde el uno hasta el mismo.
     * 
     * El problema dentro de este codigo es la cantidad de digitos que se tienen que almacnar dentro de 
     * los tipos de variables int o long, tienen limite de almacenaje 
     */
    public static void main(String[] args) {
        
        long resultado=0;
        long numero=14;

        resultado=factorial(numero);
        System.out.println("Este es el factorial: "+resultado+" de "+numero);
       
    }

    public static long factorial(long numero){

        if(numero==0){
            return 1;
        }
        else {
            return numero*factorial(numero-1);
        }
            
    }
}
