package ex08;

public class TargetThread extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(long i=0; i<2000000000; i++) {
		}
		try {
			Thread.sleep(1500);
		} catch (Exception e) {
			// TODO: handle exception
		}
		for(long i=0; i<2000000000; i++) {
		}
	}

}
