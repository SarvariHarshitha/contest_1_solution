// used the prefix sum concept to find the sum of elements in odd and even places and manipulated it by deleting the element

class Solution {
    public int waysToMakeFair(int[] arr) {
        int[] pes = new int[arr.length];
        int[] pos = new int[arr.length];

        pes[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (i % 2 == 0)
                pes[i] = pes[i - 1] + arr[i];
            else
                pes[i] = pes[i - 1];
        }

        pos[0] = 0;
        for (int i = 1; i < arr.length; i++) {
            if (i % 2 != 0)
                pos[i] = pos[i - 1] + arr[i];
            else
                pos[i] = pos[i - 1];
        }
        int c = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int es = ((i > 0) ? pes[i - 1] : 0) + (pos[n - 1] - pos[i]);
            int os = ((i > 0) ? pos[i - 1] : 0) + (pes[n - 1] - pes[i]);
            if (es == os)
                c++;
        }

        return c;
    }
}
