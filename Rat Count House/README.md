# Food Distribution for Rats

## Problem Description

The function accepts two positive integers `r` and `unit`, and a positive integer array `arr` of size `n` as its arguments. The integer `r` represents the number of rats present in an area, `unit` is the amount of food each rat consumes, and each `i-th` element of the array `arr` represents the amount of food present in the `(i+1)-th` house.

### Note:
- Return `-1` if the array is null.
- Return `0` if the total amount of food from all houses is not sufficient for all the rats.
- Computed values lie within the integer range.

## Example

### Input
- r: 7
- unit: 2
- n: 8
- arr: 2, 8, 3, 5, 7, 4, 1, 2


### Output
4


### Explanation
Total amount of food required for all rats = `r * unit` = `7 * 2 = 14`.

The amount of food in the first 4 houses is `2 + 8 + 3 + 5 = 18`. Since the amount of food in the first 4 houses is sufficient for all the rats, the output is `4`.
