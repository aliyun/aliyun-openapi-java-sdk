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
import com.aliyuncs.r_kvstore.transform.v20150101.DescribeDedicatedUserClusterResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDedicatedUserClusterResponse extends AcsResponse {

	private String requestId;

	private Integer maxRecordsPerPage;

	private Integer pageNumber;

	private Integer totalRecords;

	private Integer itemsNumbers;

	private List<ClusterInfo> clusterItems;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getMaxRecordsPerPage() {
		return this.maxRecordsPerPage;
	}

	public void setMaxRecordsPerPage(Integer maxRecordsPerPage) {
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

	public Integer getItemsNumbers() {
		return this.itemsNumbers;
	}

	public void setItemsNumbers(Integer itemsNumbers) {
		this.itemsNumbers = itemsNumbers;
	}

	public List<ClusterInfo> getClusterItems() {
		return this.clusterItems;
	}

	public void setClusterItems(List<ClusterInfo> clusterItems) {
		this.clusterItems = clusterItems;
	}

	public static class ClusterInfo {

		private String clusterId;

		private String clusterName;

		private Integer hostNumbers;

		private Integer instanceNumbers;

		private Integer cpuOverAllocationRatio;

		private Integer memoryOverAllocationRatio;

		private Integer diskOverAllocationRatio;

		private String allocationPolicy;

		private String hostReplacePolicy;

		private String createTime;

		public String getClusterId() {
			return this.clusterId;
		}

		public void setClusterId(String clusterId) {
			this.clusterId = clusterId;
		}

		public String getClusterName() {
			return this.clusterName;
		}

		public void setClusterName(String clusterName) {
			this.clusterName = clusterName;
		}

		public Integer getHostNumbers() {
			return this.hostNumbers;
		}

		public void setHostNumbers(Integer hostNumbers) {
			this.hostNumbers = hostNumbers;
		}

		public Integer getInstanceNumbers() {
			return this.instanceNumbers;
		}

		public void setInstanceNumbers(Integer instanceNumbers) {
			this.instanceNumbers = instanceNumbers;
		}

		public Integer getCpuOverAllocationRatio() {
			return this.cpuOverAllocationRatio;
		}

		public void setCpuOverAllocationRatio(Integer cpuOverAllocationRatio) {
			this.cpuOverAllocationRatio = cpuOverAllocationRatio;
		}

		public Integer getMemoryOverAllocationRatio() {
			return this.memoryOverAllocationRatio;
		}

		public void setMemoryOverAllocationRatio(Integer memoryOverAllocationRatio) {
			this.memoryOverAllocationRatio = memoryOverAllocationRatio;
		}

		public Integer getDiskOverAllocationRatio() {
			return this.diskOverAllocationRatio;
		}

		public void setDiskOverAllocationRatio(Integer diskOverAllocationRatio) {
			this.diskOverAllocationRatio = diskOverAllocationRatio;
		}

		public String getAllocationPolicy() {
			return this.allocationPolicy;
		}

		public void setAllocationPolicy(String allocationPolicy) {
			this.allocationPolicy = allocationPolicy;
		}

		public String getHostReplacePolicy() {
			return this.hostReplacePolicy;
		}

		public void setHostReplacePolicy(String hostReplacePolicy) {
			this.hostReplacePolicy = hostReplacePolicy;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}
	}

	@Override
	public DescribeDedicatedUserClusterResponse getInstance(UnmarshallerContext context) {
		return	DescribeDedicatedUserClusterResponseUnmarshaller.unmarshall(this, context);
	}
}
