// left shifting 1 32 times and using & operator to find all the 1 bits

public class Solution {
    public int hammingWeight(int n) {
        int mask = 1;
        int bits = 0;
        for(int i = 1; i <=32; i++) {
            bits+= (n & mask) == 0 ? 0 : 1;
            mask<<=1;
        }
        return bits;
    }
}
