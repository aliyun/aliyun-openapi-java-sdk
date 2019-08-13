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
import com.aliyuncs.emr.transform.v20160408.ListClusterHostGroupResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListClusterHostGroupResponse extends AcsResponse {

	private String requestId;

	private Integer pageNumber;

	private Integer pageSize;

	private Integer total;

	private String clusterId;

	private List<HostGroup> hostGroupList;

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

	public Integer getTotal() {
		return this.total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public String getClusterId() {
		return this.clusterId;
	}

	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
	}

	public List<HostGroup> getHostGroupList() {
		return this.hostGroupList;
	}

	public void setHostGroupList(List<HostGroup> hostGroupList) {
		this.hostGroupList = hostGroupList;
	}

	public static class HostGroup {

		private String hostGroupId;

		private String hostGroupName;

		private String hostGroupType;

		private String hostGroupSubType;

		private String instanceType;

		private String systemDiskType;

		private Integer systemDiskSize;

		private Integer systemDiskCount;

		private String dataDiskType;

		private Integer dataDiskSize;

		private Integer dataDiskCount;

		private Integer cpu;

		private Integer memory;

		private String status;

		private String lockType;

		private String lockReason;

		private String payType;

		private String chargeType;

		private Integer nodeCount;

		private String vswitchId;

		private String comment;

		private String securityGroupId;

		private String gmtCreate;

		private String gmtModified;

		private String hostGroupChangeType;

		private String hostGroupChangeStatus;

		public String getHostGroupId() {
			return this.hostGroupId;
		}

		public void setHostGroupId(String hostGroupId) {
			this.hostGroupId = hostGroupId;
		}

		public String getHostGroupName() {
			return this.hostGroupName;
		}

		public void setHostGroupName(String hostGroupName) {
			this.hostGroupName = hostGroupName;
		}

		public String getHostGroupType() {
			return this.hostGroupType;
		}

		public void setHostGroupType(String hostGroupType) {
			this.hostGroupType = hostGroupType;
		}

		public String getHostGroupSubType() {
			return this.hostGroupSubType;
		}

		public void setHostGroupSubType(String hostGroupSubType) {
			this.hostGroupSubType = hostGroupSubType;
		}

		public String getInstanceType() {
			return this.instanceType;
		}

		public void setInstanceType(String instanceType) {
			this.instanceType = instanceType;
		}

		public String getSystemDiskType() {
			return this.systemDiskType;
		}

		public void setSystemDiskType(String systemDiskType) {
			this.systemDiskType = systemDiskType;
		}

		public Integer getSystemDiskSize() {
			return this.systemDiskSize;
		}

		public void setSystemDiskSize(Integer systemDiskSize) {
			this.systemDiskSize = systemDiskSize;
		}

		public Integer getSystemDiskCount() {
			return this.systemDiskCount;
		}

		public void setSystemDiskCount(Integer systemDiskCount) {
			this.systemDiskCount = systemDiskCount;
		}

		public String getDataDiskType() {
			return this.dataDiskType;
		}

		public void setDataDiskType(String dataDiskType) {
			this.dataDiskType = dataDiskType;
		}

		public Integer getDataDiskSize() {
			return this.dataDiskSize;
		}

		public void setDataDiskSize(Integer dataDiskSize) {
			this.dataDiskSize = dataDiskSize;
		}

		public Integer getDataDiskCount() {
			return this.dataDiskCount;
		}

		public void setDataDiskCount(Integer dataDiskCount) {
			this.dataDiskCount = dataDiskCount;
		}

		public Integer getCpu() {
			return this.cpu;
		}

		public void setCpu(Integer cpu) {
			this.cpu = cpu;
		}

		public Integer getMemory() {
			return this.memory;
		}

		public void setMemory(Integer memory) {
			this.memory = memory;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getLockType() {
			return this.lockType;
		}

		public void setLockType(String lockType) {
			this.lockType = lockType;
		}

		public String getLockReason() {
			return this.lockReason;
		}

		public void setLockReason(String lockReason) {
			this.lockReason = lockReason;
		}

		public String getPayType() {
			return this.payType;
		}

		public void setPayType(String payType) {
			this.payType = payType;
		}

		public String getChargeType() {
			return this.chargeType;
		}

		public void setChargeType(String chargeType) {
			this.chargeType = chargeType;
		}

		public Integer getNodeCount() {
			return this.nodeCount;
		}

		public void setNodeCount(Integer nodeCount) {
			this.nodeCount = nodeCount;
		}

		public String getVswitchId() {
			return this.vswitchId;
		}

		public void setVswitchId(String vswitchId) {
			this.vswitchId = vswitchId;
		}

		public String getComment() {
			return this.comment;
		}

		public void setComment(String comment) {
			this.comment = comment;
		}

		public String getSecurityGroupId() {
			return this.securityGroupId;
		}

		public void setSecurityGroupId(String securityGroupId) {
			this.securityGroupId = securityGroupId;
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

		public String getHostGroupChangeType() {
			return this.hostGroupChangeType;
		}

		public void setHostGroupChangeType(String hostGroupChangeType) {
			this.hostGroupChangeType = hostGroupChangeType;
		}

		public String getHostGroupChangeStatus() {
			return this.hostGroupChangeStatus;
		}

		public void setHostGroupChangeStatus(String hostGroupChangeStatus) {
			this.hostGroupChangeStatus = hostGroupChangeStatus;
		}
	}

	@Override
	public ListClusterHostGroupResponse getInstance(UnmarshallerContext context) {
		return	ListClusterHostGroupResponseUnmarshaller.unmarshall(this, context);
	}
}
