package practice1;

import java.util.Scanner;
public class roots{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the a: ");
        double a = in.nextDouble();
        System.out.println("Enter the b: ");
        double b = in.nextDouble();
        System.out.println("Enter the c: ");
        double c = in.nextDouble();
        double d = b*b-4*a*c;
        if(d<0){
            System.out.println("D is negative!");
        }
        else{
            if(b!=0){
            double root1 = (0-b+Math.sqrt(d))/(2*a);
            double root2 = (0-b-Math.sqrt(d))/(2*a);
        System.out.println("The roots are "+root1+" and "+root2);}
            else{
            double root = (0-b+Math.sqrt(d))/(2*a);
             System.out.println("The root is "+root);
            }
        }
    }
}