class Solution {
    public int reverse(int x) {
    int sum=0,rem,num=x;
    x=Math.abs(x);
    while(x>0)  
    {
        rem=x%10;
        sum=sum*10+rem;
        x=x/10;
    }   
    return num>0?sum:sum*-1; 
    }
}
