/**
* @Author: Joakim Olsson <lomo133>
* @Date:   2018-10-05T18:15:23+02:00
 * @Last modified by:   lomo133
 * @Last modified time: 2018-10-05T18:15:40+02:00
*/

public Map<String, String> mapBully(Map<String, String> map) {
  if (map.containsKey("a")) {
    map.put("b",map.get("a"));
    map.put("a","");
  }
  return map;
}
