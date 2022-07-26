package com.cg.ems.service;

import java.util.List;

import com.cg.ems.entity.Address;

public interface AddressService {
	
	public Address addAddress(Address address) throws Exception;
	public Address updateAddress(Address address) throws Exception;
	public Address deleteAddressById(int addressId)throws Exception;
	public Address getAddressById(int addressId)throws Exception;
	public List<Address> getAllAddresss() throws Exception;


}
