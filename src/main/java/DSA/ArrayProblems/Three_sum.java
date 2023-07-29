package DSA.ArrayProblems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//problem statement - Given an array and a target we need to find 3 indexes from array which
//total will be equal to target
//all the indexes should be unique
public class Three_sum {
    

    public static void main(String[] args) {
        int[] arr = {7, -6, 3, 8, -1, -8, -11};
        int target = 0;
        //sample output = [-11,3,8][-6,-1,7]

        System.out.println(bruteForceApproach(arr, target).toString());

    }

    public static List<Set<Integer>> bruteForceApproach(int[] arr, int target){
        List<Set<Integer>> result = new ArrayList<>(); 
        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                for (int j2 = j + 1; j2 < arr.length; j2++) {
                    Set<Integer> list = new HashSet<Integer>();
                    if (arr[i] + arr[j] + arr[j2] == target) {
                        list.add(arr[i]);
                        list.add(arr[j]);
                        list.add(arr[j2]);

                        result.add(list);
                    }
                }
            }
        }
        return result;

    }


}
