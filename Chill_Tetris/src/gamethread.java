import java.util.Random;

public class gamethread extends Thread {
	
	static int[][] board = Core.board;
	static int blocknum = Core.blocknum;
	static int vertical = Core.vertical; static int horizontal = Core.horizontal;
	static int x = Core.x; static int y = Core.y;
	static int flag = Core.flag; static int threadflag = Core.threadflag;
	
	public void run() {
		while(true)
		{
			try {
				sleep(1000);
				
				
				Core.showboard();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
    public static void blockchoice() {
        Random rd = new Random();
        blocknum = rd.nextInt(19);
        randomX();
    }
	
	public static void randomX() {
		Random rd = new Random();
		if(blocknum==0) {
			y = rd.nextInt(horizontal);
		}
		else if((blocknum==2)||(blocknum==3)||(blocknum==5)||(blocknum==8)||(blocknum==10)||(blocknum==12)||(blocknum==14)||(blocknum==16)||(blocknum==18)) {
			y= rd.nextInt(horizontal-1);
			if((blocknum==8)||(blocknum==12)||(blocknum==16)) {
				if(y!=0){
					y--;
				}
			}
		}
		else if((blocknum==4)||(blocknum==6)||(blocknum==7)||(blocknum==9)||(blocknum==11)||(blocknum==13)||(blocknum==15)||(blocknum==17)) {
			y= rd.nextInt(horizontal-2);
		}
		else if(blocknum==1) {
			y = rd.nextInt(horizontal-3);
		}
	}
	
    public static void blockdownreferee() {
   	 if(blocknum==0) {
            if((x>vertical-5)||(board[x+4][y]!=0))
                 threadflag=1;
            else {
                 flag=0;
                 setblock();
                 x++;
            }
       }
       else if(blocknum!=0) {
            if((x>vertical-2)||((board[x+1][y]!=0)||(board[x+1][y+1]!=0)||(board[x+1][y+2]!=0)||(board[x+1][y+3]!=0)))
                 threadflag=1;
            else {
                 flag=0;
                 setblock();
                 x++;
            }
       }
       else if(blocknum==2) {
            if((x>vertical-3)||((board[x+2][y]!=0)||board[x+2][y+1]!=0))
                 threadflag=1;
            else {
                 flag=0;
                 setblock();
                 x++;
            }
       }
       else if(blocknum==3) {
            if((x>vertical-4)||(board[x+2][y]!=0)||(board[x+3][y+1]!=0))
                 threadflag=1;
            else {
                 flag=0;
                 setblock();
                 x++;
            }
       }
       else if(blocknum==4) {
            if((x>vertical-3)||(board[x+2][y]!=0)||(board[x+2][y+1]!=0)||(board[x+1][y+2]!=0))
                 threadflag=1;
            else {
                 flag=0;
                 setblock();
                 x++;
            }
       }
       else if(blocknum==5) {
            if((x>vertical-4)||(board[x+3][y]!=0)||(board[x+2][y+1]!=0))
                 threadflag=1;
            else {
                 flag=0;
                 setblock();
                 x++;
            }
       }
       else if(blocknum==6) {
            if((x>vertical-3)||(board[x+1][y]!=0)||(board[x+2][y+1]!=0)||(board[x+2][y+2]!=0))
                 threadflag=1;
            else {
                 flag=0;
                 setblock();
                 x++;
            }
       }
       else if(blocknum==7) {
            if((x>vertical-3)||(board[x+2][y]!=0)||(board[x+2][y+1]!=0)||(board[x+2][y+2]!=0))
                 threadflag=1;
            else {
                 flag=0;
                 setblock();
                 x++;
            }
       }
       else if(blocknum==8) {
            if((x>vertical-4)||(board[x+3][y+1]!=0)||(board[x+1][y+2]!=0))
                 threadflag=1;
            else {
                 flag=0;
                 setblock();
                 x++;
            }
       }
       else if(blocknum==9) {
            if((x>vertical-4)||(board[x+2][y]!=0)||(board[x+2][y+1]!=0)||(board[x+3][y+2]!=0))
                 threadflag=1;
            else {
                 flag=0;
                 setblock();
                 x++;
            }
       }
       else if(blocknum==10) {
            if((x>vertical-4)||(board[x+3][y]!=0)||(board[x+3][y+1]!=0))
                 threadflag=1;
            else {
                 flag=0;
                 setblock();
                 x++;
            }
       }
       else if(blocknum==11) {
            if((x>vertical-3)||(board[x+2][y]!=0)||(board[x+2][y+1]!=0)||(board[x+2][y+2]!=0))
                 threadflag=1;
            else {
                 flag=0;
                 setblock();
                 x++;
            }
       }
       else if(blocknum==12) {
            if((x>vertical-4)||(board[x+3][y+1]!=0)||(board[x+3][y+2]!=0))
                 threadflag=1;
            else {
                 flag=0;
                 setblock();
                 x++;
            }
       }
       else if(blocknum==13) {
            if((x>vertical-4)||(board[x+3][y]!=0)||(board[x+2][y+1]!=0)||(board[x+2][y+2]!=0))
                 threadflag=1;
            else {
                 flag=0;
                 setblock();
                 x++;
            }
       }
       else if(blocknum==14) {
            if((x>vertical-4)||(board[x+1][y]!=0)||(board[x+3][y+1]!=0))
                 threadflag=1;
            else {
                 flag=0;
                 setblock();
                 x++;
            }
       }
       else if(blocknum==15) {
            if((x>vertical-3)||(board[x+2][y]!=0)||(board[x+2][y+1]!=0)||(board[x+2][y+2]!=0))
                 threadflag=1;
            else {
                 flag=0;
                 setblock();
                 x++;
            }
       }
       else if(blocknum==16) {
            if((x>vertical-4)||(board[x+3][y+1]!=0)||(board[x+2][y+2]!=0))
                 threadflag=1;
            else {
                 flag=0;
                 setblock();
                 x++;
            }
       }
       else if(blocknum==17) {
            if((x>vertical-4)||(board[x+2][y]!=0)||(board[x+3][y+1]!=0)||(board[x+2][y+2]!=0))
                 threadflag=1;
            else {
                 flag=0;
                 setblock();
                 x++;
            }
       }
       else if(blocknum==18) {
            if((x>vertical-4)||(board[x+2][y]!=0)||(board[x+3][y+1]!=0))
                 threadflag=1;
            else {
                 flag=0;
                 setblock();
                 x++;
            }
        }
    }

	
    public static void setblock() {
        if(blocknum==0) {
             board[x][y] = flag;
             board[x+1][y] = flag;
             board[x+2][y] = flag;
             board[x+3][y] = flag;
        }
        else if(blocknum==1) {
             board[x][y] = flag;
             board[x][y+1] = flag;
             board[x][y+2] = flag;
             board[x][y+3] = flag;
        }
        ////
        else if(blocknum==2) {
             board[x][y] = flag;
             board[x][y+1] = flag;
             board[x+1][y] = flag;
             board[x+1][y+1] = flag;
        }
        ////
        else if(blocknum==3) {
             board[x][y] = flag;
             board[x+1][y] = flag;
             board[x+1][y+1] = flag;
             board[x+2][y+1] = flag;
        }
        else if(blocknum==4) {
             board[x][y+1] = flag;
             board[x][y+2] = flag;
             board[x+1][y] = flag;
             board[x+1][y+1] = flag;
        }
        ////
        else if(blocknum==5) {
             board[x][y+1] = flag;
             board[x+1][y] = flag;
             board[x+1][y+1] = flag;
             board[x+2][y] = flag;
        }
        else if(blocknum==6) {
             board[x][y] = flag;
             board[x][y+1] = flag;
             board[x+1][y+1] = flag;
             board[x+1][y+2] = flag;
        }
        ////
        else if(blocknum==7) {
             board[x][y] = flag;
             board[x+1][y] = flag;
             board[x+1][y+1] = flag;
             board[x+1][y+2] = flag;
        }
        else if(blocknum==8) {
             board[x][y+1] = flag;
             board[x][y+2] = flag;
             board[x+1][y+1] = flag;
             board[x+2][y+1] = flag;
        }
        else if(blocknum==9) {
             board[x+1][y] = flag;
             board[x+1][y+1] = flag;
             board[x+1][y+2] = flag;
             board[x+2][y+2] = flag;
        }
        else if(blocknum==10) {
             board[x][y+1] = flag;
             board[x+1][y+1] = flag;
             board[x+2][y] = flag;
             board[x+2][y+1] = flag;
        }
        ////
        else if(blocknum==11) {
             board[x][y+2] = flag;
             board[x+1][y] = flag;
             board[x+1][y+1] = flag;
             board[x+1][y+2] = flag;
        }
        else if(blocknum==12) {
             board[x][y+1] = flag;
             board[x+1][y+1] = flag;
             board[x+2][y+1] = flag;
             board[x+2][y+2] = flag;
        }
        else if(blocknum==13) {
             board[x+1][y] = flag;
             board[x+1][y+1] = flag;
             board[x+1][y+2] = flag;
             board[x+2][y] = flag;
        }
        else if(blocknum==14) {
             board[x][y] = flag;
             board[x][y+1] = flag;
             board[x+1][y+1] = flag;
             board[x+1][y+2] = flag;
        }
        ////
        else if(blocknum==15) {
             board[x][y+1] = flag;
             board[x+1][y] = flag;
             board[x+1][y+1] = flag;
             board[x+1][y+2] = flag;
        }
        else if(blocknum==16) {
             board[x][y+1] = flag;
             board[x+1][y+1] = flag;
             board[x+1][y+2] = flag;
             board[x+2][y+1] = flag;
        }
        else if(blocknum==17) {
             board[x+1][y] = flag;
             board[x+1][y+1] = flag;
             board[x+1][y+2] = flag;
             board[x+2][y+1] = flag;
        }
        else if(blocknum==18) {
             board[x][y+1] = flag;
             board[x+1][y] = flag;
             board[x+1][y+1] = flag;
             board[x+2][y+1] = flag;
        }
   }         
}

