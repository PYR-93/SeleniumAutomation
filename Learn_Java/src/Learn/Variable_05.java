package Learn;

public class Variable_05 {
	
	
	
	int Age=20;  // This is called instance variable and can be used across this class

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Variable_05 v1=new Variable_05();
		v1.Age=60;
		v1.Age=65;
		v1.variables_Test();
		
		
		
		System.out.println(v1.variables_Test());
		
		
		
		
		
		
	}

	
	int variables_Test() {
		int Score = 50; // Local Variable - Can be accessed only in this method
		
		
		Score = 30;
		Score = 70;
		
		
		return Score;
	}
	
	int variables_Test1() {
		int Score = 0;
		
		return Score;
		
	}
	
}
