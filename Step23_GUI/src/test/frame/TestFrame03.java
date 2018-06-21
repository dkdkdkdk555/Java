package test.frame;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class TestFrame03 extends JFrame 
							implements ActionListener{
	
	//생성자
	public TestFrame03() {
		//프레임의 레이아웃 설정
		setLayout(new FlowLayout());
		
		//버튼
		JButton btn1=new JButton("저장");
		JButton btn2=new JButton("수정");
		JButton btn3=new JButton("삭제");
		
		//버튼의 액션 command 설정 하기 
		btn1.setActionCommand("save");
		btn2.setActionCommand("update");
		btn3.setActionCommand("delete");
		
		//버튼에 리스너 등록하기
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		
		//프레임에 버튼 추가
		add(btn1);
		add(btn2);
		add(btn3);
		
		setBounds(100, 100, 300, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new TestFrame03();
	}
	//버튼을 누르면 호출되는 메소드 
	@Override
	public void actionPerformed(ActionEvent e) {
		//눌러진 버튼의 액션 command 읽어오기
		String command=e.getActionCommand();
		
		if(command.equals("save")) {
			
		}else if(command.equals("update")) {
			
		}else if(command.equals("delete")) {
			
		}
	}
}


















