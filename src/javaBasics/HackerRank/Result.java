package javaBasics.HackerRank;

import java.util.ArrayList;
import java.util.List;

public class Result {
    public static List<Integer> findCompletePrefixes(List<String> names, List<String> query) {
        // Write your code here
        int l= query.size();
        int[] numPrefix = new int[l];
        for(int k=0;k<l;k++){
            numPrefix[k] =0;
        }
        for(String s:names){
            for(int i=0;i<l;i++){
                if(s.startsWith(query.get(i))){
                    numPrefix[i]++;
                }
            }
        }
        List<Integer> numPrefixList = new ArrayList<Integer>(numPrefix.length);
        for(int i: numPrefix){
            numPrefixList.add(i-1);
        }
        return numPrefixList;
    }

    public static void main(String[] args) {
        List<String> names = new ArrayList<String>();
        names.add("steve");
        names.add("stevens");
        names.add("danny");
        names.add("steves");
        names.add("dan");
        names.add("john");
        names.add("johnny");
        names.add("joe");
        names.add("alex");
        names.add("alexander");
        List<String> query = new ArrayList<String>();
        query.add("steve");
        query.add("alex");
        query.add("joe");
        query.add("john");
        query.add("dan");
        System.out.println(findCompletePrefixes(names,query));
    }
}
