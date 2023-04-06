package Package_2;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import Package_2.Java15_1.MyActionListener;

public class Java15_2 extends JFrame {
	void java15_2() {
		setTitle("swing 연습");
		setSize(200, 200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new FlowLayout());//가운데 정렬 형태로 사용하겠다
		JButton button1 = new JButton("Play");
		
		//익명 클래스
		button1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			JButton Button = (JButton)e.getSource();//형 변환
			if(Button.getText().equals("Play"))
				Button.setText("Stop");
			else {
				Button.setText("Play");
			}
		}
		});
		add(button1);
	}
	public static void main(String[] args) {
		Java15_2 mainFrame = new Java15_2();
		mainFrame.java15_2();
	}
}
