package GT;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Tktwindow extends Thread {
/***
 * ���̺߳�ͬ������ʾ��
 */
	public static int num = 15;
		@Override
		public void run() {
			while (true) {
				try {
					sale();
					Thread.sleep(1200);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		private Lock lock;
		
		public Tktwindow(Lock lock){
			this.lock=lock;
		}
		
		//static Lock lock=new ReentrantLock();
		public void sale(){
			lock.lock();
			
			System.out.println(Thread.currentThread().getName()+"�۳�"+num+"��Ʊ��");
			num--;
			lock.unlock();
		}
}	