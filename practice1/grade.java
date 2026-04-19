package practice1;

import java.util.Scanner;
public class grade {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        float gr = in.nextFloat();
        if(gr>+0&&gr<=100){
        if(gr>=0&&gr<=49.4){System.out.println("F");}
        else if(gr>=49.5&&gr<54.5){System.out.println("Your grade is: D");}
        else if(gr>=54.5&&gr<59.5){System.out.println("Your grade is: D+");}
        else if(gr>=59.5&&gr<64.5){System.out.println("Your grade is: C-");}
        else if(gr>=64.5&&gr<69.5){System.out.println("Your grade is: C");}
        else if(gr>=69.5&&gr<74.5){System.out.println("Your grade is: C+");}
        else if(gr>=74.5&&gr<79.5){System.out.println("Your grade is: B-");}
        else if(gr>=79.5&&gr<84.5){System.out.println("Your grade is: B");}
        else if(gr>=84.5&&gr<89.5){System.out.println("Your grade is: B+");}
        else if(gr>=89.5&&gr<94.5){System.out.println("Your grade is: A-");}
        else{System.out.println("Your grade is: A");}
        }
    }
}