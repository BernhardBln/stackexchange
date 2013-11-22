package de.bstreit.java.testprojekte.dbtest;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class C {

	@Id
	@GeneratedValue
	@Access(AccessType.FIELD)
	private Long id;

}
