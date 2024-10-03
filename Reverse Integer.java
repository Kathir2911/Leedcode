class Solution {
    public int reverse(int x) {
    long rev=0;
    int num=x;
    x=Math.abs(x);
    while(x>0)  
    {
        rev=(rev*10)+(x%10);
        x=x/10;
        if(rev>Integer.MAX_VALUE || rev< Integer.MIN_VALUE)
            return 0;
    }   
    return num>0?(int)rev:(int)rev*-1; 
    }
}
