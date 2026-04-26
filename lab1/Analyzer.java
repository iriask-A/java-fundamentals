package lab1;

import java.util.Scanner;
class Data {
    private double sum;
    private double maximum;
    private int count;
    public Data(){
        sum = 0;
        count = 0;
        maximum = -Double.MAX_VALUE;
    }
    public void Add(double value){
        sum+=value;
        count++;
        if(value>maximum){
            maximum = value;
        }
    }
    public double Average(){
        if(count==0){
            return 0;
        }
        return sum/count;
    }
    public double Max(){
        return maximum;
    }
}

public class Analyzer {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        Data data = new Data();
        while(true){
            System.out.print("Enter number (Q to quit): ");
            String input = in.next();
            if(input.equalsIgnoreCase("Q")){
                break;
            }
            try{
                double value = Double.parseDouble(input);
                data.Add(value);
            }
            catch(NumberFormatException e){
                System.out.println("Invalid input. Please enter a number or 'Q' to quit.");
            }
        }
        System.out.println("Average = " + data.Average());
        System.out.println("Maximum = " + data.Max());
    }
}