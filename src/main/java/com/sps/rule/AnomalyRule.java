package com.sps.rule;

/**
 * @author amrmalaj
 *
 * @param <R> - Rate before anomaly
 * @param <A> - Rate after anomaly rule
 */
public interface AnomalyRule<R, A> {

	boolean matches(R input);

	A process(R input);
}
