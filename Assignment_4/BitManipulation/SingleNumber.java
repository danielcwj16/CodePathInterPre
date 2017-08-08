import java.util.*;
public class SingleNumber {
	// DO NOT MODIFY THE LIST
	public int singleNumber(final List<Integer> a) {
	    int result =0;
	    for(int num : a){
	        result = result ^ num;
	    }
	    
	    return result;
	}
}