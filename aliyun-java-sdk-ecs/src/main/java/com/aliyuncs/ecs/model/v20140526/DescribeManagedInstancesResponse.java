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

package com.aliyuncs.ecs.model.v20140526;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecs.transform.v20140526.DescribeManagedInstancesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeManagedInstancesResponse extends AcsResponse {

	private Long pageSize;

	private String requestId;

	private Long pageNumber;

	private Long totalCount;

	private List<Instance> instances;

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Long pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public List<Instance> getInstances() {
		return this.instances;
	}

	public void setInstances(List<Instance> instances) {
		this.instances = instances;
	}

	public static class Instance {

		private String lastInvokedTime;

		private Boolean connected;

		private String internetIp;

		private String hostname;

		private String instanceId;

		private String activationId;

		private String intranetIp;

		private String agentVersion;

		private String registrationTime;

		private String instanceName;

		private String osType;

		private String osVersion;

		private Long invocationCount;

		private String machineId;

		public String getLastInvokedTime() {
			return this.lastInvokedTime;
		}

		public void setLastInvokedTime(String lastInvokedTime) {
			this.lastInvokedTime = lastInvokedTime;
		}

		public Boolean getConnected() {
			return this.connected;
		}

		public void setConnected(Boolean connected) {
			this.connected = connected;
		}

		public String getInternetIp() {
			return this.internetIp;
		}

		public void setInternetIp(String internetIp) {
			this.internetIp = internetIp;
		}

		public String getHostname() {
			return this.hostname;
		}

		public void setHostname(String hostname) {
			this.hostname = hostname;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getActivationId() {
			return this.activationId;
		}

		public void setActivationId(String activationId) {
			this.activationId = activationId;
		}

		public String getIntranetIp() {
			return this.intranetIp;
		}

		public void setIntranetIp(String intranetIp) {
			this.intranetIp = intranetIp;
		}

		public String getAgentVersion() {
			return this.agentVersion;
		}

		public void setAgentVersion(String agentVersion) {
			this.agentVersion = agentVersion;
		}

		public String getRegistrationTime() {
			return this.registrationTime;
		}

		public void setRegistrationTime(String registrationTime) {
			this.registrationTime = registrationTime;
		}

		public String getInstanceName() {
			return this.instanceName;
		}

		public void setInstanceName(String instanceName) {
			this.instanceName = instanceName;
		}

		public String getOsType() {
			return this.osType;
		}

		public void setOsType(String osType) {
			this.osType = osType;
		}

		public String getOsVersion() {
			return this.osVersion;
		}

		public void setOsVersion(String osVersion) {
			this.osVersion = osVersion;
		}

		public Long getInvocationCount() {
			return this.invocationCount;
		}

		public void setInvocationCount(Long invocationCount) {
			this.invocationCount = invocationCount;
		}

		public String getMachineId() {
			return this.machineId;
		}

		public void setMachineId(String machineId) {
			this.machineId = machineId;
		}
	}

	@Override
	public DescribeManagedInstancesResponse getInstance(UnmarshallerContext context) {
		return	DescribeManagedInstancesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
