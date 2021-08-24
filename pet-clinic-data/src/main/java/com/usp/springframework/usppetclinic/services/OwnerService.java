package com.usp.springframework.usppetclinic.services;

import java.util.Set;

import com.usp.springframework.usppetclinic.model.Owner;

public interface OwnerService {

	/*Provide utility Methods for owner type*/
	Owner findById(long Id);
	Owner findByLastName(String lastName);
	Owner save (Owner owner);
	Set<Owner> findAll();
	
}
