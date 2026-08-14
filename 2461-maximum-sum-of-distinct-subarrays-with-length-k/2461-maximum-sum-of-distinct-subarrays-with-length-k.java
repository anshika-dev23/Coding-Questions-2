import java.util.HashMap;
class Solution{
    public long maximumSubarraySum(int[]nums,int k){
        HashMap<Integer,Integer>map =new HashMap<>();
        long sum=0;
        long ans=0;
        for (int i=0;i<nums.length;i++){
            sum += nums[i];
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            if (i>=k){
                int remove=nums[i-k];
                sum-=remove;
                map.put(remove,map.get(remove)-1);
                if (map.get(remove)==0){
                    map.remove(remove);
                      }
            }
            if (i>=k-1&&map.size()==k){
                ans=Math.max(ans,sum);
            }
        }
        return ans;
    }
}
               
        
