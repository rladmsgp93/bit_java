package day15;
@FunctionalInterface
public interface Command {
	void exec();//public abstract 생량

	default public void check() {
		System.out.println("check~~~~~");
	}
}

class DeleteCommand implements Command {

	@Override
	public void exec() {
		System.out.println("DeleteCommand 수행");

	}

}
class UpdateCommand implements Command {

	@Override
	public void exec() {
		System.out.println("UpdateCommand 수행");

	}

}
