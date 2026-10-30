
class Solution {
    public int sumSubarrayMins(int[] arr) {
        int mod = 1000000007;
        int n = arr.length;
        long ans = 0;
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i <= n; i++) {
            int cur = (i == n) ? 0 : arr[i];

            while (!st.isEmpty() &&
                   arr[st.peek()] > cur) {
                int mid = st.pop();
                int left = st.isEmpty() ? mid + 1 : mid - st.peek();
                int right = i - mid;

                ans = (ans + (long) arr[mid] * left * right) % mod;
            }
            st.push(i);
        }
        return (int) ans;
    }
}
