package src;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/86051
 * 없는 숫자 더하기
 */
public class Pg86051 {
    public static void main(String[] args) {
        int[] numbers = {5,8,4,0,6,7,9};
        int answer = 0;
        int[] basic_numbers = {0,1,2,3,4,5,6,7,8,9};

        Set<Integer> numbersSet = Arrays.stream(numbers).boxed().collect(Collectors.toSet());
        Set<Integer> filteredSet = Arrays.stream(basic_numbers)
                .boxed()
                .filter(num -> !numbersSet.contains(num))
                .collect(Collectors.toSet());

        int[] result_numbers = filteredSet.stream().mapToInt(Integer::intValue).toArray();

        for(int n : result_numbers) {
            answer += n;
        }

        System.out.println(answer);
    }

}
