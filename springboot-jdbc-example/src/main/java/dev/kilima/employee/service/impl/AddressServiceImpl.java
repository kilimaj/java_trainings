package dev.kilima.employee.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import dev.kilima.employee.beans.Address;
import dev.kilima.employee.dao.AddressDao;
import dev.kilima.employee.service.AddressService;

public class AddressServiceImpl implements AddressService {

	@Autowired
	AddressDao dao;
	
	@Override
	public int insert(Address address) {
		// TODO Auto-generated method stub
		return dao.insert(address);
	}

	@Override
	public List<Address> getAddressList() {
		// TODO Auto-generated method stub
		return dao.getAddressList();
	}

	@Override
	public Address getByAddressId(int id) {
		// TODO Auto-generated method stub
		return dao.getByAddressId(id);
	}

	@Override
	public Address getByEmployeeId(int empid) {
		// TODO Auto-generated method stub
		return dao.getByEmployeeId(empid);
	}

	@Override
	public int update(Address address) {
		// TODO Auto-generated method stub
		return dao.update(address);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return dao.delete(id);
	}

}
