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
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.config.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateAggregateCompliancePackRequest extends RpcAcsRequest<UpdateAggregateCompliancePackResponse> {
	   

	private String tagKeyScope;

	private String compliancePackName;

	private String clientToken;

	private String description;

	private String aggregatorId;

	private String tagValueScope;

	private String regionIdsScope;

	private String compliancePackId;

	@SerializedName("configRules")
	private List<ConfigRules> configRules;

	private Integer riskLevel;

	private String resourceGroupIdsScope;

	private String excludeResourceIdsScope;
	public UpdateAggregateCompliancePackRequest() {
		super("Config", "2020-09-07", "UpdateAggregateCompliancePack", "config");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public String getCompliancePackName() {
		return this.compliancePackName;
	}

	public void setCompliancePackName(String compliancePackName) {
		this.compliancePackName = compliancePackName;
		if(compliancePackName != null){
			putBodyParameter("CompliancePackName", compliancePackName);
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

	public String getAggregatorId() {
		return this.aggregatorId;
	}

	public void setAggregatorId(String aggregatorId) {
		this.aggregatorId = aggregatorId;
		if(aggregatorId != null){
			putBodyParameter("AggregatorId", aggregatorId);
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

	public String getCompliancePackId() {
		return this.compliancePackId;
	}

	public void setCompliancePackId(String compliancePackId) {
		this.compliancePackId = compliancePackId;
		if(compliancePackId != null){
			putBodyParameter("CompliancePackId", compliancePackId);
		}
	}

	public List<ConfigRules> getConfigRules() {
		return this.configRules;
	}

	public void setConfigRules(List<ConfigRules> configRules) {
		this.configRules = configRules;	
		if (configRules != null) {
			putBodyParameter("ConfigRules" , new Gson().toJson(configRules));
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

	public String getExcludeResourceIdsScope() {
		return this.excludeResourceIdsScope;
	}

	public void setExcludeResourceIdsScope(String excludeResourceIdsScope) {
		this.excludeResourceIdsScope = excludeResourceIdsScope;
		if(excludeResourceIdsScope != null){
			putBodyParameter("ExcludeResourceIdsScope", excludeResourceIdsScope);
		}
	}

	public static class ConfigRules {

		@SerializedName("ManagedRuleIdentifier")
		private String managedRuleIdentifier;

		@SerializedName("ConfigRuleParameters")
		private List<ConfigRuleParametersItem> configRuleParameters;

		@SerializedName("ConfigRuleId")
		private String configRuleId;

		@SerializedName("ConfigRuleName")
		private String configRuleName;

		@SerializedName("Description")
		private String description;

		@SerializedName("RiskLevel")
		private Integer riskLevel;

		public String getManagedRuleIdentifier() {
			return this.managedRuleIdentifier;
		}

		public void setManagedRuleIdentifier(String managedRuleIdentifier) {
			this.managedRuleIdentifier = managedRuleIdentifier;
		}

		public List<ConfigRuleParametersItem> getConfigRuleParameters() {
			return this.configRuleParameters;
		}

		public void setConfigRuleParameters(List<ConfigRuleParametersItem> configRuleParameters) {
			this.configRuleParameters = configRuleParameters;
		}

		public String getConfigRuleId() {
			return this.configRuleId;
		}

		public void setConfigRuleId(String configRuleId) {
			this.configRuleId = configRuleId;
		}

		public String getConfigRuleName() {
			return this.configRuleName;
		}

		public void setConfigRuleName(String configRuleName) {
			this.configRuleName = configRuleName;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public Integer getRiskLevel() {
			return this.riskLevel;
		}

		public void setRiskLevel(Integer riskLevel) {
			this.riskLevel = riskLevel;
		}

		public static class ConfigRuleParametersItem {

			@SerializedName("ParameterValue")
			private String parameterValue;

			@SerializedName("ParameterName")
			private String parameterName;

			public String getParameterValue() {
				return this.parameterValue;
			}

			public void setParameterValue(String parameterValue) {
				this.parameterValue = parameterValue;
			}

			public String getParameterName() {
				return this.parameterName;
			}

			public void setParameterName(String parameterName) {
				this.parameterName = parameterName;
			}
		}
	}

	@Override
	public Class<UpdateAggregateCompliancePackResponse> getResponseClass() {
		return UpdateAggregateCompliancePackResponse.class;
	}

}
