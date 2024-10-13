package src;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/12910
 * 나누어 떨어지는 숫자 배열
 */
public class Pg12910 {
    public static void main(String[] args) {
        int[] arr = {2, 36, 1, 3};
        int divisor = 1;

        List<Integer> list = new ArrayList<>();

        for(int a : arr) {
            if(a % divisor == 0) {
                list.add(a);
            }
        }
        if(list.isEmpty())
            list.add(-1);

        Collections.sort(list);

        int[] answer = list.stream().mapToInt(Integer::intValue).toArray();
    }
}
