package ex02;

import java.awt.*;
public class BeepPrintExample {
	public static void main(String[] args) {
		// 1. 일반적인 방법
		Runnable beepTask = new BeepTask();
		Thread thread = new Thread(beepTask);
		thread.start();
		
		for( int i=0;i<5;i++) {
			System.out.println(i);
			try { Thread.sleep(500); } catch (Exception e) {}

		}
		try { Thread.sleep(1000); } catch (Exception e) {}

		// 2. Runnable 익명 객체 이용
		Thread thread2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for(int i=0;i<5;i++) {
					System.out.println(i);
					toolkit.beep();
					try { Thread.sleep(500); } catch (Exception e) {}
				}
			}
		});
		thread2.start();
		
		try { Thread.sleep(1000); } catch (Exception e) {}
	
		// 3. 람다식 이용
		Thread thread3 = new Thread(() -> {
			Toolkit toolkit = Toolkit.getDefaultToolkit();
			for(int i=0;i<5;i++) {
				System.out.println(i);
				toolkit.beep();
				try { Thread.sleep(500); } catch (Exception e) {}
			}
		});
		
		thread3.start();
		
	}
}
/*
  1번이 끝난 뒤 2번+(sleep1초+3번)이 동시에 실행되어서 경고음이 총 12번이 출력이 됨
--------- 1번 스레드 시작  
0
1
2
3
4
--------- 1번 스레드 끝
--------- 2번 스레드 시작
0
1
--------- 3번 스레드 시작
2
0
3
1
2
4
--------- 2번 스레드 끝
3
4
--------- 3번 스레드 끝
 */
