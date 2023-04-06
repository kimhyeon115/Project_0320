package Package_2;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Java14_3 extends JFrame {
	Java14_3() {
		setTitle("swing 연습");
		setSize(200, 200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		/*
		//1)버튼을 컨텍트 팬을통해 추가하는 코드
		Container ContentPane = getContentPane();//펜을 얻고
		ContentPane.setLayout(null);//내용을 null로
		JButton button = new JButton("test");//
		button.setSize(70, 20);
		button.setLocation(50, 10);
		ContentPane.add(button);//이때 버튼이 화면에 추가된다 
		*/
		//2) JFrame를 통해 버튼을 추가하는 코드
		this.setLayout(null);//기존의 것을 삭제(null)임의로 삽입하기 우한 것 this. 생략가능
		JButton button = new JButton("test");//
		button.setSize(70, 20);
		button.setLocation(50, 10);
		this.add(button);//이때 버튼이 화면에 추가된다 this. 생략가능
	}
	public static void main(String[] args) {
		Java14_3 MainFrame = new Java14_3();
	}
}
