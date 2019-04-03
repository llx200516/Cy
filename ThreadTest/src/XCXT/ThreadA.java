package XCXT;

public class ThreadA extends Thread{
	
	Mainclass m;
	public ThreadA(Mainclass m){
		this.m=m;
	}
	@Override
	public void run() {
		while (true) {
			m.lock.lock();
			try {
				if(!m.curr.equals("A")){
					m.cdt_a.await();
				}
				System.out.print("A");
				m.curr ="B";
				m.cdt_b.signal();
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			m.lock.unlock();
		}
	}
}
