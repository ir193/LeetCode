public class Solution {

    public boolean canCross(int[] stones) {
        LinkedList<Integer> s_1 = new LinkedList<>();
        LinkedList<Integer> s_2 = new LinkedList<>();
        HashSet<String> v = new HashSet<>();
        
        if(stones[1] != 1) return false;
        
        s_1.add(0);
        s_2.add(1);
        
        while(!s_1.isEmpty()){
            int loc = s_1.pop();
            int dist = s_2.pop();
            
            //System.out.println("on [" + loc + "]=" + stones[loc] + " hash [" + loc+","+dist+"]");
            //check visited HERE!!
            if(!v.add(loc+","+dist)){
                continue;
            }
            
            if(loc == stones.length - 1){
                return true;
            }
            
            for(int i = loc; i<stones.length; i++){
                if(stones[i] > stones[loc] + dist + 1){
                    break;
                }
                if(stones[i] >= stones[loc] + dist - 1 && stones[i] <= stones[loc] + dist + 1){
                    if(stones[i] - stones[loc] > 0){
                        s_1.add(i);
                        s_2.add(stones[i] - stones[loc]);
                    }
                }
            }
        }
        return false;
    }
}
