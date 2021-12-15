package ex07;

public class Calculator {
	private int memory;

	public int getMemory() {
		return memory;
	}

//	public synchronized void setMemory(int memory) { // 사용중일 때 잠금을 걸어서 다른 스레드가 사용할 수 없게 함
//		this.memory = memory;
//		try {
//			Thread.sleep(2000);
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
//		System.out.println(Thread.currentThread().getName()+": "+ this.memory);
//	}
	
	public void setMemory(int memory) { // 사용중일 때 잠금을 걸어서 다른 스레드가 사용할 수 없게 함
		synchronized (this) {
			this.memory = memory;
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			System.out.println(Thread.currentThread().getName()+": "+ this.memory);
			/*
			 * 1. 스레드가 동기화블록으로 들어가면 this(Calculator 객체)를 잠그고 동기화 블록을 실행
			 * 2. 동기화 블록을 모두 실행할 때까지 다른 스레드들은 this의 모든 동기화 메소드 또는 동기화 블록을 실행할 수 없게 된다.
			 */
		}
	}
	
}
