package Package_2;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Java15_3 extends JFrame {
	JPanel Panel = new JPanel();
	JLabel Label = new JLabel();
	
	void java15_3() {
		setTitle("마우스 좌표 출력");
		setSize(200, 200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Panel.add(Label);//기본 Border layout 적용
		Panel.addMouseMotionListener(new MouseMotionListener() {
			//new MouseMotionListener()는 여기로 부터 정보를 얻어온다는 것
			public void mouseDragged(MouseEvent e) {}
			public void mouseMoved(MouseEvent e) {
				Integer x = e.getX();
				Integer y = e.getY();
				String str = "X : " + x.toString() + " Y : " + y.toString();
				Label.setText(str);
				}
		}
		);
		add(Panel);
	}
	public static void main(String[] args) {
		Java15_3 mainFrame = new Java15_3();
		mainFrame.java15_3();
	}
}
