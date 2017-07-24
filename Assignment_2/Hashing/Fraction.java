import java.util.*;

public class Fraction{
    public String fractionToDecimal(int numerator,int denominator){
        if(numerator == 0)
	        return "0";
	       
	    StringBuilder sb = new StringBuilder();
	    String sign = ((numerator > 0) ^ (denominator > 0)) ? "-" : "";
	    HashMap<Long,Integer> map = new HashMap<Long,Integer>();
	    sb.append(sign);
	    long num = Math.abs((long)numerator);
	    long den = Math.abs((long)denominator);
	    sb.append(num/den);
	    num %= den;
	    if(num == 0){
	        return sb.toString();
	    }
	    sb.append('.');
	    map.put(num,sb.length());
	    while(num != 0){
	        num *= 10;
	        sb.append(num/den);
	        num %= den;
	        if(map.containsKey(num)){
	            sb.insert(map.get(num),"(");
	            sb.append(")");
	            break;
	        }else{
	        map.put(num,sb.length());}
	    }
	    return sb.toString();
    }
}