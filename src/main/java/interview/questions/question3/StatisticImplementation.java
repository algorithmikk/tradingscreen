package interview.questions.question3;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Queue;

public class StatisticImplementation implements Statistic {

	private final Queue<Integer> dataSet = new ArrayDeque<>();
	private final int period;
	private int sum;

	public StatisticImplementation(int period) {
		this.period = period;
	}

	@Override
	public synchronized void event(int value) {
		sum += value;
		dataSet.add(value);
		if (dataSet.size() > period) {
			sum -= dataSet.remove();
		}

	}

	@Override
	public synchronized float mean() {
		if (dataSet.isEmpty()) {
			return 0.0f;
		}
		float meanFloatVal = sum / (float) dataSet.size();
		
		return meanFloatVal;
	}

	@Override
	public synchronized int minimum() {
		if (dataSet.isEmpty()) {
			return 0;
		}
		return Collections.min(dataSet);
	}

	@Override
	public synchronized int maximum() {

		if (dataSet.isEmpty()) {
			return 0;
		}

		return Collections.max(dataSet);
	}

}
