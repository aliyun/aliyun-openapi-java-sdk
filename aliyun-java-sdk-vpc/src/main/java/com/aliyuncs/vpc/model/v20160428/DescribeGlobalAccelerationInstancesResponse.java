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
import com.aliyuncs.vpc.transform.v20160428.DescribeGlobalAccelerationInstancesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeGlobalAccelerationInstancesResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private Integer pageNumber;

	private Integer pageSize;

	private List<GlobalAccelerationInstance> globalAccelerationInstances;

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

	public List<GlobalAccelerationInstance> getGlobalAccelerationInstances() {
		return this.globalAccelerationInstances;
	}

	public void setGlobalAccelerationInstances(List<GlobalAccelerationInstance> globalAccelerationInstances) {
		this.globalAccelerationInstances = globalAccelerationInstances;
	}

	public static class GlobalAccelerationInstance {

		private String regionId;

		private String globalAccelerationInstanceId;

		private String ipAddress;

		private String status;

		private String bandwidth;

		private String internetChargeType;

		private String chargeType;

		private String bandwidthType;

		private String accelerationLocation;

		private String serviceLocation;

		private String name;

		private String description;

		private String expiredTime;

		private String creationTime;

		private List<LockReason> operationLocks;

		private List<BackendServer> backendServers;

		private List<PublicIpAddress> publicIpAddresses;

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getGlobalAccelerationInstanceId() {
			return this.globalAccelerationInstanceId;
		}

		public void setGlobalAccelerationInstanceId(String globalAccelerationInstanceId) {
			this.globalAccelerationInstanceId = globalAccelerationInstanceId;
		}

		public String getIpAddress() {
			return this.ipAddress;
		}

		public void setIpAddress(String ipAddress) {
			this.ipAddress = ipAddress;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getBandwidth() {
			return this.bandwidth;
		}

		public void setBandwidth(String bandwidth) {
			this.bandwidth = bandwidth;
		}

		public String getInternetChargeType() {
			return this.internetChargeType;
		}

		public void setInternetChargeType(String internetChargeType) {
			this.internetChargeType = internetChargeType;
		}

		public String getChargeType() {
			return this.chargeType;
		}

		public void setChargeType(String chargeType) {
			this.chargeType = chargeType;
		}

		public String getBandwidthType() {
			return this.bandwidthType;
		}

		public void setBandwidthType(String bandwidthType) {
			this.bandwidthType = bandwidthType;
		}

		public String getAccelerationLocation() {
			return this.accelerationLocation;
		}

		public void setAccelerationLocation(String accelerationLocation) {
			this.accelerationLocation = accelerationLocation;
		}

		public String getServiceLocation() {
			return this.serviceLocation;
		}

		public void setServiceLocation(String serviceLocation) {
			this.serviceLocation = serviceLocation;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getExpiredTime() {
			return this.expiredTime;
		}

		public void setExpiredTime(String expiredTime) {
			this.expiredTime = expiredTime;
		}

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public List<LockReason> getOperationLocks() {
			return this.operationLocks;
		}

		public void setOperationLocks(List<LockReason> operationLocks) {
			this.operationLocks = operationLocks;
		}

		public List<BackendServer> getBackendServers() {
			return this.backendServers;
		}

		public void setBackendServers(List<BackendServer> backendServers) {
			this.backendServers = backendServers;
		}

		public List<PublicIpAddress> getPublicIpAddresses() {
			return this.publicIpAddresses;
		}

		public void setPublicIpAddresses(List<PublicIpAddress> publicIpAddresses) {
			this.publicIpAddresses = publicIpAddresses;
		}

		public static class LockReason {

			private String lockReason;

			public String getLockReason() {
				return this.lockReason;
			}

			public void setLockReason(String lockReason) {
				this.lockReason = lockReason;
			}
		}

		public static class BackendServer {

			private String regionId;

			private String serverId;

			private String serverIpAddress;

			private String serverType;

			public String getRegionId() {
				return this.regionId;
			}

			public void setRegionId(String regionId) {
				this.regionId = regionId;
			}

			public String getServerId() {
				return this.serverId;
			}

			public void setServerId(String serverId) {
				this.serverId = serverId;
			}

			public String getServerIpAddress() {
				return this.serverIpAddress;
			}

			public void setServerIpAddress(String serverIpAddress) {
				this.serverIpAddress = serverIpAddress;
			}

			public String getServerType() {
				return this.serverType;
			}

			public void setServerType(String serverType) {
				this.serverType = serverType;
			}
		}

		public static class PublicIpAddress {

			private String allocationId;

			private String ipAddress;

			public String getAllocationId() {
				return this.allocationId;
			}

			public void setAllocationId(String allocationId) {
				this.allocationId = allocationId;
			}

			public String getIpAddress() {
				return this.ipAddress;
			}

			public void setIpAddress(String ipAddress) {
				this.ipAddress = ipAddress;
			}
		}
	}

	@Override
	public DescribeGlobalAccelerationInstancesResponse getInstance(UnmarshallerContext context) {
		return	DescribeGlobalAccelerationInstancesResponseUnmarshaller.unmarshall(this, context);
	}
}
