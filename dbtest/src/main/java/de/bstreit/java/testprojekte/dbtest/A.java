package de.bstreit.java.testprojekte.dbtest;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class A {

	@Id
	@GeneratedValue
	@Access(AccessType.FIELD)
	private Long id;

	@ManyToOne(cascade = CascadeType.ALL)
	@Access(AccessType.FIELD)
	private C c;

	public A(C c) {
		this.c = c;
	}

	public C getC() {
		return c;
	}
}
