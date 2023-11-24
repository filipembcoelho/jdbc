package rumos.jdbc.interfaces;

import java.util.List;

public interface Repository<T> {
	List<T> getAll();

	T getById(int id);

	void add(T todo);

	void update(T todo);

	T delete(int id);
}