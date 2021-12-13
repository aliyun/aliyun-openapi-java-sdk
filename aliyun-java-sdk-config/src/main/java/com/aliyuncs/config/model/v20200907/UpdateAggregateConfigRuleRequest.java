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

package com.aliyuncs.config.model.v20200907;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.config.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateAggregateConfigRuleRequest extends RpcAcsRequest<UpdateAggregateConfigRuleResponse> {
	   

	private String configRuleId;

	private String tagKeyScope;

	private String clientToken;

	private List<String> resourceTypesScope;

	private String description;

	private String aggregatorId;

	private String configRuleTriggerTypes;

	private String tagValueScope;

	private String regionIdsScope;

	private Integer riskLevel;

	private String resourceGroupIdsScope;

	private String inputParameters;

	private String configRuleName;

	private String maximumExecutionFrequency;

	private String excludeResourceIdsScope;
	public UpdateAggregateConfigRuleRequest() {
		super("Config", "2020-09-07", "UpdateAggregateConfigRule");
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

	public String getTagKeyScope() {
		return this.tagKeyScope;
	}

	public void setTagKeyScope(String tagKeyScope) {
		this.tagKeyScope = tagKeyScope;
		if(tagKeyScope != null){
			putBodyParameter("TagKeyScope", tagKeyScope);
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

	public List<String> getResourceTypesScope() {
		return this.resourceTypesScope;
	}

	public void setResourceTypesScope(List<String> resourceTypesScope) {
		this.resourceTypesScope = resourceTypesScope;	
		if (resourceTypesScope != null) {
			for (int depth1 = 0; depth1 < resourceTypesScope.size(); depth1++) {
				putBodyParameter("ResourceTypesScope." + (depth1 + 1) , resourceTypesScope.get(depth1));
			}
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

	public String getAggregatorId() {
		return this.aggregatorId;
	}

	public void setAggregatorId(String aggregatorId) {
		this.aggregatorId = aggregatorId;
		if(aggregatorId != null){
			putBodyParameter("AggregatorId", aggregatorId);
		}
	}

	public String getConfigRuleTriggerTypes() {
		return this.configRuleTriggerTypes;
	}

	public void setConfigRuleTriggerTypes(String configRuleTriggerTypes) {
		this.configRuleTriggerTypes = configRuleTriggerTypes;
		if(configRuleTriggerTypes != null){
			putBodyParameter("ConfigRuleTriggerTypes", configRuleTriggerTypes);
		}
	}

	public String getTagValueScope() {
		return this.tagValueScope;
	}

	public void setTagValueScope(String tagValueScope) {
		this.tagValueScope = tagValueScope;
		if(tagValueScope != null){
			putBodyParameter("TagValueScope", tagValueScope);
		}
	}

	public String getRegionIdsScope() {
		return this.regionIdsScope;
	}

	public void setRegionIdsScope(String regionIdsScope) {
		this.regionIdsScope = regionIdsScope;
		if(regionIdsScope != null){
			putBodyParameter("RegionIdsScope", regionIdsScope);
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

	public String getResourceGroupIdsScope() {
		return this.resourceGroupIdsScope;
	}

	public void setResourceGroupIdsScope(String resourceGroupIdsScope) {
		this.resourceGroupIdsScope = resourceGroupIdsScope;
		if(resourceGroupIdsScope != null){
			putBodyParameter("ResourceGroupIdsScope", resourceGroupIdsScope);
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

	public String getMaximumExecutionFrequency() {
		return this.maximumExecutionFrequency;
	}

	public void setMaximumExecutionFrequency(String maximumExecutionFrequency) {
		this.maximumExecutionFrequency = maximumExecutionFrequency;
		if(maximumExecutionFrequency != null){
			putBodyParameter("MaximumExecutionFrequency", maximumExecutionFrequency);
		}
	}

	public String getExcludeResourceIdsScope() {
		return this.excludeResourceIdsScope;
	}

	public void setExcludeResourceIdsScope(String excludeResourceIdsScope) {
		this.excludeResourceIdsScope = excludeResourceIdsScope;
		if(excludeResourceIdsScope != null){
			putBodyParameter("ExcludeResourceIdsScope", excludeResourceIdsScope);
		}
	}

	@Override
	public Class<UpdateAggregateConfigRuleResponse> getResponseClass() {
		return UpdateAggregateConfigRuleResponse.class;
	}

}
