package GT;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Mainclass {

	public static void main(String[] args) {
		Lock lock=new ReentrantLock();
		Tktwindow tk0=new Tktwindow(lock);
		Tktwindow tk1=new Tktwindow(lock);
		tk0.setPriority(9);
		tk1.setPriority(1);
		tk0.start();
		tk1.start();
	}

}
