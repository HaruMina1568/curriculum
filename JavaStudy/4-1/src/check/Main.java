package check;

import constants.Constants;

public class Main {
	
	private static String firstName = "田中";
	private static String lastName = "俊輔";
	
		
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		printName(firstName, lastName);
		
		Pet pt = new Pet(Constants.CHECK_CLASS_JAVA, Constants.CHECK_CLASS_HOGE );
		pt.introduce();
		
		RobotPet rp = new RobotPet(Constants.CHECK_CLASS_R2D2, Constants.CHECK_CLASS_LUKE);
		rp.introduce();
	}


	private static String printName(String firstName,String lastName) {
		
		String fullname = firstName + lastName; 
		System.out.println("printNameメソッド → " + fullname);
		return fullname;		
		
}

}
