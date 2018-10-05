/**
* @Author: Joakim Olsson <lomo133>
* @Date:   2018-10-05T18:19:42+02:00
 * @Last modified by:   lomo133
 * @Last modified time: 2018-10-05T18:20:15+02:00
*/

public Map<String, String> mapAB(Map<String, String> map) {
  if (map.containsKey("a") && map.containsKey("b"))
  map.put("ab", map.get("a") + map.get("b"));
  
  return map;
}
