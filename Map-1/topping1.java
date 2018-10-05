/**
* @Author: Joakim Olsson <lomo133>
* @Date:   2018-10-05T18:16:08+02:00
 * @Last modified by:   lomo133
 * @Last modified time: 2018-10-05T18:16:45+02:00
*/

public Map<String, String> topping1(Map<String, String> map) {
  if (map.containsKey("ice cream")) {
    map.put("ice cream", "cherry");
  }
  map.put("bread", "butter");

  return map;
}
