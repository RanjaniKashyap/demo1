class ThreadSync extends Thread{
	String msg[] = {"I","AM","JAVA"};
	
	ThreadSync(String str){
		super(str);
	}
	public void run() {
		MyThread.runMyMethod(getName(), msg);
	}
}

class MyThread{
	public static synchronized void runMyMethod(String name, String msg[]) {
		for(int i=0;i<msg.length;i++) {
			try {
				Thread.sleep(1000);
				
			}catch(Exception e) {
				e.printStackTrace();
			}
			System.out.println(name+"  "+msg[i]);
		}
		
	}
}

public class ThreadSyncDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadSync t1 = new ThreadSync("Thread 1 : ");
		ThreadSync t2 = new ThreadSync("Thread 2 : ");
		t1.start();
		t2.start();
		
	}

}
