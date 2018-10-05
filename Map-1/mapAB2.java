/**
* @Author: Joakim Olsson <lomo133>
* @Date:   2018-10-05T18:17:04+02:00
 * @Last modified by:   lomo133
 * @Last modified time: 2018-10-05T18:17:23+02:00
*/

public Map<String, String> mapAB2(Map<String, String> map) {
  if (map.containsKey("a") && map.containsKey("b")) {
    if (map.get("a").equals(map.get("b"))) {
      map.remove("a");
      map.remove("b");
    }
  }
  return map;
}
