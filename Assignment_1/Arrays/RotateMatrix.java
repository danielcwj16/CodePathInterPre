import java.util.*;

public class RotateMatrix{
    public void Solution(ArrayList<ArrayList<Integer>> a){
        if(a == null)
	        return;
	   for(int i =0;i<a.size();i++)
	    for(int j=i;j<a.get(i).size();j++){
	        swap(a,i,j,j,i);
	    }
	    
	   for(int i=0;i<a.size();i++){
	       for(int j=0;j<a.get(i).size()/2;j++){
	           swap(a,i,j,i,a.get(i).size()-1-j);
	       }
	   }
	}
	public void swap(ArrayList<ArrayList<Integer>> a,int i,int j,int m,int n){
	    int temp = a.get(i).get(j);
	    a.get(i).set(j,a.get(m).get(n));
	    a.get(m).set(n,temp);
    }
}