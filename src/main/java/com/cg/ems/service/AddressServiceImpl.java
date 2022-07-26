package com.cg.ems.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.ems.dao.AddressRepository;
import com.cg.ems.entity.Address;
import com.cg.ems.entity.Department;

@Service("AddressService")
public class AddressServiceImpl implements AddressService{
	
	@Autowired
	AddressRepository addressRepository;

	@Override
	public Address addAddress(Address address) throws Exception {
		addressRepository.saveAndFlush(address);
		return address;
	}

	@Override
	public Address updateAddress(Address address) throws Exception {
		Address bean = null;
		try {
			bean = addressRepository.findById(address.getAddressId()).get();
		}
		catch(Exception e) {
			throw new Exception("Address details not found!");
		}
		addressRepository.saveAndFlush(address);
		return address;
	}

	@Override
	public Address deleteAddressById(int addressId) throws Exception {
		Address bean = null;
		try {
			bean = addressRepository.findById(addressId).get();
		}
		catch(Exception e) {
			throw new Exception("Address details not found!");
		}
		addressRepository.deleteById(addressId);
		return bean;
	}

	@Override
	public Address getAddressById(int addressId) throws Exception {
		Address bean = null;
		try {
			bean = addressRepository.findById(addressId).get();
		}
		catch(Exception e) {
			throw new Exception("Address details not found!");
		}
		return bean;
	}

	@Override
	public List<Address> getAllAddresss() throws Exception {
		return addressRepository.findAll();
	}
	

}
