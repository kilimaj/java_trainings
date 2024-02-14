package dev.kilima.employee.service;

import java.util.List;

import dev.kilima.employee.beans.Address;

public interface AddressService {

	int insert(Address address);

	List<Address> getAddressList();

	Address getByAddressId(int id);

	Address getByEmployeeId(int empid);

	int update(Address address);

	int delete(int id);
}
