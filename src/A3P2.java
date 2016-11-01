import java.util.Scanner;

/**
 * 
 */

/**
 * @author z.liu
 *
 */
public class A3P2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner userInput = new Scanner(System.in);
		
		String firstName;
		String lastname;
	    int grade;
	    int studentID;
	    String Login;
	    int SchoolAverage;
	    
		System.out.println("What's your first name?");
		firstName = userInput.nextLine();
		System.out.println("What's your last name?");
		lastname = userInput.next();
		System.out.println("What's your grade?");
		grade = userInput.nextInt();
		System.out.println("What's your student ID?");
		studentID = userInput.nextInt();
		System.out.println("What'your username to login in your computer?");
		Login = userInput.next();
		System.out.println("What's your average(%) from the School system?");
		SchoolAverage = userInput.nextInt();

		System.out.println("Your  information:");
		System.out.println(String.format("%-10s" + Login, "Login: "));
		System.out.println(String.format("%-10s" + studentID, "ID: "));
		System.out.println(String.format("%-10s" + lastname + ", " +firstName , "Name:" ));
		System.out.println(String.format("%-10s" + SchoolAverage, "Average:  "));
		System.out.println(String.format("%-10s" + grade,"Grade: "));
		
		
		userInput.close();
	}

}
