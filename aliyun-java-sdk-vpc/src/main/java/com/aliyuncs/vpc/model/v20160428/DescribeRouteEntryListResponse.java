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
import com.aliyuncs.vpc.transform.v20160428.DescribeRouteEntryListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeRouteEntryListResponse extends AcsResponse {

	private String requestId;

	private String nextToken;

	private List<RouteEntry> routeEntrys;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public List<RouteEntry> getRouteEntrys() {
		return this.routeEntrys;
	}

	public void setRouteEntrys(List<RouteEntry> routeEntrys) {
		this.routeEntrys = routeEntrys;
	}

	public static class RouteEntry {

		private String routeTableId;

		private String destinationCidrBlock;

		private String type;

		private String routeEntryId;

		private String routeEntryName;

		private String status;

		private String ipVersion;

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

		public String getRouteEntryId() {
			return this.routeEntryId;
		}

		public void setRouteEntryId(String routeEntryId) {
			this.routeEntryId = routeEntryId;
		}

		public String getRouteEntryName() {
			return this.routeEntryName;
		}

		public void setRouteEntryName(String routeEntryName) {
			this.routeEntryName = routeEntryName;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getIpVersion() {
			return this.ipVersion;
		}

		public void setIpVersion(String ipVersion) {
			this.ipVersion = ipVersion;
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

			private NextHopRelatedInfo nextHopRelatedInfo;

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

			public NextHopRelatedInfo getNextHopRelatedInfo() {
				return this.nextHopRelatedInfo;
			}

			public void setNextHopRelatedInfo(NextHopRelatedInfo nextHopRelatedInfo) {
				this.nextHopRelatedInfo = nextHopRelatedInfo;
			}

			public static class NextHopRelatedInfo {

				private String instanceType;

				private String regionId;

				private String instanceId;

				public String getInstanceType() {
					return this.instanceType;
				}

				public void setInstanceType(String instanceType) {
					this.instanceType = instanceType;
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
			}
		}
	}

	@Override
	public DescribeRouteEntryListResponse getInstance(UnmarshallerContext context) {
		return	DescribeRouteEntryListResponseUnmarshaller.unmarshall(this, context);
	}
}
