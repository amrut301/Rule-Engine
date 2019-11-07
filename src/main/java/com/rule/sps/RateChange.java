package com.rule.sps;

/**
 * @author amrmalaj
 *
 */
public class RateChange {

	private RateChangeType rateChangeType;

	public RateChange(RateChangeType rateChangeType) {
		this.rateChangeType = rateChangeType;
	}

	public RateChangeType getRateChangeType() {
		return rateChangeType;
	}

	public void setRateChangeType(RateChangeType rateChangeType) {
		this.rateChangeType = rateChangeType;
	}

	

}
