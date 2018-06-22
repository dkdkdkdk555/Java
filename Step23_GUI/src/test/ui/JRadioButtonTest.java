package test.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class JRadioButtonTest extends JFrame 
					implements ActionListener{
	//필드 
	private JRadioButton ra_man, ra_woman;
	
	//생성자
	public JRadioButtonTest() {
		
		ra_man=new JRadioButton("남자");
		ra_woman=new JRadioButton("여자");
		
		//라디오 버튼을 그룹으로 만들기 
		ButtonGroup group=new ButtonGroup();
		group.add(ra_man);
		group.add(ra_woman);
		//라디오 버튼의 위치와 크기 
		ra_man.setBounds(10, 10, 100, 30);
		ra_woman.setBounds(10, 40, 100, 30);
		//라디오 버튼을 프레임에 추가 
		add(ra_man);
		add(ra_woman);
		//첫번째 라디오 버튼이 선택된 상태로 
		ra_man.setSelected(true);
		
		//라디오 버튼에 액션 리스너 등록 
		ra_man.addActionListener(this);
		ra_woman.addActionListener(this);
		
		//레이아웃 메니져 사용하지 않기 
		setLayout(null);
		
		setBounds(100, 100, 500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		new JRadioButtonTest();
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		if(ra_man.isSelected()) {
			JOptionPane.showMessageDialog(this, "남자네?");
		}
		
		if(ra_woman.isSelected()) {
			JOptionPane.showMessageDialog(this, "여자네?");
		}
	}
}
















