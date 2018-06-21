package test.frame;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TestFrame06 extends JFrame 
							implements ActionListener{
	//필드
	JTextField tf;
	//생성자
	public TestFrame06() {
		//프레임의 레이아웃 설정
		setLayout(new BorderLayout());
		
		//문자열을 입력할수 있는 텍스트 필드
		tf=new JTextField(10);
		//버튼
		JButton sendBtn=new JButton("전송");
		//버튼에 리스너 등록 
		sendBtn.addActionListener(this);
		//페널
		JPanel panel=new JPanel();
		panel.add(tf);
		panel.add(sendBtn);
		
		//페널을 프레임에 배치 
		add(panel, BorderLayout.NORTH);
		
		setBounds(100, 100, 300, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new TestFrame06();
	}
	//버튼을 누르면 호출되는 메소드 
	@Override
	public void actionPerformed(ActionEvent e) {
		//1. 입력한 문자열을 읽어와서
		String msg=tf.getText();
		//2. 알림창에 띄운다.
		JOptionPane.showMessageDialog(this, msg);
	}
}


















