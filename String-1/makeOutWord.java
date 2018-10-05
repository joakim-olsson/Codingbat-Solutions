/**
* @Author: Joakim Olsson <lomo133>
* @Date:   2018-10-05T18:25:56+02:00
 * @Last modified by:   lomo133
 * @Last modified time: 2018-10-05T18:26:15+02:00
*/

public String makeOutWord(String out, String word) {
  String front = out.substring(0,2);
  String back = out.substring(2,4);

  return front + word + back;
}
