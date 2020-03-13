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

package com.aliyuncs.sofa.model.v20190815;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sofa.transform.v20190815.BatchqueryODPInstancesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class BatchqueryODPInstancesResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private List<DataItem> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultMessage() {
		return this.resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private String configSpecDesc;

		private String envMode;

		private String envTenant;

		private String gmtCreate;

		private String gmtModified;

		private Long id;

		private String instanceId;

		private String instanceName;

		private Long instancePort;

		private String instanceStatus;

		private String instanceVip;

		private String instanceWanAddress;

		private Long instanceWanPort;

		private String instanceZone;

		private Long machineCount;

		private Long paymentType;

		private String region;

		private Long schemaCount;

		private Long zoneCount;

		private List<NodesItem> nodes;

		public String getConfigSpecDesc() {
			return this.configSpecDesc;
		}

		public void setConfigSpecDesc(String configSpecDesc) {
			this.configSpecDesc = configSpecDesc;
		}

		public String getEnvMode() {
			return this.envMode;
		}

		public void setEnvMode(String envMode) {
			this.envMode = envMode;
		}

		public String getEnvTenant() {
			return this.envTenant;
		}

		public void setEnvTenant(String envTenant) {
			this.envTenant = envTenant;
		}

		public String getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(String gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public String getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(String gmtModified) {
			this.gmtModified = gmtModified;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getInstanceName() {
			return this.instanceName;
		}

		public void setInstanceName(String instanceName) {
			this.instanceName = instanceName;
		}

		public Long getInstancePort() {
			return this.instancePort;
		}

		public void setInstancePort(Long instancePort) {
			this.instancePort = instancePort;
		}

		public String getInstanceStatus() {
			return this.instanceStatus;
		}

		public void setInstanceStatus(String instanceStatus) {
			this.instanceStatus = instanceStatus;
		}

		public String getInstanceVip() {
			return this.instanceVip;
		}

		public void setInstanceVip(String instanceVip) {
			this.instanceVip = instanceVip;
		}

		public String getInstanceWanAddress() {
			return this.instanceWanAddress;
		}

		public void setInstanceWanAddress(String instanceWanAddress) {
			this.instanceWanAddress = instanceWanAddress;
		}

		public Long getInstanceWanPort() {
			return this.instanceWanPort;
		}

		public void setInstanceWanPort(Long instanceWanPort) {
			this.instanceWanPort = instanceWanPort;
		}

		public String getInstanceZone() {
			return this.instanceZone;
		}

		public void setInstanceZone(String instanceZone) {
			this.instanceZone = instanceZone;
		}

		public Long getMachineCount() {
			return this.machineCount;
		}

		public void setMachineCount(Long machineCount) {
			this.machineCount = machineCount;
		}

		public Long getPaymentType() {
			return this.paymentType;
		}

		public void setPaymentType(Long paymentType) {
			this.paymentType = paymentType;
		}

		public String getRegion() {
			return this.region;
		}

		public void setRegion(String region) {
			this.region = region;
		}

		public Long getSchemaCount() {
			return this.schemaCount;
		}

		public void setSchemaCount(Long schemaCount) {
			this.schemaCount = schemaCount;
		}

		public Long getZoneCount() {
			return this.zoneCount;
		}

		public void setZoneCount(Long zoneCount) {
			this.zoneCount = zoneCount;
		}

		public List<NodesItem> getNodes() {
			return this.nodes;
		}

		public void setNodes(List<NodesItem> nodes) {
			this.nodes = nodes;
		}

		public static class NodesItem {

			private String configSpecDesc;

			private Long cpuCount;

			private String envMode;

			private String envTenant;

			private String gmtCreate;

			private String gmtModified;

			private Long id;

			private Long machineCount;

			private Long memoryCount;

			private Long port;

			private String vip;

			private String zdalproxyInstanceId;

			private String zdalproxyNodeId;

			private String zone;

			public String getConfigSpecDesc() {
				return this.configSpecDesc;
			}

			public void setConfigSpecDesc(String configSpecDesc) {
				this.configSpecDesc = configSpecDesc;
			}

			public Long getCpuCount() {
				return this.cpuCount;
			}

			public void setCpuCount(Long cpuCount) {
				this.cpuCount = cpuCount;
			}

			public String getEnvMode() {
				return this.envMode;
			}

			public void setEnvMode(String envMode) {
				this.envMode = envMode;
			}

			public String getEnvTenant() {
				return this.envTenant;
			}

			public void setEnvTenant(String envTenant) {
				this.envTenant = envTenant;
			}

			public String getGmtCreate() {
				return this.gmtCreate;
			}

			public void setGmtCreate(String gmtCreate) {
				this.gmtCreate = gmtCreate;
			}

			public String getGmtModified() {
				return this.gmtModified;
			}

			public void setGmtModified(String gmtModified) {
				this.gmtModified = gmtModified;
			}

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public Long getMachineCount() {
				return this.machineCount;
			}

			public void setMachineCount(Long machineCount) {
				this.machineCount = machineCount;
			}

			public Long getMemoryCount() {
				return this.memoryCount;
			}

			public void setMemoryCount(Long memoryCount) {
				this.memoryCount = memoryCount;
			}

			public Long getPort() {
				return this.port;
			}

			public void setPort(Long port) {
				this.port = port;
			}

			public String getVip() {
				return this.vip;
			}

			public void setVip(String vip) {
				this.vip = vip;
			}

			public String getZdalproxyInstanceId() {
				return this.zdalproxyInstanceId;
			}

			public void setZdalproxyInstanceId(String zdalproxyInstanceId) {
				this.zdalproxyInstanceId = zdalproxyInstanceId;
			}

			public String getZdalproxyNodeId() {
				return this.zdalproxyNodeId;
			}

			public void setZdalproxyNodeId(String zdalproxyNodeId) {
				this.zdalproxyNodeId = zdalproxyNodeId;
			}

			public String getZone() {
				return this.zone;
			}

			public void setZone(String zone) {
				this.zone = zone;
			}
		}
	}

	@Override
	public BatchqueryODPInstancesResponse getInstance(UnmarshallerContext context) {
		return	BatchqueryODPInstancesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
