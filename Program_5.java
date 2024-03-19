// Iterated through all the numbers upto its half and find if its the divisor of the number. iIf it is the divisor, add to the sum.

class Solution {
    public boolean checkPerfectNumber(int num) {
        int sum = 0;
        for(int i = 1;i <= num/2;i++){
            if(num % i == 0) sum = sum+i;

        }
        return sum == num;
    }
}
