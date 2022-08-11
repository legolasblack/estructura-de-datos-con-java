/**
 * Recursividad_fibonacci
 * 
 */
public class Recursividad_fibonacci {

    public static void main(String[] args) {
        long inicio=0;
        long comodin=0;

        recorrido(comodin, inicio);
        
        
    }

    public static void recorrido(long num1, long num2){
        if(num2==0){
            System.out.println("Comenzamos con la sucecion");
            System.out.println("posicion= "+ num2);
            recorrido(num2,num2+1);
        }
    else{
        System.out.println("posicion= "+ num2);
        try {
            Thread.sleep(500);
            recorrido(num2, num2+num1);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }
    }

}