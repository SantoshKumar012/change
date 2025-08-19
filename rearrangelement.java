import java.util.*;
class Solution{
public int[] rearrangelement(int[] nums){
    int n= nums.length;
    int[] ans = new int[n];
    int posIndex = 0, negIndex = 1;
    for(int i = 0;i<n;i++){
        if(nums[i]<0){
            ans[negIndex]= nums[i];
            negIndex += 2;

        }else{
            ans[posIndex]= nums[i];
            posIndex +=2;
        }
    }
    return ans;
    
}
public static void main(String[] args){
    int [] nums = { 1,2,-4,-5};
    Solution sol = new Solution();
    int [] ans = sol.rearrangelement(nums);
    for(int i = 0; i< ans.length;i++){
        System.out.println(ans[i]+"");

    }
}
}

