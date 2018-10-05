/**
* @Author: Joakim Olsson <lomo133>
* @Date:   2018-10-05T18:04:02+02:00
 * @Last modified by:   lomo133
 * @Last modified time: 2018-10-05T18:04:33+02:00
*/

public boolean array123(int[] nums) {
  for (int i=0; i < nums.length-2; i++) {
    int start = nums[i];
    if (start == 1 && nums[i+1] == 2 && nums[i+2] == 3) {
      return true;
    }
  }
  return false;
}
