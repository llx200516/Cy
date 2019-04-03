package XCXT;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Mainclass {
/***
 * 线程协调
 * @param args
 */
	Lock lock=new ReentrantLock();
	Condition cdt_a=lock.newCondition();
	Condition cdt_b=lock.newCondition();
	Condition cdt_c=lock.newCondition();
	String curr="C";
	

	public static void main(String[] args) {
		Mainclass m=new Mainclass();
		ThreadA thr_A=new ThreadA(m);
		ThreadB thr_B=new ThreadB(m);
		ThreadC thr_C=new ThreadC(m);
		thr_A.start();
		thr_B.start();
		thr_C.start();
	}

}
