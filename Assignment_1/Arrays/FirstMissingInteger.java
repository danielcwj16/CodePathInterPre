import java.util.*;

public class FirstMissingInteger {
    public int firstMissingPositive(ArrayList<Integer> a) {
        if (a == null || a.size() == 0)
            return 1;

        for (int i = 0; i < a.size(); i++) {
            while (a.get(i) > 0 && a.get(i) < a.size() && a.get(a.get(i) - 1) != a.get(i))
                swap(a, i, a.get(i) - 1);
        }

        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) != i + 1)
                return i + 1;
        }
        return a.size() + 1;
    }

    public void swap(ArrayList<Integer> a, int i, int j) {
        int temp = a.get(i);
        a.set(i, a.get(j));
        a.set(j, temp);
    }
}