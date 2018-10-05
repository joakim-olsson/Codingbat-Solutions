/**
* @Author: Joakim Olsson <lomo133>
* @Date:   2018-10-05T18:05:42+02:00
 * @Last modified by:   lomo133
 * @Last modified time: 2018-10-05T18:06:09+02:00
*/

public int arrayCount9(int[] nums) {
  int counter = 0;
  for (int i=0; i<nums.length; i++) {
    if (nums[i] == 9) {
      counter++;
    }
  }
  return counter;
}
