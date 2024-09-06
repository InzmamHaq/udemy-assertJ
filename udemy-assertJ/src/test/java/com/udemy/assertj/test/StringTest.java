package com.udemy.assertj.test;

import org.assertj.core.api.SoftAssertions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class StringTest {

	@Test(dataProvider = "getData")
	public void stringTest(String input) {
		SoftAssertions.assertSoftly(softAssertion -> {
			softAssertion.assertThat(input).hasSize(8).startsWith("se").doesNotContain("api")
					.doesNotContainAnyWhitespaces().containsOnlyOnce("i");
		});
	}

	@DataProvider
	public Object[] getData() {

		return new String[] { "selenium", "seleniumapi", "seleniod", "selenium4", };
	}

}
