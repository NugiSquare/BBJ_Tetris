
public class Core {
	//Call Threads
	static gamethread gt;
	static eventthread et;
	//Call Variables
	static int[][] board;
	static int vert, horz, blocknum, x, y, flag, time, threadflag;
	//vert for vertical size of board
	//horz for horizontal size of board
	//x and y for block's standard point
	//

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		gt = new gamethread();
		et = new eventthread();
		
		gt.start();
		et.start();
		
		board = new int[horz][vert];
	}
}
