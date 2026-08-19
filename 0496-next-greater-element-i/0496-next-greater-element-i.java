import java.util.*;
//n1= nums1, n2= nums2
class Solution{
    public int[]nextGreaterElement(int[]n1,int[]n2){
        Stack<Integer> stack=new Stack<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        // Process n2 from right to left
        for (int i=n2.length-1;i>= 0;i--){
            // Remove elements that cannot be the next greater
            while (!stack.isEmpty()&&stack.peek()<= n2[i]){
                stack.pop();
            }
            // If stack is empty, no greater element exists
            if (stack.isEmpty()) {
                map.put(n2[i],-1);
            } else {
                map.put(n2[i],stack.peek());
            }
            // Add current element to stack
            stack.push(n2[i]);
        }
        // Build answer for nums1
        int[] ans=new int[n1.length];
        for (int i=0;i<n1.length;i++){
            ans[i]=map.get(n1[i]);
        }
        return ans;
    }
}