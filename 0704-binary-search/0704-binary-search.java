class Solution{
    public int search(int[]n,int t){
        //n=nums,t=target,i=left,j=right
        int i=0;
        int j=n.length-1;
        while (i<=j){
            int mid=i+(j-i)/2;
            if (n[mid]==t){
                return mid;
            } else if (n[mid]<t){
                i=mid+1;
            } else{
                j=mid-1;
            }
        }
        return -1;
    }
}
