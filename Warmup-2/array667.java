/**
* @Author: Joakim Olsson <lomo133>
* @Date:   2018-10-05T18:07:40+02:00
 * @Last modified by:   lomo133
 * @Last modified time: 2018-10-05T18:08:02+02:00
*/

public int array667(int[] nums) {
  int counter = 0;
  for (int i=0; i < nums.length-1; i++) {
    int start = nums[i];
    if (start == 6 && nums[i+1] == 6 || nums[i+1] == 7) {
      counter++;
    }
  }
  return counter;
}
