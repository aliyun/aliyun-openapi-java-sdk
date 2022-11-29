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
public class CreateCompliancePackRequest extends RpcAcsRequest<CreateCompliancePackResponse> {
	   

	private String compliancePackName;

	private String clientToken;

	private String compliancePackTemplateId;

	private String description;

	private Boolean defaultEnable;

	@SerializedName("configRules")
	private List<ConfigRules> configRules;

	private Integer riskLevel;
	public CreateCompliancePackRequest() {
		super("Config", "2020-09-07", "CreateCompliancePack");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public String getCompliancePackTemplateId() {
		return this.compliancePackTemplateId;
	}

	public void setCompliancePackTemplateId(String compliancePackTemplateId) {
		this.compliancePackTemplateId = compliancePackTemplateId;
		if(compliancePackTemplateId != null){
			putBodyParameter("CompliancePackTemplateId", compliancePackTemplateId);
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

	public Boolean getDefaultEnable() {
		return this.defaultEnable;
	}

	public void setDefaultEnable(Boolean defaultEnable) {
		this.defaultEnable = defaultEnable;
		if(defaultEnable != null){
			putBodyParameter("DefaultEnable", defaultEnable.toString());
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
	public Class<CreateCompliancePackResponse> getResponseClass() {
		return CreateCompliancePackResponse.class;
	}

}
