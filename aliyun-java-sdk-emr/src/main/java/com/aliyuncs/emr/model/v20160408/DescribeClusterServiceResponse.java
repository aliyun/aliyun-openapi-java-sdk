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
import com.aliyuncs.emr.transform.v20160408.DescribeClusterServiceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeClusterServiceResponse extends AcsResponse {

	private String requestId;

	private ServiceInfo serviceInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public ServiceInfo getServiceInfo() {
		return this.serviceInfo;
	}

	public void setServiceInfo(ServiceInfo serviceInfo) {
		this.serviceInfo = serviceInfo;
	}

	public static class ServiceInfo {

		private String serviceName;

		private String serviceVersion;

		private String serviceStatus;

		private String needRestartInfo;

		private Integer needRestartNum;

		private List<ServiceAction> serviceActionList;

		private List<ClusterServiceSummary> clusterServiceSummaryList;

		private List<String> needRestartHostIdList;

		private List<String> needRestartComponentNameList;

		public String getServiceName() {
			return this.serviceName;
		}

		public void setServiceName(String serviceName) {
			this.serviceName = serviceName;
		}

		public String getServiceVersion() {
			return this.serviceVersion;
		}

		public void setServiceVersion(String serviceVersion) {
			this.serviceVersion = serviceVersion;
		}

		public String getServiceStatus() {
			return this.serviceStatus;
		}

		public void setServiceStatus(String serviceStatus) {
			this.serviceStatus = serviceStatus;
		}

		public String getNeedRestartInfo() {
			return this.needRestartInfo;
		}

		public void setNeedRestartInfo(String needRestartInfo) {
			this.needRestartInfo = needRestartInfo;
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

		public List<ClusterServiceSummary> getClusterServiceSummaryList() {
			return this.clusterServiceSummaryList;
		}

		public void setClusterServiceSummaryList(List<ClusterServiceSummary> clusterServiceSummaryList) {
			this.clusterServiceSummaryList = clusterServiceSummaryList;
		}

		public List<String> getNeedRestartHostIdList() {
			return this.needRestartHostIdList;
		}

		public void setNeedRestartHostIdList(List<String> needRestartHostIdList) {
			this.needRestartHostIdList = needRestartHostIdList;
		}

		public List<String> getNeedRestartComponentNameList() {
			return this.needRestartComponentNameList;
		}

		public void setNeedRestartComponentNameList(List<String> needRestartComponentNameList) {
			this.needRestartComponentNameList = needRestartComponentNameList;
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

		public static class ClusterServiceSummary {

			private String key;

			private String displayName;

			private String value;

			private Integer desiredStoppedValue;

			private String status;

			private String type;

			private String category;

			private String alertInfo;

			public String getKey() {
				return this.key;
			}

			public void setKey(String key) {
				this.key = key;
			}

			public String getDisplayName() {
				return this.displayName;
			}

			public void setDisplayName(String displayName) {
				this.displayName = displayName;
			}

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}

			public Integer getDesiredStoppedValue() {
				return this.desiredStoppedValue;
			}

			public void setDesiredStoppedValue(Integer desiredStoppedValue) {
				this.desiredStoppedValue = desiredStoppedValue;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public String getCategory() {
				return this.category;
			}

			public void setCategory(String category) {
				this.category = category;
			}

			public String getAlertInfo() {
				return this.alertInfo;
			}

			public void setAlertInfo(String alertInfo) {
				this.alertInfo = alertInfo;
			}
		}
	}

	@Override
	public DescribeClusterServiceResponse getInstance(UnmarshallerContext context) {
		return	DescribeClusterServiceResponseUnmarshaller.unmarshall(this, context);
	}
}
