package rumos.jdbc.services;

import java.util.List;

import rumos.jdbc.interfaces.TodoRepository;
import rumos.jdbc.model.Todo;
import rumos.jdbc.services.dtos.TodoDto;
import rumos.jdbc.services.interfaces.TodoService;

public class TodoServiceImpl implements TodoService {
	private TodoRepository repo;

	public TodoServiceImpl(TodoRepository repo) { // DI Dependency Injection
		this.repo = repo;
	}

	@Override
	public List<TodoDto> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TodoDto getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void create(TodoDto todo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(TodoDto todo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(TodoDto todo) {
		// TODO Auto-generated method stub
		
	}

	
}

//class Validators {
//	public static boolean ValidateTodo(String todo) {
//		return true;
//	}
//}