package interview.question3;

import org.junit.Test;

import interview.questions.question3.StatisticImplementation;

public class StatisticImplementationTest {

	@Test
	public void testMean() {
		int[] input_data = { 1, 3, 5, 6, 8, 12, 18, 21, 22, 25 };
		int per = 3;
		StatisticImplementation obj = new StatisticImplementation(per);
		for (int x : input_data) {
			obj.event(x);
			System.out.println("New number added is " + x + ", moving mean = " + obj.mean());
		}

	}

	@Test
	public void testMin() {

	}

}
