import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class eventthread extends Thread implements KeyListener {
	
	static int x, y, flag;

	public void run() {
		preset();
	}
	
	public void preset() {
		x =gamethread.x; y =gamethread.y; flag =gamethread.flag;
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		int keycode = e.getKeyCode();
		switch(keycode) {
			case KeyEvent.VK_LEFT:
				x--;
			case KeyEvent.VK_RIGHT:
				x++;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
