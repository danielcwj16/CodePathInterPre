import java.util.*;

public class CountAndSay {
    public String solution(int a) {
        if (a == 0)
            return "0";
        String res = "1";
        for (int i = 1; i < a; i++) {
            res = helper(res);
        }

        return res;
    }

    public String helper(String str) {
        int count = 0;
        char c = str.charAt(0);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char cur = str.charAt(i);
            if (c == cur) {
                count++;
            } else {
                sb.append(count).append(c);
                c = cur;
                count = 1;
            }
        }

        sb.append(count).append(c);
        return sb.toString();
    }
}