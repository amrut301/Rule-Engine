package com.sps.rule;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.rule.sps.RateChange;

/**
 * @author amrmalaj
 *
 * @param <R> - Rate
 * @param <A> Rate after anomaly rule
 */
public class RuleEngine<R, A> {

	List<AnomalyRule> rules = new ArrayList<AnomalyRule>();

	public RuleEngine() {
	}

	public RateChange executeRule(RateChange rate) {

		return rules.stream().filter(rule -> rule.matches(rate)).map(rule -> (RateChange) rule.process(rate))
				.findFirst().orElseThrow(() -> new RuntimeException("No matching rule found"));

	}

	public List<RateChange> executeRules(RateChange rate) {
		/**
		 * this is returning list, we can change it to return one item and apply rules
		 * in sequential order
		 */
		List<RateChange> rateAfterRule = rules.stream().filter(rule -> rule.matches(rate))
				.map(rule -> (RateChange) rule.process(rate)).collect(Collectors.toList());
		return rateAfterRule;
//		return executeRule(executeRule(rate));

	}

	public RuleEngine<R, A> configureRule(AnomalyRule<RateChange, RateChange> rule) {
		rules.add(rule);
		return this;
	}
}
