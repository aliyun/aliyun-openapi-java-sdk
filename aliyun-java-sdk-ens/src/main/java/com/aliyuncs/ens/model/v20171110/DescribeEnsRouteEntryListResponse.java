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

package com.aliyuncs.ens.model.v20171110;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ens.transform.v20171110.DescribeEnsRouteEntryListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeEnsRouteEntryListResponse extends AcsResponse {

	private String requestId;

	private Integer pageNumber;

	private Integer pageSize;

	private Integer totalCount;

	private List<RouteEntry> routeEntrys;

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

	public List<RouteEntry> getRouteEntrys() {
		return this.routeEntrys;
	}

	public void setRouteEntrys(List<RouteEntry> routeEntrys) {
		this.routeEntrys = routeEntrys;
	}

	public static class RouteEntry {

		private String status;

		private String type;

		private String description;

		private String routeEntryName;

		private String destinationCidrBlock;

		private String routeEntryId;

		private String routeTableId;

		private List<NextHop> nextHops;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getRouteEntryName() {
			return this.routeEntryName;
		}

		public void setRouteEntryName(String routeEntryName) {
			this.routeEntryName = routeEntryName;
		}

		public String getDestinationCidrBlock() {
			return this.destinationCidrBlock;
		}

		public void setDestinationCidrBlock(String destinationCidrBlock) {
			this.destinationCidrBlock = destinationCidrBlock;
		}

		public String getRouteEntryId() {
			return this.routeEntryId;
		}

		public void setRouteEntryId(String routeEntryId) {
			this.routeEntryId = routeEntryId;
		}

		public String getRouteTableId() {
			return this.routeTableId;
		}

		public void setRouteTableId(String routeTableId) {
			this.routeTableId = routeTableId;
		}

		public List<NextHop> getNextHops() {
			return this.nextHops;
		}

		public void setNextHops(List<NextHop> nextHops) {
			this.nextHops = nextHops;
		}

		public static class NextHop {

			private String nextHopId;

			private String nextHopType;

			public String getNextHopId() {
				return this.nextHopId;
			}

			public void setNextHopId(String nextHopId) {
				this.nextHopId = nextHopId;
			}

			public String getNextHopType() {
				return this.nextHopType;
			}

			public void setNextHopType(String nextHopType) {
				this.nextHopType = nextHopType;
			}
		}
	}

	@Override
	public DescribeEnsRouteEntryListResponse getInstance(UnmarshallerContext context) {
		return	DescribeEnsRouteEntryListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
