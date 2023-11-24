package rumos.jdbc.services.dtos;

import java.util.List;

public class UserAddressesDto {
	int id;
	String firstName;
	String lastName;
	List<AddressDto> addresses;
}