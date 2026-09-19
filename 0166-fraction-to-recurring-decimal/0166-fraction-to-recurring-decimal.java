import java.util.*;
class Solution{
    public String fractionToDecimal(int numerator,int denominator){
        if (numerator==0){
            return "0";
        }
        StringBuilder result=new StringBuilder();
        if ((numerator<0)^ (denominator < 0)){
            result.append("-");
        }
        long num=Math.abs((long)numerator);
        long den=Math.abs((long)denominator);
        result.append(num / den);
        long remainder = num % den;
        if (remainder == 0) {
            return result.toString();
        }
        result.append(".");
        HashMap<Long, Integer> map = new HashMap<>();
        while (remainder != 0) {
            if (map.containsKey(remainder)) {
                int index = map.get(remainder);
                result.insert(index, "(");
                result.append(")");
                break;
            }
            map.put(remainder, result.length());
            remainder = remainder * 10;
            result.append(remainder / den);
            remainder = remainder % den;
        }
        return result.toString();
    }
}