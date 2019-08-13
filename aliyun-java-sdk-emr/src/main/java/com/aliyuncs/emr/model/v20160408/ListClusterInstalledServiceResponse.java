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
import com.aliyuncs.emr.transform.v20160408.ListClusterInstalledServiceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListClusterInstalledServiceResponse extends AcsResponse {

	private String requestId;

	private List<ClusterInstalledService> clusterInstalledServiceList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ClusterInstalledService> getClusterInstalledServiceList() {
		return this.clusterInstalledServiceList;
	}

	public void setClusterInstalledServiceList(List<ClusterInstalledService> clusterInstalledServiceList) {
		this.clusterInstalledServiceList = clusterInstalledServiceList;
	}

	public static class ClusterInstalledService {

		private String serviceName;

		private String serviceDisplayName;

		private String serviceVersion;

		private String serviceEcmVersion;

		private String serviceStatus;

		private Boolean onlyClient;

		private Integer notStartedNum;

		private Integer needRestartNum;

		private Integer abnormalNum;

		private String comment;

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

		public String getServiceEcmVersion() {
			return this.serviceEcmVersion;
		}

		public void setServiceEcmVersion(String serviceEcmVersion) {
			this.serviceEcmVersion = serviceEcmVersion;
		}

		public String getServiceStatus() {
			return this.serviceStatus;
		}

		public void setServiceStatus(String serviceStatus) {
			this.serviceStatus = serviceStatus;
		}

		public Boolean getOnlyClient() {
			return this.onlyClient;
		}

		public void setOnlyClient(Boolean onlyClient) {
			this.onlyClient = onlyClient;
		}

		public Integer getNotStartedNum() {
			return this.notStartedNum;
		}

		public void setNotStartedNum(Integer notStartedNum) {
			this.notStartedNum = notStartedNum;
		}

		public Integer getNeedRestartNum() {
			return this.needRestartNum;
		}

		public void setNeedRestartNum(Integer needRestartNum) {
			this.needRestartNum = needRestartNum;
		}

		public Integer getAbnormalNum() {
			return this.abnormalNum;
		}

		public void setAbnormalNum(Integer abnormalNum) {
			this.abnormalNum = abnormalNum;
		}

		public String getComment() {
			return this.comment;
		}

		public void setComment(String comment) {
			this.comment = comment;
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

			public String getBizActionName() {
				return this.actionName;
			}

			public void setBizActionName(String actionName) {
				this.actionName = actionName;
			}

			/**
			 * @deprecated use getBizActionName instead of this.
			 */
			@Deprecated
			public String getActionName() {
				return this.actionName;
			}

			/**
			 * @deprecated use setBizActionName instead of this.
			 */
			@Deprecated
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
	public ListClusterInstalledServiceResponse getInstance(UnmarshallerContext context) {
		return	ListClusterInstalledServiceResponseUnmarshaller.unmarshall(this, context);
	}
}
