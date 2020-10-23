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

package com.aliyuncs.config.model.v20190108;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.config.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class PutConfigRuleRequest extends RpcAcsRequest<PutConfigRuleResponse> {
	   

	private String configRuleId;

	private Boolean multiAccount;

	private String clientToken;

	private String description;

	private String sourceIdentifier;

	private String sourceMaximumExecutionFrequency;

	private String scopeComplianceResourceTypes;

	private String sourceDetailMessageType;

	private Integer riskLevel;

	private String sourceOwner;

	private String inputParameters;

	private String configRuleName;

	private String scopeComplianceResourceId;

	private Long memberId;
	public PutConfigRuleRequest() {
		super("Config", "2019-01-08", "PutConfigRule", "Config");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getConfigRuleId() {
		return this.configRuleId;
	}

	public void setConfigRuleId(String configRuleId) {
		this.configRuleId = configRuleId;
		if(configRuleId != null){
			putBodyParameter("ConfigRuleId", configRuleId);
		}
	}

	public Boolean getMultiAccount() {
		return this.multiAccount;
	}

	public void setMultiAccount(Boolean multiAccount) {
		this.multiAccount = multiAccount;
		if(multiAccount != null){
			putQueryParameter("MultiAccount", multiAccount.toString());
		}
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putBodyParameter("ClientToken", clientToken);
		}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putBodyParameter("Description", description);
		}
	}

	public String getSourceIdentifier() {
		return this.sourceIdentifier;
	}

	public void setSourceIdentifier(String sourceIdentifier) {
		this.sourceIdentifier = sourceIdentifier;
		if(sourceIdentifier != null){
			putBodyParameter("SourceIdentifier", sourceIdentifier);
		}
	}

	public String getSourceMaximumExecutionFrequency() {
		return this.sourceMaximumExecutionFrequency;
	}

	public void setSourceMaximumExecutionFrequency(String sourceMaximumExecutionFrequency) {
		this.sourceMaximumExecutionFrequency = sourceMaximumExecutionFrequency;
		if(sourceMaximumExecutionFrequency != null){
			putBodyParameter("SourceMaximumExecutionFrequency", sourceMaximumExecutionFrequency);
		}
	}

	public String getScopeComplianceResourceTypes() {
		return this.scopeComplianceResourceTypes;
	}

	public void setScopeComplianceResourceTypes(String scopeComplianceResourceTypes) {
		this.scopeComplianceResourceTypes = scopeComplianceResourceTypes;
		if(scopeComplianceResourceTypes != null){
			putBodyParameter("ScopeComplianceResourceTypes", scopeComplianceResourceTypes);
		}
	}

	public String getSourceDetailMessageType() {
		return this.sourceDetailMessageType;
	}

	public void setSourceDetailMessageType(String sourceDetailMessageType) {
		this.sourceDetailMessageType = sourceDetailMessageType;
		if(sourceDetailMessageType != null){
			putBodyParameter("SourceDetailMessageType", sourceDetailMessageType);
		}
	}

	public Integer getRiskLevel() {
		return this.riskLevel;
	}

	public void setRiskLevel(Integer riskLevel) {
		this.riskLevel = riskLevel;
		if(riskLevel != null){
			putBodyParameter("RiskLevel", riskLevel.toString());
		}
	}

	public String getSourceOwner() {
		return this.sourceOwner;
	}

	public void setSourceOwner(String sourceOwner) {
		this.sourceOwner = sourceOwner;
		if(sourceOwner != null){
			putBodyParameter("SourceOwner", sourceOwner);
		}
	}

	public String getInputParameters() {
		return this.inputParameters;
	}

	public void setInputParameters(String inputParameters) {
		this.inputParameters = inputParameters;
		if(inputParameters != null){
			putBodyParameter("InputParameters", inputParameters);
		}
	}

	public String getConfigRuleName() {
		return this.configRuleName;
	}

	public void setConfigRuleName(String configRuleName) {
		this.configRuleName = configRuleName;
		if(configRuleName != null){
			putBodyParameter("ConfigRuleName", configRuleName);
		}
	}

	public String getScopeComplianceResourceId() {
		return this.scopeComplianceResourceId;
	}

	public void setScopeComplianceResourceId(String scopeComplianceResourceId) {
		this.scopeComplianceResourceId = scopeComplianceResourceId;
		if(scopeComplianceResourceId != null){
			putBodyParameter("ScopeComplianceResourceId", scopeComplianceResourceId);
		}
	}

	public Long getMemberId() {
		return this.memberId;
	}

	public void setMemberId(Long memberId) {
		this.memberId = memberId;
		if(memberId != null){
			putQueryParameter("MemberId", memberId.toString());
		}
	}

	@Override
	public Class<PutConfigRuleResponse> getResponseClass() {
		return PutConfigRuleResponse.class;
	}

}
