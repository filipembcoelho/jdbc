package rumos.jdbc.model;

import java.util.Arrays;

public class Name {
	private String firstName;
	private String[] middleNames;
	private String lastName;

	public Name(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public Name(String firstName, String[] middleNames, String lastName) {
		this(firstName, lastName);
		this.middleNames = middleNames;
	}

	public Name(String fullName) {

		String[] names = fullName.split(" ");
		this.firstName = names[0];
		this.lastName = names[names.length - 1];

		if (names.length > 2) {
			Arrays.copyOfRange(names, 1, names.length - 2);
		}

	}

	public String getFullName() {
		StringBuilder sb = new StringBuilder();
		sb.append(firstName);
		sb.append(" ");

		sb.append(middleNames.length > 2 ? String.join(" ", middleNames) + " " : "");

//		if (middleNames.length > 2) {
//			sb.append(String.join(" ", middleNames));
//			sb.append(" ");
//		}

		sb.append(lastName);
		return sb.toString();
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String[] getMiddleNames() {
		return middleNames;
	}

	public void setMiddleNames(String[] middleNames) {
		this.middleNames = middleNames;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}