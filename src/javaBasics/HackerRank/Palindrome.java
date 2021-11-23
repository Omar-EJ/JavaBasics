package javaBasics.HackerRank;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int l = A.length();
        boolean isPalindrome = true;
        for(int i=0;i<l/2;i++){
            if(A.charAt(i)!=A.charAt(l-1-i)){
                isPalindrome = false;
            }
        }
        if(isPalindrome){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
