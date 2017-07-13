import java.util.*;

public class ReverseString{
    public String Solution(String s){
         if(s == null || s.isEmpty())
            return "";
        int len = s.length();
        StringBuilder sb = new StringBuilder();
        StringBuilder p = new StringBuilder();
        for(int i = 0;i<len;i++){
            if(s.charAt(i) == ' ')
            {
                if(p.length() != 0){
                    sb.insert(0,p.toString()).insert(0,' ');
                p.setLength(0);}
                else{
                continue;
                }
            }                
            else{
                p.append(s.charAt(i));
            }
        }
        sb.insert(0,p.toString());
        if(sb.length() > 0 &&sb.charAt(0) == ' ') 
            sb.deleteCharAt(0);
        return sb.toString();
    }
}