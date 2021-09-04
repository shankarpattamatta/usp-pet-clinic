package com.usp.springframework.usppetclinic.services;

import java.util.Set;

import com.usp.springframework.usppetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner,Long> {

	/*Provide utility Methods for owner type*/
	Owner findByLastName(String lastName);
	
	
}
