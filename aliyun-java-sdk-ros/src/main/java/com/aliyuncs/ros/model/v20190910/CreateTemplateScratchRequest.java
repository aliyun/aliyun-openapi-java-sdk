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

package com.aliyuncs.ros.model.v20190910;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import java.util.Map;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ros.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateTemplateScratchRequest extends RpcAcsRequest<CreateTemplateScratchResponse> {
	   

	private String resourceGroupId;

	@SerializedName("sourceResources")
	private List<SourceResources> sourceResources;

	private List<Tags> tagss;

	private String executionMode;

	@SerializedName("preferenceParameters")
	private List<PreferenceParameters> preferenceParameters;

	private String clientToken;

	private String description;

	@SerializedName("sourceTag")
	private SourceTag sourceTag;

	private String logicalIdStrategy;

	@SerializedName("sourceResourceGroup")
	private SourceResourceGroup sourceResourceGroup;

	private String templateScratchType;
	public CreateTemplateScratchRequest() {
		super("ROS", "2019-09-10", "CreateTemplateScratch", "ros");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getResourceGroupId() {
		return this.resourceGroupId;
	}

	public void setResourceGroupId(String resourceGroupId) {
		this.resourceGroupId = resourceGroupId;
		if(resourceGroupId != null){
			putQueryParameter("ResourceGroupId", resourceGroupId);
		}
	}

	public List<SourceResources> getSourceResources() {
		return this.sourceResources;
	}

	public void setSourceResources(List<SourceResources> sourceResources) {
		this.sourceResources = sourceResources;	
		if (sourceResources != null) {
			putQueryParameter("SourceResources" , new Gson().toJson(sourceResources));
		}	
	}

	public List<Tags> getTagss() {
		return this.tagss;
	}

	public void setTagss(List<Tags> tagss) {
		this.tagss = tagss;	
		if (tagss != null) {
			for (int depth1 = 0; depth1 < tagss.size(); depth1++) {
				putQueryParameter("Tags." + (depth1 + 1) + ".Value" , tagss.get(depth1).getValue());
				putQueryParameter("Tags." + (depth1 + 1) + ".Key" , tagss.get(depth1).getKey());
			}
		}	
	}

	public String getExecutionMode() {
		return this.executionMode;
	}

	public void setExecutionMode(String executionMode) {
		this.executionMode = executionMode;
		if(executionMode != null){
			putQueryParameter("ExecutionMode", executionMode);
		}
	}

	public List<PreferenceParameters> getPreferenceParameters() {
		return this.preferenceParameters;
	}

	public void setPreferenceParameters(List<PreferenceParameters> preferenceParameters) {
		this.preferenceParameters = preferenceParameters;	
		if (preferenceParameters != null) {
			putQueryParameter("PreferenceParameters" , new Gson().toJson(preferenceParameters));
		}	
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
		}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
		}
	}

	public SourceTag getSourceTag() {
		return this.sourceTag;
	}

	public void setSourceTag(SourceTag sourceTag) {
		this.sourceTag = sourceTag;	
		if (sourceTag != null) {
			putQueryParameter("SourceTag" , new Gson().toJson(sourceTag));
		}	
	}

	public String getLogicalIdStrategy() {
		return this.logicalIdStrategy;
	}

	public void setLogicalIdStrategy(String logicalIdStrategy) {
		this.logicalIdStrategy = logicalIdStrategy;
		if(logicalIdStrategy != null){
			putQueryParameter("LogicalIdStrategy", logicalIdStrategy);
		}
	}

	public SourceResourceGroup getSourceResourceGroup() {
		return this.sourceResourceGroup;
	}

	public void setSourceResourceGroup(SourceResourceGroup sourceResourceGroup) {
		this.sourceResourceGroup = sourceResourceGroup;	
		if (sourceResourceGroup != null) {
			putQueryParameter("SourceResourceGroup" , new Gson().toJson(sourceResourceGroup));
		}	
	}

	public String getTemplateScratchType() {
		return this.templateScratchType;
	}

	public void setTemplateScratchType(String templateScratchType) {
		this.templateScratchType = templateScratchType;
		if(templateScratchType != null){
			putQueryParameter("TemplateScratchType", templateScratchType);
		}
	}

	public static class SourceResources {

		@SerializedName("ResourceId")
		private String resourceId;

		@SerializedName("RegionId")
		private String regionId;

		@SerializedName("ResourceType")
		private String resourceType;

		public String getResourceId() {
			return this.resourceId;
		}

		public void setResourceId(String resourceId) {
			this.resourceId = resourceId;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getResourceType() {
			return this.resourceType;
		}

		public void setResourceType(String resourceType) {
			this.resourceType = resourceType;
		}
	}

	public static class Tags {

		private String value;

		private String key;

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public String getKey() {
			return this.key;
		}

		public void setKey(String key) {
			this.key = key;
		}
	}

	public static class PreferenceParameters {

		@SerializedName("ParameterValue")
		private String parameterValue;

		@SerializedName("ParameterKey")
		private String parameterKey;

		public String getParameterValue() {
			return this.parameterValue;
		}

		public void setParameterValue(String parameterValue) {
			this.parameterValue = parameterValue;
		}

		public String getParameterKey() {
			return this.parameterKey;
		}

		public void setParameterKey(String parameterKey) {
			this.parameterKey = parameterKey;
		}
	}

	public static class SourceTag {

		@SerializedName("ResourceTags")
		private Map<String,String> resourceTags;

		@SerializedName("ResourceTypeFilter")
		private List<String> resourceTypeFilter;

		public Map<String,String> getResourceTags() {
			return this.resourceTags;
		}

		public void setResourceTags(Map<String,String> resourceTags) {
			this.resourceTags = resourceTags;
		}

		public List<String> getResourceTypeFilter() {
			return this.resourceTypeFilter;
		}

		public void setResourceTypeFilter(List<String> resourceTypeFilter) {
			this.resourceTypeFilter = resourceTypeFilter;
		}
	}

	public static class SourceResourceGroup {

		@SerializedName("ResourceGroupId")
		private String resourceGroupId;

		@SerializedName("ResourceTypeFilter")
		private List<String> resourceTypeFilter;

		public String getResourceGroupId() {
			return this.resourceGroupId;
		}

		public void setResourceGroupId(String resourceGroupId) {
			this.resourceGroupId = resourceGroupId;
		}

		public List<String> getResourceTypeFilter() {
			return this.resourceTypeFilter;
		}

		public void setResourceTypeFilter(List<String> resourceTypeFilter) {
			this.resourceTypeFilter = resourceTypeFilter;
		}
	}

	@Override
	public Class<CreateTemplateScratchResponse> getResponseClass() {
		return CreateTemplateScratchResponse.class;
	}

}
