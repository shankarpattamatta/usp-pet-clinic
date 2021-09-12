package com.usp.springframework.usppetclinic.services;

import java.util.Set;

public interface CrudService<ID,T> {
	 Set<T> findAll(T object);
	 T findById(ID Id);
	 void delete(T Object);
	 void deleteById(ID id);
	T save(ID Id, T object);
}