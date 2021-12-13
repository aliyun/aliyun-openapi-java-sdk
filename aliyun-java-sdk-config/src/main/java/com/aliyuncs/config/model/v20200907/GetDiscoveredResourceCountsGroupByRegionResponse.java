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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.config.transform.v20200907.GetDiscoveredResourceCountsGroupByRegionResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetDiscoveredResourceCountsGroupByRegionResponse extends AcsResponse {

	private String requestId;

	private List<GroupedResourceCount> discoveredResourceCountsSummary;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<GroupedResourceCount> getDiscoveredResourceCountsSummary() {
		return this.discoveredResourceCountsSummary;
	}

	public void setDiscoveredResourceCountsSummary(List<GroupedResourceCount> discoveredResourceCountsSummary) {
		this.discoveredResourceCountsSummary = discoveredResourceCountsSummary;
	}

	public static class GroupedResourceCount {

		private Long resourceCount;

		private String groupName;

		private String region;

		public Long getResourceCount() {
			return this.resourceCount;
		}

		public void setResourceCount(Long resourceCount) {
			this.resourceCount = resourceCount;
		}

		public String getGroupName() {
			return this.groupName;
		}

		public void setGroupName(String groupName) {
			this.groupName = groupName;
		}

		public String getRegion() {
			return this.region;
		}

		public void setRegion(String region) {
			this.region = region;
		}
	}

	@Override
	public GetDiscoveredResourceCountsGroupByRegionResponse getInstance(UnmarshallerContext context) {
		return	GetDiscoveredResourceCountsGroupByRegionResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
