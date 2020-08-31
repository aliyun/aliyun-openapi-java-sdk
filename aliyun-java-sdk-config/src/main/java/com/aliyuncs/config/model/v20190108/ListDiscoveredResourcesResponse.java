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

package com.aliyuncs.config.model.v20190108;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.config.transform.v20190108.ListDiscoveredResourcesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListDiscoveredResourcesResponse extends AcsResponse {

	private String requestId;

	private DiscoveredResourceProfiles discoveredResourceProfiles;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public DiscoveredResourceProfiles getDiscoveredResourceProfiles() {
		return this.discoveredResourceProfiles;
	}

	public void setDiscoveredResourceProfiles(DiscoveredResourceProfiles discoveredResourceProfiles) {
		this.discoveredResourceProfiles = discoveredResourceProfiles;
	}

	public static class DiscoveredResourceProfiles {

		private Integer pageNumber;

		private Integer pageSize;

		private Integer totalCount;

		private List<DiscoveredResourceProfile> discoveredResourceProfileList;

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

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
		}

		public List<DiscoveredResourceProfile> getDiscoveredResourceProfileList() {
			return this.discoveredResourceProfileList;
		}

		public void setDiscoveredResourceProfileList(List<DiscoveredResourceProfile> discoveredResourceProfileList) {
			this.discoveredResourceProfileList = discoveredResourceProfileList;
		}

		public static class DiscoveredResourceProfile {

			private Long accountId;

			private String region;

			private Long resourceCreationTime;

			private Integer resourceDeleted;

			private String resourceId;

			private String resourceName;

			private String resourceStatus;

			private String resourceType;

			private String tags;

			public Long getAccountId() {
				return this.accountId;
			}

			public void setAccountId(Long accountId) {
				this.accountId = accountId;
			}

			public String getRegion() {
				return this.region;
			}

			public void setRegion(String region) {
				this.region = region;
			}

			public Long getResourceCreationTime() {
				return this.resourceCreationTime;
			}

			public void setResourceCreationTime(Long resourceCreationTime) {
				this.resourceCreationTime = resourceCreationTime;
			}

			public Integer getResourceDeleted() {
				return this.resourceDeleted;
			}

			public void setResourceDeleted(Integer resourceDeleted) {
				this.resourceDeleted = resourceDeleted;
			}

			public String getResourceId() {
				return this.resourceId;
			}

			public void setResourceId(String resourceId) {
				this.resourceId = resourceId;
			}

			public String getResourceName() {
				return this.resourceName;
			}

			public void setResourceName(String resourceName) {
				this.resourceName = resourceName;
			}

			public String getResourceStatus() {
				return this.resourceStatus;
			}

			public void setResourceStatus(String resourceStatus) {
				this.resourceStatus = resourceStatus;
			}

			public String getResourceType() {
				return this.resourceType;
			}

			public void setResourceType(String resourceType) {
				this.resourceType = resourceType;
			}

			public String getTags() {
				return this.tags;
			}

			public void setTags(String tags) {
				this.tags = tags;
			}
		}
	}

	@Override
	public ListDiscoveredResourcesResponse getInstance(UnmarshallerContext context) {
		return	ListDiscoveredResourcesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
