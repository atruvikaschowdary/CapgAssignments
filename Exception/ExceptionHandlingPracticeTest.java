package p1;

public class ExceptionHandlingPracticeTest {
	
	public static void main(String[] args) {
		Customer c;
		try {
			c = new Customer("Vikas", 10000);
			int amount=5500;
			boolean paymentStatus=c.makePayment(amount);
			if(paymentStatus) {
				System.out.println("payment Successfull "+c.getBalance());
			}
			else {
				System.out.println("payment failed");
			}
		} catch (InvalidValidUserNameException | InvalidBalanceAmountException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InsufficientFundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			}

}


