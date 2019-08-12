package day15;

public class Test07 {

	public static void main(String[] args) {
		//AAA a=new AAA();에러 미완성 코드 때문에  따라서 AAA를 별도로 extends 한 클래스를 별도로 생성해서 사용 
//		AAA a = new AAA() {
//
//			@Override
//			void exec() {
//				// TODO Auto-generated method stub
//				
//			}
//			
//		};
		AAA a = new AAA() {
			
			@Override
			void exec() {
				// TODO Auto-generated method stub
				
			}
		};//=>anonymous 클래스
		III i = new III() {

			@Override
			public void exec() {
				// TODO Auto-generated method stub
				
			}
			//강제성이 있는 오버라이딩
		};
		CCC c = new CCC() {
			void exec() {};//강제성이 없
		};
	}

}

abstract class AAA{
	abstract void exec();
}
interface III {
	void exec();
}
class CCC{
void exec() {}	
}