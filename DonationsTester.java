import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DonationsTester {

	public static void main(String[] args) throws FileNotFoundException{
		// TODO Auto-generated method stub
		Donations giveToMe = new Donations();
		Scanner user = new Scanner(System.in);
		System.out.println("Would you like to process donations now? (enter ‘Yes’ to continue):");
		String userIN = user.nextLine();
		if (userIN.equals("Yes")) {
			File inputFile = new File("src/Donations.txt");
			Scanner file = new Scanner(inputFile);
			boolean end = false;
			while(file.hasNextLine() && !end) {
				String linetext = file.nextLine();
				//System.out.println(linetext); // debugging
				double donationAmount = 0;				
				if (linetext.startsWith("<EOF>")) {
					//System.out.println("------------END OF FILE");
					end = true;
				} else if(linetext.startsWith("<individual donation>")) {
					donationAmount = Double.parseDouble(linetext.replaceAll("[^0-9,^-]",""));
					giveToMe.processDonation("individual", donationAmount);
				} else if(linetext.startsWith("<business donation>")) {
					donationAmount = Double.parseDouble(linetext.replaceAll("[^0-9,^-]",""));
					giveToMe.processDonation("business", donationAmount); 
				} else if (linetext.startsWith("<other donation>")) {
					donationAmount = Double.parseDouble(linetext.replaceAll("[^0-9,^-]",""));
					giveToMe.processDonation("other", donationAmount); 
					
				}
			}
			file.close();
			giveToMe.getStatistics();
		} else {
			System.out.print("Ending now without processing donations");
		}

	}

}
