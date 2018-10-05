/**
* @Author: Joakim Olsson <lomo133>
* @Date:   2018-10-05T18:28:22+02:00
 * @Last modified by:   lomo133
 * @Last modified time: 2018-10-05T18:28:37+02:00
*/

public String comboString(String a, String b) {
  if (a.length() > b.length()) {
    return b + a + b;
  }
  return a + b + a;
}
