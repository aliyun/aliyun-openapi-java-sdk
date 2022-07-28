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
import com.aliyuncs.eas.transform.v20210701.ListResourceInstanceWorkerResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListResourceInstanceWorkerResponse extends AcsResponse {

	private String requestId;

	private Integer pageNumber;

	private Integer pageSize;

	private Integer totalCount;

	private List<PodsItem> pods;

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

	public List<PodsItem> getPods() {
		return this.pods;
	}

	public void setPods(List<PodsItem> pods) {
		this.pods = pods;
	}

	public static class PodsItem {

		private String name;

		private String serviceName;

		private String status;

		private Boolean ready;

		private Integer cpuRequest;

		private Integer gpuRequest;

		private Integer memoryRquest;

		private Integer cpuLimit;

		private Integer gpuLimit;

		private Integer memoryLimit;

		private Integer restartCount;

		private String startTime;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getServiceName() {
			return this.serviceName;
		}

		public void setServiceName(String serviceName) {
			this.serviceName = serviceName;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Boolean getReady() {
			return this.ready;
		}

		public void setReady(Boolean ready) {
			this.ready = ready;
		}

		public Integer getCpuRequest() {
			return this.cpuRequest;
		}

		public void setCpuRequest(Integer cpuRequest) {
			this.cpuRequest = cpuRequest;
		}

		public Integer getGpuRequest() {
			return this.gpuRequest;
		}

		public void setGpuRequest(Integer gpuRequest) {
			this.gpuRequest = gpuRequest;
		}

		public Integer getMemoryRquest() {
			return this.memoryRquest;
		}

		public void setMemoryRquest(Integer memoryRquest) {
			this.memoryRquest = memoryRquest;
		}

		public Integer getCpuLimit() {
			return this.cpuLimit;
		}

		public void setCpuLimit(Integer cpuLimit) {
			this.cpuLimit = cpuLimit;
		}

		public Integer getGpuLimit() {
			return this.gpuLimit;
		}

		public void setGpuLimit(Integer gpuLimit) {
			this.gpuLimit = gpuLimit;
		}

		public Integer getMemoryLimit() {
			return this.memoryLimit;
		}

		public void setMemoryLimit(Integer memoryLimit) {
			this.memoryLimit = memoryLimit;
		}

		public Integer getRestartCount() {
			return this.restartCount;
		}

		public void setRestartCount(Integer restartCount) {
			this.restartCount = restartCount;
		}

		public String getStartTime() {
			return this.startTime;
		}

		public void setStartTime(String startTime) {
			this.startTime = startTime;
		}
	}

	@Override
	public ListResourceInstanceWorkerResponse getInstance(UnmarshallerContext context) {
		return	ListResourceInstanceWorkerResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
