package rumos.jdbc.start;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import rumos.jdbc.model.Todo;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("1. Listar tarefas");
		System.out.println("2. Adicionar nova tarefa");
		System.out.println("1. Actualizar tarefa");
		System.out.println("1. Apagar tarefa");

		String input = scanner.nextLine();

		Todo t = new Todo("Ir às compras");

		List<Todo> todos = new ArrayList<Todo>();
		
		
	}

}


