package src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/12935
 * 제일 작은 수 제거하기
 */
public class Pg12935 {
    public static void main(String[] args) {
        int[] arr = {4,3,2,1};
        int[] temp_arr = Arrays.copyOf(arr, arr.length);
        Arrays.sort(temp_arr);

        int min_num = temp_arr[0];
        List<Integer> list = new ArrayList<>();

        if(arr.length == 1) {
            list.add(-1);
        } else {
            for(int a : arr) {
                if(a != min_num) list.add(a);
            }
        }

        int[] answer = list.stream().mapToInt(Integer::intValue).toArray();

        for(int a : answer) {
            System.out.println(a);
        }
    }
}
