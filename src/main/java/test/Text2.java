package test;

import java.util.Arrays;

public class Text2 {
    public static void main(String[] args) {
        int[] numbers = new int[]{0, 31, 24, 10, 1, 9};

        Arrays.sort(numbers);
        System.out.println(numbers[numbers.length-1]);
        System.out.println(numbers[numbers.length-2]);

        int[] sort = Arrays.stream(numbers).boxed().sorted((a,b) -> b - a).mapToInt(Integer::intValue).toArray();
        System.out.println(sort[0]);
        System.out.println(sort[1]);
    }
}
