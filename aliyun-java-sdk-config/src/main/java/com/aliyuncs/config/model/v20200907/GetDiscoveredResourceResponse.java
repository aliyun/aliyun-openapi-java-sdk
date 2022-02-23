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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.config.transform.v20200907.GetDiscoveredResourceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetDiscoveredResourceResponse extends AcsResponse {

	private String requestId;

	private DiscoveredResourceDetail discoveredResourceDetail;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public DiscoveredResourceDetail getDiscoveredResourceDetail() {
		return this.discoveredResourceDetail;
	}

	public void setDiscoveredResourceDetail(DiscoveredResourceDetail discoveredResourceDetail) {
		this.discoveredResourceDetail = discoveredResourceDetail;
	}

	public static class DiscoveredResourceDetail {

		private String availabilityZone;

		private String resourceType;

		private String configuration;

		private String region;

		private Long resourceCreationTime;

		private String tags;

		private Long accountId;

		private String resourceId;

		private Integer resourceDeleted;

		private String resourceName;

		private String resourceStatus;

		public String getAvailabilityZone() {
			return this.availabilityZone;
		}

		public void setAvailabilityZone(String availabilityZone) {
			this.availabilityZone = availabilityZone;
		}

		public String getResourceType() {
			return this.resourceType;
		}

		public void setResourceType(String resourceType) {
			this.resourceType = resourceType;
		}

		public String getConfiguration() {
			return this.configuration;
		}

		public void setConfiguration(String configuration) {
			this.configuration = configuration;
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

		public String getTags() {
			return this.tags;
		}

		public void setTags(String tags) {
			this.tags = tags;
		}

		public Long getAccountId() {
			return this.accountId;
		}

		public void setAccountId(Long accountId) {
			this.accountId = accountId;
		}

		public String getResourceId() {
			return this.resourceId;
		}

		public void setResourceId(String resourceId) {
			this.resourceId = resourceId;
		}

		public Integer getResourceDeleted() {
			return this.resourceDeleted;
		}

		public void setResourceDeleted(Integer resourceDeleted) {
			this.resourceDeleted = resourceDeleted;
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
	}

	@Override
	public GetDiscoveredResourceResponse getInstance(UnmarshallerContext context) {
		return	GetDiscoveredResourceResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
