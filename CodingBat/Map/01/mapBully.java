// Modify and return the given map as follows: if the key "a" has a value, set
// the key "b" to have that value, and set the key "a" to have the value "".
// Basically "b" is a bully, taking the value and replacing it with the empty
// string.

// mapBully({"a": "candy", "b": "dirt"}) → {"a": "", "b": "candy"}
// mapBully({"a": "candy"}) → {"a": "", "b": "candy"}
// mapBully({"a": "candy", "b": "carrot", "c": "meh"}) → {"a": "", "b": "candy",
// "c": "meh"}

public Map<String, String> mapBully(Map<String, String> map) {
  if (map.containsKey("a")) { // if the hashmap contains a then
    String temp = map.get("a"); // set temp as the stored value of a
    map.put("a", ""); // set a to blank value
    map.put("b", temp); // set b to the temp value which was a's
  }
  return map;
}
