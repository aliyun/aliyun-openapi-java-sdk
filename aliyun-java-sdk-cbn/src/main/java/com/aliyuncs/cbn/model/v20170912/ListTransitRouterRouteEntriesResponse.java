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

package com.aliyuncs.cbn.model.v20170912;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cbn.transform.v20170912.ListTransitRouterRouteEntriesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListTransitRouterRouteEntriesResponse extends AcsResponse {

	private Integer maxResults;

	private String nextToken;

	private String requestId;

	private Integer totalCount;

	private List<TransitRouterRouteEntry> transitRouterRouteEntries;

	public Integer getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
	}

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

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<TransitRouterRouteEntry> getTransitRouterRouteEntries() {
		return this.transitRouterRouteEntries;
	}

	public void setTransitRouterRouteEntries(List<TransitRouterRouteEntry> transitRouterRouteEntries) {
		this.transitRouterRouteEntries = transitRouterRouteEntries;
	}

	public static class TransitRouterRouteEntry {

		private String transitRouterRouteEntryDescription;

		private String transitRouterRouteEntryDestinationCidrBlock;

		private String transitRouterRouteEntryId;

		private String transitRouterRouteEntryName;

		private String transitRouterRouteEntryNextHopId;

		private String transitRouterRouteEntryNextHopType;

		private String transitRouterRouteEntryStatus;

		private String transitRouterRouteEntryType;

		private String createTime;

		public String getTransitRouterRouteEntryDescription() {
			return this.transitRouterRouteEntryDescription;
		}

		public void setTransitRouterRouteEntryDescription(String transitRouterRouteEntryDescription) {
			this.transitRouterRouteEntryDescription = transitRouterRouteEntryDescription;
		}

		public String getTransitRouterRouteEntryDestinationCidrBlock() {
			return this.transitRouterRouteEntryDestinationCidrBlock;
		}

		public void setTransitRouterRouteEntryDestinationCidrBlock(String transitRouterRouteEntryDestinationCidrBlock) {
			this.transitRouterRouteEntryDestinationCidrBlock = transitRouterRouteEntryDestinationCidrBlock;
		}

		public String getTransitRouterRouteEntryId() {
			return this.transitRouterRouteEntryId;
		}

		public void setTransitRouterRouteEntryId(String transitRouterRouteEntryId) {
			this.transitRouterRouteEntryId = transitRouterRouteEntryId;
		}

		public String getTransitRouterRouteEntryName() {
			return this.transitRouterRouteEntryName;
		}

		public void setTransitRouterRouteEntryName(String transitRouterRouteEntryName) {
			this.transitRouterRouteEntryName = transitRouterRouteEntryName;
		}

		public String getTransitRouterRouteEntryNextHopId() {
			return this.transitRouterRouteEntryNextHopId;
		}

		public void setTransitRouterRouteEntryNextHopId(String transitRouterRouteEntryNextHopId) {
			this.transitRouterRouteEntryNextHopId = transitRouterRouteEntryNextHopId;
		}

		public String getTransitRouterRouteEntryNextHopType() {
			return this.transitRouterRouteEntryNextHopType;
		}

		public void setTransitRouterRouteEntryNextHopType(String transitRouterRouteEntryNextHopType) {
			this.transitRouterRouteEntryNextHopType = transitRouterRouteEntryNextHopType;
		}

		public String getTransitRouterRouteEntryStatus() {
			return this.transitRouterRouteEntryStatus;
		}

		public void setTransitRouterRouteEntryStatus(String transitRouterRouteEntryStatus) {
			this.transitRouterRouteEntryStatus = transitRouterRouteEntryStatus;
		}

		public String getTransitRouterRouteEntryType() {
			return this.transitRouterRouteEntryType;
		}

		public void setTransitRouterRouteEntryType(String transitRouterRouteEntryType) {
			this.transitRouterRouteEntryType = transitRouterRouteEntryType;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}
	}

	@Override
	public ListTransitRouterRouteEntriesResponse getInstance(UnmarshallerContext context) {
		return	ListTransitRouterRouteEntriesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
