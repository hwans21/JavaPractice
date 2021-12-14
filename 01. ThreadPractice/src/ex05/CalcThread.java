package ex05;


/*
	 자바의 스케줄링 
	 우선순위(Priority) + 순환할당(Round-Robin)방식을 사용
	 순환할당방식 -> 시간할당량을 정해 하나의 스레드를 정해진 시간만큼 실행
 
 */
public class CalcThread extends Thread{
	public CalcThread(String name) {
		// TODO Auto-generated constructor stub
		setName(name);
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<2000000000;i++) {
			
		}
		System.out.println(getName());
	}

	
}
