package ExercisesC;

public class ExerciseConditionals {
	public class Student {
	    private int marks;

	    public Student(int marks) {
	        // TODO: Assign 'marks' to the instance variable 'this.marks'
	        this.marks = marks;
	    }

	    public char assignGrade() {
	        if(marks < 0 || marks > 100){
	            return 'X';
	        }
	        if(marks >= 90){
	            return 'A';
	        }else if(marks >= 80 && marks < 90){
	            return 'B';
	        }else if (marks >= 70 && marks < 80){
	            return 'C';
	        }else if (marks >= 60 && marks < 70){
	            return 'D';
	        }else if (marks >= 50 && marks < 60){
	            return 'E';
	        }else {
	            return 'F';
	        }
	    }
	}
	
	public class WeatherAdviser {

	    public String provideWeatherAdvisory(int temperature) {
	        // TODO: Provide a weather advisory message based on the temperature.
	        if(temperature < 0){
	            return "It's freezing! Wear a heavy coat.";
	        }if(temperature >= 0 && temperature <= 10 ){
	            return "It's cold! Bundle up.";
	        }if(temperature >= 11 && temperature <= 20 ){
	            return "It's cool! A light jacket will do.";
	        }else 
	        return "It's warm! Enjoy the day.";
	    }
	}
	
	public class MyChar {

	    // Method to determine if a character is a vowel
	    public boolean isVowel(char ch) {
	        if( ch== 'a' || ch== 'e' ||ch== 'i' ||ch== 'o' ||ch== 'u'  ) {
				return true;
			}
			if(ch== 'A' || ch== 'E' ||ch== 'I' ||ch== 'O' ||ch== 'U'  ) {
				return true;
			}
	        // Use a switch statement to check for each vowel, both lowercase and uppercase
	        switch (ch) {
	        
	            // TODO: Complete the switch statement
	        }

	        return false;
	    }
	}
}



