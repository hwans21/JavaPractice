package ex03;


import java.awt.*;
public class BeepThread extends Thread{ // Runnable인터페이스가 아닌 Thread의 하위 클래스로 작업스래드를 정의 함
	@Override
	public void run() {
		// TODO Auto-generated method stub
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=0;i<5;i++) {
			toolkit.beep();
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

}
