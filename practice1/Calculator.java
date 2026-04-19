package practice1;

import java.util.Scanner;
public class Calculator {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int a;
        System.out.println("Enter the side of the square: ");
        a = in.nextInt();
        System.out.println("The area of the sqare is: "+a*a);
        System.out.println("The perimeter of the sqare is: "+a*4);
        System.out.println("The diagonal length of the sqare is: "+a*Math.sqrt(2));
    }
}