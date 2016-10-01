public class Solution {
    public int getSum(int a, int b) {
        while(b != 0){
            int t = a;
            a ^= b;             // a^b : the addition without carry
            b = (b & t) << 1;   // a&b : the carry bits (original a is backup-ed in t)
                                // loop until no carry 
        }
        return a;
    }
}
