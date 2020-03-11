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

package com.aliyuncs.mse.model.v20190531;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.mse.transform.v20190531.QueryClusterDetailResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryClusterDetailResponse extends AcsResponse {

	private String requestId;

	private String success;

	private String message;

	private String errorCode;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getSuccess() {
		return this.success;
	}

	public void setSuccess(String success) {
		this.success = success;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String clusterType;

		private String clusterId;

		private String appVersion;

		private String regionId;

		private Integer instanceCount;

		private Integer cpu;

		private Long memoryCapacity;

		private Long diskCapacity;

		private String diskType;

		private String healthStatus;

		private String clusterName;

		private String clusterAliasName;

		private String initStatus;

		private String payInfo;

		private String intranetAddress;

		private String internetAddress;

		private String intranetDomain;

		private String internetDomain;

		private String intranetPort;

		private String internetPort;

		private String createTime;

		private String aclId;

		private String aclEntryList;

		private Long initCostTime;

		private String vpcId;

		private String pubNetworkFlow;

		private List<InstanceModel> instanceModels;

		public String getClusterType() {
			return this.clusterType;
		}

		public void setClusterType(String clusterType) {
			this.clusterType = clusterType;
		}

		public String getClusterId() {
			return this.clusterId;
		}

		public void setClusterId(String clusterId) {
			this.clusterId = clusterId;
		}

		public String getAppVersion() {
			return this.appVersion;
		}

		public void setAppVersion(String appVersion) {
			this.appVersion = appVersion;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public Integer getInstanceCount() {
			return this.instanceCount;
		}

		public void setInstanceCount(Integer instanceCount) {
			this.instanceCount = instanceCount;
		}

		public Integer getCpu() {
			return this.cpu;
		}

		public void setCpu(Integer cpu) {
			this.cpu = cpu;
		}

		public Long getMemoryCapacity() {
			return this.memoryCapacity;
		}

		public void setMemoryCapacity(Long memoryCapacity) {
			this.memoryCapacity = memoryCapacity;
		}

		public Long getDiskCapacity() {
			return this.diskCapacity;
		}

		public void setDiskCapacity(Long diskCapacity) {
			this.diskCapacity = diskCapacity;
		}

		public String getDiskType() {
			return this.diskType;
		}

		public void setDiskType(String diskType) {
			this.diskType = diskType;
		}

		public String getHealthStatus() {
			return this.healthStatus;
		}

		public void setHealthStatus(String healthStatus) {
			this.healthStatus = healthStatus;
		}

		public String getClusterName() {
			return this.clusterName;
		}

		public void setClusterName(String clusterName) {
			this.clusterName = clusterName;
		}

		public String getClusterAliasName() {
			return this.clusterAliasName;
		}

		public void setClusterAliasName(String clusterAliasName) {
			this.clusterAliasName = clusterAliasName;
		}

		public String getInitStatus() {
			return this.initStatus;
		}

		public void setInitStatus(String initStatus) {
			this.initStatus = initStatus;
		}

		public String getPayInfo() {
			return this.payInfo;
		}

		public void setPayInfo(String payInfo) {
			this.payInfo = payInfo;
		}

		public String getIntranetAddress() {
			return this.intranetAddress;
		}

		public void setIntranetAddress(String intranetAddress) {
			this.intranetAddress = intranetAddress;
		}

		public String getInternetAddress() {
			return this.internetAddress;
		}

		public void setInternetAddress(String internetAddress) {
			this.internetAddress = internetAddress;
		}

		public String getIntranetDomain() {
			return this.intranetDomain;
		}

		public void setIntranetDomain(String intranetDomain) {
			this.intranetDomain = intranetDomain;
		}

		public String getInternetDomain() {
			return this.internetDomain;
		}

		public void setInternetDomain(String internetDomain) {
			this.internetDomain = internetDomain;
		}

		public String getIntranetPort() {
			return this.intranetPort;
		}

		public void setIntranetPort(String intranetPort) {
			this.intranetPort = intranetPort;
		}

		public String getInternetPort() {
			return this.internetPort;
		}

		public void setInternetPort(String internetPort) {
			this.internetPort = internetPort;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getAclId() {
			return this.aclId;
		}

		public void setAclId(String aclId) {
			this.aclId = aclId;
		}

		public String getAclEntryList() {
			return this.aclEntryList;
		}

		public void setAclEntryList(String aclEntryList) {
			this.aclEntryList = aclEntryList;
		}

		public Long getInitCostTime() {
			return this.initCostTime;
		}

		public void setInitCostTime(Long initCostTime) {
			this.initCostTime = initCostTime;
		}

		public String getVpcId() {
			return this.vpcId;
		}

		public void setVpcId(String vpcId) {
			this.vpcId = vpcId;
		}

		public String getPubNetworkFlow() {
			return this.pubNetworkFlow;
		}

		public void setPubNetworkFlow(String pubNetworkFlow) {
			this.pubNetworkFlow = pubNetworkFlow;
		}

		public List<InstanceModel> getInstanceModels() {
			return this.instanceModels;
		}

		public void setInstanceModels(List<InstanceModel> instanceModels) {
			this.instanceModels = instanceModels;
		}

		public static class InstanceModel {

			private String instanceType;

			private String instanceId;

			private String ip;

			private String vip;

			private String healthStatus;

			private String clusterId;

			private String role;

			private String podName;

			private String internetIp;

			private String singleTunnelVip;

			private String zkClientPort;

			public String getInstanceType() {
				return this.instanceType;
			}

			public void setInstanceType(String instanceType) {
				this.instanceType = instanceType;
			}

			public String getInstanceId() {
				return this.instanceId;
			}

			public void setInstanceId(String instanceId) {
				this.instanceId = instanceId;
			}

			public String getIp() {
				return this.ip;
			}

			public void setIp(String ip) {
				this.ip = ip;
			}

			public String getVip() {
				return this.vip;
			}

			public void setVip(String vip) {
				this.vip = vip;
			}

			public String getHealthStatus() {
				return this.healthStatus;
			}

			public void setHealthStatus(String healthStatus) {
				this.healthStatus = healthStatus;
			}

			public String getClusterId() {
				return this.clusterId;
			}

			public void setClusterId(String clusterId) {
				this.clusterId = clusterId;
			}

			public String getRole() {
				return this.role;
			}

			public void setRole(String role) {
				this.role = role;
			}

			public String getPodName() {
				return this.podName;
			}

			public void setPodName(String podName) {
				this.podName = podName;
			}

			public String getInternetIp() {
				return this.internetIp;
			}

			public void setInternetIp(String internetIp) {
				this.internetIp = internetIp;
			}

			public String getSingleTunnelVip() {
				return this.singleTunnelVip;
			}

			public void setSingleTunnelVip(String singleTunnelVip) {
				this.singleTunnelVip = singleTunnelVip;
			}

			public String getZkClientPort() {
				return this.zkClientPort;
			}

			public void setZkClientPort(String zkClientPort) {
				this.zkClientPort = zkClientPort;
			}
		}
	}

	@Override
	public QueryClusterDetailResponse getInstance(UnmarshallerContext context) {
		return	QueryClusterDetailResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
