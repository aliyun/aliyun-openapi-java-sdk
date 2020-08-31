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
import com.aliyuncs.config.transform.v20190108.GetDiscoveredResourceCountsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetDiscoveredResourceCountsResponse extends AcsResponse {

	private String requestId;

	private GroupedResourceCounts groupedResourceCounts;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public GroupedResourceCounts getGroupedResourceCounts() {
		return this.groupedResourceCounts;
	}

	public void setGroupedResourceCounts(GroupedResourceCounts groupedResourceCounts) {
		this.groupedResourceCounts = groupedResourceCounts;
	}

	public static class GroupedResourceCounts {

		private String groupByKey;

		private List<GroupedResourceCount> groupedResourceCountList;

		public String getGroupByKey() {
			return this.groupByKey;
		}

		public void setGroupByKey(String groupByKey) {
			this.groupByKey = groupByKey;
		}

		public List<GroupedResourceCount> getGroupedResourceCountList() {
			return this.groupedResourceCountList;
		}

		public void setGroupedResourceCountList(List<GroupedResourceCount> groupedResourceCountList) {
			this.groupedResourceCountList = groupedResourceCountList;
		}

		public static class GroupedResourceCount {

			private String groupName;

			private Long resourceCount;

			public String getGroupName() {
				return this.groupName;
			}

			public void setGroupName(String groupName) {
				this.groupName = groupName;
			}

			public Long getResourceCount() {
				return this.resourceCount;
			}

			public void setResourceCount(Long resourceCount) {
				this.resourceCount = resourceCount;
			}
		}
	}

	@Override
	public GetDiscoveredResourceCountsResponse getInstance(UnmarshallerContext context) {
		return	GetDiscoveredResourceCountsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
