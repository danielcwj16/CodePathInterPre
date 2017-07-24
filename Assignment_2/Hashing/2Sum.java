import java.util.*;

public class TwoSum {
    public ArrayList<Integer> twoSum(final List<Integer> a, int b) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        if (a == null || a.size() < 2)
            return res;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < a.size(); i++) {
            if (map.containsKey(b - a.get(i))) {

                res.add(map.get(b - a.get(i)) + 1);
                res.add(i + 1);
                return res;
            } else if (!map.containsKey(a.get(i))) {
                map.put(a.get(i), i);
            }
        }
        return res;
    }
}