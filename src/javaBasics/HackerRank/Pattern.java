package javaBasics.HackerRank;
import java.util.*;
import java.util.Scanner;
import java.util.regex.PatternSyntaxException;

public class Pattern {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        List<String> valid = new ArrayList<>();
        while(testCases>0){
            String pattern = in.nextLine();
            //Write your code
            try{
                java.util.regex.Pattern.compile(pattern);
                valid.add("Valid");
            }catch (PatternSyntaxException ex){
                valid.add("Invalid");
            }
            testCases-=1;
        }
        for(int i=0;i<valid.size();i++){
            System.out.println(valid.get(i));
        }
    }
}
