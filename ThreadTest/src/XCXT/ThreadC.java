package XCXT;

public class ThreadC extends Thread{
	
	Mainclass m;
	public ThreadC(Mainclass m){
		this.m=m;
	}
	@Override
	public void run() {
		while(true){
			m.lock.lock();
			try {
				if(!m.curr.equals("C")){
					m.cdt_c.await();
				}
				System.out.print("C");
				m.curr ="A";
				m.cdt_a.signal();
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			m.lock.unlock();
		}
	}
}
