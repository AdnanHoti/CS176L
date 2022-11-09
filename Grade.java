package edu.monmouth.grade;
import edu.monmouth.grade.Grade; 
public class Grade {
	private String gradeLetter;
	
	private final String UNKNOWN = "UNKNOWN";
	

	public Grade() {
		setGradeLetter(UNKNOWN);
	}
	public Grade(char gradeLetter) {
		setGradeLetter(Character.toString(gradeLetter));
	}
	public Grade(String gradeLetter) {
		setGradeLetter(gradeLetter);
	}
	public String getGradeLetter() {
		return gradeLetter;
	}
	public void setGradeLetter(String gradeLetter) {
	
		if (gradeLetter.equals("A") || gradeLetter.equals("A-") || gradeLetter.equals("B") || gradeLetter.equals("B+")|| gradeLetter.equals("B-") || gradeLetter.equals("C") || gradeLetter.equals("C+") || gradeLetter.equals("INC")) {
			
			this.gradeLetter = gradeLetter ;  
		
		}else{
			this.gradeLetter = UNKNOWN ;
		}
	}
			
	public double getGradeValue() {
		double output = 0;
		if (gradeLetter.equals("A")){
			output = 4;
		}else if (gradeLetter.equals("A-")) {
			output = 3.75;
		}else if (gradeLetter.equals("B+")) {
			output = 3.5;
		}else if (gradeLetter.equals("B")) {
			output = 3;
		}else if (gradeLetter.equals("B-")) {
			output = 2.75;
		}else if (gradeLetter.equals("C+")) {
			output = 2.5;
		}else if (gradeLetter.equals("C")) {
			output = 2;
		
		}

		return output;
	
		
	}
}

