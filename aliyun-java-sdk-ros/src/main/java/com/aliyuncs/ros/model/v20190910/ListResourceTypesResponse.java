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
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ros.transform.v20190910.ListResourceTypesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListResourceTypesResponse extends AcsResponse {

	private String requestId;

	private List<ResourceTypeSummarie> resourceTypeSummaries;

	private List<String> resourceTypes;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ResourceTypeSummarie> getResourceTypeSummaries() {
		return this.resourceTypeSummaries;
	}

	public void setResourceTypeSummaries(List<ResourceTypeSummarie> resourceTypeSummaries) {
		this.resourceTypeSummaries = resourceTypeSummaries;
	}

	public List<String> getResourceTypes() {
		return this.resourceTypes;
	}

	public void setResourceTypes(List<String> resourceTypes) {
		this.resourceTypes = resourceTypes;
	}

	public static class ResourceTypeSummarie {

		private String provider;

		private String entityType;

		private String resourceType;

		private String defaultVersionId;

		private String latestVersionId;

		private String createTime;

		private String updateTime;

		private String description;

		private Integer totalVersionCount;

		private Boolean reachVersionCountLimit;

		public String getProvider() {
			return this.provider;
		}

		public void setProvider(String provider) {
			this.provider = provider;
		}

		public String getEntityType() {
			return this.entityType;
		}

		public void setEntityType(String entityType) {
			this.entityType = entityType;
		}

		public String getResourceType() {
			return this.resourceType;
		}

		public void setResourceType(String resourceType) {
			this.resourceType = resourceType;
		}

		public String getDefaultVersionId() {
			return this.defaultVersionId;
		}

		public void setDefaultVersionId(String defaultVersionId) {
			this.defaultVersionId = defaultVersionId;
		}

		public String getLatestVersionId() {
			return this.latestVersionId;
		}

		public void setLatestVersionId(String latestVersionId) {
			this.latestVersionId = latestVersionId;
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

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public Integer getTotalVersionCount() {
			return this.totalVersionCount;
		}

		public void setTotalVersionCount(Integer totalVersionCount) {
			this.totalVersionCount = totalVersionCount;
		}

		public Boolean getReachVersionCountLimit() {
			return this.reachVersionCountLimit;
		}

		public void setReachVersionCountLimit(Boolean reachVersionCountLimit) {
			this.reachVersionCountLimit = reachVersionCountLimit;
		}
	}

	@Override
	public ListResourceTypesResponse getInstance(UnmarshallerContext context) {
		return	ListResourceTypesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
