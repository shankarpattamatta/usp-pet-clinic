package com.usp.springframework.usppetclinic.services.map;

import java.util.Set;

import com.usp.springframework.usppetclinic.model.Vet;

public class VetServiceMap extends AbstractMapService<Long,Vet> {

	@Override
	public Set<Vet> findAll(Vet object) {
		return super.findAll(object);
		
	}
	@Override
	public Vet findById(Long Id) {
		return super.findByID(Id);
	}


	@Override
	public void delete(Vet object) {
		// TODO Auto-generated method stub
		 super.delete(object);
	}

	@Override
	public void deleteById(Long Id) {
		 super.deleteById(Id);
	}
    
	
	public Vet save(Vet object) {
		return super.save(object.getId(), object);
	}


}
