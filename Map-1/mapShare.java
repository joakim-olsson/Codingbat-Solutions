/**
* @Author: Joakim Olsson <lomo133>
* @Date:   2018-10-05T18:17:51+02:00
 * @Last modified by:   lomo133
 * @Last modified time: 2018-10-05T18:18:04+02:00
*/

public Map<String, String> mapShare(Map<String, String> map) {
  if (map.containsKey("c")) map.remove("c");
  if (map.containsKey("a")) {
    map.put("b", map.get("a"));
  }
  return map;
}
