package rumos.jdbc.consoleapp;

import java.util.List;
import java.util.Scanner;


import rumos.jdbc.services.dtos.TodoDto;
import rumos.jdbc.services.interfaces.TodoService;

public class Start {
	private final static Scanner scanner;

	static {
		scanner = new Scanner(System.in);
	}

	private TodoService todoService;

	public Start(TodoService todoService) {
		this.todoService = todoService;
	}

	public void run() {
		showMenu();
	}

	private void showMenu() {
		boolean exit = false;
		do {
			System.out.println("1. Listar tarefas");
			System.out.println("2. Adicionar nova tarefa");
			System.out.println("3. Actualizar tarefa");
			System.out.println("4. Apagar tarefa");
			System.out.println("0. Sair");
			String input = scanner.nextLine();

			switch (input) {
			case "1":
				listTodos();
				break;
			case "2":
				addTodo();
				break;
			case "3":
				updateTodo();
				break;
			case "4":
				deleteTodo();
				break;
			case "0":
				exit = true;
				break;
			}
		} while (!exit);
		scanner.close();
	}

	private void listTodos() {
		list(todoService.getAll(), false);
	}

	private void addTodo() {
		String input = "";
		final int minChars = 3;
		do {
			System.out.print("Tarefa: ");
			input = scanner.nextLine();

			if (input.length() < minChars) {
				System.out.println("Tarefa muito curta!");
			}

		} while (input.length() < minChars);

		var todo = new TodoDto();
		todo.setTodo(input);

		todoService.create(todo);
	}

	private void updateTodo() {
		list(todoService.getAll(), true);

		System.out.print("Introduza o número da tarefa: "); // 1
		int number = scanner.nextInt();

		var chosenId = number - 1;
		var todo = todoService.getById(chosenId);

		System.out.println("Introduza o novo nome (" + todo.getTodo() + "): ");
		String newValue = scanner.nextLine();

		todo.setTodo(newValue);

		todoService.update(todo);
	}

	private void deleteTodo() {
		list(todoService.getAll(), true);

		System.out.print("Introduza o número da tarefa: "); // 1
		int number = scanner.nextInt();

		var chosenId = number - 1;
		var todo = todoService.getById(chosenId);

		System.out.println("Tem a certeza que que quer apagar a tarefa " + todo.getTodo() + "(s/n): ");
		String confirmation = scanner.nextLine();

		if (confirmation.toLowerCase() == "s") {
			todoService.delete(chosenId);
		}
	}

	private void list(List<TodoDto> dtos, boolean numbering) {
		int counter = 1;
		for (var user : dtos) {
			String str = "";
			if (numbering) {
				str = counter + " ";
				counter++;
			}

			str += user.getTodo() + " " + user.isDone();

			System.out.println(str);
		}

	}
}
