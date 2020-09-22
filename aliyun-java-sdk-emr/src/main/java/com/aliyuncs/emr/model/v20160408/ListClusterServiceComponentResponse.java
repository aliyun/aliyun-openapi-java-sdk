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
import com.aliyuncs.emr.transform.v20160408.ListClusterServiceComponentResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListClusterServiceComponentResponse extends AcsResponse {

	private String requestId;

	private Integer pageNumber;

	private Integer pageSize;

	private Integer total;

	private List<Component> componentList;

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

	public List<Component> getComponentList() {
		return this.componentList;
	}

	public void setComponentList(List<Component> componentList) {
		this.componentList = componentList;
	}

	public static class Component {

		private String serviceName;

		private String serviceDisplayName;

		private String componentName;

		private String componentDisplayName;

		private String status;

		private Boolean needRestart;

		private String serverStatus;

		private String podName;

		private String publicIp;

		private String privateIp;

		private String role;

		private String commissionStatus;

		private Integer desiredCount;

		private String namespace;

		private String workloadType;

		private String workloadName;

		public String getServiceName() {
			return this.serviceName;
		}

		public void setServiceName(String serviceName) {
			this.serviceName = serviceName;
		}

		public String getServiceDisplayName() {
			return this.serviceDisplayName;
		}

		public void setServiceDisplayName(String serviceDisplayName) {
			this.serviceDisplayName = serviceDisplayName;
		}

		public String getComponentName() {
			return this.componentName;
		}

		public void setComponentName(String componentName) {
			this.componentName = componentName;
		}

		public String getComponentDisplayName() {
			return this.componentDisplayName;
		}

		public void setComponentDisplayName(String componentDisplayName) {
			this.componentDisplayName = componentDisplayName;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Boolean getNeedRestart() {
			return this.needRestart;
		}

		public void setNeedRestart(Boolean needRestart) {
			this.needRestart = needRestart;
		}

		public String getServerStatus() {
			return this.serverStatus;
		}

		public void setServerStatus(String serverStatus) {
			this.serverStatus = serverStatus;
		}

		public String getPodName() {
			return this.podName;
		}

		public void setPodName(String podName) {
			this.podName = podName;
		}

		public String getPublicIp() {
			return this.publicIp;
		}

		public void setPublicIp(String publicIp) {
			this.publicIp = publicIp;
		}

		public String getPrivateIp() {
			return this.privateIp;
		}

		public void setPrivateIp(String privateIp) {
			this.privateIp = privateIp;
		}

		public String getRole() {
			return this.role;
		}

		public void setRole(String role) {
			this.role = role;
		}

		public String getCommissionStatus() {
			return this.commissionStatus;
		}

		public void setCommissionStatus(String commissionStatus) {
			this.commissionStatus = commissionStatus;
		}

		public Integer getDesiredCount() {
			return this.desiredCount;
		}

		public void setDesiredCount(Integer desiredCount) {
			this.desiredCount = desiredCount;
		}

		public String getNamespace() {
			return this.namespace;
		}

		public void setNamespace(String namespace) {
			this.namespace = namespace;
		}

		public String getWorkloadType() {
			return this.workloadType;
		}

		public void setWorkloadType(String workloadType) {
			this.workloadType = workloadType;
		}

		public String getWorkloadName() {
			return this.workloadName;
		}

		public void setWorkloadName(String workloadName) {
			this.workloadName = workloadName;
		}
	}

	@Override
	public ListClusterServiceComponentResponse getInstance(UnmarshallerContext context) {
		return	ListClusterServiceComponentResponseUnmarshaller.unmarshall(this, context);
	}
}
