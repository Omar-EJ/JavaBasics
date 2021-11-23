package javaBasics.HackerRank;

import java.util.Scanner;

public class Anagrams {
    public static boolean anagram(String string1, String string2){

        if (string1.length() != string2.length()) {
            return false;
        }
        int count[] = new int[256];
        for (int i = 0; i < string1.length(); i++) {
            count[string1.charAt(i)]++;
            count[string2.charAt(i)]--;

        }
        for (int i = 0; i < 256; i++) {
            if (count[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        if(anagram(s1,s2)){
            System.out.println("Anagrams");
        }
        else{
            System.out.println("Not Anagrams");
        }
    }
}
