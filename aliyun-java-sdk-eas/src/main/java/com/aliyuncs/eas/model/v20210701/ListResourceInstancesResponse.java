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

package com.aliyuncs.eas.model.v20210701;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.eas.transform.v20210701.ListResourceInstancesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListResourceInstancesResponse extends AcsResponse {

	private String requestId;

	private Integer pageNumber;

	private Integer pageSize;

	private Integer totalCount;

	private List<InstancesItem> instances;

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

	public List<InstancesItem> getInstances() {
		return this.instances;
	}

	public void setInstances(List<InstancesItem> instances) {
		this.instances = instances;
	}

	public static class InstancesItem {

		private String instanceId;

		private String instanceName;

		private String instanceIp;

		private String instanceStatus;

		private Integer instanceCpuCount;

		private Integer instanceGpuCount;

		private String instanceMemory;

		private String instanceGpuMemory;

		private Float instanceUsedCpu;

		private Integer instanceUsedGpu;

		private String instanceUsedMemory;

		private String instanceType;

		private String createTime;

		private String chargeType;

		private String expiredTime;

		private Boolean autoRenewal;

		private String arch;

		private String region;

		private String zone;

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getInstanceName() {
			return this.instanceName;
		}

		public void setInstanceName(String instanceName) {
			this.instanceName = instanceName;
		}

		public String getInstanceIp() {
			return this.instanceIp;
		}

		public void setInstanceIp(String instanceIp) {
			this.instanceIp = instanceIp;
		}

		public String getInstanceStatus() {
			return this.instanceStatus;
		}

		public void setInstanceStatus(String instanceStatus) {
			this.instanceStatus = instanceStatus;
		}

		public Integer getInstanceCpuCount() {
			return this.instanceCpuCount;
		}

		public void setInstanceCpuCount(Integer instanceCpuCount) {
			this.instanceCpuCount = instanceCpuCount;
		}

		public Integer getInstanceGpuCount() {
			return this.instanceGpuCount;
		}

		public void setInstanceGpuCount(Integer instanceGpuCount) {
			this.instanceGpuCount = instanceGpuCount;
		}

		public String getInstanceMemory() {
			return this.instanceMemory;
		}

		public void setInstanceMemory(String instanceMemory) {
			this.instanceMemory = instanceMemory;
		}

		public String getInstanceGpuMemory() {
			return this.instanceGpuMemory;
		}

		public void setInstanceGpuMemory(String instanceGpuMemory) {
			this.instanceGpuMemory = instanceGpuMemory;
		}

		public Float getInstanceUsedCpu() {
			return this.instanceUsedCpu;
		}

		public void setInstanceUsedCpu(Float instanceUsedCpu) {
			this.instanceUsedCpu = instanceUsedCpu;
		}

		public Integer getInstanceUsedGpu() {
			return this.instanceUsedGpu;
		}

		public void setInstanceUsedGpu(Integer instanceUsedGpu) {
			this.instanceUsedGpu = instanceUsedGpu;
		}

		public String getInstanceUsedMemory() {
			return this.instanceUsedMemory;
		}

		public void setInstanceUsedMemory(String instanceUsedMemory) {
			this.instanceUsedMemory = instanceUsedMemory;
		}

		public String getInstanceType() {
			return this.instanceType;
		}

		public void setInstanceType(String instanceType) {
			this.instanceType = instanceType;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getChargeType() {
			return this.chargeType;
		}

		public void setChargeType(String chargeType) {
			this.chargeType = chargeType;
		}

		public String getExpiredTime() {
			return this.expiredTime;
		}

		public void setExpiredTime(String expiredTime) {
			this.expiredTime = expiredTime;
		}

		public Boolean getAutoRenewal() {
			return this.autoRenewal;
		}

		public void setAutoRenewal(Boolean autoRenewal) {
			this.autoRenewal = autoRenewal;
		}

		public String getArch() {
			return this.arch;
		}

		public void setArch(String arch) {
			this.arch = arch;
		}

		public String getRegion() {
			return this.region;
		}

		public void setRegion(String region) {
			this.region = region;
		}

		public String getZone() {
			return this.zone;
		}

		public void setZone(String zone) {
			this.zone = zone;
		}
	}

	@Override
	public ListResourceInstancesResponse getInstance(UnmarshallerContext context) {
		return	ListResourceInstancesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
