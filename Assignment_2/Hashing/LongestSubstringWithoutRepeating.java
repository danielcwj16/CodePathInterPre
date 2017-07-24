import java.util.*;

public class LongestSubstringWithoutRepeating{
    public int lengthOfLongestSubstring(String a) {
	    if(a.length()== 0)
	        return 0;
	    int max = 0;
	    HashMap<Character,Integer> map = new HashMap<Character,Integer>();

	    for(int i=0,j=0;i<a.length();i++){
	        if(map.containsKey(a.charAt(i))){
	            j= Math.max(j,map.get(a.charAt(i))+1);
	        }
	        map.put(a.charAt(i),i);
	        max = Math.max(max,i-j+1);
	    }
	    return max;
	}
}