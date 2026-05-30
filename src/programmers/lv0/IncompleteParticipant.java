package programmers.lv0;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class IncompleteParticipant {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> map = new HashMap<>();
        for (String player : participant)
            map.put(player, map.getOrDefault(player, 0) + 1);
        for (String player : completion)
            map.put(player, map.get(player) - 1);

        Iterator<Map.Entry<String, Integer>> iter = map.entrySet().iterator();

        while(iter.hasNext()){
            Map.Entry<String, Integer> entry = iter.next();
            if (entry.getValue() != 0){
                answer = entry.getKey();
                break;
            }
        }
        return answer;
    }
}

/*
class IncompleteParticipant2 {
    public String solution(String[] participant, String[] completion) {
        var answer = "";
        HashMap<String,Integer> map = new HashMap<>();
        for(String person: participant) {
            map.put(person,map.getOrDefault(person,0)+1);
        }
        for(String completedPerson: completion) {
            map.put(completedPerson,map.get(completedPerson)-1);
        }
        for(Map.Entry<String,Integer> entry : map.entrySet()) {
            if(entry.getValue() > 0) {
                answer = entry.getKey();
            }
        }
        return answer;
    }
}
*/