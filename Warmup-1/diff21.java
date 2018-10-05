/**
* @Author: Joakim Olsson <lomo133>
* @Date:   2018-10-05T17:54:40+02:00
 * @Last modified by:   lomo133
 * @Last modified time: 2018-10-05T17:55:18+02:00
*/

public int diff21(int n) {
  int diff = 21 - n;
  if (diff < 0) {
    return diff * -2;
  }
  return diff;
}
