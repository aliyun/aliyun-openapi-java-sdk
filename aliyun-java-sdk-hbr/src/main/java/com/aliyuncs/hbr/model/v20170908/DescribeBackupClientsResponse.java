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

	private Integer pageNumber;

	private Integer pageSize;

	private Long totalCount;

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

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public List<Client> getClients() {
		return this.clients;
	}

	public void setClients(List<Client> clients) {
		this.clients = clients;
	}

	public static class Client {

		private String status;

		private String backupStatus;

		private String archType;

		private String clientId;

		private String maxClientVersion;

		private String privateIpV4;

		private String instanceName;

		private Long createdTime;

		private Long lastHeartBeatTime;

		private String clusterId;

		private String productAssetTag;

		private Long registerTime;

		private String clientType;

		private String productName;

		private String hostname;

		private String instanceId;

		private String productVersion;

		private Boolean appliance;

		private String productPartNumber;

		private Long updatedTime;

		private String osType;

		private String zoneId;

		private String productManufacturer;

		private String userDefinedKey;

		private String productSerialNumber;

		private String clientVersion;

		private List<Tag> tags;

		private Settings settings;

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

		public String getArchType() {
			return this.archType;
		}

		public void setArchType(String archType) {
			this.archType = archType;
		}

		public String getClientId() {
			return this.clientId;
		}

		public void setClientId(String clientId) {
			this.clientId = clientId;
		}

		public String getMaxClientVersion() {
			return this.maxClientVersion;
		}

		public void setMaxClientVersion(String maxClientVersion) {
			this.maxClientVersion = maxClientVersion;
		}

		public String getPrivateIpV4() {
			return this.privateIpV4;
		}

		public void setPrivateIpV4(String privateIpV4) {
			this.privateIpV4 = privateIpV4;
		}

		public String getInstanceName() {
			return this.instanceName;
		}

		public void setInstanceName(String instanceName) {
			this.instanceName = instanceName;
		}

		public Long getCreatedTime() {
			return this.createdTime;
		}

		public void setCreatedTime(Long createdTime) {
			this.createdTime = createdTime;
		}

		public Long getLastHeartBeatTime() {
			return this.lastHeartBeatTime;
		}

		public void setLastHeartBeatTime(Long lastHeartBeatTime) {
			this.lastHeartBeatTime = lastHeartBeatTime;
		}

		public String getClusterId() {
			return this.clusterId;
		}

		public void setClusterId(String clusterId) {
			this.clusterId = clusterId;
		}

		public String getProductAssetTag() {
			return this.productAssetTag;
		}

		public void setProductAssetTag(String productAssetTag) {
			this.productAssetTag = productAssetTag;
		}

		public Long getRegisterTime() {
			return this.registerTime;
		}

		public void setRegisterTime(Long registerTime) {
			this.registerTime = registerTime;
		}

		public String getClientType() {
			return this.clientType;
		}

		public void setClientType(String clientType) {
			this.clientType = clientType;
		}

		public String getProductName() {
			return this.productName;
		}

		public void setProductName(String productName) {
			this.productName = productName;
		}

		public String getHostname() {
			return this.hostname;
		}

		public void setHostname(String hostname) {
			this.hostname = hostname;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getProductVersion() {
			return this.productVersion;
		}

		public void setProductVersion(String productVersion) {
			this.productVersion = productVersion;
		}

		public Boolean getAppliance() {
			return this.appliance;
		}

		public void setAppliance(Boolean appliance) {
			this.appliance = appliance;
		}

		public String getProductPartNumber() {
			return this.productPartNumber;
		}

		public void setProductPartNumber(String productPartNumber) {
			this.productPartNumber = productPartNumber;
		}

		public Long getUpdatedTime() {
			return this.updatedTime;
		}

		public void setUpdatedTime(Long updatedTime) {
			this.updatedTime = updatedTime;
		}

		public String getOsType() {
			return this.osType;
		}

		public void setOsType(String osType) {
			this.osType = osType;
		}

		public String getZoneId() {
			return this.zoneId;
		}

		public void setZoneId(String zoneId) {
			this.zoneId = zoneId;
		}

		public String getProductManufacturer() {
			return this.productManufacturer;
		}

		public void setProductManufacturer(String productManufacturer) {
			this.productManufacturer = productManufacturer;
		}

		public String getUserDefinedKey() {
			return this.userDefinedKey;
		}

		public void setUserDefinedKey(String userDefinedKey) {
			this.userDefinedKey = userDefinedKey;
		}

		public String getProductSerialNumber() {
			return this.productSerialNumber;
		}

		public void setProductSerialNumber(String productSerialNumber) {
			this.productSerialNumber = productSerialNumber;
		}

		public String getClientVersion() {
			return this.clientVersion;
		}

		public void setClientVersion(String clientVersion) {
			this.clientVersion = clientVersion;
		}

		public List<Tag> getTags() {
			return this.tags;
		}

		public void setTags(List<Tag> tags) {
			this.tags = tags;
		}

		public Settings getSettings() {
			return this.settings;
		}

		public void setSettings(Settings settings) {
			this.settings = settings;
		}

		public static class Tag {

			private String key;

			private String value;

			public String getKey() {
				return this.key;
			}

			public void setKey(String key) {
				this.key = key;
			}

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}
		}

		public static class Settings {

			private String proxyHost;

			private String maxCpuCore;

			private Integer proxyPort;

			private String useHttps;

			private String proxyPassword;

			private String proxyUser;

			private String dataProxySetting;

			private String dataNetworkType;

			private String maxWorker;

			private Long maxMemory;

			private Boolean alertOnPartialComplete;

			public String getProxyHost() {
				return this.proxyHost;
			}

			public void setProxyHost(String proxyHost) {
				this.proxyHost = proxyHost;
			}

			public String getMaxCpuCore() {
				return this.maxCpuCore;
			}

			public void setMaxCpuCore(String maxCpuCore) {
				this.maxCpuCore = maxCpuCore;
			}

			public Integer getProxyPort() {
				return this.proxyPort;
			}

			public void setProxyPort(Integer proxyPort) {
				this.proxyPort = proxyPort;
			}

			public String getUseHttps() {
				return this.useHttps;
			}

			public void setUseHttps(String useHttps) {
				this.useHttps = useHttps;
			}

			public String getProxyPassword() {
				return this.proxyPassword;
			}

			public void setProxyPassword(String proxyPassword) {
				this.proxyPassword = proxyPassword;
			}

			public String getProxyUser() {
				return this.proxyUser;
			}

			public void setProxyUser(String proxyUser) {
				this.proxyUser = proxyUser;
			}

			public String getDataProxySetting() {
				return this.dataProxySetting;
			}

			public void setDataProxySetting(String dataProxySetting) {
				this.dataProxySetting = dataProxySetting;
			}

			public String getDataNetworkType() {
				return this.dataNetworkType;
			}

			public void setDataNetworkType(String dataNetworkType) {
				this.dataNetworkType = dataNetworkType;
			}

			public String getMaxWorker() {
				return this.maxWorker;
			}

			public void setMaxWorker(String maxWorker) {
				this.maxWorker = maxWorker;
			}

			public Long getMaxMemory() {
				return this.maxMemory;
			}

			public void setMaxMemory(Long maxMemory) {
				this.maxMemory = maxMemory;
			}

			public Boolean getAlertOnPartialComplete() {
				return this.alertOnPartialComplete;
			}

			public void setAlertOnPartialComplete(Boolean alertOnPartialComplete) {
				this.alertOnPartialComplete = alertOnPartialComplete;
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
