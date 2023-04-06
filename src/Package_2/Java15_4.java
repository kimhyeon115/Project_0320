package Package_2;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Java15_4 extends JFrame {
	JPanel Panel = new JPanel();
	JLabel Label = new JLabel();
	
	void java15_4() {
		setTitle("마우스 좌표 출력");
		setSize(200, 200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Panel.setLayout(null);
		Label.setLocation(20, 20);
		Label.setSize(170, 50);
		Label.setText("클릭 좌표: ");
		
		Panel.add(Label);//판넬에 연결, 기본 Border layout 적용
		Panel.addMouseListener(new MyMouse());//라벨을 사용하므로 간단해 졌다.
		
		add(Panel);
	}
	
	public class MyMouse extends MouseAdapter{
		public void mouseClicked(MouseEvent e)//마우스 어댑터 사용
		{
			Integer x = e.getX();
			Integer y = e.getY();
			String string = "클릭 좌표: " + x.toString() + " Y : " + y.toString();
			Label.setText(string);//문자 열을 라벨에 넣는다
		}
		
	}
	public static void main(String[] args) {
		Java15_4 mainFrame = new Java15_4();
		mainFrame.java15_4();
	}
}
