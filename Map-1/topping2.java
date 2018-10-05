/**
* @Author: Joakim Olsson <lomo133>
* @Date:   2018-10-05T18:18:24+02:00
 * @Last modified by:   lomo133
 * @Last modified time: 2018-10-05T18:18:33+02:00
*/

public Map<String, String> topping2(Map<String, String> map) {
  if (map.containsKey("ice cream")) {
    map.put("yogurt", map.get("ice cream"));
  }
  if (map.containsKey("spinach")) {
    map.put("spinach", "nuts");
  }
  return map;
}
