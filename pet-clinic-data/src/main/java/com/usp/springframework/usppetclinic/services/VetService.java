package com.usp.springframework.usppetclinic.services;

import java.util.Set;

import com.usp.springframework.usppetclinic.model.Vet;

public interface VetService {
	
	Vet findById(long Id);
	Vet save(Vet vet);
	Set<Vet> findAll();
}
