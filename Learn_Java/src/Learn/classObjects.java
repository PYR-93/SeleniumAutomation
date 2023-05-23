package Learn;

public class classObjects {
	public String Name,Company,Skills;
	private int Age;
	
	
	
	public void run() {
		System.out.println("Hi Am Running");
	}
	
	
	
	
	public static void main(String[] Args) {
		
		classObjects C1 = new classObjects();
		classObjects C2 = new classObjects();
		classObjects C3 = new classObjects();
		classObjects C4 = new classObjects();
		
		C1.Age=20;
		C1.Company="IQVIA";
		C1.Name="Yogi";
		C1.Skills="Automation";
		
		C2.Age=21;
		C2.Company="DXC";
		C2.Name="Yogi";
		C2.Skills="Selenium";
		
		
		
		C2.Age=29;
		
		
		
		
		System.out.println("Hi My name is "+C1.Name+" and my age is - "+C2.Age+" "+"I worked in companies like "+C1.Company+","+C2.Company+" And "+"Expertise in "+C1.Skills+" "+C2.Skills );
		C1.run();
	}
	
}
