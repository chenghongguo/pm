/**
 * 
 */
package com.guttv.pm.core.msg.queue;


/**
 * @author Peter
 *
 */
public abstract class AbstractCheckRuleProducer implements Producer {

	private AbstractDispatchRule rule = null;
	
	/**
	 * 检测data是否符合分发规则
	 */
	public boolean checkRule(Object data) throws Exception{
		if(this.getDispatchRule() != null) {
			return rule.check(data);
		}else {
			return true;
		}
	}
	
	public void setDispatchRule(AbstractDispatchRule rule) {
		this.rule = rule;
	}
	public AbstractDispatchRule getDispatchRule() {
		return rule;
	}
	
}
