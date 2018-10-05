/**
* @Author: Joakim Olsson <lomo133>
* @Date:   2018-10-05T17:55:53+02:00
 * @Last modified by:   lomo133
 * @Last modified time: 2018-10-05T17:56:15+02:00
*/

public boolean nearHundred(int n) {
  return (Math.abs(n - 100) <= 10 ||  Math.abs(n - 200) <= 10);
}
