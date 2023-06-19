package class4;

public class MyProgram1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		System.out.println("this is test forddd! \\ dsds  ");
		
//		String mypara = "this is my test statment to teach";
//		
//		System.out.println(mypara.charAt(16));
//		
//		System.out.println(mypara.substring(5, 17));
		
		
		String mystat = "Welcome to [pargol's class] whatever";
		int startChar = mystat.indexOf("["); //11
		int endChar = mystat.indexOf("]");//26
//		System.out.println(startChar);
//		
//		System.out.println(endChar);
		
		String myNewStat = mystat.substring(startChar+1, endChar);
		System.out.println(myNewStat);

		String test = "Pargol";
		System.out.println(test.length());
		
		
		
		

	}

}
