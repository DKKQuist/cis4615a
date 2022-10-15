//prevent exceptions while logging data
//Non compliant code below

try {
  // ...
} catch (SecurityException se) {
  System.err.println(se);
  // Recover from exception
}
