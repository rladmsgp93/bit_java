package day23;

public class Test09 {

	public static void main(String[] args) {
		// System.out.println(Thread.MAX_PRIORITY);// 10
		// System.out.println(Thread.MIN_PRIORITY);// 1
		// System.out.println(Thread.NORM_PRIORITY);// 5
		// 힙영역이 60프로 찼을 때 gc가 우선순위 1(10이 빠른 거)
	
		System.out.println(Thread.currentThread());

		// 스레드 생성
		// Job1 job1 = new Job1();
		T1 t1 = new T1();
		// Job2 job2 = new Job2();
		T2 t2 = new T2();
		// 스레드 실행대기 큐에 넣기
		t1.start();
		System.out.println("Main Start");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		t2.start();
		System.out.println("홀수합+짝수합=" + (t1.sum + t2.sum));
		System.out.println("Main End");
	}

}

class T1 extends Thread {
	int sum = 0;

	@Override
	public void run() {
		for (int i = 1; i < 100; i += 2) {
			sum += i;
			System.out.print(Thread.currentThread() + " ");
			System.out.println("1~" + i + "홀수 합:" + sum);
		}

	}

}

class T2 extends Thread {
	int sum = 0;

	@Override
	public void run() {
		for (int i = 0; i < 100; i += 2) {
			sum += i;
			System.out.print(Thread.currentThread() + " ");
			System.out.println("0~" + i + "짝수 합:" + sum);
		}

	}

}