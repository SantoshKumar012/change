class Solution{
    public double power(double x, long n) {
        if(n==0) return 1.0;

        if(n==1) return x;

        if(n%2 == 0){
            return power(x*x,n/2);
        }
        return x * power(x,n-1);
    }
    public double myPow(double x, int n){
        if(n<0){ 
            return 1.0/power(x,-n);
        }
        return power(x, n);
    }
    public static void main(String[] args){
        Solution sol= new Solution();
        double x=2.0;
        int n=10;
        double result = sol.myPow(x,n);
        System.out.println(x+ "^"+n+"="+result);
    }

}