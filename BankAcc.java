package back_CaseStudy;

public abstract class BankAcc {
	private int accNo;
	private String accNm;
	private  float accBal;
	public BankAcc(int accNo, String accNm, float accBal) {
		
	}
	
	public void withdraw()
	{
		
	}
	public void deposite()
	{
		
	}

	@Override
	public String toString() {
		return "BankAcc [accNo=" + accNo + ", accNm=" + accNm + ", accBal=" + accBal + "]";
	}
	
	 

}
