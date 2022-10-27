
public class Donations {

	
	// numIndividual –The number of individual donations
	int numIndividual;
	// amtIndividual – The total of all individual donations
	double amtIndividual;
	// numBusiness –The number of business donations
	int numBusiness;
	// amtBusiness – The total of all business donations
	double amtBusiness;
	// numOther –The number of other donations
	int numOther;
	// amtOther – The total of all other donations
	double amtOther;
	
	public Donations(){}
	
	public void processDonation(String cat, double donation) {
		if (cat.equals ("individual")) {
			this.amtIndividual += donation;
			if (donation > 0) {
		       this.numIndividual++;
			}
			else {
				this.numIndividual--;
				
			}
			
		} else if (cat.equals("business")) {
			this.amtBusiness += donation;
			if (donation > 0) {
		       this.numBusiness++;
			}
			else {
				this.numBusiness--;
				
			}
		
			
		} else if (cat.equals("other")) {
			this.amtOther += donation;
			if (donation > 0) {
		       this.numOther++;
			}
			else {
				this.numOther--;
				
			}
		}
	}
	
	public void getStatistics() {
		System.out.println("Individual: #:"+ this.numIndividual + "$" + String.format("%, 2f", amtIndividual));
		System.out.println("Business: #:"+ this.numBusiness + "$" + String.format("%, 2f", amtBusiness));
		System.out.println("Other: #:"+ this.numOther + "$" + String.format("%, 2f", amtOther));



		
	}
}