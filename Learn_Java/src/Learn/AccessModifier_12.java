package Learn;

public class AccessModifier_12 {
		public int Public;
		private int PRIVATE;
		int Default;
		protected int Protected;
	
	public static void main(String[] args) {
		AccessModifier_12 A1 = new AccessModifier_12();
		System.out.println(A1.Default=9);
		
		
		Dup D = new Dup();
		D.A2.PRIVATE = 20;
		
		
		
	}
	
	
}

class Dup{
	public AccessModifier_12 A2;
	
	public static void main(String[] args) {
		Dup D = new Dup();
		
	}

}