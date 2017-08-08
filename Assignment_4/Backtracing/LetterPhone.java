import java.util.*;

public class LetterPhone {
	public ArrayList<String> letterCombinations(String a) {
        HashMap<Character,String> map = new HashMap<Character,String>();
        map.put('0',"0");
        map.put('1',"1");
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");
        
        ArrayList<String> res = new ArrayList<String>();
        StringBuilder sb = new StringBuilder();
        helper(a,map,res,sb,0);
        return res;
    }
    
    public void helper(String digits,HashMap<Character,String> map,List<String> res,StringBuilder sb,int i){
        if(i> digits.length()-1){
            if(sb.length()!=0)
            res.add(sb.toString());
            return;
        }
        String letters = map.get(digits.charAt(i));
        for(int j = 0;j<letters.length();j++){
            sb.append(letters.charAt(j));
            helper(digits,map,res,sb,i+1);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}