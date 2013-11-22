package de.bstreit.java.testprojekte.dbtest;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class B {

	@Id
	@GeneratedValue
	@Access(AccessType.FIELD)
	private Long id;

	@Access(AccessType.FIELD)
	@ManyToOne(cascade = CascadeType.ALL)
	private C c;

	public B(C c) {
		this.c = c;
	}

}
