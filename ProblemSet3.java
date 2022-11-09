package edu.monmouth.grade;

public class ProblemSet3 {
	public static void main(String[] args) {
		
	
	Grade history = new Grade("B+");
    Grade math = new Grade("C");
    Grade english = new Grade("C+");
    Grade gym = new Grade("B");
    Grade bogus = new Grade("F");
    
    System.out.println("History:" + history.getGradeLetter() + "" + history.getGradeValue());
    System.out.println("Math:" + math.getGradeLetter() + "" + math.getGradeValue());
    System.out.println("English:" + english.getGradeLetter() + "" + english.getGradeValue());
    System.out.println("Gym:" + gym.getGradeLetter() + "" + gym.getGradeValue());
    System.out.println("Bogus:" + bogus.getGradeLetter() + "" + bogus.getGradeValue());
    double gpa = (history.getGradeValue() + math.getGradeValue() + english.getGradeValue() + gym.getGradeValue() + bogus.getGradeValue())/5;
    System.out.println("GPA: " + gpa);
    
    //Went over with tutor and taught me that Math.min/max can work to provide max and min
    
  System.out.println("Lowest Grade:"+ Math.min(Math.min(Math.min(Math.min(history.getGradeValue(),math.getGradeValue()),english.getGradeValue()),gym.getGradeValue()),bogus.getGradeValue()));
  System.out.println("Highest Grade:"+ Math.max(Math.max(Math.max(Math.max(history.getGradeValue(),math.getGradeValue()),english.getGradeValue()),gym.getGradeValue()),bogus.getGradeValue()));
  
	}
}

   
