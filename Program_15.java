// If a number has even number of 0's after its only one , Then it is a power of 4. used this logic to solve the problem.

class Solution {
    public boolean isPowerOfFour(int n) {
        int x = n & (n - 1);
        int count = 0;
        if(n > 0 && x == 0){
            while(n > 1){
                n >>= 1;
                count++;
            }

            if(count % 2 == 0){
                return true;
            }
        }

        return false;
    }
}
