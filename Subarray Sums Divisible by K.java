class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int[] freq = new int[k]; 
        int sum = 0;
        freq[0] = 1;

        int ans = 0;

        for (int num : nums) {
            sum += num;
            int remainder = (sum % k + k) % k; 
            ans += freq[remainder];
            freq[remainder]++; 
        }

        return ans;
    }
}
