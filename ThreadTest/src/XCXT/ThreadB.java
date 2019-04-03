package XCXT;

public class ThreadB extends Thread{
	
	Mainclass m;
	public ThreadB(Mainclass m){
		this.m=m;
	}
	@Override
	public void run() {
		while(true){
			m.lock.lock();
			try {
				if(!m.curr.equals("B")){
					m.cdt_b.await();
				}
				System.out.print("B");
				m.curr ="C";
				m.cdt_c.signal();
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			m.lock.unlock();
		}
	}
}
