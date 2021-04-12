package Recursion;
/**
 * Leetcode 78
 */

import java.util.ArrayList;
import java.util.List;

public class Subset {
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        subsets(nums, result, new ArrayList<Integer>(), 0);
        return result;

    }


    public static void subsets(int[] nums, List<List<Integer>> result, List<Integer> tmp, int pos){

        result.add(new ArrayList<>(tmp));
        for(int i = pos; i < nums.length; i++){
            tmp.add(nums[i]);
            subsets(nums, result, tmp, i + 1);
            tmp.remove(tmp.size() - 1);
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3};
        List<List<Integer>> result = Subset.subsets(nums);
        for (List<Integer> i :result){
            System.out.println(i);
        }
    }
}
