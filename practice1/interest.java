package practice1;

import java.util.Scanner;
public class interest {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your balance: ");
        double balance = in.nextDouble();
        System.out.println("The interest rate is: ");
        double int_rate = in.nextInt();
        System.out.println("The updated balance is "+ ((balance*int_rate)/100+balance));
    }
}