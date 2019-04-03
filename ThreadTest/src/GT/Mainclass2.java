package GT;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Mainclass2 {
	/**
	 * 使用Callable可以存在返回值
	 * @param args
	 * @throws ExecutionException 
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		Callable call=new Callable<Integer>() {
			@Override
			public Integer call() throws Exception {
				System.out.println("start--");
				Thread.sleep(5000);
				System.out.println("end--");
				return 999;
			}
		};
		
		
		ExecutorService srv=Executors.newCachedThreadPool();
		Future<Integer> f=srv.submit(call);
		System.out.println(f.get());
	}	

}
