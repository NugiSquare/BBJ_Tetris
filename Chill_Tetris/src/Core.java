
public class Core {
	//Call Threads
	static gamethread gt;
	static eventthread et;
	//Call Variables
	static int[][] board;
	static int vertical, horizontal, blocknum, x, y, flag, time, threadflag;
	//vertical is for vertical size of board
	//horizontal is for horizontal size of board
	//x and y are for block's standard point
	//flag is for block's particle's state
	//time is for speed for falling blocks
	//threadflag is for thread's state

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		gt = new gamethread();
		et = new eventthread();
		
		threadflag = 0;
		vertical = 20; horizontal = 10;
		
		board = new int[vertical][horizontal];
		
		resetboard();
		
		gt.start();
		et.start();
	}
	
	//reset board
	public static void resetboard() {
		for(int i=0; i<vertical; i++) {
			for(int j=0; j<horizontal; j++) {
				board[i][j] = 0;
			}
		}
	}
	
	//show board on console
    public static void showboard() {
		for(int i=0; i<horizontal; i++) {
			System.out.print("--");
		}
		System.out.println();
		     for(int i=0; i<vertical; i++) {
		         for(int j=0; j<horizontal; j++) {
		        	 System.out.print(board[i][j]+" ");
		         }
		         System.out.println();
		     }
		     for(int i=0; i<horizontal; i++) {
		    	 System.out.print("--");
		     }
		System.out.println();
	}
}
