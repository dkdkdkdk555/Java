package test.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class JOptionPaneTest extends JFrame 
						implements ActionListener{
	//생성자 
	public JOptionPaneTest() {
		//버튼 객체 생성하고 
		JButton alertBtn=new JButton("알림버튼");
		JButton inputBtn=new JButton("입력버튼");
		JButton confirmBtn=new JButton("확인버튼");
		//버튼의 액션명 지정 
		alertBtn.setActionCommand("alert");
		inputBtn.setActionCommand("input");
		confirmBtn.setActionCommand("confirm");
		
		//버튼의 리스너 등록
		alertBtn.addActionListener(this);
		inputBtn.addActionListener(this);
		confirmBtn.addActionListener(this);
		
		//페널을 만들어서
		JPanel panel=new JPanel();
		//페널에 버튼 추가하고
		panel.add(alertBtn);
		panel.add(inputBtn);
		panel.add(confirmBtn);
		
		//프레임에 페널을 추가
		add(panel);
		
		setBounds(100, 100, 500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	//버튼을 눌르면 호출되는 메소드 
	@Override
	public void actionPerformed(ActionEvent e) {
		String command=e.getActionCommand();
		if(command.equals("alert")) {
			//알림 띄우기
			JOptionPane.showMessageDialog(this, "알림!!");
		}else if(command.equals("input")) {
			//입력창 띄우기
			String msg=JOptionPane.showInputDialog(this, "이름 입력");
			System.out.println("입력한 문자열:"+msg);
		}else if(command.equals("confirm")) {
			//확인창 띄우기
			int which=JOptionPane.showConfirmDialog(this, "삭제 할까?");
			switch(which) {
			case JOptionPane.YES_OPTION: //0
				System.out.println("YES");
				break;
			case JOptionPane.NO_OPTION: //1
				System.out.println("NO");
				break;
			case JOptionPane.CANCEL_OPTION://2
				System.out.println("CANCEL");
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		new JOptionPaneTest();
	}

}






