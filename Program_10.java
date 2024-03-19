// Used a variable prod that stores the product of all elements in the array , we are dividing prod with the element at given index, to find the prod of other elements except itself, whenever there is no 0 in the array 

class Solution 
{ 
	public static long[] productExceptSelf(int nums[], int n) 
	{ 
        long[] ans = new long[n];
        long prod = 1;
        int c = 0;
        for(int i = 0; i < n; i++){
            if(nums[i] == 0){
                c++;
            }
            else{
                prod *= nums[i];
            }
        }
        for(int i = 0; i < n; i++){
            if(c > 0){
                if(c == 1){
                    if(nums[i] != 0) ans[i] = 0;
                    else ans[i] = prod;
                }
                else{
                    return ans;
                }
            }
            else{
                ans[i] = prod / nums[i];
            }
        }
        
        return ans;
	} 
} 
