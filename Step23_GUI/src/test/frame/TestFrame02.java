package test.frame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class TestFrame02 extends JFrame implements ActionListener{
	
	//생성자
	public TestFrame02() {
		//버튼 객체 생성해서 
		JButton button=new JButton("눌러보셈");
		
		//버튼에 액션 리스너 등록하기
		button.addActionListener(this);
		//이 프레임에 추가하기
		add(button);
		
		setBounds(100, 100, 300, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new TestFrame02();
	}
	// implements ActionListener 때문에 강제 구현된 메소드 
	@Override
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(this, "버튼을 눌렀네?");
	}
}







