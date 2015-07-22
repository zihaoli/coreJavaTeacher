package corelesson6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.UUID;

public class ChartServer {
	private static HashMap<String, Socket> users = new HashMap<String, Socket>();

	public static void addClient(String addr, Socket socket) {
		users.put(addr, socket);
	}

	public static Socket findClient(String addr) {
		return users.get(addr);
	}

	public static HashMap<String, Socket> getUsers() {
		return users;
	}

	public static void main(String[] args) {
		new ChartServer().startServer();
	}

	public void startServer() {
		try {
			ServerSocket s = new ServerSocket(9000);
			System.out.println("�������Ѿ�����...");
			while (true) {
				Socket socket = s.accept();
				// �洢����
				String addr = socket.getInetAddress().getHostAddress()+UUID.randomUUID().toString();
				System.out.println("���ܵ�"+addr+"�ķ���");
				ChartServer.addClient(addr, socket);
				new Service(socket,addr);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class Service extends Thread {
	private Socket socket;
	private PrintStream ps;// ����ǰ�Ŀͻ���
	private PrintStream clientToClient;// ˽������д��
	private PrintStream toAll;// Ⱥ������д�ġ�
	private BufferedReader br;
	private String addr;

	public Service(Socket socket,String addr) {
		this.socket = socket;
		try {
			ps = new PrintStream(socket.getOutputStream());
			br = new BufferedReader(new InputStreamReader(
					socket.getInputStream()));
		} catch (Exception e) {
			e.printStackTrace();
		}
		this.addr =addr;
		this.start();
	}

	@Override
	public void run() {
		try {
			while (true) {
				String str = br.readLine();
				if ("".equals(str) || str == null)
					continue;
				if ("exit".equals(str)) {
					System.out.println("�пͻ����˳�...");
				}
				int index = str.indexOf("/");
				if (index == -1) {
					// Ⱥ��--->�������е�socket����д����
					for (String ip : ChartServer.getUsers().keySet()) {
						Socket clientSocket = ChartServer.getUsers().get(ip);
						toAll = new PrintStream(clientSocket.getOutputStream());
						toAll.println(str);
					}
				} else {
					// ˽��
					String ip = str.split("/")[0];
					String content = str.split("/")[1];
					String text = this.addr + "/" + content;// ���Ҫ���͵�����
					Socket clientSocket = ChartServer.findClient(ip);
					if (clientSocket == null) {
						ps.println("������ֱ�Ӹ���������Ҫ���͵Ŀͻ��˲�����!");
					} else {
						clientToClient = new PrintStream(
								clientSocket.getOutputStream());
						clientToClient.println(text);
					}

				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
