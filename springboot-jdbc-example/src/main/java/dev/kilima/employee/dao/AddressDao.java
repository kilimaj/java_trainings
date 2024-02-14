package dev.kilima.employee.dao;

import java.util.List;

import dev.kilima.employee.beans.Address;

public interface AddressDao {

	int insert(Address address);
	List<Address> getAddressList();
	Address getByAddressId(int id);
	Address getByEmployeeId(int empid);
	int update(Address address);
	int delete(int id);
}
