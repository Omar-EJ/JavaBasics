package javaBasics.HackerRank;
import java.util.Scanner;
public class SmallestLargest {
        public static String getSmallestAndLargest(String s, int k) {
            String smallest = "";
            String largest = "";
            String[] substrings = new String[1];
            for (int i = 0; i <= s.length() - k; i++) {
                String substr = s.substring(i, i + k);
                substrings[i]=substr;
                String[] temp = new String[substrings.length+1];
                for(int j=0;j<substrings.length;j++){
                    temp[j] = substrings[j];
                }
                substrings = temp;

            }
            smallest = substrings[0];
            largest = smallest;
            for(int i=1;i<substrings.length-1;i++){
                if(substrings[i].compareTo(smallest)<0 ){
                    smallest = substrings[i];
//                    tempSmall = substrings[i];
                }
                if(substrings[i].compareTo(largest)>=0 ){
                    largest = substrings[i];
                }
            }

            return smallest + "\n" + largest;
        }


        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String s = scan.next();
            int k = scan.nextInt();
            scan.close();

            System.out.println(getSmallestAndLargest(s,k));
        }

}
