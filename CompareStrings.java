import java.util.Scanner;

public class CompareStrings {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		try {
			System.out.println("Input the first text: ");
			String first = scan.nextLine();
			
			System.out.println("Input the secound text: ");
			String secound = scan.nextLine();
			
			System.out.println("--------------------------------------");
			System.out.println(first + "\n"
					+ secound);
			System.out.println("--------------------------------------");
		
			if(first.equals(secound)) {
				System.out.println("\n");
				System.out.println("\n");
				System.out.println("################");
				System.out.println("Matched! \n"
						+ "It seems ledigt.");
				System.out.println("################");
			}else {
				System.out.println("################");
				System.out.println("NOT MATCHED !! \n"
						+ "STAY AWAY!!");
				System.out.println("################");
			}
			
		} finally {
			scan.close();
		}

	}

}
