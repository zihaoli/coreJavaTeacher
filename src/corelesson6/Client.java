package corelesson6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	public static void main(String[] args) {
		try {
			Socket socket = new Socket("127.0.0.1", 9000);
			System.out.println("�ͻ������ӷ�����");
			// �ͻ��˼��̶�һ�����ݷ��͸�������
			BufferedReader br = new BufferedReader(new InputStreamReader(
					System.in));
			String str = br.readLine();
			// д���������� --->�������˽��ж�����
			// �ֽ���----��һ��дһ�е�����
			PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
			out.println(str);
			BufferedReader br1 = new BufferedReader(
					new InputStreamReader(socket.getInputStream()));
			String str1 = br1.readLine();
			System.out.println(str1);
			socket.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
