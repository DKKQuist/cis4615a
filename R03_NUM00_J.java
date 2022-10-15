//detect or prevent integer overflow
//non compliant code below

public static int multAccum(int oldAcc, int newVal, int scale) {
  // May result in overflow
  return oldAcc + (newVal * scale);
}
