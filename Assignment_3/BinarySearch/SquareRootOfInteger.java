import java.util.*;

public class SquareRootOfInteger{
    public int sqrt(int a){
        int low = 0;
        int high = a;

        while(low <= high){
            long mid = (long)(low+high)/2;
            if(mid * mid == a)return (int)mid;
            else if(mid * mid < a){
                low = (int)mid +1;
            }else{
                high = (int)mid - 1;
            }
        }

        return high;
    }
}