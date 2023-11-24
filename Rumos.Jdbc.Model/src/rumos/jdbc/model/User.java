package rumos.jdbc.model;

import java.util.ArrayList;
import java.util.List;

public class User {

	private int id;
	private Name name;
	
	
	
	private Account account;
	private List<Todo> todos;
	
	private List<Address> addresses;
	private List<Contact> contacts;

	private User() {
		todos = new ArrayList<Todo>();
		contacts = new ArrayList<Contact>();
		addresses = new ArrayList<Address>();
	}

	public User(Name name) {
		this();
		this.name = name;
	}

	public User(String firstName, String lastName) {
		this(new Name(firstName, lastName));
	}

}

class Contact {
	private int id;
	private String value;	
	private ContactType type;
}

enum ContactType {
	Email,
	Mobile,
	Phone,
	Fax,
	Pager
}