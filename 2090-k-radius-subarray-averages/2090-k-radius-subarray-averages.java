class Solution {
    public int[] getAverages(int[] nums, int k) {
        int n = nums.length;
        int[] ans = new int[n];

        java.util.Arrays.fill(ans, -1);

        if (2 * k + 1 > n) {
            return ans;
        }

        long Sum = 0;
        int Size = 2 * k + 1;

        for (int i = 0; i < Size; i++) {
            Sum += nums[i];
        }
        ans[k] = (int) (Sum / Size);

        for (int j = k + 1; j < n - k; j++) {
            Sum -= nums[j - k - 1];
            Sum += nums[j + k];

            ans[j] = (int) (Sum / Size);
        }

        return ans;
    }
}