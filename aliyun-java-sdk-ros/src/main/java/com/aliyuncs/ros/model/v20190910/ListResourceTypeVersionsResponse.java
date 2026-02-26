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
import com.aliyuncs.ros.transform.v20190910.ListResourceTypeVersionsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListResourceTypeVersionsResponse extends AcsResponse {

	private String requestId;

	private List<ResourceTypeVersion> resourceTypeVersions;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ResourceTypeVersion> getResourceTypeVersions() {
		return this.resourceTypeVersions;
	}

	public void setResourceTypeVersions(List<ResourceTypeVersion> resourceTypeVersions) {
		this.resourceTypeVersions = resourceTypeVersions;
	}

	public static class ResourceTypeVersion {

		private String provider;

		private String entityType;

		private String resourceType;

		private Boolean isDefaultVersion;

		private String createTime;

		private String updateTime;

		private String versionId;

		private String description;

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

		public Boolean getIsDefaultVersion() {
			return this.isDefaultVersion;
		}

		public void setIsDefaultVersion(Boolean isDefaultVersion) {
			this.isDefaultVersion = isDefaultVersion;
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

		public String getVersionId() {
			return this.versionId;
		}

		public void setVersionId(String versionId) {
			this.versionId = versionId;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}
	}

	@Override
	public ListResourceTypeVersionsResponse getInstance(UnmarshallerContext context) {
		return	ListResourceTypeVersionsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
