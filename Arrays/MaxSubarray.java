import java.util.*;

public class MaxSubarray{
    public int Solution(List<Integer> a){
        int maxSofar = a.get(0);
        int maxEndingHere = a.get(0);

        for(int i=1;i<a.size();i++){
            maxEndingHere = Math.max(maxEndingHere + a.get(i),a.get(i));
            maxSofar = Math.max(maxSofar,maxEndingHere);
        }

        return maxSofar;
    }
}