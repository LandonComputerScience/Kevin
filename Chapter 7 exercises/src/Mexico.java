
public class Mexico {
	public static final int startYear = 2014;
	public static final double growth = 1.005;
	public static final double startGrowth = 123.8;
	public static void main (String [] args){
		double userInput= Input.getDouble("Please enter target population");
		int year;
		for(year= startYear; startGrowth* Math.pow(growth, year - startYear) < userInput; year++){
			
		}
		System.out.println("The target population of " + userInput + "will be reached in " + year+ " years");
	}
}
