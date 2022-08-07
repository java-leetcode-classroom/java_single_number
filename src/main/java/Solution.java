public class Solution {
  public int singleNumber(int[] nums) {
    int result = nums[0];
    int lenNums = nums.length;
    for (int pos = 1; pos < lenNums; pos++) {
      result ^= nums[pos];
    }
    return result;
  }
}
