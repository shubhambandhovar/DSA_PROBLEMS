package com.dsa;

import java.util.List;
public class SumOfIntegers {
    public static int sumNaive(List<Integer> numbers) {
        int total = 0;
        for (int num : numbers) {
            total += num;
        }
        return total;
    }

    public static int sumRecursive(List<Integer> numbers, int index) {
        if (index == numbers.size()) {
            return 0;
        }
        return numbers.get(index) + sumRecursive(numbers, index + 1);
    }

    public static int sumBuiltIn(List<Integer> numbers) {
        return numbers.stream().mapToInt(Integer::intValue).sum();
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        int naiveSum = sumNaive(numbers);
        int recursiveSum = sumRecursive(numbers, 0);
        int builtInSum = sumBuiltIn(numbers);

        System.out.println("Naive Sum: " + naiveSum);
        System.out.println("Recursive Sum: " + recursiveSum);
        System.out.println("Built-in Sum: " + builtInSum);
    }

}


