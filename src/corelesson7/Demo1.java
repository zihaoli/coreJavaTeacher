package corelesson7;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Demo1 {
	public static void main(String[] args) {
		JFrame frame = new JFrame("�ҵĵ�һ������");
		JButton button = new JButton("ȷ��");
		JButton button1 = new JButton("aa");
		JButton button2 = new JButton("bb");
		JButton button3 = new JButton("cc");
		JButton button4 = new JButton("dd");
		JButton button5 = new JButton("ee");
		JButton button6 = new JButton("ff");
		JButton button7 = new JButton("gg");
		frame.setSize(300,300);
		//frame.setResizable(false);
		//�رճ����Զ��˳�
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		/*frame.setLayout(new FlowLayout());//����ˮƽ����
		frame.add(button);
		frame.add(button1);
		frame.add(button2);
		frame.add(button3);
		frame.add(button4);
		frame.add(button5);
		frame.add(button6);
		frame.add(button7);*///ˮƽ����ʾ��
		/*frame.setLayout(new BorderLayout());
		frame.add(button,BorderLayout.NORTH);
		frame.add(button1,BorderLayout.SOUTH);
		frame.add(button2,BorderLayout.EAST);
		frame.add(button3,BorderLayout.WEST);
		frame.add(button4);*/
		frame.setLayout(new GridLayout(2, 3));
		frame.add(button);
		frame.add(button1);
		frame.add(button2);
		frame.add(button3);
		frame.add(button4);
		frame.add(button5);
		frame.setVisible(true);
		
	}

}
