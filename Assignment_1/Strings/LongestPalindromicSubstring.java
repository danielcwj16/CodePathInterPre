import java.util.*;

public class LongestPalindromicSubstring{
    public String solution(String a){
        if(a == null)
            return null;
        if(a.length()==1)
            return a;
        String longest = "";
        String longestStr = "";
        for(int i=0;i<a.length();i++){
            String palin1 = findPalindrome(a,i,i);
            String palin2 = findPalindrome(a,i,i+1);
            if(palin1.length()>longest.length())
                longest = palin1;
            if(palin2.length()>longest.length())
                longest = palin2;
        }
        return longest;
    }

    public String findPalindrome(String s,int i,int j){
        while(i>=0&&j<s.length()&&s.charAt(i)==s.charAt(j)){
            i--;
            j++;
        }
        return s.substring(i+1,j);
    }
}