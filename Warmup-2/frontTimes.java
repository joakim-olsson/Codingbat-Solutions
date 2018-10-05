/**
* @Author: Joakim Olsson <lomo133>
* @Date:   2018-10-05T18:04:51+02:00
 * @Last modified by:   lomo133
 * @Last modified time: 2018-10-05T18:05:17+02:00
*/

public String frontTimes(String str, int n) {
  String newString = "";
  if (str.length() >= 3) {
    String front = str.substring(0,3);
    for (int i=0; i<n; i++) {
      newString += front;
    }
    return newString;
  }
  String front = str.substring(0,str.length());
  for (int i=0; i<n; i++) {
    newString += front;
  }
  return newString;
}
