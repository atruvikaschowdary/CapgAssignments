package p1;

public class BillPaymentService {
	
	
		public boolean payBill(Customer c, int amountToPaid)throws InsufficientFundException{
			if(amountToPaid>c.getBalance()) {
				throw new InsufficientFundException("Low Balance");
			}
			return true;
		}

	}


