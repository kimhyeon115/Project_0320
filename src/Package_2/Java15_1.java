package Package_2;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Java15_1 extends JFrame {
	void java15_1() {
		setTitle("swing 연습");
		setSize(200, 200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());//가운데 정렬 형태로 사용하겠다
		JButton button1 = new JButton("Play");
		button1.addActionListener(new MyActionListener());
		//버튼에 리스너를 연결해 주어야 한다. 그래서 객체를 생성해서 넣어 주었다.
		add(button1);//프레임에다 삽입
		}
		//내부 클래스
		public class MyActionListener implements ActionListener {
			public void actionPerformed(ActionEvent e) {
				JButton Button = (JButton)e.getSource();//형 변환
				if(Button.getText().equals("Play"))
					Button.setText("Stop");
				else {
					Button.setText("Play");
				}
			}
		}
		public static void main(String[] args) {
			Java15_1 mainFrame = new Java15_1();
			mainFrame.java15_1();
		}
}
