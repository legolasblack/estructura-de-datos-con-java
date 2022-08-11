public class Recursividad_torres_de_hanoi {
    /*
     * Definicion de las reglas del problema:
     *
     * La torre de Hanói es un juego mental o rompecabezas que consiste n tres
     * varillas verticales sobre las cuales están insertados un número de discos de
     * diferentes diámetros. La versión mas popular de este juego cuenta con cuatro
     * discos, pero existen modelos que van de los cinco a los ocho discos
     * diferentes.
     * 
     * Conforme aumenta el número de discos la dificultad del juego aumenta así como
     * el tiempo de resolución sin haber cometido ningún error.Las torres de Hanói
     * fueron inventadas por un matemático de origen francés llamado Édouard Lucas
     * en el año 1883 quien después de diseñar el juego comenzó a comercializarlo.
     * 
     * La Torres de Hanoi es un juego didáctico, muy ingenioso que busca agilizar el
     * pensamiento y el uso de la lógica personal para crear una técnica que permita
     * trasladar las piezas en un numero mínimo de pasos.
     * 
     * 
     * Regla 1:
     * no se puede mover mas de un disco a la vez
     * 
     * Regla 2:
     * no puedes poner un discom mayor encima de uno menor.
     * 
     * 
     * utilizaremos el siguiente algoritmo para resolverlo:
     * 
     * Algoritmo Torres de Hanói (Complejidad {\displaystyle \Theta
     * (2^{n}-1)}{\displaystyle \Theta (2^{n}-1)})
     * Entrada: Tres pilas de números origen, auxiliar, destino, con la pila origen
     * ordenada
     * 
     * Salida: La pila destino
     * 
     * si origen==1 entonces
     * mover el disco 1 de pila origen a la pila destino (insertarlo arriba de la
     * pila destino)
     * terminar
     * si no
     * hanoi({\displaystyle \scriptstyle \{1,\dots ,n-1\}}{\displaystyle
     * \scriptstyle \{1,\dots ,n-1\}},origen,destino, auxiliar) //mover todas las
     * fichas menos la más grande (n) a la varilla auxiliar
     * mover disco n a destino //mover la ficha grande hasta la varilla final
     * hanoi (auxiliar, origen, destino) //mover todas las fichas restantes,
     * 1...n–1, encima de la ficha grande (n)
     * terminar
     */
    public static void main(String[] args) {
        recorrido(3, 1, 2, 3);
        System.out.println("hemos terminado");
    }

     public static void recorrido(int aros, int origen, int auxiliar, int destino){
        if(aros==1){
            System.out.println("mover el disco de la torre "+ origen+ " la torre "+ destino );
        }
        else{
            recorrido(aros-1, origen, destino, auxiliar);
            System.out.println("mover disco de la torre "+origen+" a torre "+ destino);
            recorrido(aros-1, auxiliar, origen, destino);

        }
     }

}
