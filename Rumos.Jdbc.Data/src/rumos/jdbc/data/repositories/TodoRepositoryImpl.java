package rumos.jdbc.data.repositories;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import rumos.jdbc.interfaces.TodoRepository;
import rumos.jdbc.model.Todo;

public class TodoRepositoryImpl implements TodoRepository {

	@Override
	public List<Todo> getAll() {

		try (Connection conn = DriverManager.getConnection("")) {

			String query = "SELECT * FROM todos WHERE todo == ?";
			
			
			PreparedStatement stmt = conn.prepareStatement(query);
			stmt.setString(0, "ir às compras");
			
			// Commands => acções alteram estado (CUD)			
			int rows = stmt.executeUpdate(query);
			
			// Queries => (R) 
			ResultSet rs = stmt.executeQuery(query);
			
//			boolean isQuery = stmt.execute(query);
//			
//			if(isQuery) {
//				rs = stmt.getResultSet();
//			} else {
//				rows = stmt.getUpdateCount();
//			}
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		return null;
	}

	@Override
	public Todo getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(Todo todo) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Todo todo) {
		// TODO Auto-generated method stub

	}

	@Override
	public Todo delete(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}