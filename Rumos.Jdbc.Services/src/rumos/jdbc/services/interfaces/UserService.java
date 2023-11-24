package rumos.jdbc.services.interfaces;

import java.util.List;

import rumos.jdbc.services.dtos.AddUserDto;
import rumos.jdbc.services.dtos.UpdateUserDto;
import rumos.jdbc.services.dtos.UserAddressesDto;
import rumos.jdbc.services.dtos.UserDto;

public interface UserService {
	List<UserDto> getAll();

	UserDto getById(int id);

	void create(AddUserDto user);

	void update(UpdateUserDto user);

	void delete(int id);

	boolean changePassword();

	List<UserAddressesDto> getAllWithAddresses();

	UserAddressesDto getByIdWithAddresses(int id);

	UserAddressesDto getByIdWithContacts(int id);

	UserAddressesDto getByIdWithAddressesContacts(int id);
}