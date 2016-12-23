Title: Leetcode sum-of-two-integers solution
Slug: sum-of-two-integers
Date: 2016-09-30 17:00:59
Tags: LeetCode,
Category: LeetCode
Author: ir193


## Leetcode sum-of-two-integers solution

```java
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
```