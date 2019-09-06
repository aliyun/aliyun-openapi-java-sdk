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

package com.aliyuncs.vpc.model.v20160428;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.vpc.transform.v20160428.DescribeRouteTablesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeRouteTablesResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private Integer pageNumber;

	private Integer pageSize;

	private List<RouteTable> routeTables;

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

	public List<RouteTable> getRouteTables() {
		return this.routeTables;
	}

	public void setRouteTables(List<RouteTable> routeTables) {
		this.routeTables = routeTables;
	}

	public static class RouteTable {

		private String vRouterId;

		private String routeTableId;

		private String routeTableType;

		private String creationTime;

		private String resourceGroupId;

		private String status;

		private List<RouteEntry> routeEntrys;

		private List<String> vSwitchIds;

		public String getVRouterId() {
			return this.vRouterId;
		}

		public void setVRouterId(String vRouterId) {
			this.vRouterId = vRouterId;
		}

		public String getRouteTableId() {
			return this.routeTableId;
		}

		public void setRouteTableId(String routeTableId) {
			this.routeTableId = routeTableId;
		}

		public String getRouteTableType() {
			return this.routeTableType;
		}

		public void setRouteTableType(String routeTableType) {
			this.routeTableType = routeTableType;
		}

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public String getResourceGroupId() {
			return this.resourceGroupId;
		}

		public void setResourceGroupId(String resourceGroupId) {
			this.resourceGroupId = resourceGroupId;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public List<RouteEntry> getRouteEntrys() {
			return this.routeEntrys;
		}

		public void setRouteEntrys(List<RouteEntry> routeEntrys) {
			this.routeEntrys = routeEntrys;
		}

		public List<String> getVSwitchIds() {
			return this.vSwitchIds;
		}

		public void setVSwitchIds(List<String> vSwitchIds) {
			this.vSwitchIds = vSwitchIds;
		}

		public static class RouteEntry {

			private String routeTableId;

			private String destinationCidrBlock;

			private String type;

			private String status;

			private String instanceId;

			private String nextHopType;

			private String routeEntryName;

			private String routeEntryId;

			private String nextHopRegionId;

			private String nextHopOppsiteType;

			private String nextHopOppsiteInstanceId;

			private String nextHopOppsiteRegionId;

			private String privateIpAddress;

			private List<NextHop> nextHops;

			public String getRouteTableId() {
				return this.routeTableId;
			}

			public void setRouteTableId(String routeTableId) {
				this.routeTableId = routeTableId;
			}

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

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getInstanceId() {
				return this.instanceId;
			}

			public void setInstanceId(String instanceId) {
				this.instanceId = instanceId;
			}

			public String getNextHopType() {
				return this.nextHopType;
			}

			public void setNextHopType(String nextHopType) {
				this.nextHopType = nextHopType;
			}

			public String getRouteEntryName() {
				return this.routeEntryName;
			}

			public void setRouteEntryName(String routeEntryName) {
				this.routeEntryName = routeEntryName;
			}

			public String getRouteEntryId() {
				return this.routeEntryId;
			}

			public void setRouteEntryId(String routeEntryId) {
				this.routeEntryId = routeEntryId;
			}

			public String getNextHopRegionId() {
				return this.nextHopRegionId;
			}

			public void setNextHopRegionId(String nextHopRegionId) {
				this.nextHopRegionId = nextHopRegionId;
			}

			public String getNextHopOppsiteType() {
				return this.nextHopOppsiteType;
			}

			public void setNextHopOppsiteType(String nextHopOppsiteType) {
				this.nextHopOppsiteType = nextHopOppsiteType;
			}

			public String getNextHopOppsiteInstanceId() {
				return this.nextHopOppsiteInstanceId;
			}

			public void setNextHopOppsiteInstanceId(String nextHopOppsiteInstanceId) {
				this.nextHopOppsiteInstanceId = nextHopOppsiteInstanceId;
			}

			public String getNextHopOppsiteRegionId() {
				return this.nextHopOppsiteRegionId;
			}

			public void setNextHopOppsiteRegionId(String nextHopOppsiteRegionId) {
				this.nextHopOppsiteRegionId = nextHopOppsiteRegionId;
			}

			public String getPrivateIpAddress() {
				return this.privateIpAddress;
			}

			public void setPrivateIpAddress(String privateIpAddress) {
				this.privateIpAddress = privateIpAddress;
			}

			public List<NextHop> getNextHops() {
				return this.nextHops;
			}

			public void setNextHops(List<NextHop> nextHops) {
				this.nextHops = nextHops;
			}

			public static class NextHop {

				private String nextHopType;

				private String nextHopId;

				private Integer enabled;

				private Integer weight;

				private String nextHopRegionId;

				private String nextHopOppsiteType;

				private String nextHopOppsiteInstanceId;

				private String nextHopOppsiteRegionId;

				public String getNextHopType() {
					return this.nextHopType;
				}

				public void setNextHopType(String nextHopType) {
					this.nextHopType = nextHopType;
				}

				public String getNextHopId() {
					return this.nextHopId;
				}

				public void setNextHopId(String nextHopId) {
					this.nextHopId = nextHopId;
				}

				public Integer getEnabled() {
					return this.enabled;
				}

				public void setEnabled(Integer enabled) {
					this.enabled = enabled;
				}

				public Integer getWeight() {
					return this.weight;
				}

				public void setWeight(Integer weight) {
					this.weight = weight;
				}

				public String getNextHopRegionId() {
					return this.nextHopRegionId;
				}

				public void setNextHopRegionId(String nextHopRegionId) {
					this.nextHopRegionId = nextHopRegionId;
				}

				public String getNextHopOppsiteType() {
					return this.nextHopOppsiteType;
				}

				public void setNextHopOppsiteType(String nextHopOppsiteType) {
					this.nextHopOppsiteType = nextHopOppsiteType;
				}

				public String getNextHopOppsiteInstanceId() {
					return this.nextHopOppsiteInstanceId;
				}

				public void setNextHopOppsiteInstanceId(String nextHopOppsiteInstanceId) {
					this.nextHopOppsiteInstanceId = nextHopOppsiteInstanceId;
				}

				public String getNextHopOppsiteRegionId() {
					return this.nextHopOppsiteRegionId;
				}

				public void setNextHopOppsiteRegionId(String nextHopOppsiteRegionId) {
					this.nextHopOppsiteRegionId = nextHopOppsiteRegionId;
				}
			}
		}
	}

	@Override
	public DescribeRouteTablesResponse getInstance(UnmarshallerContext context) {
		return	DescribeRouteTablesResponseUnmarshaller.unmarshall(this, context);
	}
}
