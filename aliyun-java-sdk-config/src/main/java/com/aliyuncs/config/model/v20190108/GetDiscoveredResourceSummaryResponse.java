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
import com.aliyuncs.config.transform.v20190108.GetDiscoveredResourceSummaryResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetDiscoveredResourceSummaryResponse extends AcsResponse {

	private String requestId;

	private DiscoveredResourceSummary discoveredResourceSummary;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public DiscoveredResourceSummary getDiscoveredResourceSummary() {
		return this.discoveredResourceSummary;
	}

	public void setDiscoveredResourceSummary(DiscoveredResourceSummary discoveredResourceSummary) {
		this.discoveredResourceSummary = discoveredResourceSummary;
	}

	public static class DiscoveredResourceSummary {

		private Integer resourceCount;

		private Integer resourceTypeCount;

		private Integer regionCount;

		public Integer getResourceCount() {
			return this.resourceCount;
		}

		public void setResourceCount(Integer resourceCount) {
			this.resourceCount = resourceCount;
		}

		public Integer getResourceTypeCount() {
			return this.resourceTypeCount;
		}

		public void setResourceTypeCount(Integer resourceTypeCount) {
			this.resourceTypeCount = resourceTypeCount;
		}

		public Integer getRegionCount() {
			return this.regionCount;
		}

		public void setRegionCount(Integer regionCount) {
			this.regionCount = regionCount;
		}
	}

	@Override
	public GetDiscoveredResourceSummaryResponse getInstance(UnmarshallerContext context) {
		return	GetDiscoveredResourceSummaryResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
