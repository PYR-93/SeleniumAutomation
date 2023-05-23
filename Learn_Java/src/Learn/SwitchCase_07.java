package Learn;

public class SwitchCase_07 {

	public static void main(String[] args) {

		String Day = "Tuesday";
		String lower = Day;
		switch (lower.toLowerCase()) {

		case "monday":
			System.out.println("Its monday");
			break;
		case "tuesday":
			System.out.println("Its Tuesday");
			break;
		case "wednesday":
			System.out.println("Its Wednesday");
			break;
		case "thursday":
			System.out.println("Its Thursday");
			break;
		case "friday":
			System.out.println("Its Friday");
			break;
		case "saturday":
			System.out.println("Its Saturday");
			break;
		case "sunday":
			System.out.println("Its Sunday");
			break;
			
		default :
			System.out.println("Please provide a valid value");
			

		}

	}

}
