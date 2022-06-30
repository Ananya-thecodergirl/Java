class Solution
{
    // complete the function
    public static int digitalRoot(int n)
    {
       
        if(n <= 9){
            return n;
        }
        int sum = n % 10 + digitalRoot(n/10); //sum of digits
        if(sum > 9){
            return digitalRoot(sum);
        }else{
            return sum;
        }
        
    }
}
