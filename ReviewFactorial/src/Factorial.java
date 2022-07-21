import java.io.*;
import java.util.*;

public class Factorial {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the number you want to factorial");
        int num = scan.nextInt();
        long  fact =1;
        for(int i =1; i<=num; i++ ){
            fact *= i;
        }
        System.out.println("Ther Factorial is "+ fact );

    }
}