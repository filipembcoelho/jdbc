package rumos.jdbc.creator;

import rumos.jdbc.data.repositories.TodoRepositoryImpl;
import rumos.jdbc.interfaces.TodoRepository;
import rumos.jdbc.services.TodoServiceImpl;
import rumos.jdbc.services.interfaces.TodoService;

public class Creator {

	public static TodoService getTodoService() {
		return new TodoServiceImpl(Creator.getTodoRepo());
	}

	public static TodoRepository getTodoRepo() {
		return new TodoRepositoryImpl();
	}

}
