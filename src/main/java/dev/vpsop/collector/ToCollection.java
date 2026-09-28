package dev.vpsop.collector;

import java.util.*;
import java.util.stream.Collectors;

public class ToCollection {
    public static void main(String[] args) {
        List<Integer> nums = List.of(1,2,3,4,5,6,7,8);
        Set<Integer> res1 = nums.stream()
                .map(x -> x * 2)
                .collect(Collectors.toCollection(TreeSet::new));

        System.out.println(res1);

        // ArrayList
        // .collect(Collectors.toCollection(ArrayList::new));

        // LinkedList
        // .collect(Collectors.toCollection(LinkedList::new));

        //HashSet
        // .collect(Collectors.toCollection(HashSet::new));

        // LinkedHashSet (Preserves Insertion Order)
        // .collect(Collectors.toCollection(LinkedHashSet::new));

        // TreeSet (Sorted)
        // .collect(Collectors.toCollection(TreeSet::new));
    }
}
