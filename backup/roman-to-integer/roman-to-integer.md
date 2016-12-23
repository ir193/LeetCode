Title: Leetcode roman-to-integer solution
Slug: roman-to-integer
Date: 2016-10-04 20:29:20
Tags: LeetCode,
Category: LeetCode
Author: ir193


## Leetcode roman-to-integer solution



```java
public class Solution {
    public int romanToInt(String s) {
        int sum = 0;
        int last = -1;
        HashMap<Character, Integer> h = new HashMap<>();
        h.put('I', 1);
        h.put('V', 5);
        h.put('X', 10);
        h.put('L', 50);
        h.put('C', 100);
        h.put('D', 500);
        h.put('M', 1000);
        for(char i : s.toCharArray()){
            if(last > 0 && last < h.get(i)){
                sum = sum + h.get(i) - 2*last;
            }
            else{
                last = h.get(i);
                sum = sum + last;
            }
        }
        return sum;
    }
}
```