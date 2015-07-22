package corelesson7;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Demo3 {
	public static void main(String[] args) {
		JFrame frame = new JFrame("�ҵĴ���");
		frame.setSize(300,300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MyPanel panel = new MyPanel();
		frame.add(panel);
		frame.setVisible(true);
	}
}
class MyPanel extends JPanel{
	//private JButton button1 = new JButton("��ɫ");
	public MyPanel(){
		/*this.add(button1);
		button1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			//	MyPanel.this.setBackground(Color.blue);
				setBackground(Color.blue);
			}
		});*/
		addButton("��ɫ", Color.blue);
		addButton("��ɫ",Color.yellow);
		addButton("��ɫ",Color.red);
	}
	private void addButton(String name,final Color c){
		JButton button = new JButton(name);
		this.add(button);
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				   setBackground(c);
			}
		});
	}
}
