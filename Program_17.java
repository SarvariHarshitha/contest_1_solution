 // Used hashing approach to solve the problem
class Solution {
    static boolean findsum(int arr[], int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
            if (sum == 0 || map.containsKey(sum) || arr[i] == 0) {
                return true;
            }
            map.put(sum, i);
        }

        return false;
    }
}
