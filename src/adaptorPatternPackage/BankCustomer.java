package adaptorPatternPackage;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//Adaptor Class
public class BankCustomer extends BankDetails implements CreditCard {

	@Override
	public void giveBankDetails() {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("Enter the account holder name: ");
			String customerName = br.readLine();
			System.out.println("\n");
			
			System.out.println("Enter the account number: ");
			long accountNumber = Long.parseLong(br.readLine());
			System.out.println("\n");
			
			System.out.println("Enter the bank name: ");
			String bankName = br.readLine();
			System.out.println("\n");
			
			setAccHolderName(customerName);
			setAccNumber(accountNumber);
			setBankName(bankName);	
		} catch(Exception e) {
			e.printStackTrace();
		}		
	}

	@Override
	public String getCreditCard() {
		long accno = getAccNumber();
		String accholdername = getAccHolderName();
		String bname = getBankName();
		
		return ("The Account number "+accno+" of "+accholdername+" in "+bname+ 
				"bank is valid and authenticated for issuing the credit card. "); 
	}
	
}
