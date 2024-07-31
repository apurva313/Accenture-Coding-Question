# Product of the Smallest Pair

## Problem Statement

Implement the function `ProductSmallestPair(sum, arr)`. The function accepts an integer `sum` and an integer array `arr` of size `n`. The goal is to find a pair `(arr[j], arr[k])` where `j != k`, such that `arr[j]` and `arr[k]` are the two least elements in the array and their sum is less than or equal to `sum`. The function should return the product of this pair.

### Notes:
- Return `-1` if the array is empty or if `n < 2`.
- Return `0` if no such pairs are found.
- All computed values lie within the integer range.

## Example

### Input
sum: 9
arr: 5, 2, 4, 3, 9, 7, 1


### Output
2


### Explanation
The pair of the least two elements is `(2, 1)`. Their sum is `2 + 1 = 3`, which is less than `9`. The product of `(2, 1)` is `2 * 1 = 2`. Thus, the output is `2`.

