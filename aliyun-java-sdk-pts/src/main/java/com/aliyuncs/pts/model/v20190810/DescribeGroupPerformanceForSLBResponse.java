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

package com.aliyuncs.pts.model.v20190810;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.pts.transform.v20190810.DescribeGroupPerformanceForSLBResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeGroupPerformanceForSLBResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private Integer httpStatusCode;

	private Boolean success;

	private Map<Object,Object> groupPerformanceList;

	private List<SlbPerformanceView> slbPerformanceViewList;

	private List<RdsPerformanceView> rdsPerformanceViewList;

	private List<EcsPerformanceView> ecsPerformanceViewList;

	private List<GroupInfo> groupInfoList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Map<Object,Object> getGroupPerformanceList() {
		return this.groupPerformanceList;
	}

	public void setGroupPerformanceList(Map<Object,Object> groupPerformanceList) {
		this.groupPerformanceList = groupPerformanceList;
	}

	public List<SlbPerformanceView> getSlbPerformanceViewList() {
		return this.slbPerformanceViewList;
	}

	public void setSlbPerformanceViewList(List<SlbPerformanceView> slbPerformanceViewList) {
		this.slbPerformanceViewList = slbPerformanceViewList;
	}

	public List<RdsPerformanceView> getRdsPerformanceViewList() {
		return this.rdsPerformanceViewList;
	}

	public void setRdsPerformanceViewList(List<RdsPerformanceView> rdsPerformanceViewList) {
		this.rdsPerformanceViewList = rdsPerformanceViewList;
	}

	public List<EcsPerformanceView> getEcsPerformanceViewList() {
		return this.ecsPerformanceViewList;
	}

	public void setEcsPerformanceViewList(List<EcsPerformanceView> ecsPerformanceViewList) {
		this.ecsPerformanceViewList = ecsPerformanceViewList;
	}

	public List<GroupInfo> getGroupInfoList() {
		return this.groupInfoList;
	}

	public void setGroupInfoList(List<GroupInfo> groupInfoList) {
		this.groupInfoList = groupInfoList;
	}

	public static class SlbPerformanceView {

		private String address;

		private String instanceId;

		private String listenPort;

		private Map<Object,Object> metricMap;

		public String getAddress() {
			return this.address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getListenPort() {
			return this.listenPort;
		}

		public void setListenPort(String listenPort) {
			this.listenPort = listenPort;
		}

		public Map<Object,Object> getMetricMap() {
			return this.metricMap;
		}

		public void setMetricMap(Map<Object,Object> metricMap) {
			this.metricMap = metricMap;
		}
	}

	public static class RdsPerformanceView {

		private String instanceId;

		private String instanceName;

		private String connection;

		private Integer iopsValue;

		private String cpu;

		private Integer diskValue;

		private String iops;

		private Integer memoryValue;

		private Integer cpuValue;

		private String rt;

		private String disk;

		private Integer rtValue;

		private String memory;

		private Integer connectionValue;

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

		public String getConnection() {
			return this.connection;
		}

		public void setConnection(String connection) {
			this.connection = connection;
		}

		public Integer getIopsValue() {
			return this.iopsValue;
		}

		public void setIopsValue(Integer iopsValue) {
			this.iopsValue = iopsValue;
		}

		public String getCpu() {
			return this.cpu;
		}

		public void setCpu(String cpu) {
			this.cpu = cpu;
		}

		public Integer getDiskValue() {
			return this.diskValue;
		}

		public void setDiskValue(Integer diskValue) {
			this.diskValue = diskValue;
		}

		public String getIops() {
			return this.iops;
		}

		public void setIops(String iops) {
			this.iops = iops;
		}

		public Integer getMemoryValue() {
			return this.memoryValue;
		}

		public void setMemoryValue(Integer memoryValue) {
			this.memoryValue = memoryValue;
		}

		public Integer getCpuValue() {
			return this.cpuValue;
		}

		public void setCpuValue(Integer cpuValue) {
			this.cpuValue = cpuValue;
		}

		public String getRt() {
			return this.rt;
		}

		public void setRt(String rt) {
			this.rt = rt;
		}

		public String getDisk() {
			return this.disk;
		}

		public void setDisk(String disk) {
			this.disk = disk;
		}

		public Integer getRtValue() {
			return this.rtValue;
		}

		public void setRtValue(Integer rtValue) {
			this.rtValue = rtValue;
		}

		public String getMemory() {
			return this.memory;
		}

		public void setMemory(String memory) {
			this.memory = memory;
		}

		public Integer getConnectionValue() {
			return this.connectionValue;
		}

		public void setConnectionValue(Integer connectionValue) {
			this.connectionValue = connectionValue;
		}
	}

	public static class EcsPerformanceView {

		private String instanceId;

		private String instanceName;

		private String cpu;

		private String load;

		private Integer memoryValue;

		private Integer cpuValue;

		private Integer loadValue;

		private Integer cpuCore;

		private String memory;

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

		public String getCpu() {
			return this.cpu;
		}

		public void setCpu(String cpu) {
			this.cpu = cpu;
		}

		public String getLoad() {
			return this.load;
		}

		public void setLoad(String load) {
			this.load = load;
		}

		public Integer getMemoryValue() {
			return this.memoryValue;
		}

		public void setMemoryValue(Integer memoryValue) {
			this.memoryValue = memoryValue;
		}

		public Integer getCpuValue() {
			return this.cpuValue;
		}

		public void setCpuValue(Integer cpuValue) {
			this.cpuValue = cpuValue;
		}

		public Integer getLoadValue() {
			return this.loadValue;
		}

		public void setLoadValue(Integer loadValue) {
			this.loadValue = loadValue;
		}

		public Integer getCpuCore() {
			return this.cpuCore;
		}

		public void setCpuCore(Integer cpuCore) {
			this.cpuCore = cpuCore;
		}

		public String getMemory() {
			return this.memory;
		}

		public void setMemory(String memory) {
			this.memory = memory;
		}
	}

	public static class GroupInfo {

		private String type;

		private Integer groupId;

		private String groupName;

		private List<InstanceAndPort> instanceAndPortList;

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public Integer getGroupId() {
			return this.groupId;
		}

		public void setGroupId(Integer groupId) {
			this.groupId = groupId;
		}

		public String getGroupName() {
			return this.groupName;
		}

		public void setGroupName(String groupName) {
			this.groupName = groupName;
		}

		public List<InstanceAndPort> getInstanceAndPortList() {
			return this.instanceAndPortList;
		}

		public void setInstanceAndPortList(List<InstanceAndPort> instanceAndPortList) {
			this.instanceAndPortList = instanceAndPortList;
		}

		public static class InstanceAndPort {

			private String address;

			private String instanceId;

			private String addressPort;

			private String instanceName;

			public String getAddress() {
				return this.address;
			}

			public void setAddress(String address) {
				this.address = address;
			}

			public String getInstanceId() {
				return this.instanceId;
			}

			public void setInstanceId(String instanceId) {
				this.instanceId = instanceId;
			}

			public String getAddressPort() {
				return this.addressPort;
			}

			public void setAddressPort(String addressPort) {
				this.addressPort = addressPort;
			}

			public String getInstanceName() {
				return this.instanceName;
			}

			public void setInstanceName(String instanceName) {
				this.instanceName = instanceName;
			}
		}
	}

	@Override
	public DescribeGroupPerformanceForSLBResponse getInstance(UnmarshallerContext context) {
		return	DescribeGroupPerformanceForSLBResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
