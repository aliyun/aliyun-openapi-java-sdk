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
import com.aliyuncs.config.transform.v20190108.GetResourceComplianceTimelineResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetResourceComplianceTimelineResponse extends AcsResponse {

	private String requestId;

	private ResourceComplianceTimeline resourceComplianceTimeline;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public ResourceComplianceTimeline getResourceComplianceTimeline() {
		return this.resourceComplianceTimeline;
	}

	public void setResourceComplianceTimeline(ResourceComplianceTimeline resourceComplianceTimeline) {
		this.resourceComplianceTimeline = resourceComplianceTimeline;
	}

	public static class ResourceComplianceTimeline {

		private Integer limit;

		private Long totalCount;

		private String nextToken;

		private List<ComplianceListItem> complianceList;

		public Integer getLimit() {
			return this.limit;
		}

		public void setLimit(Integer limit) {
			this.limit = limit;
		}

		public Long getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Long totalCount) {
			this.totalCount = totalCount;
		}

		public String getNextToken() {
			return this.nextToken;
		}

		public void setNextToken(String nextToken) {
			this.nextToken = nextToken;
		}

		public List<ComplianceListItem> getComplianceList() {
			return this.complianceList;
		}

		public void setComplianceList(List<ComplianceListItem> complianceList) {
			this.complianceList = complianceList;
		}

		public static class ComplianceListItem {

			private String accountId;

			private String availabilityZone;

			private Long captureTime;

			private String configuration;

			private String configurationDiff;

			private String region;

			private Long resourceCreateTime;

			private String resourceId;

			private String resourceName;

			private String resourceStatus;

			private String resourceType;

			private String tags;

			public String getAccountId() {
				return this.accountId;
			}

			public void setAccountId(String accountId) {
				this.accountId = accountId;
			}

			public String getAvailabilityZone() {
				return this.availabilityZone;
			}

			public void setAvailabilityZone(String availabilityZone) {
				this.availabilityZone = availabilityZone;
			}

			public Long getCaptureTime() {
				return this.captureTime;
			}

			public void setCaptureTime(Long captureTime) {
				this.captureTime = captureTime;
			}

			public String getConfiguration() {
				return this.configuration;
			}

			public void setConfiguration(String configuration) {
				this.configuration = configuration;
			}

			public String getConfigurationDiff() {
				return this.configurationDiff;
			}

			public void setConfigurationDiff(String configurationDiff) {
				this.configurationDiff = configurationDiff;
			}

			public String getRegion() {
				return this.region;
			}

			public void setRegion(String region) {
				this.region = region;
			}

			public Long getResourceCreateTime() {
				return this.resourceCreateTime;
			}

			public void setResourceCreateTime(Long resourceCreateTime) {
				this.resourceCreateTime = resourceCreateTime;
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
	public GetResourceComplianceTimelineResponse getInstance(UnmarshallerContext context) {
		return	GetResourceComplianceTimelineResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
