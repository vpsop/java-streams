package dev.vpsop.parallelstreams;

public class MentalModel {

    /*
     * ============================================================
     *          PARALLEL STREAM — OPERATION CHEAT SHEET
     * ============================================================
     *
     * Operation          | Parallel consideration
     * ------------------------------------------------------------
     * map()              | Excellent candidate
     * filter()           | Excellent candidate
     * flatMap()          | Can parallelize; depends on workload
     * peek()             | Avoid shared side effects
     *
     * distinct()         | Stateful; requires coordination
     * sorted()           | Stateful; expensive coordination
     * limit()            | Ordering can restrict parallelism
     * skip()             | Ordering can restrict parallelism
     * takeWhile()        | Order-sensitive
     * dropWhile()        | Order-sensitive
     *
     * forEach()          | No encounter-order guarantee
     * forEachOrdered()   | Preserves order; may reduce performance
     *
     * reduce()           | Associativity + correct identity important
     * collect()          | Combiner is important in parallel execution
     *
     * anyMatch()         | Short-circuiting
     * allMatch()         | Short-circuiting
     * noneMatch()        | Short-circuiting
     * findFirst()        | Order-sensitive
     * findAny()          | Better suited to parallel execution
     *
     * min()/max()        | Usually must inspect all elements
     * count()            | Parallelizable
     * sum()              | Parallelizable
     * average()          | Parallelizable
     * summaryStatistics()| Parallelizable
     */


    /*
     * ============================================================
     *              CORE MENTAL MODEL — REMEMBER THESE 5
     * ============================================================
     *
     * 1. Stateless operations
     *    → Easy to parallelize.
     *
     *    Examples:
     *    map(), filter(), mapToInt(), etc.
     *
     *
     * 2. Stateful / order-sensitive operations
     *    → Require coordination between partitions.
     *
     *    Examples:
     *    sorted(), distinct(), limit(), skip(),
     *    takeWhile(), dropWhile()
     *
     *
     * 3. Short-circuiting
     *    → Can stop processing when the result is known.
     *
     *    Examples:
     *    anyMatch(), allMatch(), noneMatch(),
     *    findFirst(), findAny(), limit()
     *
     *    In parallel execution, already-running tasks may
     *    continue briefly even after the result is known.
     *
     *
     * 4. reduce() / collect()
     *    → Parallel execution creates partial results,
     *      which must be combined correctly.
     *
     *    reduce():
     *      accumulator + combiner
     *
     *    collect():
     *      supplier + accumulator + combiner + finisher
     *
     *    Reduction operations should generally be associative.
     *
     *
     * 5. parallelStream() != automatically faster
     *    → Parallelism has overhead:
     *
     *      splitting
     *      scheduling
     *      thread coordination
     *      combining
     *
     *    Best suited for:
     *      large data
     *      CPU-intensive work
     *      independent operations
     *
     *    Usually poor for:
     *      small datasets
     *      cheap operations
     *      shared mutable state
     *      uncontrolled I/O
     */
}
