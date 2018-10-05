/**
* @Author: Joakim Olsson <lomo133>
* @Date:   2018-10-05T18:20:32+02:00
 * @Last modified by:   lomo133
 * @Last modified time: 2018-10-05T18:20:47+02:00
*/

public Map<String, String> topping3(Map<String, String> map) {
  if (map.containsKey("potato")) {
    map.put("fries", map.get("potato"));
  }
  if (map.containsKey("salad")) {
    map.put("spinach", map.get("salad"));
  }
  return map;
}
