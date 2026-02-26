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
import com.aliyuncs.ros.transform.v20190910.ListTemplateScratchesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListTemplateScratchesResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private Integer pageNumber;

	private Integer pageSize;

	private List<TemplateScratch> templateScratches;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public List<TemplateScratch> getTemplateScratches() {
		return this.templateScratches;
	}

	public void setTemplateScratches(List<TemplateScratch> templateScratches) {
		this.templateScratches = templateScratches;
	}

	public static class TemplateScratch {

		private String templateScratchId;

		private String templateScratchType;

		private String status;

		private String statusReason;

		private String failedCode;

		private String description;

		private String logicalIdStrategy;

		private String createTime;

		private String updateTime;

		private String resourceGroupId;

		private List<PreferenceParameter> preferenceParameters;

		private List<SourceResource> sourceResources;

		private List<TagsItem> tags;

		private SourceTag sourceTag;

		private SourceResourceGroup sourceResourceGroup;

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

		public String getResourceGroupId() {
			return this.resourceGroupId;
		}

		public void setResourceGroupId(String resourceGroupId) {
			this.resourceGroupId = resourceGroupId;
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

		public List<TagsItem> getTags() {
			return this.tags;
		}

		public void setTags(List<TagsItem> tags) {
			this.tags = tags;
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

		public static class TagsItem {

			private String key;

			private String value;

			public String getKey() {
				return this.key;
			}

			public void setKey(String key) {
				this.key = key;
			}

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
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
	}

	@Override
	public ListTemplateScratchesResponse getInstance(UnmarshallerContext context) {
		return	ListTemplateScratchesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
