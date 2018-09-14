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
import com.aliyuncs.cbn.transform.v20170912.DescribePublishedRouteEntriesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribePublishedRouteEntriesResponse extends AcsResponse {

	private String requestId;

	private Integer pageNumber;

	private Integer totalCount;

	private Integer pageSize;

	private List<PublishedRouteEntry> publishedRouteEntries;

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

	public List<PublishedRouteEntry> getPublishedRouteEntries() {
		return this.publishedRouteEntries;
	}

	public void setPublishedRouteEntries(List<PublishedRouteEntry> publishedRouteEntries) {
		this.publishedRouteEntries = publishedRouteEntries;
	}

	public static class PublishedRouteEntry {

		private String destinationCidrBlock;

		private String childInstanceRouteTableId;

		private String nextHopType;

		private String routeType;

		private String nextHopId;

		private Boolean operationalMode;

		private String publishStatus;

		private List<Conflict> conflicts;

		public String getDestinationCidrBlock() {
			return this.destinationCidrBlock;
		}

		public void setDestinationCidrBlock(String destinationCidrBlock) {
			this.destinationCidrBlock = destinationCidrBlock;
		}

		public String getChildInstanceRouteTableId() {
			return this.childInstanceRouteTableId;
		}

		public void setChildInstanceRouteTableId(String childInstanceRouteTableId) {
			this.childInstanceRouteTableId = childInstanceRouteTableId;
		}

		public String getNextHopType() {
			return this.nextHopType;
		}

		public void setNextHopType(String nextHopType) {
			this.nextHopType = nextHopType;
		}

		public String getRouteType() {
			return this.routeType;
		}

		public void setRouteType(String routeType) {
			this.routeType = routeType;
		}

		public String getNextHopId() {
			return this.nextHopId;
		}

		public void setNextHopId(String nextHopId) {
			this.nextHopId = nextHopId;
		}

		public Boolean getOperationalMode() {
			return this.operationalMode;
		}

		public void setOperationalMode(Boolean operationalMode) {
			this.operationalMode = operationalMode;
		}

		public String getPublishStatus() {
			return this.publishStatus;
		}

		public void setPublishStatus(String publishStatus) {
			this.publishStatus = publishStatus;
		}

		public List<Conflict> getConflicts() {
			return this.conflicts;
		}

		public void setConflicts(List<Conflict> conflicts) {
			this.conflicts = conflicts;
		}

		public static class Conflict {

			private String destinationCidrBlock;

			private String regionId;

			private String instanceId;

			private String instanceType;

			private String status;

			public String getDestinationCidrBlock() {
				return this.destinationCidrBlock;
			}

			public void setDestinationCidrBlock(String destinationCidrBlock) {
				this.destinationCidrBlock = destinationCidrBlock;
			}

			public String getRegionId() {
				return this.regionId;
			}

			public void setRegionId(String regionId) {
				this.regionId = regionId;
			}

			public String getInstanceId() {
				return this.instanceId;
			}

			public void setInstanceId(String instanceId) {
				this.instanceId = instanceId;
			}

			public String getInstanceType() {
				return this.instanceType;
			}

			public void setInstanceType(String instanceType) {
				this.instanceType = instanceType;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}
		}
	}

	@Override
	public DescribePublishedRouteEntriesResponse getInstance(UnmarshallerContext context) {
		return	DescribePublishedRouteEntriesResponseUnmarshaller.unmarshall(this, context);
	}
}
