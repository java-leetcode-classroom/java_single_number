import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
  final private Solution sol = new Solution();
  @Test
  void singleNumberExample1() {
    assertEquals(1, sol.singleNumber(new int[]{2,2,1}));
  }
  @Test
  void singleNumberExample2() {
    assertEquals(4, sol.singleNumber(new int[]{4,1,2,1,2}));
  }
  @Test
  void singleNumberExample3() {
    assertEquals(1, sol.singleNumber(new int[]{1}));
  }
}