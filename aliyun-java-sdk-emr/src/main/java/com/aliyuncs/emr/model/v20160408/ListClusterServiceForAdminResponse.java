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
import com.aliyuncs.emr.transform.v20160408.ListClusterServiceForAdminResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListClusterServiceForAdminResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private Integer pageNumber;

	private Integer pageSize;

	private List<ClusterService> clusterServiceList;

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

	public List<ClusterService> getClusterServiceList() {
		return this.clusterServiceList;
	}

	public void setClusterServiceList(List<ClusterService> clusterServiceList) {
		this.clusterServiceList = clusterServiceList;
	}

	public static class ClusterService {

		private String serviceName;

		private String serviceDisplayName;

		private String serviceVersion;

		private Boolean installStatus;

		private Boolean clientType;

		private String serviceStatus;

		private String healthStatus;

		private String needRestartInfo;

		private String notStartInfo;

		private Integer abnormalNum;

		private Integer stoppedNum;

		private Integer needRestartNum;

		private List<ServiceAction> serviceActionList;

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

		public String getServiceVersion() {
			return this.serviceVersion;
		}

		public void setServiceVersion(String serviceVersion) {
			this.serviceVersion = serviceVersion;
		}

		public Boolean getInstallStatus() {
			return this.installStatus;
		}

		public void setInstallStatus(Boolean installStatus) {
			this.installStatus = installStatus;
		}

		public Boolean getClientType() {
			return this.clientType;
		}

		public void setClientType(Boolean clientType) {
			this.clientType = clientType;
		}

		public String getServiceStatus() {
			return this.serviceStatus;
		}

		public void setServiceStatus(String serviceStatus) {
			this.serviceStatus = serviceStatus;
		}

		public String getHealthStatus() {
			return this.healthStatus;
		}

		public void setHealthStatus(String healthStatus) {
			this.healthStatus = healthStatus;
		}

		public String getNeedRestartInfo() {
			return this.needRestartInfo;
		}

		public void setNeedRestartInfo(String needRestartInfo) {
			this.needRestartInfo = needRestartInfo;
		}

		public String getNotStartInfo() {
			return this.notStartInfo;
		}

		public void setNotStartInfo(String notStartInfo) {
			this.notStartInfo = notStartInfo;
		}

		public Integer getAbnormalNum() {
			return this.abnormalNum;
		}

		public void setAbnormalNum(Integer abnormalNum) {
			this.abnormalNum = abnormalNum;
		}

		public Integer getStoppedNum() {
			return this.stoppedNum;
		}

		public void setStoppedNum(Integer stoppedNum) {
			this.stoppedNum = stoppedNum;
		}

		public Integer getNeedRestartNum() {
			return this.needRestartNum;
		}

		public void setNeedRestartNum(Integer needRestartNum) {
			this.needRestartNum = needRestartNum;
		}

		public List<ServiceAction> getServiceActionList() {
			return this.serviceActionList;
		}

		public void setServiceActionList(List<ServiceAction> serviceActionList) {
			this.serviceActionList = serviceActionList;
		}

		public static class ServiceAction {

			private String serviceName;

			private String componentName;

			private String actionName;

			private String command;

			private String displayName;

			public String getServiceName() {
				return this.serviceName;
			}

			public void setServiceName(String serviceName) {
				this.serviceName = serviceName;
			}

			public String getComponentName() {
				return this.componentName;
			}

			public void setComponentName(String componentName) {
				this.componentName = componentName;
			}

			public String getActionName() {
				return this.actionName;
			}

			public void setActionName(String actionName) {
				this.actionName = actionName;
			}

			public String getCommand() {
				return this.command;
			}

			public void setCommand(String command) {
				this.command = command;
			}

			public String getDisplayName() {
				return this.displayName;
			}

			public void setDisplayName(String displayName) {
				this.displayName = displayName;
			}
		}
	}

	@Override
	public ListClusterServiceForAdminResponse getInstance(UnmarshallerContext context) {
		return	ListClusterServiceForAdminResponseUnmarshaller.unmarshall(this, context);
	}
}
