package com.usp.springframework.usppetclinic.services.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.usp.springframework.usppetclinic.services.CrudService;

public abstract class AbstractMapService <ID,T> implements CrudService<ID,T> {
	
	protected Map<ID,T> serviceMap = new HashMap<>();
	
	public Set<T> findAll(T object) {
		
		return new HashSet<>(serviceMap.values());
	}
	
	T findByID(ID Id){
	return serviceMap.get(Id);
	}
	
	
	 public T save(ID Id,T object) {
		serviceMap.put(Id,object);
		return object;
	}
	
	 public void deleteById(ID Id) {
		 serviceMap.remove(Id);
	}
	
	public void delete(T object) {
	serviceMap.entrySet().removeIf(entry->entry.getValue().equals(object));
	}

}
