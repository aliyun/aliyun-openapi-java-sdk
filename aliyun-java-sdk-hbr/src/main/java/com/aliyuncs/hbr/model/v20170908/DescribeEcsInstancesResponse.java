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

package com.aliyuncs.hbr.model.v20170908;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.hbr.transform.v20170908.DescribeEcsInstancesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeEcsInstancesResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Integer totalCount;

	private Integer pageSize;

	private Integer pageNumber;

	private List<EcsInstance> ecsInstances;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
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

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public List<EcsInstance> getEcsInstances() {
		return this.ecsInstances;
	}

	public void setEcsInstances(List<EcsInstance> ecsInstances) {
		this.ecsInstances = ecsInstances;
	}

	public static class EcsInstance {

		private String instanceId;

		private String instanceName;

		private String instanceNetworkType;

		private Boolean cloudAssistantStatus;

		private String clientStatus;

		private String clientVersion;

		private String status;

		private String osType;

		private String osName;

		private String osNameEn;

		private String clientInstallStatus;

		private String regionId;

		private String zoneId;

		private Integer cpu;

		private Integer memory;

		private String hostName;

		private String eipAddress;

		private String clientId;

		private String createdByProduct;

		private String maxClientVersion;

		private List<String> innerIpAddress;

		private List<String> publicIpAddress;

		private List<String> privateIpAddress;

		private ClientSettings clientSettings;

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

		public String getInstanceNetworkType() {
			return this.instanceNetworkType;
		}

		public void setInstanceNetworkType(String instanceNetworkType) {
			this.instanceNetworkType = instanceNetworkType;
		}

		public Boolean getCloudAssistantStatus() {
			return this.cloudAssistantStatus;
		}

		public void setCloudAssistantStatus(Boolean cloudAssistantStatus) {
			this.cloudAssistantStatus = cloudAssistantStatus;
		}

		public String getClientStatus() {
			return this.clientStatus;
		}

		public void setClientStatus(String clientStatus) {
			this.clientStatus = clientStatus;
		}

		public String getClientVersion() {
			return this.clientVersion;
		}

		public void setClientVersion(String clientVersion) {
			this.clientVersion = clientVersion;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getOsType() {
			return this.osType;
		}

		public void setOsType(String osType) {
			this.osType = osType;
		}

		public String getOsName() {
			return this.osName;
		}

		public void setOsName(String osName) {
			this.osName = osName;
		}

		public String getOsNameEn() {
			return this.osNameEn;
		}

		public void setOsNameEn(String osNameEn) {
			this.osNameEn = osNameEn;
		}

		public String getClientInstallStatus() {
			return this.clientInstallStatus;
		}

		public void setClientInstallStatus(String clientInstallStatus) {
			this.clientInstallStatus = clientInstallStatus;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getZoneId() {
			return this.zoneId;
		}

		public void setZoneId(String zoneId) {
			this.zoneId = zoneId;
		}

		public Integer getCpu() {
			return this.cpu;
		}

		public void setCpu(Integer cpu) {
			this.cpu = cpu;
		}

		public Integer getMemory() {
			return this.memory;
		}

		public void setMemory(Integer memory) {
			this.memory = memory;
		}

		public String getHostName() {
			return this.hostName;
		}

		public void setHostName(String hostName) {
			this.hostName = hostName;
		}

		public String getEipAddress() {
			return this.eipAddress;
		}

		public void setEipAddress(String eipAddress) {
			this.eipAddress = eipAddress;
		}

		public String getClientId() {
			return this.clientId;
		}

		public void setClientId(String clientId) {
			this.clientId = clientId;
		}

		public String getCreatedByProduct() {
			return this.createdByProduct;
		}

		public void setCreatedByProduct(String createdByProduct) {
			this.createdByProduct = createdByProduct;
		}

		public String getMaxClientVersion() {
			return this.maxClientVersion;
		}

		public void setMaxClientVersion(String maxClientVersion) {
			this.maxClientVersion = maxClientVersion;
		}

		public List<String> getInnerIpAddress() {
			return this.innerIpAddress;
		}

		public void setInnerIpAddress(List<String> innerIpAddress) {
			this.innerIpAddress = innerIpAddress;
		}

		public List<String> getPublicIpAddress() {
			return this.publicIpAddress;
		}

		public void setPublicIpAddress(List<String> publicIpAddress) {
			this.publicIpAddress = publicIpAddress;
		}

		public List<String> getPrivateIpAddress() {
			return this.privateIpAddress;
		}

		public void setPrivateIpAddress(List<String> privateIpAddress) {
			this.privateIpAddress = privateIpAddress;
		}

		public ClientSettings getClientSettings() {
			return this.clientSettings;
		}

		public void setClientSettings(ClientSettings clientSettings) {
			this.clientSettings = clientSettings;
		}

		public static class ClientSettings {

			private String useHttps;

			private String dataNetworkType;

			private Integer maxCpuCore;

			private Integer maxWorker;

			private String dataProxySetting;

			private String proxyHost;

			private Integer proxyPort;

			private String proxyUser;

			private String proxyPassword;

			public String getUseHttps() {
				return this.useHttps;
			}

			public void setUseHttps(String useHttps) {
				this.useHttps = useHttps;
			}

			public String getDataNetworkType() {
				return this.dataNetworkType;
			}

			public void setDataNetworkType(String dataNetworkType) {
				this.dataNetworkType = dataNetworkType;
			}

			public Integer getMaxCpuCore() {
				return this.maxCpuCore;
			}

			public void setMaxCpuCore(Integer maxCpuCore) {
				this.maxCpuCore = maxCpuCore;
			}

			public Integer getMaxWorker() {
				return this.maxWorker;
			}

			public void setMaxWorker(Integer maxWorker) {
				this.maxWorker = maxWorker;
			}

			public String getDataProxySetting() {
				return this.dataProxySetting;
			}

			public void setDataProxySetting(String dataProxySetting) {
				this.dataProxySetting = dataProxySetting;
			}

			public String getProxyHost() {
				return this.proxyHost;
			}

			public void setProxyHost(String proxyHost) {
				this.proxyHost = proxyHost;
			}

			public Integer getProxyPort() {
				return this.proxyPort;
			}

			public void setProxyPort(Integer proxyPort) {
				this.proxyPort = proxyPort;
			}

			public String getProxyUser() {
				return this.proxyUser;
			}

			public void setProxyUser(String proxyUser) {
				this.proxyUser = proxyUser;
			}

			public String getProxyPassword() {
				return this.proxyPassword;
			}

			public void setProxyPassword(String proxyPassword) {
				this.proxyPassword = proxyPassword;
			}
		}
	}

	@Override
	public DescribeEcsInstancesResponse getInstance(UnmarshallerContext context) {
		return	DescribeEcsInstancesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
