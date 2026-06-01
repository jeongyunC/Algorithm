package programmers.lv0;

import java.util.*;

public class Ponketmon {
    public int solution(int[] nums) {
        int size = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int n : nums) {
            map.put(n,map.getOrDefault(n,0)+1);
        }
        int type = map.size();
        int answer = Math.min(size/2,type);
        return answer;
    }
}