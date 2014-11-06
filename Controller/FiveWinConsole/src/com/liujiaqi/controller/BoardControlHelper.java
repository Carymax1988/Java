package com.liujiaqi.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.liujiaqi.bean.Board;
import com.liujiaqi.bean.Point;

public class BoardControlHelper {
	private Board b = new Board();
	public void Start(){
		init();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String inputStr = null;
		try {
			while((inputStr=br.readLine())!=null){
				String[] pos = inputStr.split(",");
				int x = Integer.parseInt(pos[0]);
				int y = Integer.parseInt(pos[1]);
				Point p = new Point();
				p.setX(x);
				p.setY(y);
				p.setIsempty(false);
				b.putpoint(p);
				refresh();
			}
		} catch (IOException e) {
			System.out.println("ϵͳ����");
		}
	}
	private void init(){
		b.init();
		System.out.println("����������������꣬Ӧ��x,y�ĸ�ʽ:");
	}
	private void refresh(){
		b.refreshBoard();
		System.out.println("����������������꣬Ӧ��x,y�ĸ�ʽ:");
	}
}
