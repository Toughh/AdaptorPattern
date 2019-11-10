package adaptorPatternPackage;

public class AdaptorPatternDemo {
	public static void main(String args[]) {
		CreditCard targetInterface = new BankCustomer();
		targetInterface.giveBankDetails();
		System.out.println(targetInterface.getCreditCard());
	}
}
