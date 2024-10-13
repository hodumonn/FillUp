package src;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/76501
 * 음양 더하기
 */
public class Pg76501 {
    public static void main(String[] args) {
        int[] absolutes = {4,7,12};
        // true: 양수, false: 음수
        boolean[] signs = {true, false, true};
        int answer = 0;

        for(int i=0; i<signs.length; i++){
            int temp = signs[i] ? absolutes[i] : absolutes[i] * -1;
            answer += temp;
        }

        System.out.println(answer);
    }
}
