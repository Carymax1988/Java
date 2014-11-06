package com.liujiaqi.bean;

public class Board {
	
	private Point[][] arr_board;
	private final static int board_size = 15;
	/**
	 * 
	 */
	public void init(){
		arr_board = new Point[board_size][board_size];
		for(int i=0;i<board_size;i++){
			for (int j = 0; j < board_size; j++) {
				Point p = new Point();
				p.setX(i+1);
				p.setY(j+1);
				p.setIsempty(true);
				arr_board[i][j] = p;
			}
		}
		refreshBoard();
	}
	
	/**
	 * 
	 * @param p
	 */
	public void putpoint(Point p) throws ArrayIndexOutOfBoundsException{
		int x = p.getX();
		int y = p.getY();
		if(x<=board_size && y<=board_size){
			arr_board[x-1][y-1].setIsempty(false);
		}else{
			System.out.println("ÏµÍ³³ö´í");
		}
	}
	
	/**
	 * 
	 */
	public void refreshBoard(){
		for(int i=0;i<arr_board.length;i++){
			Point[] inpoint = arr_board[i];
			for(int j=0;j<inpoint.length;j++){
				Point p = inpoint[j];
				if(p.isIsempty()){
					System.out.print("+");
				}else{
					System.out.print("¡ñ");
				}
			}
			System.out.print("\n");
		}
	}
}
