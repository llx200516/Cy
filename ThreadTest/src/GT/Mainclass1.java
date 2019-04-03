package GT;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Mainclass1 {
	/***
	 * 线程池,Runnable的run方法没返回值，需要用Callable
	 * @param args
	 */
	public static void main(String[] args) {
		Runnable rnb=new Runnable() {
			@Override
			public void run() {
				while (true) {
					try {
						System.out.println(Thread.currentThread().getName()+":success");
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
		};
		
		ExecutorService srv = Executors.newFixedThreadPool(3);
		srv.execute(rnb);
		srv.execute(rnb);
		srv.execute(rnb);
		
	}

}
