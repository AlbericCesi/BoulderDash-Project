package view;

import static org.junit.Assert.assertNotNull;

import java.util.Observable;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import contract.IModel;

public class ViewFrameTest {

	boolean GetModel;
	ViewFrameTest test;
	private static IModel model2;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {

	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		model2 = new FakeModel();
	}

	@Test
	public void testGetModel() {

		ViewFrame fakeview = new ViewFrame(null);

		assertNotNull(fakeview.getModel());
		System.out.println(
				" SUCCES");
	}

	class FakeModel implements IModel {

		public Observable getObservable() {
			return new Observable();
		}
	}
}