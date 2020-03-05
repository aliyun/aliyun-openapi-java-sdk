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
import com.aliyuncs.cbn.transform.v20170912.DescribeCenRegionDomainRouteEntriesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeCenRegionDomainRouteEntriesResponse extends AcsResponse {

	private String requestId;

	private Integer pageNumber;

	private Integer totalCount;

	private Integer pageSize;

	private List<CenRouteEntry> cenRouteEntries;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public List<CenRouteEntry> getCenRouteEntries() {
		return this.cenRouteEntries;
	}

	public void setCenRouteEntries(List<CenRouteEntry> cenRouteEntries) {
		this.cenRouteEntries = cenRouteEntries;
	}

	public static class CenRouteEntry {

		private String destinationCidrBlock;

		private String type;

		private String nextHopInstanceId;

		private String nextHopType;

		private String nextHopRegionId;

		private String status;

		private String toOtherRegionStatus;

		private Integer preference;

		private List<CenRouteMapRecord> cenRouteMapRecords;

		private List<CenOutRouteMapRecord> cenOutRouteMapRecords;

		private List<String> asPaths;

		private List<String> communities;

		public String getDestinationCidrBlock() {
			return this.destinationCidrBlock;
		}

		public void setDestinationCidrBlock(String destinationCidrBlock) {
			this.destinationCidrBlock = destinationCidrBlock;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getNextHopInstanceId() {
			return this.nextHopInstanceId;
		}

		public void setNextHopInstanceId(String nextHopInstanceId) {
			this.nextHopInstanceId = nextHopInstanceId;
		}

		public String getNextHopType() {
			return this.nextHopType;
		}

		public void setNextHopType(String nextHopType) {
			this.nextHopType = nextHopType;
		}

		public String getNextHopRegionId() {
			return this.nextHopRegionId;
		}

		public void setNextHopRegionId(String nextHopRegionId) {
			this.nextHopRegionId = nextHopRegionId;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getToOtherRegionStatus() {
			return this.toOtherRegionStatus;
		}

		public void setToOtherRegionStatus(String toOtherRegionStatus) {
			this.toOtherRegionStatus = toOtherRegionStatus;
		}

		public Integer getPreference() {
			return this.preference;
		}

		public void setPreference(Integer preference) {
			this.preference = preference;
		}

		public List<CenRouteMapRecord> getCenRouteMapRecords() {
			return this.cenRouteMapRecords;
		}

		public void setCenRouteMapRecords(List<CenRouteMapRecord> cenRouteMapRecords) {
			this.cenRouteMapRecords = cenRouteMapRecords;
		}

		public List<CenOutRouteMapRecord> getCenOutRouteMapRecords() {
			return this.cenOutRouteMapRecords;
		}

		public void setCenOutRouteMapRecords(List<CenOutRouteMapRecord> cenOutRouteMapRecords) {
			this.cenOutRouteMapRecords = cenOutRouteMapRecords;
		}

		public List<String> getAsPaths() {
			return this.asPaths;
		}

		public void setAsPaths(List<String> asPaths) {
			this.asPaths = asPaths;
		}

		public List<String> getCommunities() {
			return this.communities;
		}

		public void setCommunities(List<String> communities) {
			this.communities = communities;
		}

		public static class CenRouteMapRecord {

			private String regionId;

			private String routeMapId;

			public String getRegionId() {
				return this.regionId;
			}

			public void setRegionId(String regionId) {
				this.regionId = regionId;
			}

			public String getRouteMapId() {
				return this.routeMapId;
			}

			public void setRouteMapId(String routeMapId) {
				this.routeMapId = routeMapId;
			}
		}

		public static class CenOutRouteMapRecord {

			private String regionId;

			private String routeMapId;

			public String getRegionId() {
				return this.regionId;
			}

			public void setRegionId(String regionId) {
				this.regionId = regionId;
			}

			public String getRouteMapId() {
				return this.routeMapId;
			}

			public void setRouteMapId(String routeMapId) {
				this.routeMapId = routeMapId;
			}
		}
	}

	@Override
	public DescribeCenRegionDomainRouteEntriesResponse getInstance(UnmarshallerContext context) {
		return	DescribeCenRegionDomainRouteEntriesResponseUnmarshaller.unmarshall(this, context);
	}
}
