// Sort the nums in the array, If the numbers are positive the maximum product lies in the last three elements in the array. If the numbers are negative, the first two nums and the last element gives maximum.

class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int c1 = nums[0]*nums[1]*nums[nums.length-1];
        int c2 = nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3];

        int max = Integer.max(c1, c2);
        return max;
    }
}
