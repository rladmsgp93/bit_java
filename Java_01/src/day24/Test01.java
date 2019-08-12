package day24;

import java.util.ArrayList;
import java.util.Vector;

public class Test01 {

	public static void main(String[] args) {
		System.out.println("main start");
		Account account = new Account("2019001", 99000, "홍길동");

		Job1 j1 = new Job1(account);
		Job1 j2 = new Job1(account);
		Thread t1 = new Thread(j1, "통장");
		Thread t2 = new Thread(j2, "카드");
		t1.start();
		t2.start();

		ArrayList a;
		Vector v;// 모든 블럭에서 synchronized 처리
		System.out.println("main end");
	}

}

class Account {
	String name;
	int money;
	String number;

	public Account(String name, int money, String number) {
		super();
		this.name = name;
		this.money = money;
		this.number = number;
	}

	public Account() {
		super();
	}

	@Override
	public String toString() {
		return "Account [name=" + name + ", money=" + money + ", number=" + number + "]";
	}

	public synchronized void withdraw(int money) {
		System.out.println("*****출금" + money + "*******");
		System.out.println(Thread.currentThread());
		if (this.money >= money) {

			System.out.println("잔고" + this.money);
			System.out.println("출금완료:" + money);
			this.money -= money;
			System.out.println("잔고:" + this.money);

		} else {
			System.out.println("잔액 부족");
		}
		System.out.println("***********************");
	}

}

class Job1 implements Runnable {
	Account ac;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 5; i++) {
			int money = (int) (Math.random() * 7 + 1) * 1000;
			ac.withdraw(money);
		}

	}

	public Job1() {

	}

	public Job1(Account ac) {
		super();
		this.ac = ac;
	}

}