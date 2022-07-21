import java.io.*;
import java.util.*;

public class Swapper {
    public static void main(String[] args) {
        int A;
        System.out.println("Swapping of Number");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Value for the X");
        int X = scan.nextInt();
        System.out.println("Enter the Value for the Y");
        int Y = scan.nextInt();
        System.out.println("After Swapping number are");
        A=X;
        X=Y;
        Y=A;
        System.out.println("the numbers"+ X +" and " +Y+"" );


    }
}