package rumos.jdbc.model;

public class Todo {
	private int id;
	private String todo;
	private boolean isDone;
	
	public Todo(String todo) {
		this.todo = todo;
	}

	public Todo(int id, String todo, boolean isDone) {
		this.id = id;
		this.todo = todo;
		this.isDone = isDone;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTodo() {
		return todo;
	}

	public void setTodo(String todo) {
		this.todo = todo;
	}

	public boolean getIsDone() {
		return isDone;
	}

	public void setIsDone(boolean isDone) {
		this.isDone = isDone;
	}
}
