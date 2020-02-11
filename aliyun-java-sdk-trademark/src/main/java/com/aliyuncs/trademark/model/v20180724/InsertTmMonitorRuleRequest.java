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

package com.aliyuncs.trademark.model.v20180724;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.trademark.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class InsertTmMonitorRuleRequest extends RpcAcsRequest<InsertTmMonitorRuleResponse> {
	   

	private String startApplyDate;

	private Integer ruleType;

	private String ruleSource;

	private String ruleName;

	private String classification;

	private String notifyStatus;

	private String endApplyDate;

	private String ruleKeyword;
	public InsertTmMonitorRuleRequest() {
		super("Trademark", "2018-07-24", "InsertTmMonitorRule");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getStartApplyDate() {
		return this.startApplyDate;
	}

	public void setStartApplyDate(String startApplyDate) {
		this.startApplyDate = startApplyDate;
		if(startApplyDate != null){
			putQueryParameter("StartApplyDate", startApplyDate);
		}
	}

	public Integer getRuleType() {
		return this.ruleType;
	}

	public void setRuleType(Integer ruleType) {
		this.ruleType = ruleType;
		if(ruleType != null){
			putQueryParameter("RuleType", ruleType.toString());
		}
	}

	public String getRuleSource() {
		return this.ruleSource;
	}

	public void setRuleSource(String ruleSource) {
		this.ruleSource = ruleSource;
		if(ruleSource != null){
			putQueryParameter("RuleSource", ruleSource);
		}
	}

	public String getRuleName() {
		return this.ruleName;
	}

	public void setRuleName(String ruleName) {
		this.ruleName = ruleName;
		if(ruleName != null){
			putQueryParameter("RuleName", ruleName);
		}
	}

	public String getClassification() {
		return this.classification;
	}

	public void setClassification(String classification) {
		this.classification = classification;
		if(classification != null){
			putQueryParameter("Classification", classification);
		}
	}

	public String getNotifyStatus() {
		return this.notifyStatus;
	}

	public void setNotifyStatus(String notifyStatus) {
		this.notifyStatus = notifyStatus;
		if(notifyStatus != null){
			putQueryParameter("NotifyStatus", notifyStatus);
		}
	}

	public String getEndApplyDate() {
		return this.endApplyDate;
	}

	public void setEndApplyDate(String endApplyDate) {
		this.endApplyDate = endApplyDate;
		if(endApplyDate != null){
			putQueryParameter("EndApplyDate", endApplyDate);
		}
	}

	public String getRuleKeyword() {
		return this.ruleKeyword;
	}

	public void setRuleKeyword(String ruleKeyword) {
		this.ruleKeyword = ruleKeyword;
		if(ruleKeyword != null){
			putQueryParameter("RuleKeyword", ruleKeyword);
		}
	}

	@Override
	public Class<InsertTmMonitorRuleResponse> getResponseClass() {
		return InsertTmMonitorRuleResponse.class;
	}

}
