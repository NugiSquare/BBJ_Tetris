
public class gamethread extends Thread {
	
	public void run() {
		while(true)
		{
			try {
				
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
