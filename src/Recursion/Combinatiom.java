package Recursion;
/**
 * Leetcode 77
 */

import java.util.ArrayList;
import java.util.List;

public class Combinatiom {
    public static List<List<Integer>> combine(int n, int k) {
        return combine(n,k, new ArrayList<Integer>(), 1);
    }

    public static List<List<Integer>> combine(int n, int k, List<Integer> cur, int depth){
        List<List<Integer>> result = new ArrayList<List<Integer>>();

        if(cur.size() == k){
            result.add(new ArrayList<Integer>(cur));
            return result;
        }

        for (int i = depth; i < n+1; i++){
            cur.add(i);

            result.addAll(combine(n, k, cur, i+1));
            cur.remove(cur.size() - 1);

        }
        return result;
    }

    public static void main(String[] args) {
        int n = 4;
        int k = 2;
        List<List<Integer>> result = Combinatiom.combine(n,k);

        for (List<Integer> i : result){
            System.out.println(i);
        }

    }
}
