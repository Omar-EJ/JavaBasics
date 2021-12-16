package javaBasics.HackerRank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Result2 {

    public static void closestNumbers(List<Integer> numbers) {
        // Write your code here

        Collections.sort(numbers);
        int l = numbers.size();
        //min value between two elements
        int min = 0;
        int temp = 0;
        //List<Integer> minList = new ArrayList<Integer>();
        for(int i=0;i<l-1;i++){

            min = Math.min(temp,numbers.get(i+1)-numbers.get(i));
            temp =numbers.get(i+1)-numbers.get(i);

        }
        for(int j=0;j<l-1;j++){
            if(numbers.get(j+1)-numbers.get(j)== min){
                System.out.println(numbers.get(j)+" "+numbers.get(j+1));
//
            };
        }
    }

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(-9);
        numbers.add(-5);
        numbers.add(9);
        numbers.add(10);
        numbers.add(12);
        closestNumbers(numbers);
    }
}
