class Solution{
    public boolean isAnagram(String s,String t){
        if(s.length()!=t.length()){
            return false;
        }
        char[]a=s.toCharArray();
        char[]b=t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        int i=0;
        int j=0;
        while(i<a.length&&j<b.length){
            if(a[i]!=b[j]){
                return false;
            }
            i++;
            j++;
        }
        return true;
    }
}