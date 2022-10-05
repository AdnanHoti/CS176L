package edu.monmouth.grade;

public class Grade {
	private char gradeLetter;

	public Grade() {
		gradeLetter = 'U';
	}
	public Grade(char gradeLetter) {
		this.gradeLetter = gradeLetter;
	}
	public char getGradeLetter() {
		return gradeLetter;
	}
	public void setGradeLetter(char gradeLetter) {
		this.gradeLetter = gradeLetter;
	}

}
