package omok;

import java.awt.*;
import java.util.*;
import java.awt.event.*;
import javax.swing.*;

	public class Omokgame extends JFrame {
	
		// 오목판 객체생성
		private OmokBoard board=new OmokBoard(20,30);
  
		// 생성자
		public Omokgame(String title){                     
	  			add(board);
	  			this.setBounds(200,20,650,700);
	  			this.setVisible(true);
 
		}
  public void ch(String s){
   JOptionPane.showMessageDialog(this,s,"승리",JOptionPane.INFORMATION_MESSAGE);
  }
  	class OmokBoard extends Canvas{   //오목판 구현
  		
  		// 흑과 백을 나타내는 상수
  		public static final int BLACK=1, WHITE=-1; 
  		
  		// 오목판 배열	
  		private int[][] map;    
  		
  		// size는 격자의 가로 또는 세로 개수, 15로 정한다.
  		private int size;           
  		
  		// 격자의 크기(pixel)
  		private int cell;                     
  		private int color=BLACK;   
  		
  		// true면 돌을 놓기, false면 불가
  		private Graphics gboard, gbuff;    // 캔버스와 버퍼를 위한 그래픽스 객체
  		
  		private Image buff;                 // 더블 버퍼링을 위한 버퍼
  		
  			int turn=1;
  			
  		// 오목판  생성자(s 15, c 30)  
  			OmokBoard(int s, int c){           // 오목판  생성자(s 15, c 30)  
  				
  				this.size=s; this.cell=c;
  				map=new int[size+2][];            // 맵의 크기를 정한다.
  				
  				for(int i=0;i<map.length;i++)
  					map[i]=new int[size+2];
  				setBackground(new Color(220,255,0));         // 오목판의 배경색을 정한다.
  				
  				setSize(size*(cell+1)+size, size*(cell+1)+size);    // 오목판의 크기를 계산한다.
  				
  				
  				addMouseListener(new MouseAdapter(){
  					public void mousePressed(MouseEvent me){
  						//마우스 좌표 계산식 추가 예정
  						
  						
  						
  						
  					};
  				});
  			}
  	}
  	
  	
  	
    public static void main(String []args){
    	   new Omokgame("OMOKGAME");
    	   
    	   
    	   
    	   
    }
}
	
	
	
	
	
	