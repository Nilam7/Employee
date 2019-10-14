package test.com.example;

import org.junit.Assert;
import org.junit.Test;

import com.examples.Sum;

public class TestSum{
	
	/**
	 * positive test case
	 */
	@Test
	public void test_sum() {
		Sum sum = new Sum("1,2,3,4");
		int sum2 = sum.getSum();
		Assert.assertEquals(10, sum2);
		
	}
	
	
	/**
	 * null
	 */
	@Test
	public void test_sum1() {
		Sum sum = new Sum("");
		int sum1=sum.getSum();
		Assert.assertEquals(0, sum1);
	}
	
	
	
	/**
	 * invalid paramters
	 */
	@Test
	public void testSum() {
		Sum s=new Sum("n,1,m");
		int sum3=s.getSum();
		Assert.assertEquals(-1,sum3);
		
	}


}
