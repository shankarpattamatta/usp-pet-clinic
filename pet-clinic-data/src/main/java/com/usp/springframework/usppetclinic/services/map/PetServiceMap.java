package com.usp.springframework.usppetclinic.services.map;

import java.util.Set;

import com.usp.springframework.usppetclinic.model.Pet;

public class PetServiceMap extends AbstractMapService<Long,Pet> {

	@Override
	public Set<Pet> findAll(Pet object) {
		return super.findAll(object);
		
	}
	@Override
	public Pet findById(Long Id) {
		return super.findByID(Id);
	}


	@Override
	public void delete(Pet object) {
		// TODO Auto-generated method stub
		 super.delete(object);
	}

	@Override
	public void deleteById(Long Id) {
		 super.deleteById(Id);
	}
    
	
	public Pet save(Pet object) {
		return super.save(object.getId(), object);
	}


}
