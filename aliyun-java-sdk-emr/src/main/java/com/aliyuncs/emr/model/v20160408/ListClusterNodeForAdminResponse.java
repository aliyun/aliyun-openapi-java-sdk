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

package com.aliyuncs.emr.model.v20160408;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.emr.transform.v20160408.ListClusterNodeForAdminResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListClusterNodeForAdminResponse extends AcsResponse {

	private String requestId;

	private List<ClusterNode> clusterNodeList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ClusterNode> getClusterNodeList() {
		return this.clusterNodeList;
	}

	public void setClusterNodeList(List<ClusterNode> clusterNodeList) {
		this.clusterNodeList = clusterNodeList;
	}

	public static class ClusterNode {

		private String clusterId;

		private String cpuCore;

		private String daemons;

		private String diskDevices;

		private String diskInfo;

		private String diskType;

		private String gmtCreate;

		private String gmtModified;

		private String hostName;

		private String id;

		private String imageId;

		private String innerIpAddress;

		private String instanceId;

		private String instanceType;

		private String isMaster;

		private String memCapacity;

		private String payment;

		private String publicIpAddress;

		private String regionId;

		private String securityGroupId;

		private String serialNumber;

		private String status;

		private String userId;

		private String zoneId;

		public String getClusterId() {
			return this.clusterId;
		}

		public void setClusterId(String clusterId) {
			this.clusterId = clusterId;
		}

		public String getCpuCore() {
			return this.cpuCore;
		}

		public void setCpuCore(String cpuCore) {
			this.cpuCore = cpuCore;
		}

		public String getDaemons() {
			return this.daemons;
		}

		public void setDaemons(String daemons) {
			this.daemons = daemons;
		}

		public String getDiskDevices() {
			return this.diskDevices;
		}

		public void setDiskDevices(String diskDevices) {
			this.diskDevices = diskDevices;
		}

		public String getDiskInfo() {
			return this.diskInfo;
		}

		public void setDiskInfo(String diskInfo) {
			this.diskInfo = diskInfo;
		}

		public String getDiskType() {
			return this.diskType;
		}

		public void setDiskType(String diskType) {
			this.diskType = diskType;
		}

		public String getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(String gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public String getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(String gmtModified) {
			this.gmtModified = gmtModified;
		}

		public String getHostName() {
			return this.hostName;
		}

		public void setHostName(String hostName) {
			this.hostName = hostName;
		}

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getImageId() {
			return this.imageId;
		}

		public void setImageId(String imageId) {
			this.imageId = imageId;
		}

		public String getInnerIpAddress() {
			return this.innerIpAddress;
		}

		public void setInnerIpAddress(String innerIpAddress) {
			this.innerIpAddress = innerIpAddress;
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

		public String getIsMaster() {
			return this.isMaster;
		}

		public void setIsMaster(String isMaster) {
			this.isMaster = isMaster;
		}

		public String getMemCapacity() {
			return this.memCapacity;
		}

		public void setMemCapacity(String memCapacity) {
			this.memCapacity = memCapacity;
		}

		public String getPayment() {
			return this.payment;
		}

		public void setPayment(String payment) {
			this.payment = payment;
		}

		public String getPublicIpAddress() {
			return this.publicIpAddress;
		}

		public void setPublicIpAddress(String publicIpAddress) {
			this.publicIpAddress = publicIpAddress;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getSecurityGroupId() {
			return this.securityGroupId;
		}

		public void setSecurityGroupId(String securityGroupId) {
			this.securityGroupId = securityGroupId;
		}

		public String getSerialNumber() {
			return this.serialNumber;
		}

		public void setSerialNumber(String serialNumber) {
			this.serialNumber = serialNumber;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getUserId() {
			return this.userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}

		public String getZoneId() {
			return this.zoneId;
		}

		public void setZoneId(String zoneId) {
			this.zoneId = zoneId;
		}
	}

	@Override
	public ListClusterNodeForAdminResponse getInstance(UnmarshallerContext context) {
		return	ListClusterNodeForAdminResponseUnmarshaller.unmarshall(this, context);
	}
}
