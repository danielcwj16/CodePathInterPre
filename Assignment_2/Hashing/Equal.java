import java.util.*;
public class Equal {
    public ArrayList<Integer> equal(ArrayList<Integer> a) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        int len = a.size();
        
        for(int i=0;i<=len-4;i++){
            for(int j=i+1;j<len;j++){
                int c1 = len;
                int d1 = -1;
                map.clear();
                int sum = a.get(i) + a.get(j);
                for(int k = i+1;k<len;k++){
                    if(k!=j){
                        int num = a.get(k);
                        if(map.containsKey(num)){
                            if(map.get(num)<c1){
                                c1 = map.get(num);
                                d1 = k;
                            }
                        }else if(!map.containsKey(sum-num)){
                            map.put(sum-num,k);
                        }
                    }
                }
                if(c1 != len){
                    result.add(i);
                    result.add(j);
                    result.add(c1);
                    result.add(d1);
                    return result;
                }
            }
        }
        return result;
    }

}