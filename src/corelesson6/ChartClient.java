package corelesson6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ChartClient {
	public static void main(String[] args) {
		new ChartClient().startClient();
	}
	public void startClient(){
		try {
			Socket socket = new Socket("127.0.0.1",9000);
			BufferedReader br = new BufferedReader(
					new InputStreamReader(System.in));
			PrintWriter pw = new PrintWriter(socket.getOutputStream(),true);
			new AcceptData(socket);
			while(true){
				String str = br.readLine();
				if("exit".equals(str))break;
				pw.println(str);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
class AcceptData extends Thread{
	private Socket socket;
	private BufferedReader br;
	public AcceptData(Socket socket){
		this.socket = socket;
		try {
			br = new BufferedReader(
					new InputStreamReader(
							socket.getInputStream()));
		} catch (IOException e) {
			e.printStackTrace();
		}
		this.start();
	}
	@Override
	public void run() {
		try {
			while(true){
				String str = br.readLine();
				if("".equals(str)||str==null)continue;
				if("exit".equals(str)){
					System.out.println("�пͻ����˳�...");
				}
				int index = str.indexOf("/");
				if(index==-1){//˵����Ⱥ�ĵ�����
					System.out.println("Ⱥ�ĵ�������:"+str);
				}else{//˽�ĵ�����
					String[] ss = str.split("/");
					System.out.println(ss[0]+"����˵:"+ss[1]);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
