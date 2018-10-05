/**
* @Author: Joakim Olsson <lomo133>
* @Date:   2018-10-05T18:18:51+02:00
 * @Last modified by:   lomo133
 * @Last modified time: 2018-10-05T18:19:22+02:00
*/

public Map<String, String> mapAB3(Map<String, String> map) {
  if (map.containsKey("a") ^ map.containsKey("b")) {
    if (map.containsKey("a")) {
      map.put("b", map.get("a"));
    }
    if (map.containsKey("b")) {
      map.put("a", map.get("b"));
    }
  }
  return map;
}
