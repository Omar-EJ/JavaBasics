package javaBasics.HackerRank;
import java.io.*;
import java.util.*;
import java.util.regex.*;
public class Tokens {

    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String s = scan.nextLine();
            scan.close();
            if (s.trim().isEmpty()) {
                System.out.println(0);
            }
            else{
                String[] splitString = (s.replaceAll("^\\W+", "").split("[\\s!,?._'@]+"));
                System.out.println(splitString.length);
                for (String string : splitString) {
                    System.out.println(string);
                }
            }

    }
}
