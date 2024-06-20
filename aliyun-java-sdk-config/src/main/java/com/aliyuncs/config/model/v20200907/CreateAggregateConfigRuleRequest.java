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
public class CreateAggregateConfigRuleRequest extends RpcAcsRequest<CreateAggregateConfigRuleResponse> {
	   

	private String tagKeyScope;

	private String clientToken;

	private List<String> resourceTypesScope;

	private String description;

	private String aggregatorId;

	private String excludeResourceGroupIdsScope;

	private String configRuleTriggerTypes;

	private String sourceIdentifier;

	private String tagValueScope;

	private String excludeAccountIdsScope;

	private String regionIdsScope;

	private String resourceIdsScope;

	private String excludeFolderIdsScope;

	private List<ExcludeTagsScope> excludeTagsScope;

	private Integer riskLevel;

	private List<TagsScope> tagsScope;

	private String sourceOwner;

	private String resourceGroupIdsScope;

	private String inputParameters;

	private String excludeRegionIdsScope;

	private String accountIdsScope;

	private String configRuleName;

	private String tagKeyLogicScope;

	private String maximumExecutionFrequency;

	private String folderIdsScope;

	private String excludeResourceIdsScope;
	public CreateAggregateConfigRuleRequest() {
		super("Config", "2020-09-07", "CreateAggregateConfigRule", "config");
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
			String resourceTypesScopeArrVal = "";
			for(int depth1 = 0; depth1 < resourceTypesScope.size(); depth1++) {
				resourceTypesScopeArrVal += resourceTypesScope.get(depth1) + ",";
			}
			if (resourceTypesScopeArrVal.length() > 0) {
				resourceTypesScopeArrVal = resourceTypesScopeArrVal.substring(0, resourceTypesScopeArrVal.length() - 1);
			}
			putBodyParameter("ResourceTypesScope" , resourceTypesScopeArrVal);
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

	public String getExcludeResourceGroupIdsScope() {
		return this.excludeResourceGroupIdsScope;
	}

	public void setExcludeResourceGroupIdsScope(String excludeResourceGroupIdsScope) {
		this.excludeResourceGroupIdsScope = excludeResourceGroupIdsScope;
		if(excludeResourceGroupIdsScope != null){
			putBodyParameter("ExcludeResourceGroupIdsScope", excludeResourceGroupIdsScope);
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

	public String getSourceIdentifier() {
		return this.sourceIdentifier;
	}

	public void setSourceIdentifier(String sourceIdentifier) {
		this.sourceIdentifier = sourceIdentifier;
		if(sourceIdentifier != null){
			putBodyParameter("SourceIdentifier", sourceIdentifier);
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

	public String getExcludeAccountIdsScope() {
		return this.excludeAccountIdsScope;
	}

	public void setExcludeAccountIdsScope(String excludeAccountIdsScope) {
		this.excludeAccountIdsScope = excludeAccountIdsScope;
		if(excludeAccountIdsScope != null){
			putBodyParameter("ExcludeAccountIdsScope", excludeAccountIdsScope);
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

	public String getExcludeFolderIdsScope() {
		return this.excludeFolderIdsScope;
	}

	public void setExcludeFolderIdsScope(String excludeFolderIdsScope) {
		this.excludeFolderIdsScope = excludeFolderIdsScope;
		if(excludeFolderIdsScope != null){
			putBodyParameter("ExcludeFolderIdsScope", excludeFolderIdsScope);
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

	public String getSourceOwner() {
		return this.sourceOwner;
	}

	public void setSourceOwner(String sourceOwner) {
		this.sourceOwner = sourceOwner;
		if(sourceOwner != null){
			putBodyParameter("SourceOwner", sourceOwner);
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

	public String getExcludeRegionIdsScope() {
		return this.excludeRegionIdsScope;
	}

	public void setExcludeRegionIdsScope(String excludeRegionIdsScope) {
		this.excludeRegionIdsScope = excludeRegionIdsScope;
		if(excludeRegionIdsScope != null){
			putBodyParameter("ExcludeRegionIdsScope", excludeRegionIdsScope);
		}
	}

	public String getAccountIdsScope() {
		return this.accountIdsScope;
	}

	public void setAccountIdsScope(String accountIdsScope) {
		this.accountIdsScope = accountIdsScope;
		if(accountIdsScope != null){
			putBodyParameter("AccountIdsScope", accountIdsScope);
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

	public String getTagKeyLogicScope() {
		return this.tagKeyLogicScope;
	}

	public void setTagKeyLogicScope(String tagKeyLogicScope) {
		this.tagKeyLogicScope = tagKeyLogicScope;
		if(tagKeyLogicScope != null){
			putBodyParameter("TagKeyLogicScope", tagKeyLogicScope);
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

	public String getFolderIdsScope() {
		return this.folderIdsScope;
	}

	public void setFolderIdsScope(String folderIdsScope) {
		this.folderIdsScope = folderIdsScope;
		if(folderIdsScope != null){
			putBodyParameter("FolderIdsScope", folderIdsScope);
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
	public Class<CreateAggregateConfigRuleResponse> getResponseClass() {
		return CreateAggregateConfigRuleResponse.class;
	}

}
