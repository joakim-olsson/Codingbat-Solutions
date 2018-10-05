/**
* @Author: Joakim Olsson <lomo133>
* @Date:   2018-10-05T17:56:59+02:00
 * @Last modified by:   lomo133
 * @Last modified time: 2018-10-05T17:57:20+02:00
*/

public String missingChar(String str, int n) {
  if (str.length() <= 0) {
    return "";
  }
  return str.substring(0, n) + str.substring(n+1);
}
