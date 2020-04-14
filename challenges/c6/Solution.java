import java.io.*;
import java.util.*;

public class Solution {
    private static final Scanner scanner = new Scanner(System.in);
    

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        while(scanner.hasNextLine()){
            String s = scanner.nextLine();
            //scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            for(int i=0;i<s.length();i+=2){
                System.out.print(s.charAt(i));

            }
            System.out.print(" ");


            


            for(int i=1;i<s.length();i+=2){
                System.out.print(s.charAt(i));

            }
            System.out.println();

        }

        scanner.close();
        
    }
}