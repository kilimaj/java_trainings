package dev.kilima.employee.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import dev.kilima.employee.beans.Address;
import dev.kilima.employee.dao.AddressDao;
import dev.kilima.employee.utils.queries.AddressDBQueries;

public class AddressDaoImpl implements AddressDao {

	@Autowired
	JdbcTemplate template;

	@Override
	public int insert(Address address) {
		Object args[] = { address.getId(), address.getStreet(), address.getCity(), address.getEmpid() };
		int rows = template.update(AddressDBQueries.insert, args);
		return rows;
	}

	@Override
	public List<Address> getAddressList() {
		List<Address> addressList = template.query(AddressDBQueries.getall,
				new BeanPropertyRowMapper<Address>(Address.class));
		return addressList;
	}

	@Override
	public Address getByAddressId(int id) {
		Address address = template.queryForObject(AddressDBQueries.getByAddressId,
				new BeanPropertyRowMapper<Address>(Address.class), id);
		return address;
	}

	@Override
	public Address getByEmployeeId(int empid) {
		Address address = template.queryForObject(AddressDBQueries.getByAddressId,
				new BeanPropertyRowMapper<Address>(Address.class), empid);
		return address;
	}

	@Override
	public int update(Address address) {
		Object args[] = { address.getStreet(), address.getCity(), address.getEmpid(), address.getId() };
		int rows = template.update(AddressDBQueries.update, args);
		return rows;
	}

	@Override
	public int delete(int id) {
		int rows = template.update(AddressDBQueries.delete, id);
		return rows;
	}

}
