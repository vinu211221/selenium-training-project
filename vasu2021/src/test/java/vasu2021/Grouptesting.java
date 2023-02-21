package vasu2021;

import org.testng.annotations.Test;

public class Grouptesting {
	@Test(groups = "smoke",priority=0)
	public void testcase1() {
		System.out.println("this is my first smoke test");
		
		
	}
	@Test(groups = "Regression",priority=1)
	public void testcase2() {
		System.out.println("this is my first regression test");
		
		
	}
	@Test(groups = "smoke",priority=2)
	public void testcase3() {
		System.out.println("this is my second smoke test");
		
		
	}

}
