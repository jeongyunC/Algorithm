package programmers.lv0;
/*
Problem = [Programmers][LV0][옹알이] https://school.programmers.co.kr/learn/courses/30/lessons/120956
*/
class Babbling {
    public int solution(String[] babbling) {
        String[] isSpeak = {"aya","ye","woo","ma"};
        int answer = 0;
        for(String word : babbling) {
            if(check(word, isSpeak)) {
                answer ++;
            }
        }
        return answer;
    }

    public Boolean check(String word, String[] isSpeak) {
        if(word.isEmpty()) {
            return true;
        }
        for(String validWord: isSpeak) {
            if(word.startsWith(validWord)) {
                if(check(word.substring(validWord.length()), isSpeak)) {
                    return true;
                }
            }
        }
        return false;
    }
}