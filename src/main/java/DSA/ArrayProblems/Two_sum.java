package DSA.ArrayProblems;

import java.util.Arrays;
import java.util.HashMap;

//problem statment :- Given An array of size N and an integer 'Target'.Find the indexes(i,j)
//of two numbers such that their sum is equal to target.
//you can assume that there will be only one pair. 
public class Two_sum {
    

    public static void main(String[] args) {
        int[] arr = {11,3,7,9,14,2};
        int target = 17;

        System.out.println(Arrays.toString(solutionOne(arr, target)));
    }


    //solution1- Brute Force Approach
    //Time complexity - O(n2) as we have to iterate 2 times
    //space complexity - O(1) constant as we are not using any extra space
    public static int[] bruteForceSolution(int[] arr, int target){
        int[] result = new int[2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                 if((arr[i] + arr[j]) == target){
                    result[0] = i;
                    result[1] = j;
                    break;
                 }                
            }            
        }
        return result;
    }

    //Optimization in this approach we will look for second number that will be target - current index value
    //we will save current index value in hashmap if that is not our second number
    //so when the index will reach on second number we will get saved first number in hashmap 
    public static int[] solutionOne(int[] arr, int target){
        int[] result = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int secondNo = target - arr[i];
            if (map.containsKey(secondNo)) {
               result[0] = map.get(secondNo);
               result[1] = i;
               break;
            }
            map.put(arr[i], i);            
        }
       return result;
    }



}
