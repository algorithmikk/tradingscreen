/*
 * Copyright (c) 2006-2019 Henri Tremblay.
 */
package interview.questions.question1;

import java.util.List;

/**
 * Please implement the {@link #mostPopularTicker(List)} method. With a sequential and a parallel algorithm.
 * DO NOT modify the existing code.
 */
public final class TransactionStatistics {

   /**
    * Return the most popular ticker in terms of transaction total absolute value (i.e. abs(price * quantity)). For example,
    * let's say we have these transactions:
    * <ul>
    *     <li>transaction("a", -10, 2.0)</li>
    *     <li>transaction("a", 20, 1.0)</li>
    *     <li>transaction("b", 5, 1.0)</li>
    *     <li>transaction("b", 10, 1.0)</li>
    *     <li>transaction("b", 10, 1.0)</li>
    * </ul>
    * The most popular one ticker is "a" with a traded value of 40 compared to b that only has 25.
    *
    * @param list List containing all transactions we want to look at
    * @return the most popular ticker
    */
   public static String mostPopularTicker(List<Transaction> transactions) {
      return null;
   }
   
   public double sumOfTotalAbsoluteValue(Transaction tr) {
	   
	   
	   
	   
	   return 0;
   }

   private TransactionStatistics()  {}
}
