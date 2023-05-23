package Learn;

public class BreakContinue_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		
		int i=0,j=0;
		for (;i<=10;i++) {
			
			if(i==7) {break;}   // After 6th iteration Exit from for loop
			System.out.println(i);
		}
		
for (;j<=10;j++) {
			
			if(j==7) {continue;}  /// 7th iteration is Skipped
			System.out.println(j);
		}

	}

}
