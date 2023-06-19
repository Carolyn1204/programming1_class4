package class4;

public class MyProgram2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String myStat = "Welcome to my Class [Pargolteacher.com] whatseve.com jhhjggjh";
		
		int startWord = myStat.indexOf("Pargol") + "pargol".length() ;
		
		int endWord = myStat.lastIndexOf(".com");
		System.out.println(endWord);
		String outsts = myStat.substring(startWord, endWord);
		
		System.out.println(outsts);
	}

}
