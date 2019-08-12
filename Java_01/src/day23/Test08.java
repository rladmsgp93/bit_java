package day23;

public class Test08 {

	public static void main(String[] args) {
		// System.out.println(Thread.MAX_PRIORITY);// 10
		// System.out.println(Thread.MIN_PRIORITY);// 1
		// System.out.println(Thread.NORM_PRIORITY);// 5
		// 힙영역이 60프로 찼을 때 gc가 우선순위 1(10이 빠른 거)
		System.out.println("Main Start");
//		try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//
//			e.printStackTrace();
//		}
		System.out.println(Thread.currentThread());

		// 스레드 생성
		Job1 job1 = new Job1();
		Thread t1 = new Thread(job1, "job1");
		Job2 job2 = new Job2();
		Thread t2 = new Thread(job2, "job2");
		// 스레드 실행대기 큐에 넣기
		t1.start();

		try {
			t1.join();
			t2.join();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("홀수합+짝수합=" + (job1.sum + job2.sum));
		System.out.println("Main End");
	}

}

class Job1 implements Runnable {
	int sum = 0;

	@Override
	public void run() {
		for (int i = 1; i < 100; i += 2) {
			sum += i;
			System.out.print(Thread.currentThread() + " ");
			System.out.println("1~" + i + "홀수 합:" + sum);
			Thread.yield();

		}

	}

}

class Job2 implements Runnable {
	int sum = 0;

	@Override
	public void run() {
		for (int i = 0; i < 100; i += 2) {
			sum += i;
			System.out.print(Thread.currentThread() + " ");
			System.out.println("0~" + i + "짝수 합:" + sum);
			Thread.yield();

		}

	}

}