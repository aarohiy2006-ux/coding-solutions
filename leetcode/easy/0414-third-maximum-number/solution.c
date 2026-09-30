#include <limits.h>

int thirdMax(int* nums, int numsSize) {
    long firstMax = LONG_MIN;
    long secondMax = LONG_MIN;
    long thirdMax = LONG_MIN;

    for (int i = 0; i < numsSize; i++) {

        if (nums[i] == firstMax ||
            nums[i] == secondMax ||
            nums[i] == thirdMax)
            continue;

        if (nums[i] > firstMax) {
            thirdMax = secondMax;
            secondMax = firstMax;
            firstMax = nums[i];
        }
        else if (nums[i] > secondMax) {
            thirdMax = secondMax;
            secondMax = nums[i];
        }
        else if (nums[i] > thirdMax) {
            thirdMax = nums[i];
        }
    }

    if (thirdMax == LONG_MIN)
        return (int)firstMax;

    return (int)thirdMax;
}