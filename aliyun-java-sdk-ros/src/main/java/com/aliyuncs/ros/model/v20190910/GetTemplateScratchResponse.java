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

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ros.transform.v20190910.GetTemplateScratchResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetTemplateScratchResponse extends AcsResponse {

	private String requestId;

	private TemplateScratch templateScratch;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public TemplateScratch getTemplateScratch() {
		return this.templateScratch;
	}

	public void setTemplateScratch(TemplateScratch templateScratch) {
		this.templateScratch = templateScratch;
	}

	public static class TemplateScratch {

		private String templateScratchId;

		private String templateScratchType;

		private String status;

		private String statusReason;

		private String failedCode;

		private Map<Object,Object> templateScratchData;

		private String description;

		private String logicalIdStrategy;

		private String createTime;

		private String updateTime;

		private List<PreferenceParameter> preferenceParameters;

		private List<SourceResource> sourceResources;

		private List<Stack> stacks;

		private SourceTag sourceTag;

		private SourceResourceGroup sourceResourceGroup;

		private StackProvision stackProvision;

		public String getTemplateScratchId() {
			return this.templateScratchId;
		}

		public void setTemplateScratchId(String templateScratchId) {
			this.templateScratchId = templateScratchId;
		}

		public String getTemplateScratchType() {
			return this.templateScratchType;
		}

		public void setTemplateScratchType(String templateScratchType) {
			this.templateScratchType = templateScratchType;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getStatusReason() {
			return this.statusReason;
		}

		public void setStatusReason(String statusReason) {
			this.statusReason = statusReason;
		}

		public String getFailedCode() {
			return this.failedCode;
		}

		public void setFailedCode(String failedCode) {
			this.failedCode = failedCode;
		}

		public Map<Object,Object> getTemplateScratchData() {
			return this.templateScratchData;
		}

		public void setTemplateScratchData(Map<Object,Object> templateScratchData) {
			this.templateScratchData = templateScratchData;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getLogicalIdStrategy() {
			return this.logicalIdStrategy;
		}

		public void setLogicalIdStrategy(String logicalIdStrategy) {
			this.logicalIdStrategy = logicalIdStrategy;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getUpdateTime() {
			return this.updateTime;
		}

		public void setUpdateTime(String updateTime) {
			this.updateTime = updateTime;
		}

		public List<PreferenceParameter> getPreferenceParameters() {
			return this.preferenceParameters;
		}

		public void setPreferenceParameters(List<PreferenceParameter> preferenceParameters) {
			this.preferenceParameters = preferenceParameters;
		}

		public List<SourceResource> getSourceResources() {
			return this.sourceResources;
		}

		public void setSourceResources(List<SourceResource> sourceResources) {
			this.sourceResources = sourceResources;
		}

		public List<Stack> getStacks() {
			return this.stacks;
		}

		public void setStacks(List<Stack> stacks) {
			this.stacks = stacks;
		}

		public SourceTag getSourceTag() {
			return this.sourceTag;
		}

		public void setSourceTag(SourceTag sourceTag) {
			this.sourceTag = sourceTag;
		}

		public SourceResourceGroup getSourceResourceGroup() {
			return this.sourceResourceGroup;
		}

		public void setSourceResourceGroup(SourceResourceGroup sourceResourceGroup) {
			this.sourceResourceGroup = sourceResourceGroup;
		}

		public StackProvision getStackProvision() {
			return this.stackProvision;
		}

		public void setStackProvision(StackProvision stackProvision) {
			this.stackProvision = stackProvision;
		}

		public static class PreferenceParameter {

			private String parameterKey;

			private String parameterValue;

			public String getParameterKey() {
				return this.parameterKey;
			}

			public void setParameterKey(String parameterKey) {
				this.parameterKey = parameterKey;
			}

			public String getParameterValue() {
				return this.parameterValue;
			}

			public void setParameterValue(String parameterValue) {
				this.parameterValue = parameterValue;
			}
		}

		public static class SourceResource {

			private String resourceId;

			private String resourceType;

			public String getResourceId() {
				return this.resourceId;
			}

			public void setResourceId(String resourceId) {
				this.resourceId = resourceId;
			}

			public String getResourceType() {
				return this.resourceType;
			}

			public void setResourceType(String resourceType) {
				this.resourceType = resourceType;
			}
		}

		public static class Stack {

			private String stackId;

			private String regionId;

			private String usageType;

			public String getStackId() {
				return this.stackId;
			}

			public void setStackId(String stackId) {
				this.stackId = stackId;
			}

			public String getRegionId() {
				return this.regionId;
			}

			public void setRegionId(String regionId) {
				this.regionId = regionId;
			}

			public String getUsageType() {
				return this.usageType;
			}

			public void setUsageType(String usageType) {
				this.usageType = usageType;
			}
		}

		public static class SourceTag {

			private Map<Object,Object> resourceTags;

			private List<String> resourceTypeFilter;

			public Map<Object,Object> getResourceTags() {
				return this.resourceTags;
			}

			public void setResourceTags(Map<Object,Object> resourceTags) {
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

			private String resourceGroupId;

			private List<String> resourceTypeFilter1;

			public String getResourceGroupId() {
				return this.resourceGroupId;
			}

			public void setResourceGroupId(String resourceGroupId) {
				this.resourceGroupId = resourceGroupId;
			}

			public List<String> getResourceTypeFilter1() {
				return this.resourceTypeFilter1;
			}

			public void setResourceTypeFilter1(List<String> resourceTypeFilter1) {
				this.resourceTypeFilter1 = resourceTypeFilter1;
			}
		}

		public static class StackProvision {

			private Boolean creatable;

			private Boolean importable;

			public Boolean getCreatable() {
				return this.creatable;
			}

			public void setCreatable(Boolean creatable) {
				this.creatable = creatable;
			}

			public Boolean getImportable() {
				return this.importable;
			}

			public void setImportable(Boolean importable) {
				this.importable = importable;
			}
		}
	}

	@Override
	public GetTemplateScratchResponse getInstance(UnmarshallerContext context) {
		return	GetTemplateScratchResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
