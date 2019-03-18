import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HouseTest {

	@Test
	void testHouseConstruction() {
		StringBuffer sb = new StringBuffer(50);
		sb.append("standard material");
		House houseObject = new House();
		double Actual = houseObject.houseConstruction(sb,10);
		double Expected = 15000;
		assertEquals(Expected,Actual);
	}
	
	@Test
	void testHouseConstruction1() {
		StringBuffer sb = new StringBuffer(50);
		sb.append("high standard material");
		House houseObject = new House();
		double Actual = houseObject.houseConstruction(sb,10);
		double Expected = 18000;
		assertEquals(Expected,Actual);
	}
	
	@Test
	void testHouseConstruction2() {
		StringBuffer sb = new StringBuffer(50);
		sb.append("high standard material and fully automated house");
		House houseObject = new House();
		double Actual = houseObject.houseConstruction(sb,10);
		double Expected = 25000;
		assertEquals(Expected,Actual);
	}

}
