import java.net.*;
public class Client {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		
		//S1 : how to create client socket
		
		Socket cSocket = new Socket(InetAddress.getLocalHost(), 90);
		
		//S3: how client will write data on socket
		
		PrintStream toServer = new PrintStream(cSocket.getOutputStream());
		}

}
