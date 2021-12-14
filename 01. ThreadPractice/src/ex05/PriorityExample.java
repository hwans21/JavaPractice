package ex05;

public class PriorityExample {
	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
			Thread thread = new CalcThread("thread" + i);
			if(i!=10) {
				thread.setPriority(Thread.MIN_PRIORITY);
			} else {
				thread.setPriority(Thread.MAX_PRIORITY);
			}
			thread.start();
		}
	}
}
/*
	thread10
	thread3
	thread4
	thread7
	thread1
	thread2
	thread8
	thread5
	thread9
	thread6

 */
