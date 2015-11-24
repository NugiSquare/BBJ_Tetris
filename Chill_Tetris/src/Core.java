import javax.swing.*;
import java.awt.event.*;
import javax.swing.border.LineBorder;

import java.awt.*;


public class Core extends JFrame {
	//Call Threads
	static gamethread gt;
	static eventthread et;
	static Core c;
	
	static int vertical, horizontal;
	
	private JPanel board, panel2, panel3, panel4, panel5;
	private JLabel score, level;
	private JTextArea textArea1;
	private JButton start, exit;
	private JRadioButton b1, b2, b3;
	private ButtonGroup bg;
	public JButton[][] block;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		gt = new gamethread();
		et = new eventthread();
		
		gt.start();
		et.start();
		
		vertical = gamethread.vertical-3;
		horizontal = gamethread.horizontal;
		
		c = new Core();
		
		c.setVisible(true);
		
		while(true) {
			for(int i=0; i<vertical; i++) {
				for(int j=0; j<horizontal; j++) {
					c.changecolor(i, j, String.valueOf(gamethread.board[i+3][j]));
				}
			}
			c.changecolor();
        }
	}
	
	public void changecolor(int x, int y, String board) {
        block[x][y].setName(board);
	}
	public void changecolor() {
		for(int i=0; i<vertical; i++) {
        	for(int j=0; j<horizontal; j++) {
        		if(block[i][j].getName().equals("0")) {
        			block[i][j].setBackground(Color.BLACK);
        		}
        		else if(block[i][j].getName().equals("1") || block[i][j].getName().equals("2")) {
        			block[i][j].setBackground(Color.CYAN);
        		}
        		else if(block[i][j].getName().equals("3") || block[i][j].getName().equals("4") || block[i][j].getName().equals("5") || block[i][j].getName().equals("6")) {
        			block[i][j].setBackground(Color.BLUE);
        		}
        		else if(block[i][j].getName().equals("7") || block[i][j].getName().equals("8") || block[i][j].getName().equals("9") || block[i][j].getName().equals("10")) {
        			block[i][j].setBackground(Color.ORANGE);
        		}
        		else if(block[i][j].getName().equals("11")) {
        			block[i][j].setBackground(Color.YELLOW);
        		}
        		else if(block[i][j].getName().equals("12") || block[i][j].getName().equals("13")) {
        			block[i][j].setBackground(Color.GREEN);
        		}
        		else if(block[i][j].getName().equals("14") || block[i][j].getName().equals("15") || block[i][j].getName().equals("16") || block[i][j].getName().equals("17")) {
        			block[i][j].setBackground(Color.ORANGE);
        		}
        		else if(block[i][j].getName().equals("18") || block[i][j].getName().equals("19")) {
        			block[i][j].setBackground(Color.RED);
        		}
        		else
        			block[i][j].setBackground(Color.WHITE);
        	}
        }
	}
	public Core()
    {	
		vertical = gamethread.vertical-3;
		horizontal = gamethread.horizontal;
		
    	getContentPane().setLayout(null);
        setResizable(false);
        setTitle("Chill_Tetris");
        setBounds(500,100,500,640);
        setBackground(Color.white);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        board = new JPanel();
        board.setBounds(50,50,300,510);
        board.setBackground(Color.black);
        board.setLayout(new GridLayout(vertical, horizontal));
        getContentPane().add(board);
        
        block = new JButton[vertical][horizontal];
        for(int i=0; i<vertical; i++) {
        	for(int j=0; j<horizontal; j++) {
        		block[i][j] = new JButton();
        		block[i][j].setBorder(new LineBorder(Color.black));
        		block[i][j].setBackground(Color.gray);
        		block[i][j].setEnabled(false);
        		block[i][j].setOpaque(true);
        	}
        }
        for(int i=0; i<vertical; i++) {
        	for(int j=0; j<horizontal; j++) {
        		board.add(block[i][j]);
        	}
        }

        panel2 = new JPanel();
        panel2.setBounds(380,50,80,70);
        panel2.setBackground(Color.gray);
        getContentPane().add(panel2);
        panel2.setLayout(new GridLayout(2,1));


        score = new JLabel();
        score.setText("Score");
        score.setBounds(0,0,50,30);
        panel2.add(score);

        textArea1 = new JTextArea();
        textArea1.setBounds(10,30,60,30);
        panel2.add(textArea1);

        panel3 = new JPanel();
        panel3.setBounds(380,150,80,130);
        panel3.setBackground(Color.gray);
        getContentPane().add(panel3);


        level = new JLabel();
        level.setText("Level");
        level.setBounds(0,0,50,40);
        panel3.add(level);

        bg = new ButtonGroup();
        JRadioButton b1 = new JRadioButton("Easy");
        b1.setBounds(0,40,80,30);
        bg.add(b1);
        panel3.add(b1);

        b2 = new JRadioButton("Normal");
        b2.setBounds(0,70,80,30);
        bg.add(b2);
        panel3.add(b2);

        b3 = new JRadioButton("Hard");
        b3.setBounds(0,100,80,30);
        bg.add(b3);
        panel3.add(b3);
        
//        b1.addActionListener(button); 
//        b2.addActionListener(button);  
//        b3.addActionListener(button);  

        panel4 = new JPanel();
        panel4.setBounds(380, 500, 80, 40);
        getContentPane().add(panel4);

        panel5 = new JPanel();
        panel5.setBounds(380,450,80,40);
        getContentPane().add(panel5);

        start = new JButton();
        start.setText("START");
        start.setBackground(Color.gray);
        start.setBounds(0,0,50,40);
        panel5.add(start);
//        start.addActionListener(button);  
        
        exit = new JButton();
        exit.setText("EXIT");
        exit.setBounds(0,0,50,40);
        exit.setBackground(Color.gray);
        panel4.add(exit);
        exit.addActionListener(new ActionListener()
        {
        	public void actionPerformed(ActionEvent arg0)
        	{
        		System.exit(0);
        	}
        });
    }
	
	public void setsize(int a, int b) {
		this.vertical = a;
		this.horizontal = b;
	}
}