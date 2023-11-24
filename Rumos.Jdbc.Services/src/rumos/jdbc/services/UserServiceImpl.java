package rumos.jdbc.services;

import java.util.List;

import rumos.jdbc.interfaces.UserRepository;

import rumos.jdbc.services.dtos.AddUserDto;
import rumos.jdbc.services.dtos.UpdateUserDto;
import rumos.jdbc.services.dtos.UserAddressesDto;
import rumos.jdbc.services.dtos.UserDto;
import rumos.jdbc.services.interfaces.UserService;

public class UserServiceImpl implements UserService {

	private UserRepository userRepo;

	public UserServiceImpl(UserRepository userRepo) {
		this.userRepo = userRepo;
	}

	@Override
	public List<UserDto> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDto getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void create(AddUserDto user) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(UpdateUserDto user) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean changePassword() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<UserAddressesDto> getAllWithAddresses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserAddressesDto getByIdWithAddresses(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserAddressesDto getByIdWithContacts(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserAddressesDto getByIdWithAddressesContacts(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
