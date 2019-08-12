package day14;

public interface Command {
	public void exec();

}

class DeleteCommand implements Command {

	@Override
	public void exec() {
		System.out.println("Delete 수행");

	}

}

class InsertCommand implements Command {

	@Override
	public void exec() {
		System.out.println("Insert 수행");

	}

}

class UpdateCommand implements Command {

	@Override
	public void exec() {
		System.out.println("Update 수행");

	}

}

class ListCommand implements Command {

	@Override
	public void exec() {
		System.out.println("List 수행");

	}

}