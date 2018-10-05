/**
* @Author: Joakim Olsson <lomo133>
* @Date:   2018-10-05T18:21:06+02:00
 * @Last modified by:   lomo133
 * @Last modified time: 2018-10-05T18:21:23+02:00
*/

public Map<String, String> mapAB4(Map<String, String> map) {
  if (map.containsKey("a") && map.containsKey("b")) {
    if (map.get("a").length() > map.get("b").length()) {
      map.put("c", map.get("a"));
    }
    if (map.get("a").length() == map.get("b").length()) {
      map.put("a", "");
      map.put("b", "");
    }
    if (map.get("a").length() < map.get("b").length()) {
      map.put("c", map.get("b"));
    }
  }
  return map;
}
