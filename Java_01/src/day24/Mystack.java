package day24;

public class Mystack {

	int[] stack;
	int top;

	Mystack() {
		stack = new int[10];
	}

	Mystack(int size) {
		if (size < 0) {
			stack = new int[10];
		} else
			stack = new int[size];

	}

	public synchronized int top() {
		if (isEmpty()) {
			return -1;

		}
		int data = stack[top];
		System.out.println("top=>" + data);
		return data;

	}

	public synchronized boolean isEmpty() {
		return top == 0 ? true : false;
	}

	public synchronized boolean isFull() {
		return top == stack.length ? true : false;
	}

	public synchronized void push(int n) {
		if (isFull())
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		stack[top] = n;
		top++;
		System.out.println("push=>" + n);
		notifyAll();
	}

	public synchronized int pop() {
		if (isEmpty()) {
			// return -1;
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		int data = stack[--top];
		System.out.println("Pop=>" + data);

		return data;

	}

}
