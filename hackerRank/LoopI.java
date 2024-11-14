package hackerRank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LoopI {

    public static void main(String[] args) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = 0;
        int result = 0;
        do {
            N = Integer.parseInt(bufferedReader.readLine().trim());
        } while (N <2 || N > 20);
        for(int i = 0; i<=9; i++){
            result = N * (i+1);
            System.out.println(N + " x " + (i+1) + " = " + result);
        }
        bufferedReader.close();
                
    }
}