package assignment3_arithmeticOperators;

public class question5_calculateTime {

	public static void main(String[] args) {
		
		int inputSeconds, hours, minutes, seconds;
		inputSeconds=3695;
		
		hours=inputSeconds/3600;
		minutes=(inputSeconds-(hours*3600))/60;
		seconds=inputSeconds%60;
		
		
		
		System.out.println("inputSecond is " + inputSeconds);
		System.out.println(hours + " hours, " + minutes + " minutes, and " + seconds + " seconds");
		
		

	}

}
