
public class Core {
	//Call Threads
	static gamethread gt;
	static eventthread et;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		gt = new gamethread();
		et = new eventthread();
		
		gt.start();
		et.start();
	}
}
