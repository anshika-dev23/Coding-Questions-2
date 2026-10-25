import java.util.*;
class Solution{
    public List<Integer>findAnagrams(String s,String p){
        List<Integer> ans=new ArrayList<>();
        if (s.length()<p.length())return ans;
        int[] count=new int[26];
        for (char c:p.toCharArray()){
            count[c-'a']++;
        }
        int left=0,right=0;
        int required=p.length();
        while(right<s.length()){
            char c=s.charAt(right);
            if (count[c-'a']>0)
                required--;
            count[c-'a']--;
            right++;
            if(right-left==p.length()){
                if(required==0)
                    ans.add(left);
                char l=s.charAt(left);
                if(count[l-'a']>=0)
                    required++;
                count[l-'a']++;
                left++;
            }
        }
        return ans;
    }
}
    