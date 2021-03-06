
public class UserException {
	
	public static void applyLoan(String loanType, int amount, int creditScore) throws CitiException, FannieException{
				if (loanType.equalsIgnoreCase("vehicle") && creditScore<400){
					throw new CitiException("Sorry, your credit score is "+creditScore+", too low for vehicle");
				}else if (loanType.equalsIgnoreCase("home") && creditScore<700){
					throw new FannieException("Sorry, your credit score is "+creditScore+", too low for home");
				}else{
					System.out.println("loan accepted " + loanType);
				}
				
				
	}
	
	public static void main(String[] args) throws CitiException, FannieException {
		try{
			applyLoan("vehicle", 1000, 200);
		}catch(CitiException e) {
			e.printStackTrace();
		}catch(FannieException e){
			e.printStackTrace();
		}

			applyLoan("home", 1000, 400);

	}

}

class FannieException extends Exception{
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return this.getMessage();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ":::" + this.msg+":::";
	}

	private String msg;
	
	FannieException(){
		this.msg = "Fanni Exception called ...";
	}
	
	FannieException(String msg){
		this.msg=msg;
	}
	
}

class CitiException extends Exception{
	private String msg;
	
	CitiException(){
		this.msg="Citi Exception called ...";
	
	}
	
	CitiException(String msg){
		this.msg=msg;
	}
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return this.getMessage();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ":::" + this.msg+":::";
	}
}