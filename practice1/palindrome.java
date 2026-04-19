package practice1;

import java.util.Scanner;
public class palindrome {
    public static String isPalindrome(String x){
        boolean res = true;
        for(int i =0;i<=Math.ceil(x.length()/2);i++){
            if(x.charAt(i)!=x.charAt(x.length()-i-1)){
                res = false;
                break;
            }
        }
        if(res == true){
            return "It is palindrome";
        }
        else{
            return "It is not palindrome";
        }
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the word: ");
        String word = in.nextLine();
        System.out.println(isPalindrome(word));
    }
}