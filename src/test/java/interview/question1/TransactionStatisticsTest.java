package interview.question1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

import interview.questions.question1.Transaction;

public class TransactionStatisticsTest {

	@Test
	public void returnMostPopTickerWhenListNotEmpty() {

		Transaction tr1 = Transaction.transaction("a", -10, 2.0);
		Transaction tr2 = Transaction.transaction("a", 20, 1.0);
		Transaction tr3 = Transaction.transaction("b", 5, 1.0);
		Transaction tr4 = Transaction.transaction("b", 10, 1.0);
		Transaction tr5 = Transaction.transaction("b", 10, 1.0);

		List<Transaction> transactions = new ArrayList<>();

		Collections.addAll(transactions, tr1, tr2, tr3, tr4, tr5);
		
		System.out.println(transactions.get(0).getTicker());

	}

}
