package rumos.jdbc.consoleapp;

import rumos.jdbc.creator.Creator;
import rumos.jdbc.services.interfaces.TodoService;

public class Main {
	public static void main(String[] args) {
		// Tight vs Loose coupling

		TodoService service = Creator.getTodoService();
		new Start(service).run();
	}
}
