
public class yourmoneysworth {
	public static void main(String[] args) {
		int totalcents = Input.getInt("Please enter amount of cents");
		int p = 0, n = 0, d = 0, q = 0;

		for (q = 0; (q * 25) <= totalcents; q++) {
			for (d = 0; (d * 10) <= (totalcents - q * 25); d++) {
				for (n = 0; (n * 5) <= (totalcents - q * 25 - d * 10); n++) {
					for (p = 0; p <= (totalcents - q * 25 - d * 10 - n * 5); p++) {

						if (((q * 25) + (d * 10) + (n * 5) + p) == totalcents) {

							System.out.println("Q: " + q + " D: " + d + " N: " + n + " P: " + p);

						}
					}
				}
			}
		}
	}
}
