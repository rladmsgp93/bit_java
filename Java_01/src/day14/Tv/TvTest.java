package day14.Tv;

public class TvTest {

	public static void main(String[] args) {
	
		play(new STV());
		play(new LTV());
		play(new ITV());

		

	}
	
	public static void play(TV tv) {
		tv.poweroff();
		tv.poweron();
	}
	
	


}
