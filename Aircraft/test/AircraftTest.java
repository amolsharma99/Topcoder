import org.junit.Test;
import static org.junit.Assert.*;

public class AircraftTest {
	
	@Test
	public void test0() {
		int[] p1 = new int[] {15,50,5};
		int[] v1 = new int[] {25,1,0};
		int[] p2 = new int[] {161,102,9};
		int[] v2 = new int[] {-10,-10,-1};
		int R = 10;
		assertEquals("YES", new Aircraft().nearMiss(p1, v1, p2, v2, R));
	}
	
	@Test
	public void test1() {
		int[] p1 = new int[] {0,0,0};
		int[] v1 = new int[] {2,2,0};
		int[] p2 = new int[] {9,0,5};
		int[] v2 = new int[] {-2,2,0};
		int R = 5;
		assertEquals("YES", new Aircraft().nearMiss(p1, v1, p2, v2, R));
	}
	
	@Test
	public void test2() {
		int[] p1 = new int[] {0,0,0};
		int[] v1 = new int[] {-2,2,0};
		int[] p2 = new int[] {9,0,5};
		int[] v2 = new int[] {2,2,0};
		int R = 5;
		assertEquals("NO", new Aircraft().nearMiss(p1, v1, p2, v2, R));
	}
	
	@Test
	public void test3() {
		int[] p1 = new int[] {-2838,-7940,-2936};
		int[] v1 = new int[] {1,1,-2};
		int[] p2 = new int[] {532,3850,9590};
		int[] v2 = new int[] {1,0,-3};
		int R = 3410;
		assertEquals("YES", new Aircraft().nearMiss(p1, v1, p2, v2, R));
	}
	
	@Test
	public void test4() {
		int[] p1 = new int[] {-8509,9560,345};
		int[] v1 = new int[] {-89,-33,62};
		int[] p2 = new int[] {-5185,-1417,2846};
		int[] v2 = new int[] {-58,24,26};
		int R = 8344;
		assertEquals("YES", new Aircraft().nearMiss(p1, v1, p2, v2, R));
	}
	
	@Test
	public void test5() {
		int[] p1 = new int[] {-7163,-371,-2459};
		int[] v1 = new int[] {-59,-41,-14};
		int[] p2 = new int[] {-2398,-426,-5487};
		int[] v2 = new int[] {-43,27,67};
		int R = 5410;
		assertEquals("NO", new Aircraft().nearMiss(p1, v1, p2, v2, R));
	}
	
	@Test
	public void test6() {
		int[] p1 = new int[] {1774,-4491,7810};
		int[] v1 = new int[] {-12,19,-24};
		int[] p2 = new int[] {2322,3793,9897};
		int[] v2 = new int[] {-12,19,-24};
		int R = 10000;
		assertEquals("YES", new Aircraft().nearMiss(p1, v1, p2, v2, R));
	}
	
	@Test
	public void test7() {
		int[] p1 = new int[] {3731,8537,5661};
		int[] v1 = new int[] {-70,71,32};
		int[] p2 = new int[] {8701,-1886,-5115};
		int[] v2 = new int[] {28,-13,7};
		int R = 9766;
		assertEquals("NO", new Aircraft().nearMiss(p1, v1, p2, v2, R));
	}
}
