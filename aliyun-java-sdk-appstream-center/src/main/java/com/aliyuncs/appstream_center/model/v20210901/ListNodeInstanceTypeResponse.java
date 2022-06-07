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

package com.aliyuncs.appstream_center.model.v20210901;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.appstream_center.transform.v20210901.ListNodeInstanceTypeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListNodeInstanceTypeResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private Integer pageSize;

	private Integer pageNumber;

	private List<Node> nodeInstanceTypeModels;

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

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public List<Node> getNodeInstanceTypeModels() {
		return this.nodeInstanceTypeModels;
	}

	public void setNodeInstanceTypeModels(List<Node> nodeInstanceTypeModels) {
		this.nodeInstanceTypeModels = nodeInstanceTypeModels;
	}

	public static class Node {

		private String nodeInstanceType;

		private String nodeInstanceTypeFamily;

		private String cpu;

		private String gpu;

		private Long memory;

		private Long systemDiskSize;

		private Long dataDiskSize;

		public String getNodeInstanceType() {
			return this.nodeInstanceType;
		}

		public void setNodeInstanceType(String nodeInstanceType) {
			this.nodeInstanceType = nodeInstanceType;
		}

		public String getNodeInstanceTypeFamily() {
			return this.nodeInstanceTypeFamily;
		}

		public void setNodeInstanceTypeFamily(String nodeInstanceTypeFamily) {
			this.nodeInstanceTypeFamily = nodeInstanceTypeFamily;
		}

		public String getCpu() {
			return this.cpu;
		}

		public void setCpu(String cpu) {
			this.cpu = cpu;
		}

		public String getGpu() {
			return this.gpu;
		}

		public void setGpu(String gpu) {
			this.gpu = gpu;
		}

		public Long getMemory() {
			return this.memory;
		}

		public void setMemory(Long memory) {
			this.memory = memory;
		}

		public Long getSystemDiskSize() {
			return this.systemDiskSize;
		}

		public void setSystemDiskSize(Long systemDiskSize) {
			this.systemDiskSize = systemDiskSize;
		}

		public Long getDataDiskSize() {
			return this.dataDiskSize;
		}

		public void setDataDiskSize(Long dataDiskSize) {
			this.dataDiskSize = dataDiskSize;
		}
	}

	@Override
	public ListNodeInstanceTypeResponse getInstance(UnmarshallerContext context) {
		return	ListNodeInstanceTypeResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
