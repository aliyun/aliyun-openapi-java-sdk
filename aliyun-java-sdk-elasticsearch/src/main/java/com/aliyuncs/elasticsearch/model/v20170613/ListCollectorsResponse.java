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

package com.aliyuncs.elasticsearch.model.v20170613;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.elasticsearch.transform.v20170613.ListCollectorsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListCollectorsResponse extends AcsResponse {

	private String requestId;

	private List<ResultItem> result;

	private Headers headers;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ResultItem> getResult() {
		return this.result;
	}

	public void setResult(List<ResultItem> result) {
		this.result = result;
	}

	public Headers getHeaders() {
		return this.headers;
	}

	public void setHeaders(Headers headers) {
		this.headers = headers;
	}

	public static class ResultItem {

		private String gmtCreatedTime;

		private String gmtUpdateTime;

		private String name;

		private String resId;

		private String resVersion;

		private String vpcId;

		private String resType;

		private String ownerId;

		private String status;

		private Boolean dryRun;

		private List<ConfigsItem> configs;

		private List<ExtendConfigsItem> extendConfigs;

		private List<String> collectorPaths;

		public String getGmtCreatedTime() {
			return this.gmtCreatedTime;
		}

		public void setGmtCreatedTime(String gmtCreatedTime) {
			this.gmtCreatedTime = gmtCreatedTime;
		}

		public String getGmtUpdateTime() {
			return this.gmtUpdateTime;
		}

		public void setGmtUpdateTime(String gmtUpdateTime) {
			this.gmtUpdateTime = gmtUpdateTime;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getResId() {
			return this.resId;
		}

		public void setResId(String resId) {
			this.resId = resId;
		}

		public String getResVersion() {
			return this.resVersion;
		}

		public void setResVersion(String resVersion) {
			this.resVersion = resVersion;
		}

		public String getVpcId() {
			return this.vpcId;
		}

		public void setVpcId(String vpcId) {
			this.vpcId = vpcId;
		}

		public String getResType() {
			return this.resType;
		}

		public void setResType(String resType) {
			this.resType = resType;
		}

		public String getOwnerId() {
			return this.ownerId;
		}

		public void setOwnerId(String ownerId) {
			this.ownerId = ownerId;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Boolean getDryRun() {
			return this.dryRun;
		}

		public void setDryRun(Boolean dryRun) {
			this.dryRun = dryRun;
		}

		public List<ConfigsItem> getConfigs() {
			return this.configs;
		}

		public void setConfigs(List<ConfigsItem> configs) {
			this.configs = configs;
		}

		public List<ExtendConfigsItem> getExtendConfigs() {
			return this.extendConfigs;
		}

		public void setExtendConfigs(List<ExtendConfigsItem> extendConfigs) {
			this.extendConfigs = extendConfigs;
		}

		public List<String> getCollectorPaths() {
			return this.collectorPaths;
		}

		public void setCollectorPaths(List<String> collectorPaths) {
			this.collectorPaths = collectorPaths;
		}

		public static class ConfigsItem {

			private String fileName;

			private String content;

			public String getFileName() {
				return this.fileName;
			}

			public void setFileName(String fileName) {
				this.fileName = fileName;
			}

			public String getContent() {
				return this.content;
			}

			public void setContent(String content) {
				this.content = content;
			}
		}

		public static class ExtendConfigsItem {

			private String configType;

			private String instanceId;

			private String instanceType;

			private String protocol;

			private String userName;

			private Boolean enableMonitoring;

			private String type;

			private String groupId;

			private List<MachinesItem> machines;

			private List<String> hosts;

			public String getConfigType() {
				return this.configType;
			}

			public void setConfigType(String configType) {
				this.configType = configType;
			}

			public String getInstanceId() {
				return this.instanceId;
			}

			public void setInstanceId(String instanceId) {
				this.instanceId = instanceId;
			}

			public String getInstanceType() {
				return this.instanceType;
			}

			public void setInstanceType(String instanceType) {
				this.instanceType = instanceType;
			}

			public String getBizProtocol() {
				return this.protocol;
			}

			public void setBizProtocol(String protocol) {
				this.protocol = protocol;
			}

			public String getUserName() {
				return this.userName;
			}

			public void setUserName(String userName) {
				this.userName = userName;
			}

			public Boolean getEnableMonitoring() {
				return this.enableMonitoring;
			}

			public void setEnableMonitoring(Boolean enableMonitoring) {
				this.enableMonitoring = enableMonitoring;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public String getGroupId() {
				return this.groupId;
			}

			public void setGroupId(String groupId) {
				this.groupId = groupId;
			}

			public List<MachinesItem> getMachines() {
				return this.machines;
			}

			public void setMachines(List<MachinesItem> machines) {
				this.machines = machines;
			}

			public List<String> getHosts() {
				return this.hosts;
			}

			public void setHosts(List<String> hosts) {
				this.hosts = hosts;
			}

			public static class MachinesItem {

				private String instanceId;

				private String agentStatus;

				public String getInstanceId() {
					return this.instanceId;
				}

				public void setInstanceId(String instanceId) {
					this.instanceId = instanceId;
				}

				public String getAgentStatus() {
					return this.agentStatus;
				}

				public void setAgentStatus(String agentStatus) {
					this.agentStatus = agentStatus;
				}
			}
		}
	}

	public static class Headers {

		private Integer xTotalCount;

		public Integer getXTotalCount() {
			return this.xTotalCount;
		}

		public void setXTotalCount(Integer xTotalCount) {
			this.xTotalCount = xTotalCount;
		}
	}

	@Override
	public ListCollectorsResponse getInstance(UnmarshallerContext context) {
		return	ListCollectorsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
