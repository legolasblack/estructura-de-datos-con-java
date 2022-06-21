public class class_string {
/*en este ejemplo redactamos codigo coon la clase string 
 * y utilizar algunos de sus metodos 
 */
    public static void main(String[] args) {
        String nombre="legolas lothbrok";
        System.out.println("Mi nombre es: "+ nombre);
        System.out.println("Mi nombre tiene: "+ nombre.length()+" letras.");
        System.out.println("La primer letra de "+ nombre + " es " + nombre.charAt(0));


        int ultima_letra;
        ultima_letra=nombre.length();
        System.out.println("La ultima letra de "+ nombre + " es " + nombre.charAt(ultima_letra-1));
    

        String frase="hoy es un estupendo aqui en la biblioteca";
        String frase_resumen=frase.substring(0, 3);
        System.out.println(frase_resumen);


        String alumno1, alumno2;
        alumno1="diego";
        alumno2="Deigo";
        System.out.println("los alumnos son desiguales hasta este punto");
        System.out.println("1.- "+ alumno1 + " vs " +alumno2);
        System.out.println(alumno1.equals(alumno2));
        
        alumno2="diego";
        System.out.println("los alumnos ya son iguales hasta este punto");
        System.out.println("1.- "+alumno1+ " vs " +alumno2);
        System.out.println(alumno1.equals(alumno2)); 
    }
    
}
