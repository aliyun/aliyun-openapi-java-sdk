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

package com.aliyuncs.oos.model.v20190601;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.oos.transform.v20190601.ListApplicationGroupsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListApplicationGroupsResponse extends AcsResponse {

	private String nextToken;

	private String requestId;

	private Integer maxResults;

	private List<ApplicationGroup> applicationGroups;

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
	}

	public List<ApplicationGroup> getApplicationGroups() {
		return this.applicationGroups;
	}

	public void setApplicationGroups(List<ApplicationGroup> applicationGroups) {
		this.applicationGroups = applicationGroups;
	}

	public static class ApplicationGroup {

		private String cmsGroupId;

		private String deployRegionId;

		private String updateDate;

		private String description;

		private String importTagKey;

		private String applicationName;

		private String importTagValue;

		private String name;

		private String createDate;

		private String status;

		private String deployParameters;

		private String statusReason;

		public String getCmsGroupId() {
			return this.cmsGroupId;
		}

		public void setCmsGroupId(String cmsGroupId) {
			this.cmsGroupId = cmsGroupId;
		}

		public String getDeployRegionId() {
			return this.deployRegionId;
		}

		public void setDeployRegionId(String deployRegionId) {
			this.deployRegionId = deployRegionId;
		}

		public String getUpdateDate() {
			return this.updateDate;
		}

		public void setUpdateDate(String updateDate) {
			this.updateDate = updateDate;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getImportTagKey() {
			return this.importTagKey;
		}

		public void setImportTagKey(String importTagKey) {
			this.importTagKey = importTagKey;
		}

		public String getApplicationName() {
			return this.applicationName;
		}

		public void setApplicationName(String applicationName) {
			this.applicationName = applicationName;
		}

		public String getImportTagValue() {
			return this.importTagValue;
		}

		public void setImportTagValue(String importTagValue) {
			this.importTagValue = importTagValue;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getCreateDate() {
			return this.createDate;
		}

		public void setCreateDate(String createDate) {
			this.createDate = createDate;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getDeployParameters() {
			return this.deployParameters;
		}

		public void setDeployParameters(String deployParameters) {
			this.deployParameters = deployParameters;
		}

		public String getStatusReason() {
			return this.statusReason;
		}

		public void setStatusReason(String statusReason) {
			this.statusReason = statusReason;
		}
	}

	@Override
	public ListApplicationGroupsResponse getInstance(UnmarshallerContext context) {
		return	ListApplicationGroupsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
