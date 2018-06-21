package test.frame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class TestFrame01 extends JFrame{
	
	//생성자
	public TestFrame01() {
		//버튼 객체 생성해서 
		JButton button=new JButton("눌러보셈");
		//버튼에 액션 리스너 등록하기
		button.addActionListener(listener);
		//이 프레임에 추가하기
		add(button);
		
		setBounds(100, 100, 300, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	//ActionListener type 객체를 필드로 정의하기 
	ActionListener listener=new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("버튼을 눌렀네?");
		}
	};
	
	public static void main(String[] args) {
		new TestFrame01();
	}
}







