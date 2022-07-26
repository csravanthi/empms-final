package com.cg.ems.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.ems.entity.Address;
import com.cg.ems.entity.Employee;
import com.cg.ems.service.AddressService;
import com.cg.ems.service.EmployeeService;

@RestController
@RequestMapping("/ems-address")
public class AddressController {
	
	@Autowired
	AddressService addressService;
	
	
	@PostMapping("/addAddress")
	public Address addAddress(@RequestBody Address address) throws Exception{
		return addressService.addAddress(address);
	}
	
	@PutMapping("/updateAddress")
	public Address updateAddress(@RequestBody Address address) throws Exception{
		return addressService.updateAddress(address);
	}
	
	@DeleteMapping("/deleteAddressById/{addressId}")
	public Address deleteAddressById(@PathVariable int addressId)throws Exception{
		return addressService.deleteAddressById(addressId);
	}
	
	@GetMapping("/getAddressById/{addressId}")	
	public Address getAddressById(@PathVariable int addressId)throws Exception{
		return addressService.getAddressById(addressId);
	}
	
	@GetMapping("/getAllAddresss")	
	public List<Address> getAllAddresss() throws Exception{
		return addressService.getAllAddresss();
	}

}
