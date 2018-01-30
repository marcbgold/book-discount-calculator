package book.discount.calculator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BookDiscountCalculatorTest {

	@Test
	public void shouldAddOneBook() {
		BookDiscountCalculator underTest = new BookDiscountCalculator(14);
		underTest.add(1);

		int count = underTest.getTotalCount();

		assertEquals(1, count);
	}

	@Test
	public void shouldAddTwoOfSameBook() {
		BookDiscountCalculator underTest = new BookDiscountCalculator(14);
		underTest.add(1);

		int count = underTest.getTotalCount();

		assertEquals(1, count);
	}

	@Test
	public void shouldDetectConditionToMakeTwoGroupsOf4() {
		BookDiscountCalculator underTest = new BookDiscountCalculator(14);
		underTest.add(2);
		underTest.add(2);
		underTest.add(2);
		underTest.add(1);
		underTest.add(1);

		assertEquals(true, underTest.checkForTwoGroupsOf4());
	}

	@Test
	public void shouldMakeTwoGroupsOf4() {
		BookDiscountCalculator underTest = new BookDiscountCalculator(14);
		underTest.add(2);
		underTest.add(2);
		underTest.add(2);
		underTest.add(1);
		underTest.add(1);

		underTest.makeTwoGroupsof4();

		assertEquals(true, underTest.checkForTwoGroupsOf4());
	}

}
