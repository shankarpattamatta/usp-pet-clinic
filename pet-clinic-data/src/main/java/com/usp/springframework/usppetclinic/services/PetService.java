package com.usp.springframework.usppetclinic.services;

import java.util.Set;

import com.usp.springframework.usppetclinic.model.Pet;

public interface PetService {
	
	Pet findById(long Id);
	Pet save(Pet owner);
	Set<Pet> findAll();
	

}
