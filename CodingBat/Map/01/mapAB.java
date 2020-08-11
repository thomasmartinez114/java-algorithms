
// Modify and return the given map as follows: for this problem the map may or
// may not contain the "a" and "b" keys. If both keys are present, append their
// 2 string values together and store the result under the key "ab".

// mapAB({"a": "Hi", "b": "There"}) → {"a": "Hi", "ab": "HiThere", "b": "There"}
// mapAB({"a": "Hi"}) → {"a": "Hi"}
// mapAB({"b": "There"}) → {"b": "There"}


public Map<String, String> mapAB(Map<String, String> map) {
  if (map.containsKey("a") && map.containsKey("b")) {
    String aKey = map.get("a"); // declare String to a value
    String bKey = map.get("b"); // declare String to b value
    
    map.put("ab", aKey+bKey); // set the ab to the two strings
  }
  return map;
}
