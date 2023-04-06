package swing;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class IndepClassListener extends JFrame {
	public IndepClassListener() {
		setTitle("Action 이벤트 리스너 예제");//제목
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		//프레임 윈도우를 닫으면 프로그램을 종료하도록 설정
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("Action");
		btn.addActionListener(new MyActionListener()); 
		// Action 이벤트 리스너 달기, 리스너는 이벤트를 처리하는 코드(메서드)
		c.add(btn);
		
		setSize(350, 150);
		setVisible(true);
	}
	public static void main(String [] args) {
		new IndepClassListener();
	}
} 
// 독립된 클래스로 이벤트 리스너를 작성한다.
class MyActionListener implements ActionListener {
	public void actionPerformed(ActionEvent e) {//버튼클릭 시에 발동 되는 메소드
		JButton b = (JButton)e.getSource(); // 이벤트 소스 버튼 알아내기
		if(b.getText().equals("Action")) // 버튼의 문자열이 "Action"인지 비교
			b.setText("액션"); // 버튼의 문자열을 "액션"으로 변경
		else
			b.setText("Action"); // 버튼의 문자열을 "Action"으로 변경
	}
}