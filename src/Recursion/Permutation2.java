package Recursion;
/**
 * Leetcode 47
 */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Permutation2 {
    public static List<List<Integer>> permuteUnique(int[] nums) {
        boolean[] visited = new boolean[nums.length];
        List<List<Integer>> resultlist = permute(new ArrayList<Integer>(), nums, visited);
        List<List<Integer>> listWithoutDuplicates = new ArrayList<>(
                new HashSet<>(resultlist));
        return listWithoutDuplicates;

    }

    public static List<List<Integer>> permute(ArrayList<Integer> cur, int[] nums, boolean[] visited){
        List<List<Integer>> result = new ArrayList<List<Integer>>();

        if(cur.size() == nums.length){
            result.add(new ArrayList<Integer>(cur));

            return result;
        }

        for (int i = 0; i < nums.length; i++){
            if(visited[i]){
                continue;
            }
            cur.add(nums[i]);
            visited[i] = true;
            result.addAll(permute(cur, nums, visited));
            cur.remove(cur.size()-1);
            visited[i] = false;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,1,2};

        List<List<Integer>>  result = Permutation2.permuteUnique(nums);
        for(List<Integer> i : result){
            System.out.println(i);
        }

    }


}
