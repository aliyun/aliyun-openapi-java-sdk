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

package com.aliyuncs.r_kvstore.model.v20150101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.r_kvstore.transform.v20150101.DescribeUserClusterHostResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeUserClusterHostResponse extends AcsResponse {

	private String requestId;

	private String maxRecordsPerPage;

	private Integer pageNumber;

	private Integer totalRecords;

	private Integer itemNumbers;

	private List<HostInfo> hostItems;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getMaxRecordsPerPage() {
		return this.maxRecordsPerPage;
	}

	public void setMaxRecordsPerPage(String maxRecordsPerPage) {
		this.maxRecordsPerPage = maxRecordsPerPage;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getTotalRecords() {
		return this.totalRecords;
	}

	public void setTotalRecords(Integer totalRecords) {
		this.totalRecords = totalRecords;
	}

	public Integer getItemNumbers() {
		return this.itemNumbers;
	}

	public void setItemNumbers(Integer itemNumbers) {
		this.itemNumbers = itemNumbers;
	}

	public List<HostInfo> getHostItems() {
		return this.hostItems;
	}

	public void setHostItems(List<HostInfo> hostItems) {
		this.hostItems = hostItems;
	}

	public static class HostInfo {

		private String clusterId;

		private String hostId;

		private String engine;

		private String hostIP;

		private String hostStatus;

		private String allocationStatus;

		private String hostCpu;

		private String hostMem;

		private String hostStorage;

		private String hostName;

		private Integer id;

		private String createTime;

		private String instanceNumber;

		private String regionId;

		private String zoneId;

		private String hostClass;

		private String expireTime;

		private String chargeType;

		public String getClusterId() {
			return this.clusterId;
		}

		public void setClusterId(String clusterId) {
			this.clusterId = clusterId;
		}

		public String getHostId() {
			return this.hostId;
		}

		public void setHostId(String hostId) {
			this.hostId = hostId;
		}

		public String getEngine() {
			return this.engine;
		}

		public void setEngine(String engine) {
			this.engine = engine;
		}

		public String getHostIP() {
			return this.hostIP;
		}

		public void setHostIP(String hostIP) {
			this.hostIP = hostIP;
		}

		public String getHostStatus() {
			return this.hostStatus;
		}

		public void setHostStatus(String hostStatus) {
			this.hostStatus = hostStatus;
		}

		public String getAllocationStatus() {
			return this.allocationStatus;
		}

		public void setAllocationStatus(String allocationStatus) {
			this.allocationStatus = allocationStatus;
		}

		public String getHostCpu() {
			return this.hostCpu;
		}

		public void setHostCpu(String hostCpu) {
			this.hostCpu = hostCpu;
		}

		public String getHostMem() {
			return this.hostMem;
		}

		public void setHostMem(String hostMem) {
			this.hostMem = hostMem;
		}

		public String getHostStorage() {
			return this.hostStorage;
		}

		public void setHostStorage(String hostStorage) {
			this.hostStorage = hostStorage;
		}

		public String getHostName() {
			return this.hostName;
		}

		public void setHostName(String hostName) {
			this.hostName = hostName;
		}

		public Integer getId() {
			return this.id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getInstanceNumber() {
			return this.instanceNumber;
		}

		public void setInstanceNumber(String instanceNumber) {
			this.instanceNumber = instanceNumber;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getZoneId() {
			return this.zoneId;
		}

		public void setZoneId(String zoneId) {
			this.zoneId = zoneId;
		}

		public String getHostClass() {
			return this.hostClass;
		}

		public void setHostClass(String hostClass) {
			this.hostClass = hostClass;
		}

		public String getExpireTime() {
			return this.expireTime;
		}

		public void setExpireTime(String expireTime) {
			this.expireTime = expireTime;
		}

		public String getChargeType() {
			return this.chargeType;
		}

		public void setChargeType(String chargeType) {
			this.chargeType = chargeType;
		}
	}

	@Override
	public DescribeUserClusterHostResponse getInstance(UnmarshallerContext context) {
		return	DescribeUserClusterHostResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
