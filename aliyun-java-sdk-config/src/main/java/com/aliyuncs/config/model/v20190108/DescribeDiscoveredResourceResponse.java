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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.config.transform.v20190108.DescribeDiscoveredResourceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDiscoveredResourceResponse extends AcsResponse {

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

		private Long accountId;

		private String resourceId;

		private String resourceType;

		private String resourceName;

		private String region;

		private String availabilityZone;

		private Long resourceCreationTime;

		private String resourceStatus;

		private Integer resourceDeleted;

		private String tags;

		private String configuration;

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

		public String getResourceType() {
			return this.resourceType;
		}

		public void setResourceType(String resourceType) {
			this.resourceType = resourceType;
		}

		public String getResourceName() {
			return this.resourceName;
		}

		public void setResourceName(String resourceName) {
			this.resourceName = resourceName;
		}

		public String getRegion() {
			return this.region;
		}

		public void setRegion(String region) {
			this.region = region;
		}

		public String getAvailabilityZone() {
			return this.availabilityZone;
		}

		public void setAvailabilityZone(String availabilityZone) {
			this.availabilityZone = availabilityZone;
		}

		public Long getResourceCreationTime() {
			return this.resourceCreationTime;
		}

		public void setResourceCreationTime(Long resourceCreationTime) {
			this.resourceCreationTime = resourceCreationTime;
		}

		public String getResourceStatus() {
			return this.resourceStatus;
		}

		public void setResourceStatus(String resourceStatus) {
			this.resourceStatus = resourceStatus;
		}

		public Integer getResourceDeleted() {
			return this.resourceDeleted;
		}

		public void setResourceDeleted(Integer resourceDeleted) {
			this.resourceDeleted = resourceDeleted;
		}

		public String getTags() {
			return this.tags;
		}

		public void setTags(String tags) {
			this.tags = tags;
		}

		public String getConfiguration() {
			return this.configuration;
		}

		public void setConfiguration(String configuration) {
			this.configuration = configuration;
		}
	}

	@Override
	public DescribeDiscoveredResourceResponse getInstance(UnmarshallerContext context) {
		return	DescribeDiscoveredResourceResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
