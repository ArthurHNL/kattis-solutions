import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String in = s.nextLine();
		s.close();
		
		String[] param = in.split(" ");
		
		int fizzInt = Integer.parseInt(param[0]);
		int buzzInt = Integer.parseInt(param[1]);
		int max = Integer.parseInt(param[2]);
		
		for (int i = 1; i <= max; i++) {
			String strOut = "";
			if (i % fizzInt == 0) {
				strOut += "Fizz";
			}
			if (i % buzzInt == 0) {
				strOut += "Buzz";
			}
			if (strOut.isEmpty()) {
				strOut += i;
			}
			System.out.println(strOut);
			
		}
		
	}
	
	
}
