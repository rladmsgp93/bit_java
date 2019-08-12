package day24;

public class Test02 {

	public static void main(String[] args) {
		System.out.println("main start");
		Mystack stack = new Mystack();
		Push job1 = new Push(stack);
		Pop job2 = new Pop(stack);
		Thread push = new Thread(job1, "push");
		Thread pop = new Thread(job2, "pop");
		System.out.println("main end");
		push.start();
		pop.start();

	}

}

class Pop implements Runnable {
	Mystack stack;

	public Pop() {
	}

	public Pop(Mystack stack) {
		this.stack = stack;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			stack.pop();
			try {
				Thread.sleep((int) (Math.random() * 100));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}

class Push implements Runnable {
	Mystack stack;

	public Push() {
	}

	public Push(Mystack stack) {
		this.stack = stack;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			stack.push(i);
			try {
				Thread.sleep((int) (Math.random() * 100));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}