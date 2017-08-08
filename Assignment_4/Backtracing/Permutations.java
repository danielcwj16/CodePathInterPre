/**
 * Given a collection of numbers, return all possible permutations.

Example:

[1,2,3] will have the following permutations:

[1,2,3]
[1,3,2]
[2,1,3] 
[2,3,1] 
[3,1,2] 
[3,2,1]
 */

 import java.util.*;

 public class Permutations{
     public ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> a){
         ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
         if(a == null || a.size()==0)
            return res;
        boolean[] visited = new boolean[a.size()];
        helper(res,a,visited,new ArrayList<Integer>());
        return res;
     }

     public void helper(ArrayList<ArrayList<Integer>> res,ArrayList<Integer> a,boolean[] visited,ArrayList<Integer> sub){
        if(sub.size() == a.size())
            {
                res.add(new ArrayList<Integer>(sub));
                return;
            }
        for(int i = 0;i<a.size();i++){
            if(visited[i]!= true){
                sub.add(a.get(i));
                visited[i] = true;
                helper(res,a,visited,sub);
                sub.remove(sub.size()-1);
                visited[i] = false;
            }
        }
     }
 }