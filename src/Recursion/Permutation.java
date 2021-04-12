package Recursion;
/**
 * Leetcode 46 Permutation
 */

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Permutation {
    public List<List<Integer>> permute(int[] nums) {

        return permute(new ArrayList<Integer>(), nums);
    }

    public List<List<Integer>> permute(List<Integer> cur, int[] nums){
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if(cur.size() == nums.length){
            result.add(new ArrayList<Integer>(cur));
            return result;
        }


        for (int i : nums){
            if(cur.contains(i)){
                continue;
            }
            cur.add(i);
            result.addAll(permute(cur, nums));
            cur.remove(cur.size()-1);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3};

        Permutation permutation = new Permutation();
        List<List<Integer>> result = permutation.permute(nums);
        for (List<Integer> list: result){
            System.out.println(list);
        }

    }
}
