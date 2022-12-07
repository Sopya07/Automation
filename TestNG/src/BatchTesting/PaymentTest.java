package BatchTesting;

import org.testng.annotations.Test;

public class PaymentTest {
	
	@Test
	public void paymentinDoller()
	{
		System.out.println("This is payment by doller method");
	}
	
	@Test
	public void paymentinrupees()
	{
		System.out.println("This is payment by rupees method");
	}
	

}
