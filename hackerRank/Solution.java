 package hackerRank;
/*
import java.util.Scanner;

public class OutputFormatting {
    public static void main(String[] args) {
       try {
        int maxLength = 10;
        String[] msgArray = new String[3];
        int[] intArray = new int[3];
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            msgArray[i] = scan.next();
            while (msgArray[i].length() > maxLength) {
                System.out.println("El texto es mayor a 10 espacios, reintenta");
                msgArray[i] = scan.nextLine();
            }
            intArray[i] = scan.nextInt();
            while (intArray[i] < 0 && intArray[i] > 999) {
                System.out.println("El numero no esta en el rango, reintenta");
                intArray[i] = scan.nextInt();
            }
        }
        System.out.println("================================");
        for(int j = 0; j< msgArray.length;j++){
            System.out.printf("%-15s %03d%n", msgArray[j], intArray[j]);
        }
        System.out.println("================================");
       } catch (Exception e) {
        System.out.println(e.getMessage());
       }

    }

} */

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            try {
        int maxLength = 10;
        String[] msgArray = new String[3];
        int[] intArray = new int[3];
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            msgArray[i] = scan.next();
            while (msgArray[i].length() > maxLength) {
                System.out.println("El texto es mayor a 10 espacios, reintenta");
                msgArray[i] = scan.nextLine();
            }
            intArray[i] = scan.nextInt();
            while (intArray[i] < 0 && intArray[i] > 999) {
                System.out.println("El numero no esta en el rango, reintenta");
                intArray[i] = scan.nextInt();
            }
        }
        System.out.println("================================");
        for(int j = 0; j< msgArray.length;j++){
            System.out.printf("%-15s %03d%n", msgArray[j], intArray[j]);
        }
        System.out.println("================================");
       } catch (Exception e) {
        System.out.println(e.getMessage());
       }


    }
}
