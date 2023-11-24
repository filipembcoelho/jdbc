package rumso.jdbc.interfaces;

import rumos.jdbc.model.Todo;

interface TodoRepository extends Repository<Todo> {

}

class TodoServiceImpl {
	
	private TodoRepository repo;
	
	public TodoServiceImpl(TodoRepository repo) {
		this.repo = repo;
	}
	
}