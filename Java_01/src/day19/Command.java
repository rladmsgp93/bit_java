package day19;

@FunctionalInterface // 추상 메서드가 하나인 인터페이스는 람다로 표현 가능
public interface Command {

	void exec();

	default void print() {
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
	}
}

class DeleteCommand implements Command {

	@Override
	public void exec() {
		System.out.println("DeleteCommand 수행 ");

	}

}

class UpdateCommand implements Command {

	@Override
	public void exec() {
		System.out.println("UpdateCommand 수행 ");

	}

}

class InsertCommand implements Command {

	@Override
	public void exec() {
		System.out.println("InsertCommand 수행 ");

	}

}

class SelectCommand implements Command {

	@Override
	public void exec() {
		System.out.println("SelectCommand 수행 ");

	}

}
