import java.io.BufferedReader;
import java.net.*;

public class Server {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		
		ServerSocket ss = new ServerSocket(96);
		
		//s4 : how sever will accept from client req
		Socket fromClient =ss.accept();
		
		//how server will read request from socket
		
		BufferedReader fromClient = new BufferedReader(new InputStreamReader());
		

	}

}
