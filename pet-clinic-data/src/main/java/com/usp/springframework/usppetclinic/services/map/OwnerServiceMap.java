package com.usp.springframework.usppetclinic.services.map;

import java.util.Set;

import com.usp.springframework.usppetclinic.model.Owner;

public class OwnerServiceMap extends AbstractMapService<Long,Owner> {

	@Override
	public Set<Owner> findAll(Owner object) {
		return super.findAll(object);
		
	}
	@Override
	public Owner findById(Long Id) {
		return super.findByID(Id);
	}


	@Override
	public void delete(Owner object) {
		// TODO Auto-generated method stub
		 super.delete(object);
	}

	@Override
	public void deleteById(Long Id) {
		 super.deleteById(Id);
	}
    
	
	public Owner save(Owner object) {
		return super.save(object.getId(), object);
	}


}
