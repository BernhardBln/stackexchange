package de.bstreit.java.testprojekte.dbtest;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
public class DBTest extends AbstractH2TestCase {

	@Test
	public void testDataStorage() {

		final AbstractApplicationContext context = new AnnotationConfigApplicationContext(DBTest.class);

		try {
			final PersistService persistService = context.getBean(PersistService.class);

			C c1 = new C();
			C c2 = new C();

			A a1 = new A(c1);
			A a2 = new A(c2);
			A a3 = new A(c1);

			B b1 = new B(c1);
			B b2 = new B(c2);

			persistService.save(b1, b2, a1, a2, a3);

		} finally {
			context.close();
		}
	}
}
