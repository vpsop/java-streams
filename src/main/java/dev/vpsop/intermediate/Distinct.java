package dev.vpsop.intermediate;

import java.util.List;

public class Distinct {
    public static void main(String[] args) {
        List<Integer> nums = List.of(1, 2, 3, 4, 1, 6, 3 , 8 ,2);

        // distinct() keeps the first copy of the element
        List<Integer> distinctNums = nums.stream().distinct().toList();

        System.out.println(distinctNums);

        /// For objects, distinct() uses: equals() & hashCode()
        /// So custom classes should implement them correctly
    }

}
