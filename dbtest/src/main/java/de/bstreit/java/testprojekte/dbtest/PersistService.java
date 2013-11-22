package de.bstreit.java.testprojekte.dbtest;

import java.util.Arrays;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.transaction.annotation.Transactional;

@Named
public class PersistService {

	@Inject
	IARepository aRepo;

	@Inject
	IBRepository bRepo;

	byte b = 127;

	@Transactional
	public void save(B b1, B b2, A... aObjects) {

		aRepo.save(Arrays.asList(aObjects));

		bRepo.save(Arrays.asList(b1, b2));

	}
}
