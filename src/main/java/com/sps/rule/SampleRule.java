package com.sps.rule;

import com.rule.sps.RateChange;
import com.rule.sps.RateChangeType;

/**
 * @author amrmalaj
 *
 */
public class SampleRule implements AnomalyRule<RateChange, RateChange> {

	public boolean matches(RateChange input) {
		return true;
	}

	public RateChange process(RateChange input) {
		System.out.println("Sample rule applied");
		return new RateChange(RateChangeType.X);
	}

}
