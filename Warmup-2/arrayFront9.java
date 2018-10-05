/**
* @Author: Joakim Olsson <lomo133>
* @Date:   2018-10-05T18:07:11+02:00
 * @Last modified by:   lomo133
 * @Last modified time: 2018-10-05T18:07:22+02:00
*/

public boolean arrayFront9(int[] nums) {
  if (nums.length >= 4) {
    for (int i=0; i < 4; i++) {
      if (nums[i] == 9) return true;
    }
  }
  if (nums.length < 4) {
    for (int i=0; i < nums.length; i++) {
      if (nums[i] == 9) return true;
    }
  }
  return false;
}
