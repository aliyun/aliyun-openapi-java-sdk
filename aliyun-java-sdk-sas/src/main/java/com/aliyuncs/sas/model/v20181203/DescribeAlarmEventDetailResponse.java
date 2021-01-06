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

package com.aliyuncs.sas.model.v20181203;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sas.transform.v20181203.DescribeAlarmEventDetailResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAlarmEventDetailResponse extends AcsResponse {

	private String requestId;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String internetIp;

		private String level;

		private String instanceName;

		private String alarmEventAliasName;

		private String type;

		private String uuid;

		private String solution;

		private Long startTime;

		private Long endTime;

		private String alarmEventDesc;

		private String intranetIp;

		private Boolean canBeDealOnLine;

		private String alarmUniqueInfo;

		private String dataSource;

		private Boolean canCancelFault;

		private Boolean containHwMode;

		private String containerImageId;

		private String containerImageName;

		private String containerId;

		private String k8sNamespace;

		private String k8sClusterId;

		private String k8sClusterName;

		private String k8sNodeId;

		private String k8sPodName;

		private String k8sNodeName;

		private String appName;

		private List<CauseDetail> causeDetails;

		public String getInternetIp() {
			return this.internetIp;
		}

		public void setInternetIp(String internetIp) {
			this.internetIp = internetIp;
		}

		public String getLevel() {
			return this.level;
		}

		public void setLevel(String level) {
			this.level = level;
		}

		public String getInstanceName() {
			return this.instanceName;
		}

		public void setInstanceName(String instanceName) {
			this.instanceName = instanceName;
		}

		public String getAlarmEventAliasName() {
			return this.alarmEventAliasName;
		}

		public void setAlarmEventAliasName(String alarmEventAliasName) {
			this.alarmEventAliasName = alarmEventAliasName;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getUuid() {
			return this.uuid;
		}

		public void setUuid(String uuid) {
			this.uuid = uuid;
		}

		public String getSolution() {
			return this.solution;
		}

		public void setSolution(String solution) {
			this.solution = solution;
		}

		public Long getStartTime() {
			return this.startTime;
		}

		public void setStartTime(Long startTime) {
			this.startTime = startTime;
		}

		public Long getEndTime() {
			return this.endTime;
		}

		public void setEndTime(Long endTime) {
			this.endTime = endTime;
		}

		public String getAlarmEventDesc() {
			return this.alarmEventDesc;
		}

		public void setAlarmEventDesc(String alarmEventDesc) {
			this.alarmEventDesc = alarmEventDesc;
		}

		public String getIntranetIp() {
			return this.intranetIp;
		}

		public void setIntranetIp(String intranetIp) {
			this.intranetIp = intranetIp;
		}

		public Boolean getCanBeDealOnLine() {
			return this.canBeDealOnLine;
		}

		public void setCanBeDealOnLine(Boolean canBeDealOnLine) {
			this.canBeDealOnLine = canBeDealOnLine;
		}

		public String getAlarmUniqueInfo() {
			return this.alarmUniqueInfo;
		}

		public void setAlarmUniqueInfo(String alarmUniqueInfo) {
			this.alarmUniqueInfo = alarmUniqueInfo;
		}

		public String getDataSource() {
			return this.dataSource;
		}

		public void setDataSource(String dataSource) {
			this.dataSource = dataSource;
		}

		public Boolean getCanCancelFault() {
			return this.canCancelFault;
		}

		public void setCanCancelFault(Boolean canCancelFault) {
			this.canCancelFault = canCancelFault;
		}

		public Boolean getContainHwMode() {
			return this.containHwMode;
		}

		public void setContainHwMode(Boolean containHwMode) {
			this.containHwMode = containHwMode;
		}

		public String getContainerImageId() {
			return this.containerImageId;
		}

		public void setContainerImageId(String containerImageId) {
			this.containerImageId = containerImageId;
		}

		public String getContainerImageName() {
			return this.containerImageName;
		}

		public void setContainerImageName(String containerImageName) {
			this.containerImageName = containerImageName;
		}

		public String getContainerId() {
			return this.containerId;
		}

		public void setContainerId(String containerId) {
			this.containerId = containerId;
		}

		public String getK8sNamespace() {
			return this.k8sNamespace;
		}

		public void setK8sNamespace(String k8sNamespace) {
			this.k8sNamespace = k8sNamespace;
		}

		public String getK8sClusterId() {
			return this.k8sClusterId;
		}

		public void setK8sClusterId(String k8sClusterId) {
			this.k8sClusterId = k8sClusterId;
		}

		public String getK8sClusterName() {
			return this.k8sClusterName;
		}

		public void setK8sClusterName(String k8sClusterName) {
			this.k8sClusterName = k8sClusterName;
		}

		public String getK8sNodeId() {
			return this.k8sNodeId;
		}

		public void setK8sNodeId(String k8sNodeId) {
			this.k8sNodeId = k8sNodeId;
		}

		public String getK8sPodName() {
			return this.k8sPodName;
		}

		public void setK8sPodName(String k8sPodName) {
			this.k8sPodName = k8sPodName;
		}

		public String getK8sNodeName() {
			return this.k8sNodeName;
		}

		public void setK8sNodeName(String k8sNodeName) {
			this.k8sNodeName = k8sNodeName;
		}

		public String getAppName() {
			return this.appName;
		}

		public void setAppName(String appName) {
			this.appName = appName;
		}

		public List<CauseDetail> getCauseDetails() {
			return this.causeDetails;
		}

		public void setCauseDetails(List<CauseDetail> causeDetails) {
			this.causeDetails = causeDetails;
		}

		public static class CauseDetail {

			private String key;

			private List<ValueItem> value;

			public String getKey() {
				return this.key;
			}

			public void setKey(String key) {
				this.key = key;
			}

			public List<ValueItem> getValue() {
				return this.value;
			}

			public void setValue(List<ValueItem> value) {
				this.value = value;
			}

			public static class ValueItem {

				private String name;

				private String type;

				private String value;

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}

				public String getType() {
					return this.type;
				}

				public void setType(String type) {
					this.type = type;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}
		}
	}

	@Override
	public DescribeAlarmEventDetailResponse getInstance(UnmarshallerContext context) {
		return	DescribeAlarmEventDetailResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
