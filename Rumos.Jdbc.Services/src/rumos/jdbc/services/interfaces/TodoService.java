package rumos.jdbc.services.interfaces;

import java.util.List;

import rumos.jdbc.model.Todo;
import rumos.jdbc.services.dtos.TodoDto;

public interface TodoService {
	List<TodoDto> getAll();
	TodoDto getById(int id);
	void create(TodoDto todo);
	void update(TodoDto todo);
	void delete(int id);
	void delete(TodoDto todo);
}