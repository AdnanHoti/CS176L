//Adnan Hoti
//176L
//House Painting
//

import java.util.Scanner;
public class HousePainting {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.println("Please enter the cost per SqFt");
		int costSqFt= in.nextInt();
		System.out.println("Please enter building length");
		int buildingLength= in.nextInt();
		System.out.println ("Please enter building width");
		int buildingWidth= in.nextInt();
		System.out.println("Please enter building height");
		int buildingHeight=in.nextInt();
	
		
			int buildingHW=(buildingHeight-buildingWidth);
			int buildingAHW=(buildingLength*buildingHW);
			int buildinghalfAHW=(buildingAHW/2);
			int peakSqFt=(buildingLength*buildingWidth+buildinghalfAHW);
			int totalpeakSqFt=(2*peakSqFt);
			System.out.println("The total square footage of the peak sided walls is"+totalpeakSqFt);
			
			int normalSqFt=(2*buildingLength*buildingWidth);
			System.out.println("The total square footage of the normal sided walls is" +normalSqFt);
			
			int wallSqFt=(totalpeakSqFt+normalSqFt);
			System.out.println("The total square footage of the walls are" + wallSqFt);
			
			System.out.println("Please enter the amount of windows");
			int windowAmount= in.nextInt();
			System.out.println("Please enter the width of the windows");
			int windowHeight= in.nextInt();
			System.out.println("Please enter the length of the windows");
			int windowLength= in.nextInt();
			
			int windowSqFt=(windowHeight*windowLength*windowAmount);
			System.out.println("The total square footage of the windows are"+windowSqFt);
			
			System.out.println("Please enter the amount of doors");
			int doorAmount= in.nextInt();
			System.out.println("Please enter the width of the doors");
			int doorHeight= in.nextInt();
			System.out.println("Please enter the length of the doors");
			int doorLength= in.nextInt ();
			
			int doorSqFt=(doorHeight*doorLength*doorAmount);
			System.out.println("The total square footage of the doors are" + doorSqFt);
			
			int sqfttopaint= (wallSqFt-windowSqFt-doorSqFt);
			System.out.println("The total paintable square footage is");
			System.out.println("cost to paint the house is "+ sqfttopaint*costSqFt);
			in.close();

	}

}
