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
import com.aliyuncs.cbn.transform.v20170912.DescribeCenChildInstanceRouteEntriesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeCenChildInstanceRouteEntriesResponse extends AcsResponse {

	private Integer pageSize;

	private String requestId;

	private Integer pageNumber;

	private Integer totalCount;

	private List<CenRouteEntry> cenRouteEntries;

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

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

	public List<CenRouteEntry> getCenRouteEntries() {
		return this.cenRouteEntries;
	}

	public void setCenRouteEntries(List<CenRouteEntry> cenRouteEntries) {
		this.cenRouteEntries = cenRouteEntries;
	}

	public static class CenRouteEntry {

		private String status;

		private String type;

		private String publishStatus;

		private String nextHopType;

		private Boolean operationalMode;

		private String nextHopRegionId;

		private String nextHopInstanceId;

		private String destinationCidrBlock;

		private String routeTableId;

		private Long med;

		private String vpnTunnelIp;

		private String vpnTunnelId;

		private List<CenRouteMapRecord> cenRouteMapRecords;

		private List<Conflict> conflicts;

		private List<String> communities;

		private List<String> asPaths;

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

		public String getPublishStatus() {
			return this.publishStatus;
		}

		public void setPublishStatus(String publishStatus) {
			this.publishStatus = publishStatus;
		}

		public String getNextHopType() {
			return this.nextHopType;
		}

		public void setNextHopType(String nextHopType) {
			this.nextHopType = nextHopType;
		}

		public Boolean getOperationalMode() {
			return this.operationalMode;
		}

		public void setOperationalMode(Boolean operationalMode) {
			this.operationalMode = operationalMode;
		}

		public String getNextHopRegionId() {
			return this.nextHopRegionId;
		}

		public void setNextHopRegionId(String nextHopRegionId) {
			this.nextHopRegionId = nextHopRegionId;
		}

		public String getNextHopInstanceId() {
			return this.nextHopInstanceId;
		}

		public void setNextHopInstanceId(String nextHopInstanceId) {
			this.nextHopInstanceId = nextHopInstanceId;
		}

		public String getDestinationCidrBlock() {
			return this.destinationCidrBlock;
		}

		public void setDestinationCidrBlock(String destinationCidrBlock) {
			this.destinationCidrBlock = destinationCidrBlock;
		}

		public String getRouteTableId() {
			return this.routeTableId;
		}

		public void setRouteTableId(String routeTableId) {
			this.routeTableId = routeTableId;
		}

		public Long getMed() {
			return this.med;
		}

		public void setMed(Long med) {
			this.med = med;
		}

		public String getVpnTunnelIp() {
			return this.vpnTunnelIp;
		}

		public void setVpnTunnelIp(String vpnTunnelIp) {
			this.vpnTunnelIp = vpnTunnelIp;
		}

		public String getVpnTunnelId() {
			return this.vpnTunnelId;
		}

		public void setVpnTunnelId(String vpnTunnelId) {
			this.vpnTunnelId = vpnTunnelId;
		}

		public List<CenRouteMapRecord> getCenRouteMapRecords() {
			return this.cenRouteMapRecords;
		}

		public void setCenRouteMapRecords(List<CenRouteMapRecord> cenRouteMapRecords) {
			this.cenRouteMapRecords = cenRouteMapRecords;
		}

		public List<Conflict> getConflicts() {
			return this.conflicts;
		}

		public void setConflicts(List<Conflict> conflicts) {
			this.conflicts = conflicts;
		}

		public List<String> getCommunities() {
			return this.communities;
		}

		public void setCommunities(List<String> communities) {
			this.communities = communities;
		}

		public List<String> getAsPaths() {
			return this.asPaths;
		}

		public void setAsPaths(List<String> asPaths) {
			this.asPaths = asPaths;
		}

		public static class CenRouteMapRecord {

			private String routeMapId;

			private String regionId;

			public String getRouteMapId() {
				return this.routeMapId;
			}

			public void setRouteMapId(String routeMapId) {
				this.routeMapId = routeMapId;
			}

			public String getRegionId() {
				return this.regionId;
			}

			public void setRegionId(String regionId) {
				this.regionId = regionId;
			}
		}

		public static class Conflict {

			private String status;

			private String destinationCidrBlock;

			private String instanceId;

			private String instanceType;

			private String regionId;

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getDestinationCidrBlock() {
				return this.destinationCidrBlock;
			}

			public void setDestinationCidrBlock(String destinationCidrBlock) {
				this.destinationCidrBlock = destinationCidrBlock;
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

			public String getRegionId() {
				return this.regionId;
			}

			public void setRegionId(String regionId) {
				this.regionId = regionId;
			}
		}
	}

	@Override
	public DescribeCenChildInstanceRouteEntriesResponse getInstance(UnmarshallerContext context) {
		return	DescribeCenChildInstanceRouteEntriesResponseUnmarshaller.unmarshall(this, context);
	}
}
