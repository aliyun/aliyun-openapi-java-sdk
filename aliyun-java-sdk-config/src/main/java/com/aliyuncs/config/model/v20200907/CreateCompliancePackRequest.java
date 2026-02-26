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
	   

	private String tagKeyScope;

	private String compliancePackName;

	private String clientToken;

	private String compliancePackTemplateId;

	private String description;

	private String excludeResourceGroupIdsScope;

	private String tagValueScope;

	private String regionIdsScope;

	private String resourceIdsScope;

	private String tag;

	private Boolean defaultEnable;

	@SerializedName("configRules")
	private List<ConfigRules> configRules;

	private List<ExcludeTagsScope> excludeTagsScope;

	private Integer riskLevel;

	private List<TagsScope> tagsScope;

	private String templateContent;

	private String resourceGroupIdsScope;

	private String excludeRegionIdsScope;

	private String excludeResourceIdsScope;
	public CreateCompliancePackRequest() {
		super("Config", "2020-09-07", "CreateCompliancePack", "config");
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

	public String getExcludeResourceGroupIdsScope() {
		return this.excludeResourceGroupIdsScope;
	}

	public void setExcludeResourceGroupIdsScope(String excludeResourceGroupIdsScope) {
		this.excludeResourceGroupIdsScope = excludeResourceGroupIdsScope;
		if(excludeResourceGroupIdsScope != null){
			putBodyParameter("ExcludeResourceGroupIdsScope", excludeResourceGroupIdsScope);
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

	public String getResourceIdsScope() {
		return this.resourceIdsScope;
	}

	public void setResourceIdsScope(String resourceIdsScope) {
		this.resourceIdsScope = resourceIdsScope;
		if(resourceIdsScope != null){
			putBodyParameter("ResourceIdsScope", resourceIdsScope);
		}
	}

	public String getTag() {
		return this.tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
		if(tag != null){
			putQueryParameter("Tag", tag);
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

	public List<ExcludeTagsScope> getExcludeTagsScope() {
		return this.excludeTagsScope;
	}

	public void setExcludeTagsScope(List<ExcludeTagsScope> excludeTagsScope) {
		this.excludeTagsScope = excludeTagsScope;	
		if (excludeTagsScope != null) {
			for (int depth1 = 0; depth1 < excludeTagsScope.size(); depth1++) {
				if (excludeTagsScope.get(depth1) != null) {
					
						putBodyParameter("ExcludeTagsScope." + (depth1 + 1) + ".TagValue" , excludeTagsScope.get(depth1).getTagValue());
						putBodyParameter("ExcludeTagsScope." + (depth1 + 1) + ".TagKey" , excludeTagsScope.get(depth1).getTagKey());
				}
			}
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

	public List<TagsScope> getTagsScope() {
		return this.tagsScope;
	}

	public void setTagsScope(List<TagsScope> tagsScope) {
		this.tagsScope = tagsScope;	
		if (tagsScope != null) {
			for (int depth1 = 0; depth1 < tagsScope.size(); depth1++) {
				if (tagsScope.get(depth1) != null) {
					
						putBodyParameter("TagsScope." + (depth1 + 1) + ".TagValue" , tagsScope.get(depth1).getTagValue());
						putBodyParameter("TagsScope." + (depth1 + 1) + ".TagKey" , tagsScope.get(depth1).getTagKey());
				}
			}
		}	
	}

	public String getTemplateContent() {
		return this.templateContent;
	}

	public void setTemplateContent(String templateContent) {
		this.templateContent = templateContent;
		if(templateContent != null){
			putBodyParameter("TemplateContent", templateContent);
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

	public String getExcludeRegionIdsScope() {
		return this.excludeRegionIdsScope;
	}

	public void setExcludeRegionIdsScope(String excludeRegionIdsScope) {
		this.excludeRegionIdsScope = excludeRegionIdsScope;
		if(excludeRegionIdsScope != null){
			putBodyParameter("ExcludeRegionIdsScope", excludeRegionIdsScope);
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

	public static class ExcludeTagsScope {

		private String tagValue;

		private String tagKey;

		public String getTagValue() {
			return this.tagValue;
		}

		public void setTagValue(String tagValue) {
			this.tagValue = tagValue;
		}

		public String getTagKey() {
			return this.tagKey;
		}

		public void setTagKey(String tagKey) {
			this.tagKey = tagKey;
		}
	}

	public static class TagsScope {

		private String tagValue;

		private String tagKey;

		public String getTagValue() {
			return this.tagValue;
		}

		public void setTagValue(String tagValue) {
			this.tagValue = tagValue;
		}

		public String getTagKey() {
			return this.tagKey;
		}

		public void setTagKey(String tagKey) {
			this.tagKey = tagKey;
		}
	}

	@Override
	public Class<CreateCompliancePackResponse> getResponseClass() {
		return CreateCompliancePackResponse.class;
	}

}
