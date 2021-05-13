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
import com.aliyuncs.ens.transform.v20171110.DescribeEnsResourceUsageResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeEnsResourceUsageResponse extends AcsResponse {

	private String requestId;

	private List<EnsResourceUsageItem> ensResourceUsage;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<EnsResourceUsageItem> getEnsResourceUsage() {
		return this.ensResourceUsage;
	}

	public void setEnsResourceUsage(List<EnsResourceUsageItem> ensResourceUsage) {
		this.ensResourceUsage = ensResourceUsage;
	}

	public static class EnsResourceUsageItem {

		private String serviceType;

		private Integer instanceCount;

		private Long cpuSum;

		private Long gpuSum;

		private Integer downCount;

		private Integer expiredCount;

		private Integer expiringCount;

		private Integer runningCount;

		private Integer diskCount;

		private Long storageSum;

		private Integer computeResourceCount;

		public String getServiceType() {
			return this.serviceType;
		}

		public void setServiceType(String serviceType) {
			this.serviceType = serviceType;
		}

		public Integer getInstanceCount() {
			return this.instanceCount;
		}

		public void setInstanceCount(Integer instanceCount) {
			this.instanceCount = instanceCount;
		}

		public Long getCpuSum() {
			return this.cpuSum;
		}

		public void setCpuSum(Long cpuSum) {
			this.cpuSum = cpuSum;
		}

		public Long getGpuSum() {
			return this.gpuSum;
		}

		public void setGpuSum(Long gpuSum) {
			this.gpuSum = gpuSum;
		}

		public Integer getDownCount() {
			return this.downCount;
		}

		public void setDownCount(Integer downCount) {
			this.downCount = downCount;
		}

		public Integer getExpiredCount() {
			return this.expiredCount;
		}

		public void setExpiredCount(Integer expiredCount) {
			this.expiredCount = expiredCount;
		}

		public Integer getExpiringCount() {
			return this.expiringCount;
		}

		public void setExpiringCount(Integer expiringCount) {
			this.expiringCount = expiringCount;
		}

		public Integer getRunningCount() {
			return this.runningCount;
		}

		public void setRunningCount(Integer runningCount) {
			this.runningCount = runningCount;
		}

		public Integer getDiskCount() {
			return this.diskCount;
		}

		public void setDiskCount(Integer diskCount) {
			this.diskCount = diskCount;
		}

		public Long getStorageSum() {
			return this.storageSum;
		}

		public void setStorageSum(Long storageSum) {
			this.storageSum = storageSum;
		}

		public Integer getComputeResourceCount() {
			return this.computeResourceCount;
		}

		public void setComputeResourceCount(Integer computeResourceCount) {
			this.computeResourceCount = computeResourceCount;
		}
	}

	@Override
	public DescribeEnsResourceUsageResponse getInstance(UnmarshallerContext context) {
		return	DescribeEnsResourceUsageResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
