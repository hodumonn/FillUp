package src;

import java.util.Arrays;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/12933
 * 정수 내림차순으로 배치하기
 */
public class Pg12933 {
    public static void main(String[] args) {
        long n = 118372;
        long answer = 0;

        long[] n_arr = Arrays.stream(Long.toString(n).split(""))
                .mapToLong(Long::parseLong)
                .toArray();
        Arrays.sort(n_arr);

        String temp_answer = "";
        for(int i=n_arr.length-1; i>=0; i--) {
            temp_answer += n_arr[i];
        }
        answer = Long.parseLong(temp_answer);

        System.out.println(answer);
    }
}
