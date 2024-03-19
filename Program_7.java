// Recursive approach to find whether the number is power of 3, recursively dividing a power of three by 3 results in one. Used this logic to solve this problem.

class Solution {
    public boolean isPowerOfThree(int n) {
        if(n == 1) return true;
        if(n%3 != 0 || n <= 0) return false;
        return isPowerOfThree(n/3);
    }
}
