public String comboString(String a, String b) {
    int lenA = a.length();
    int lenB = b.length();
    
    if (lenA > lenB)
      return b+a+b;
    else
      return a+b+a;
  }