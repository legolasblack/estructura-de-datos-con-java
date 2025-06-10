
public class Tipos_Variables {
    /*En este programa inical veremos los tipos de variables declarables en java
     * asi como la manera de hacerlo y de instanciarlas
     */
    
    public static void main(String[] args) {
        byte edad;
        edad =30;

        
        //Esta manera de declarar una variable es primero delcarando 
        //el tipo de dato y despues en el codigo la iniciqlizamos 

        int edad2 = 45 ;
        //tambien se puede inicializar el valor de la variable en
        //el mismo renglon
        


        System.out.println("Esta es la edad: "+ edad);
        System.out.println("Esta es la edad: "+ edad2);
       /*
 Tipos de datos en Java:

 1. Enteros:
    - byte   : Ocupa 8 bits, almacena números enteros entre -128 y 127.
    - short  : Ocupa 16 bits, almacena números enteros entre -32,768 y 32,767.
    - int    : Ocupa 32 bits, almacena números enteros más grandes entre -2,147,483,648 y 2,147,483,647.
    - long   : Ocupa 64 bits, almacena números enteros muy grandes. Se le debe agregar una 'L' al final (ej: 15000000000L).

 2. Decimales:
    - float  : Ocupa 32 bits, almacena números con decimales de menor precisión. Se le debe agregar una 'f' al final (ej: 5.75f).
    - double : Ocupa 64 bits, almacena números decimales de doble precisión (por defecto para números decimales).

 3. Carácter:
    - char   : Ocupa 16 bits, almacena un solo carácter Unicode (ej: 'A', 'b', '9').

 4. Booleano:
    - boolean: Solo puede tomar dos valores: true o false.

 5. Objeto (No primitivo):
    - String : Almacena cadenas de texto. Es un objeto, no un tipo primitivo. (ej: "Hola Mundo").

 Ejemplo de uso:
 ---------------------------------------------------------
 byte edad = 25;
 short año = 2024;
 int poblacion = 1000000;
 long distancia = 9876543210L;

 float precio = 19.99f;
 double pi = 3.14159265359;

 char inicial = 'J';
 boolean esJavaFacil = true;

 String saludo = "Hola Mundo";
 ---------------------------------------------------------
 */
    }
}
