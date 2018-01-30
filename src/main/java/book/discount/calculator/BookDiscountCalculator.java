package book.discount.calculator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BookDiscountCalculator {
	private List<Integer> bookCounts = new ArrayList<>();
	double bookPrice;
	double totalDiscount;

	public BookDiscountCalculator(int bookPrice) {
		this.bookPrice = bookPrice;
	}

	public void add(int amount) {
		if (bookCounts.size() <= 5) {
			bookCounts.add(amount);
		}

	}

	public void sort() {
		Collections.sort(bookCounts, Collections.reverseOrder());
	}

	public List<Integer> getList() {
		return bookCounts;
	}

	public int getTotalCount() {
		int sum = 0;
		for (int i : bookCounts) {
			sum += i;
		}
		return sum;
	}

	public boolean checkForTwoGroupsOf4() {
		for (int i : bookCounts) {
			if (i == 0) {
				return false;
			}
		}

		for (int i = 0; i < 3; i++) {
			if (bookCounts.get(i) < 2) {
				return false;
			}
		}
		return true;
	}

	public void makeTwoGroupsof4() {

	}

}
