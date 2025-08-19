import java.util.*;
class Solution{
    public List<Integer> spiralOrder(int[][] matrix){
        List<Integer> ans = new ArrayList<>();
        int n= matrix.length;
        int m = matrix[0].length;
        int top = 0,left= 0;
        int bottom = n-1,right = m-1;
        while(top <= bottom && left <= right){
            for(int i =left; i<= right;i++){
                ans.add(matrix[top][i]);
            }
            top++;
            for(int i = top;i<=bottom;++i){
                ans.add(matrix[i][right]);
            }
            right--;
            if(top <= bottom){
                for(int i= right; i >= left ;i--){
                    ans.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if(left <= right){
                for(int i= bottom;i >= top;--i){
                    ans.add(matrix[i][left]);
                }
                left++;
            }
        }
        return ans;
    }
    public static void main(String[] args){
        int [][] mat = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
        Solution finder = new Solution();
        List<Integer> ans = finder.spiralOrder(mat);
        System.out.print("elements in spiral order are :");
        for(int i=0;i< ans.size();++i){
            System.out.print(ans.get(i)+"");
        }
        System.out.println();
    }
}