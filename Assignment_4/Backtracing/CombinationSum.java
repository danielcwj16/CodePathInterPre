/**
 * Given a set of candidate numbers (C) and a target number (T), find all unique combinations in C where the candidate numbers sums to T.

The same repeated number may be chosen from C unlimited number of times.

 Note:
All numbers (including target) will be positive integers.
Elements in a combination (a1, a2, … , ak) must be in non-descending order. (ie, a1 ≤ a2 ≤ … ≤ ak).
The combinations themselves must be sorted in ascending order.
CombinationA > CombinationB iff (a1 > b1) OR (a1 = b1 AND a2 > b2) OR … (a1 = b1 AND a2 = b2 AND … ai = bi AND ai+1 > bi+1)
The solution set must not contain duplicate combinations.
Example, 
Given candidate set 2,3,6,7 and target 7,
A solution set is:

[2, 2, 3]
[7]
 Warning : DO NOT USE LIBRARY FUNCTION FOR GENERATING COMBINATIONS.
Example : itertools.combinations in python.
If you do, we will disqualify your submission retroactively and give you penalty points. 
 */

import java.util.*;

public class CombinationSum {
    public ArrayList<ArrayList<Integer>> combinationSum(ArrayList<Integer> a, int b) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> com = new ArrayList<Integer>();
        if (a == null || a.size() == 0)
            return res;
        ArrayList<Integer> unique = new ArrayList<Integer>();
        Collections.sort(a);
        unique.add(a.get(0));
        for(int i =0;i<a.size();i++){
            if(i!=0 && a.get(i)!= a.get(i-1))
                unique.add(a.get(i));
        }
        helper(res,new ArrayList<Integer>(),unique,b,0);
        return res;
    }

    public void helper(ArrayList<ArrayList<Integer>> res, ArrayList<Integer> com, ArrayList<Integer> unique, int b,int index) {
        if (b == 0) {
            res.add(new ArrayList<Integer>(com));           
            return;
        }
        if( b < 0)
            return;

        for(int i = index;i<unique.size();i++)
        {
            int num = unique.get(i);
            com.add(num);
            helper(res,com,unique,b-num,i);
            com.remove(com.size()-1);
        }
    }
}