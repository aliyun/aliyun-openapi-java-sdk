/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.cloud_siem.model.v20220616;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class PostCustomizeRuleRequest extends RpcAcsRequest<PostCustomizeRuleResponse> {
	   

	private Long roleFor;

	private String attCk;

	private String ruleDesc;

	private String ruleName;

	private String alertTypeMds;

	private String ruleThreshold;

	private String logSourceMds;

	private String logType;

	private String logTypeMds;

	private Integer roleType;

	private Long id;

	private Integer eventTransferSwitch;

	private String queryCycle;

	private String logSource;

	private String alertType;

	private String eventTransferType;

	private String ruleCondition;

	private String eventTransferExt;

	private String threatLevel;

	private String ruleGroup;
	public PostCustomizeRuleRequest() {
		super("cloud-siem", "2022-06-16", "PostCustomizeRule", "cloud-siem");
		setMethod(MethodType.POST);
	}

	public Long getRoleFor() {
		return this.roleFor;
	}

	public void setRoleFor(Long roleFor) {
		this.roleFor = roleFor;
		if(roleFor != null){
			putBodyParameter("RoleFor", roleFor.toString());
		}
	}

	public String getAttCk() {
		return this.attCk;
	}

	public void setAttCk(String attCk) {
		this.attCk = attCk;
		if(attCk != null){
			putBodyParameter("AttCk", attCk);
		}
	}

	public String getRuleDesc() {
		return this.ruleDesc;
	}

	public void setRuleDesc(String ruleDesc) {
		this.ruleDesc = ruleDesc;
		if(ruleDesc != null){
			putBodyParameter("RuleDesc", ruleDesc);
		}
	}

	public String getRuleName() {
		return this.ruleName;
	}

	public void setRuleName(String ruleName) {
		this.ruleName = ruleName;
		if(ruleName != null){
			putBodyParameter("RuleName", ruleName);
		}
	}

	public String getAlertTypeMds() {
		return this.alertTypeMds;
	}

	public void setAlertTypeMds(String alertTypeMds) {
		this.alertTypeMds = alertTypeMds;
		if(alertTypeMds != null){
			putBodyParameter("AlertTypeMds", alertTypeMds);
		}
	}

	public String getRuleThreshold() {
		return this.ruleThreshold;
	}

	public void setRuleThreshold(String ruleThreshold) {
		this.ruleThreshold = ruleThreshold;
		if(ruleThreshold != null){
			putBodyParameter("RuleThreshold", ruleThreshold);
		}
	}

	public String getLogSourceMds() {
		return this.logSourceMds;
	}

	public void setLogSourceMds(String logSourceMds) {
		this.logSourceMds = logSourceMds;
		if(logSourceMds != null){
			putBodyParameter("LogSourceMds", logSourceMds);
		}
	}

	public String getLogType() {
		return this.logType;
	}

	public void setLogType(String logType) {
		this.logType = logType;
		if(logType != null){
			putBodyParameter("LogType", logType);
		}
	}

	public String getLogTypeMds() {
		return this.logTypeMds;
	}

	public void setLogTypeMds(String logTypeMds) {
		this.logTypeMds = logTypeMds;
		if(logTypeMds != null){
			putBodyParameter("LogTypeMds", logTypeMds);
		}
	}

	public Integer getRoleType() {
		return this.roleType;
	}

	public void setRoleType(Integer roleType) {
		this.roleType = roleType;
		if(roleType != null){
			putBodyParameter("RoleType", roleType.toString());
		}
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
		if(id != null){
			putBodyParameter("Id", id.toString());
		}
	}

	public Integer getEventTransferSwitch() {
		return this.eventTransferSwitch;
	}

	public void setEventTransferSwitch(Integer eventTransferSwitch) {
		this.eventTransferSwitch = eventTransferSwitch;
		if(eventTransferSwitch != null){
			putBodyParameter("EventTransferSwitch", eventTransferSwitch.toString());
		}
	}

	public String getQueryCycle() {
		return this.queryCycle;
	}

	public void setQueryCycle(String queryCycle) {
		this.queryCycle = queryCycle;
		if(queryCycle != null){
			putBodyParameter("QueryCycle", queryCycle);
		}
	}

	public String getLogSource() {
		return this.logSource;
	}

	public void setLogSource(String logSource) {
		this.logSource = logSource;
		if(logSource != null){
			putBodyParameter("LogSource", logSource);
		}
	}

	public String getAlertType() {
		return this.alertType;
	}

	public void setAlertType(String alertType) {
		this.alertType = alertType;
		if(alertType != null){
			putBodyParameter("AlertType", alertType);
		}
	}

	public String getEventTransferType() {
		return this.eventTransferType;
	}

	public void setEventTransferType(String eventTransferType) {
		this.eventTransferType = eventTransferType;
		if(eventTransferType != null){
			putBodyParameter("EventTransferType", eventTransferType);
		}
	}

	public String getRuleCondition() {
		return this.ruleCondition;
	}

	public void setRuleCondition(String ruleCondition) {
		this.ruleCondition = ruleCondition;
		if(ruleCondition != null){
			putBodyParameter("RuleCondition", ruleCondition);
		}
	}

	public String getEventTransferExt() {
		return this.eventTransferExt;
	}

	public void setEventTransferExt(String eventTransferExt) {
		this.eventTransferExt = eventTransferExt;
		if(eventTransferExt != null){
			putBodyParameter("EventTransferExt", eventTransferExt);
		}
	}

	public String getThreatLevel() {
		return this.threatLevel;
	}

	public void setThreatLevel(String threatLevel) {
		this.threatLevel = threatLevel;
		if(threatLevel != null){
			putBodyParameter("ThreatLevel", threatLevel);
		}
	}

	public String getRuleGroup() {
		return this.ruleGroup;
	}

	public void setRuleGroup(String ruleGroup) {
		this.ruleGroup = ruleGroup;
		if(ruleGroup != null){
			putBodyParameter("RuleGroup", ruleGroup);
		}
	}

	@Override
	public Class<PostCustomizeRuleResponse> getResponseClass() {
		return PostCustomizeRuleResponse.class;
	}

}
