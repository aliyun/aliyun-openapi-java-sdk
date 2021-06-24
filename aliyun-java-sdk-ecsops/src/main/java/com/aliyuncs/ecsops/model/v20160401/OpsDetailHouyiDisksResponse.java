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

package com.aliyuncs.ecsops.model.v20160401;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsops.transform.v20160401.OpsDetailHouyiDisksResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsDetailHouyiDisksResponse extends AcsResponse {

	private Integer totalCount;

	private String nextToken;

	private Integer pageSize;

	private String requestId;

	private Integer pageNumber;

	private List<DiskItem> diskSet;

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

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

	public List<DiskItem> getDiskSet() {
		return this.diskSet;
	}

	public void setDiskSet(List<DiskItem> diskSet) {
		this.diskSet = diskSet;
	}

	public static class DiskItem {

		private String status;

		private String bpsR;

		private String bpsW;

		private String availableZoneId;

		private String diskSize;

		private String diskType;

		private String diskId;

		private String instanceId;

		private String iops;

		private String driver;

		private String bps;

		private String iopsR;

		private String iopsW;

		private String device;

		private String diskName;

		private String zoneId;

		private String serialNumber;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getBpsR() {
			return this.bpsR;
		}

		public void setBpsR(String bpsR) {
			this.bpsR = bpsR;
		}

		public String getBpsW() {
			return this.bpsW;
		}

		public void setBpsW(String bpsW) {
			this.bpsW = bpsW;
		}

		public String getAvailableZoneId() {
			return this.availableZoneId;
		}

		public void setAvailableZoneId(String availableZoneId) {
			this.availableZoneId = availableZoneId;
		}

		public String getDiskSize() {
			return this.diskSize;
		}

		public void setDiskSize(String diskSize) {
			this.diskSize = diskSize;
		}

		public String getDiskType() {
			return this.diskType;
		}

		public void setDiskType(String diskType) {
			this.diskType = diskType;
		}

		public String getDiskId() {
			return this.diskId;
		}

		public void setDiskId(String diskId) {
			this.diskId = diskId;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getIops() {
			return this.iops;
		}

		public void setIops(String iops) {
			this.iops = iops;
		}

		public String getDriver() {
			return this.driver;
		}

		public void setDriver(String driver) {
			this.driver = driver;
		}

		public String getBps() {
			return this.bps;
		}

		public void setBps(String bps) {
			this.bps = bps;
		}

		public String getIopsR() {
			return this.iopsR;
		}

		public void setIopsR(String iopsR) {
			this.iopsR = iopsR;
		}

		public String getIopsW() {
			return this.iopsW;
		}

		public void setIopsW(String iopsW) {
			this.iopsW = iopsW;
		}

		public String getDevice() {
			return this.device;
		}

		public void setDevice(String device) {
			this.device = device;
		}

		public String getDiskName() {
			return this.diskName;
		}

		public void setDiskName(String diskName) {
			this.diskName = diskName;
		}

		public String getZoneId() {
			return this.zoneId;
		}

		public void setZoneId(String zoneId) {
			this.zoneId = zoneId;
		}

		public String getSerialNumber() {
			return this.serialNumber;
		}

		public void setSerialNumber(String serialNumber) {
			this.serialNumber = serialNumber;
		}
	}

	@Override
	public OpsDetailHouyiDisksResponse getInstance(UnmarshallerContext context) {
		return	OpsDetailHouyiDisksResponseUnmarshaller.unmarshall(this, context);
	}
}
