
// Given a string, return a version without the first and last char, so "Hello" yields "ell". The string length will be at least 2.


// withoutEnd("Hello") → "ell"
// withoutEnd("java") → "av"
// withoutEnd("coding") → "odin"

public String withoutEnd(String str) {
    int len = str.length();
    
    return str.substring(1, len - 1);
  }
