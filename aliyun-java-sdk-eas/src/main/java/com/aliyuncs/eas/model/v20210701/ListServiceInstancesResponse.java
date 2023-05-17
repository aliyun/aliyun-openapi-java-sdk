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
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.eas.transform.v20210701.ListServiceInstancesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListServiceInstancesResponse extends AcsResponse {

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

		private String hostIP;

		private String hostName;

		private String innerIP;

		private String instanceName;

		private Integer instancePort;

		private String namespace;

		private String reason;

		private Integer restartCount;

		private String status;

		private Integer totalProcesses;

		private Integer readyProcesses;

		private String startAt;

		private String role;

		private String resourceType;

		private String tenantInstanceIP;

		private String tenantHostIP;

		private Boolean isSpot;

		private Float currentAmount;

		private Float originalAmount;

		private List<Map<Object,Object>> lastState;

		public String getHostIP() {
			return this.hostIP;
		}

		public void setHostIP(String hostIP) {
			this.hostIP = hostIP;
		}

		public String getHostName() {
			return this.hostName;
		}

		public void setHostName(String hostName) {
			this.hostName = hostName;
		}

		public String getInnerIP() {
			return this.innerIP;
		}

		public void setInnerIP(String innerIP) {
			this.innerIP = innerIP;
		}

		public String getInstanceName() {
			return this.instanceName;
		}

		public void setInstanceName(String instanceName) {
			this.instanceName = instanceName;
		}

		public Integer getInstancePort() {
			return this.instancePort;
		}

		public void setInstancePort(Integer instancePort) {
			this.instancePort = instancePort;
		}

		public String getNamespace() {
			return this.namespace;
		}

		public void setNamespace(String namespace) {
			this.namespace = namespace;
		}

		public String getReason() {
			return this.reason;
		}

		public void setReason(String reason) {
			this.reason = reason;
		}

		public Integer getRestartCount() {
			return this.restartCount;
		}

		public void setRestartCount(Integer restartCount) {
			this.restartCount = restartCount;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Integer getTotalProcesses() {
			return this.totalProcesses;
		}

		public void setTotalProcesses(Integer totalProcesses) {
			this.totalProcesses = totalProcesses;
		}

		public Integer getReadyProcesses() {
			return this.readyProcesses;
		}

		public void setReadyProcesses(Integer readyProcesses) {
			this.readyProcesses = readyProcesses;
		}

		public String getStartAt() {
			return this.startAt;
		}

		public void setStartAt(String startAt) {
			this.startAt = startAt;
		}

		public String getRole() {
			return this.role;
		}

		public void setRole(String role) {
			this.role = role;
		}

		public String getResourceType() {
			return this.resourceType;
		}

		public void setResourceType(String resourceType) {
			this.resourceType = resourceType;
		}

		public String getTenantInstanceIP() {
			return this.tenantInstanceIP;
		}

		public void setTenantInstanceIP(String tenantInstanceIP) {
			this.tenantInstanceIP = tenantInstanceIP;
		}

		public String getTenantHostIP() {
			return this.tenantHostIP;
		}

		public void setTenantHostIP(String tenantHostIP) {
			this.tenantHostIP = tenantHostIP;
		}

		public Boolean getIsSpot() {
			return this.isSpot;
		}

		public void setIsSpot(Boolean isSpot) {
			this.isSpot = isSpot;
		}

		public Float getCurrentAmount() {
			return this.currentAmount;
		}

		public void setCurrentAmount(Float currentAmount) {
			this.currentAmount = currentAmount;
		}

		public Float getOriginalAmount() {
			return this.originalAmount;
		}

		public void setOriginalAmount(Float originalAmount) {
			this.originalAmount = originalAmount;
		}

		public List<Map<Object,Object>> getLastState() {
			return this.lastState;
		}

		public void setLastState(List<Map<Object,Object>> lastState) {
			this.lastState = lastState;
		}
	}

	@Override
	public ListServiceInstancesResponse getInstance(UnmarshallerContext context) {
		return	ListServiceInstancesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
