package com.usp.springframework.usppetclinic.model;

import java.io.Serializable;

public class BaseEntity  implements Serializable{

	private Long id;	/* Hibernate recommends using Objects (Long ) not long as they can be initiated to null*/

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	 
}
