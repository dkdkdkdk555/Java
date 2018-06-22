package test.ui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class JTextAreaTest2 extends JFrame 
						implements ActionListener{
	//필드
	private JTextArea ta;
	
	//생성자
	public JTextAreaTest2() {
		//여러줄의 문자열을 입력할수 있는 JTextArea 객체 
		ta=new JTextArea("Welcome!");
		//배경색 지정
		ta.setBackground(Color.YELLOW);
		
		// JScrollPane 으로 JTextArea 감싸기 
		JScrollPane scPane=new JScrollPane(ta);
		//위치와 크기 지정
		scPane.setBounds(10, 10, 300, 300);
		//프레임에 추가 
		add(scPane);
		
		JButton sendBtn=new JButton("전송");
		sendBtn.setBounds(10, 310, 300, 50);
		//버튼에 액션 리스터 등록
		sendBtn.addActionListener(this);
		
		add(sendBtn);
		
		//레이아웃 메니져 없이 배치 하기 위해 
		setLayout(null);
		
		setBounds(100, 100, 500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new JTextAreaTest2();
	}
	//버튼을 눌렀을때 호출되는 메소드 
	@Override
	public void actionPerformed(ActionEvent e) {
		//JTextArea 에 입력한 문자열을 읽어와서
		String msg=ta.getText();
		//콘솔에 출력하기 
		System.out.println(msg);
	}
}











