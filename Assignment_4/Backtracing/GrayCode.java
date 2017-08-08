/**
 * G(i) = i^(i/2)
 */

import java.util.*;

public class GrayCode{
    public ArrayList<Integer> grayCode(int n){
        ArrayList<Integer> res= new ArrayList<Integer>();
        if(n == 0){
            res.add(0);
            return res;
        }
        res = grayCode(n-1);
        int len = res.size();
        for(int i = len-1;i>=0;i--){
            int addNum = 1<<(n-1);
            res.add(res.get(i)+addNum);
        }

        return res;
    }

}