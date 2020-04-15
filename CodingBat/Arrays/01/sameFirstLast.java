// Given an array of ints, return true if the array is length 1 or more, and the first element and the last element are equal.


// sameFirstLast([1, 2, 3]) → false
// sameFirstLast([1, 2, 3, 1]) → true
// sameFirstLast([1, 2, 1]) → true

public boolean sameFirstLast(int[] nums) {
    // Check if the length of the array is longer than 0
    // Check if the first index equals the last index
    if (nums.length >= 1 && nums[0] == nums[nums.length - 1])
    return true;
    else
    return false;
  }
  