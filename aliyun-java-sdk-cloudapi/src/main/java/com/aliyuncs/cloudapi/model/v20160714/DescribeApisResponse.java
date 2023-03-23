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

package com.aliyuncs.cloudapi.model.v20160714;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloudapi.transform.v20160714.DescribeApisResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeApisResponse extends AcsResponse {

	private Integer pageNumber;

	private String requestId;

	private Integer pageSize;

	private Integer totalCount;

	private List<ApiSummary> apiSummarys;

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<ApiSummary> getApiSummarys() {
		return this.apiSummarys;
	}

	public void setApiSummarys(List<ApiSummary> apiSummarys) {
		this.apiSummarys = apiSummarys;
	}

	public static class ApiSummary {

		private String visibility;

		private String apiId;

		private String modifiedTime;

		private String description;

		private String groupName;

		private String groupId;

		private String createdTime;

		private String apiName;

		private String regionId;

		private String apiPath;

		private String apiMethod;

		private List<DeployedInfo> deployedInfos;

		private List<Tag> tagList;

		public String getVisibility() {
			return this.visibility;
		}

		public void setVisibility(String visibility) {
			this.visibility = visibility;
		}

		public String getApiId() {
			return this.apiId;
		}

		public void setApiId(String apiId) {
			this.apiId = apiId;
		}

		public String getModifiedTime() {
			return this.modifiedTime;
		}

		public void setModifiedTime(String modifiedTime) {
			this.modifiedTime = modifiedTime;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getGroupName() {
			return this.groupName;
		}

		public void setGroupName(String groupName) {
			this.groupName = groupName;
		}

		public String getGroupId() {
			return this.groupId;
		}

		public void setGroupId(String groupId) {
			this.groupId = groupId;
		}

		public String getCreatedTime() {
			return this.createdTime;
		}

		public void setCreatedTime(String createdTime) {
			this.createdTime = createdTime;
		}

		public String getApiName() {
			return this.apiName;
		}

		public void setApiName(String apiName) {
			this.apiName = apiName;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getApiPath() {
			return this.apiPath;
		}

		public void setApiPath(String apiPath) {
			this.apiPath = apiPath;
		}

		public String getApiMethod() {
			return this.apiMethod;
		}

		public void setApiMethod(String apiMethod) {
			this.apiMethod = apiMethod;
		}

		public List<DeployedInfo> getDeployedInfos() {
			return this.deployedInfos;
		}

		public void setDeployedInfos(List<DeployedInfo> deployedInfos) {
			this.deployedInfos = deployedInfos;
		}

		public List<Tag> getTagList() {
			return this.tagList;
		}

		public void setTagList(List<Tag> tagList) {
			this.tagList = tagList;
		}

		public static class DeployedInfo {

			private String stageName;

			private String effectiveVersion;

			private String deployedStatus;

			public String getStageName() {
				return this.stageName;
			}

			public void setStageName(String stageName) {
				this.stageName = stageName;
			}

			public String getEffectiveVersion() {
				return this.effectiveVersion;
			}

			public void setEffectiveVersion(String effectiveVersion) {
				this.effectiveVersion = effectiveVersion;
			}

			public String getDeployedStatus() {
				return this.deployedStatus;
			}

			public void setDeployedStatus(String deployedStatus) {
				this.deployedStatus = deployedStatus;
			}
		}

		public static class Tag {

			private String tagKey;

			private String tagValue;

			public String getTagKey() {
				return this.tagKey;
			}

			public void setTagKey(String tagKey) {
				this.tagKey = tagKey;
			}

			public String getTagValue() {
				return this.tagValue;
			}

			public void setTagValue(String tagValue) {
				this.tagValue = tagValue;
			}
		}
	}

	@Override
	public DescribeApisResponse getInstance(UnmarshallerContext context) {
		return	DescribeApisResponseUnmarshaller.unmarshall(this, context);
	}
}
