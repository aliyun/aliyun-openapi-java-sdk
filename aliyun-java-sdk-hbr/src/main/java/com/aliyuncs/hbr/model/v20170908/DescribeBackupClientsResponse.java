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
import com.aliyuncs.hbr.transform.v20170908.DescribeBackupClientsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeBackupClientsResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Long totalCount;

	private Integer pageSize;

	private Integer pageNumber;

	private List<Client> clients;

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

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
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

	public List<Client> getClients() {
		return this.clients;
	}

	public void setClients(List<Client> clients) {
		this.clients = clients;
	}

	public static class Client {

		private Long createdTime;

		private Long updatedTime;

		private String clientType;

		private String clientId;

		private String clientVersion;

		private String osType;

		private String archType;

		private String hostname;

		private Long lastHeartBeatTime;

		private String instanceId;

		private String zoneId;

		private String privateIpV4;

		private Boolean appliance;

		private String productManufacturer;

		private String productName;

		private String productPartNumber;

		private String productVersion;

		private String productSerialNumber;

		private String productAssetTag;

		private String status;

		private String backupStatus;

		private String instanceName;

		private String clusterId;

		private Long registerTime;

		private String maxClientVersion;

		private Settings settings;

		public Long getCreatedTime() {
			return this.createdTime;
		}

		public void setCreatedTime(Long createdTime) {
			this.createdTime = createdTime;
		}

		public Long getUpdatedTime() {
			return this.updatedTime;
		}

		public void setUpdatedTime(Long updatedTime) {
			this.updatedTime = updatedTime;
		}

		public String getClientType() {
			return this.clientType;
		}

		public void setClientType(String clientType) {
			this.clientType = clientType;
		}

		public String getClientId() {
			return this.clientId;
		}

		public void setClientId(String clientId) {
			this.clientId = clientId;
		}

		public String getClientVersion() {
			return this.clientVersion;
		}

		public void setClientVersion(String clientVersion) {
			this.clientVersion = clientVersion;
		}

		public String getOsType() {
			return this.osType;
		}

		public void setOsType(String osType) {
			this.osType = osType;
		}

		public String getArchType() {
			return this.archType;
		}

		public void setArchType(String archType) {
			this.archType = archType;
		}

		public String getHostname() {
			return this.hostname;
		}

		public void setHostname(String hostname) {
			this.hostname = hostname;
		}

		public Long getLastHeartBeatTime() {
			return this.lastHeartBeatTime;
		}

		public void setLastHeartBeatTime(Long lastHeartBeatTime) {
			this.lastHeartBeatTime = lastHeartBeatTime;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getZoneId() {
			return this.zoneId;
		}

		public void setZoneId(String zoneId) {
			this.zoneId = zoneId;
		}

		public String getPrivateIpV4() {
			return this.privateIpV4;
		}

		public void setPrivateIpV4(String privateIpV4) {
			this.privateIpV4 = privateIpV4;
		}

		public Boolean getAppliance() {
			return this.appliance;
		}

		public void setAppliance(Boolean appliance) {
			this.appliance = appliance;
		}

		public String getProductManufacturer() {
			return this.productManufacturer;
		}

		public void setProductManufacturer(String productManufacturer) {
			this.productManufacturer = productManufacturer;
		}

		public String getProductName() {
			return this.productName;
		}

		public void setProductName(String productName) {
			this.productName = productName;
		}

		public String getProductPartNumber() {
			return this.productPartNumber;
		}

		public void setProductPartNumber(String productPartNumber) {
			this.productPartNumber = productPartNumber;
		}

		public String getProductVersion() {
			return this.productVersion;
		}

		public void setProductVersion(String productVersion) {
			this.productVersion = productVersion;
		}

		public String getProductSerialNumber() {
			return this.productSerialNumber;
		}

		public void setProductSerialNumber(String productSerialNumber) {
			this.productSerialNumber = productSerialNumber;
		}

		public String getProductAssetTag() {
			return this.productAssetTag;
		}

		public void setProductAssetTag(String productAssetTag) {
			this.productAssetTag = productAssetTag;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getBackupStatus() {
			return this.backupStatus;
		}

		public void setBackupStatus(String backupStatus) {
			this.backupStatus = backupStatus;
		}

		public String getInstanceName() {
			return this.instanceName;
		}

		public void setInstanceName(String instanceName) {
			this.instanceName = instanceName;
		}

		public String getClusterId() {
			return this.clusterId;
		}

		public void setClusterId(String clusterId) {
			this.clusterId = clusterId;
		}

		public Long getRegisterTime() {
			return this.registerTime;
		}

		public void setRegisterTime(Long registerTime) {
			this.registerTime = registerTime;
		}

		public String getMaxClientVersion() {
			return this.maxClientVersion;
		}

		public void setMaxClientVersion(String maxClientVersion) {
			this.maxClientVersion = maxClientVersion;
		}

		public Settings getSettings() {
			return this.settings;
		}

		public void setSettings(Settings settings) {
			this.settings = settings;
		}

		public static class Settings {

			private String dataNetworkType;

			private String useHttps;

			private String maxCpuCore;

			private String maxWorker;

			private String dataProxySetting;

			private String proxyHost;

			private Integer proxyPort;

			private String proxyUser;

			private String proxyPassword;

			public String getDataNetworkType() {
				return this.dataNetworkType;
			}

			public void setDataNetworkType(String dataNetworkType) {
				this.dataNetworkType = dataNetworkType;
			}

			public String getUseHttps() {
				return this.useHttps;
			}

			public void setUseHttps(String useHttps) {
				this.useHttps = useHttps;
			}

			public String getMaxCpuCore() {
				return this.maxCpuCore;
			}

			public void setMaxCpuCore(String maxCpuCore) {
				this.maxCpuCore = maxCpuCore;
			}

			public String getMaxWorker() {
				return this.maxWorker;
			}

			public void setMaxWorker(String maxWorker) {
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
	public DescribeBackupClientsResponse getInstance(UnmarshallerContext context) {
		return	DescribeBackupClientsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
