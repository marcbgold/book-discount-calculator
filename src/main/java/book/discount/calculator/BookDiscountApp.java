package book.discount.calculator;

public class BookDiscountApp {

	public static void main(String[] args) {
		BookDiscountCalculator calc = new BookDiscountCalculator(14);

		calc.add(2);
		calc.add(2);
		calc.add(3);
		calc.add(0);
		calc.add(3);
		calc.sort();

		System.out.println(calc.getList());
		do {
			if (calc.checkForTwoGroupsOf4()) {
				calc.makeTwoGroupsof4();
			}
		} while (calc.getTotalCount() > 0);

		System.out.println("end");
	}

}
