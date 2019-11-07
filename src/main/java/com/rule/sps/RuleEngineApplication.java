package com.rule.sps;

import com.sps.rule.AnotherRule;
import com.sps.rule.SampleRule;
import com.sps.rule.RuleEngine;

/**
 * @author amrmalaj
 *
 */
public class RuleEngineApplication {
	public static void main(String[] args) {

		RuleEngine ruleEngine = new RuleEngine();
		SampleRule rule = new SampleRule();
		AnotherRule anotherRule = new AnotherRule();
		ruleEngine.configureRule(rule);
		ruleEngine.configureRule(anotherRule);
		RateChange rate = new RateChange(RateChangeType.X);
//		ruleEngine.executeRule(rate);
//		ruleEngine.executeRules(rate);
	}
}
