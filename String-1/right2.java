/**
* @Author: Joakim Olsson <lomo133>
* @Date:   2018-10-05T18:28:54+02:00
 * @Last modified by:   lomo133
 * @Last modified time: 2018-10-05T18:29:09+02:00
*/

public String right2(String str) {
  return str.substring(str.length()-2,str.length()) + str.substring(0, str.length()-2);
}
