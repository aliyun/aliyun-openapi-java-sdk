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
import com.aliyuncs.hbr.transform.v20170908.DescribeClientsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeClientsResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Integer totalCount;

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

	public List<Client> getClients() {
		return this.clients;
	}

	public void setClients(List<Client> clients) {
		this.clients = clients;
	}

	public static class Client {

		private String clientId;

		private String clientName;

		private String vaultId;

		private String hostName;

		private String status;

		private String networkType;

		private Long snapshotTotal;

		private Long snapshotRunning;

		private Long snapshotComplete;

		private Long snapshotFailed;

		private Long createdTime;

		private Long updatedTime;

		private String clientVersion;

		private String platformType;

		private String clientType;

		private String alertSetting;

		private String contactId;

		private Long snapshotPartialComplete;

		private String statusMessage;

		private String instanceId;

		private String instanceName;

		private String osName;

		private Long jobsCount;

		private String maxVersion;

		private String eipAddress;

		private String vaultType;

		private String gatewayId;

		private String gatewayName;

		private String gatewayInnerIp;

		private String gatewayStatus;

		private List<String> sourceTypes;

		private List<String> innerIpAddresses;

		private List<String> publicIpAddresses;

		private List<String> privateIpAddresses;

		public String getClientId() {
			return this.clientId;
		}

		public void setClientId(String clientId) {
			this.clientId = clientId;
		}

		public String getClientName() {
			return this.clientName;
		}

		public void setClientName(String clientName) {
			this.clientName = clientName;
		}

		public String getVaultId() {
			return this.vaultId;
		}

		public void setVaultId(String vaultId) {
			this.vaultId = vaultId;
		}

		public String getHostName() {
			return this.hostName;
		}

		public void setHostName(String hostName) {
			this.hostName = hostName;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getNetworkType() {
			return this.networkType;
		}

		public void setNetworkType(String networkType) {
			this.networkType = networkType;
		}

		public Long getSnapshotTotal() {
			return this.snapshotTotal;
		}

		public void setSnapshotTotal(Long snapshotTotal) {
			this.snapshotTotal = snapshotTotal;
		}

		public Long getSnapshotRunning() {
			return this.snapshotRunning;
		}

		public void setSnapshotRunning(Long snapshotRunning) {
			this.snapshotRunning = snapshotRunning;
		}

		public Long getSnapshotComplete() {
			return this.snapshotComplete;
		}

		public void setSnapshotComplete(Long snapshotComplete) {
			this.snapshotComplete = snapshotComplete;
		}

		public Long getSnapshotFailed() {
			return this.snapshotFailed;
		}

		public void setSnapshotFailed(Long snapshotFailed) {
			this.snapshotFailed = snapshotFailed;
		}

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

		public String getClientVersion() {
			return this.clientVersion;
		}

		public void setClientVersion(String clientVersion) {
			this.clientVersion = clientVersion;
		}

		public String getPlatformType() {
			return this.platformType;
		}

		public void setPlatformType(String platformType) {
			this.platformType = platformType;
		}

		public String getClientType() {
			return this.clientType;
		}

		public void setClientType(String clientType) {
			this.clientType = clientType;
		}

		public String getAlertSetting() {
			return this.alertSetting;
		}

		public void setAlertSetting(String alertSetting) {
			this.alertSetting = alertSetting;
		}

		public String getContactId() {
			return this.contactId;
		}

		public void setContactId(String contactId) {
			this.contactId = contactId;
		}

		public Long getSnapshotPartialComplete() {
			return this.snapshotPartialComplete;
		}

		public void setSnapshotPartialComplete(Long snapshotPartialComplete) {
			this.snapshotPartialComplete = snapshotPartialComplete;
		}

		public String getStatusMessage() {
			return this.statusMessage;
		}

		public void setStatusMessage(String statusMessage) {
			this.statusMessage = statusMessage;
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

		public String getOsName() {
			return this.osName;
		}

		public void setOsName(String osName) {
			this.osName = osName;
		}

		public Long getJobsCount() {
			return this.jobsCount;
		}

		public void setJobsCount(Long jobsCount) {
			this.jobsCount = jobsCount;
		}

		public String getMaxVersion() {
			return this.maxVersion;
		}

		public void setMaxVersion(String maxVersion) {
			this.maxVersion = maxVersion;
		}

		public String getEipAddress() {
			return this.eipAddress;
		}

		public void setEipAddress(String eipAddress) {
			this.eipAddress = eipAddress;
		}

		public String getVaultType() {
			return this.vaultType;
		}

		public void setVaultType(String vaultType) {
			this.vaultType = vaultType;
		}

		public String getGatewayId() {
			return this.gatewayId;
		}

		public void setGatewayId(String gatewayId) {
			this.gatewayId = gatewayId;
		}

		public String getGatewayName() {
			return this.gatewayName;
		}

		public void setGatewayName(String gatewayName) {
			this.gatewayName = gatewayName;
		}

		public String getGatewayInnerIp() {
			return this.gatewayInnerIp;
		}

		public void setGatewayInnerIp(String gatewayInnerIp) {
			this.gatewayInnerIp = gatewayInnerIp;
		}

		public String getGatewayStatus() {
			return this.gatewayStatus;
		}

		public void setGatewayStatus(String gatewayStatus) {
			this.gatewayStatus = gatewayStatus;
		}

		public List<String> getSourceTypes() {
			return this.sourceTypes;
		}

		public void setSourceTypes(List<String> sourceTypes) {
			this.sourceTypes = sourceTypes;
		}

		public List<String> getInnerIpAddresses() {
			return this.innerIpAddresses;
		}

		public void setInnerIpAddresses(List<String> innerIpAddresses) {
			this.innerIpAddresses = innerIpAddresses;
		}

		public List<String> getPublicIpAddresses() {
			return this.publicIpAddresses;
		}

		public void setPublicIpAddresses(List<String> publicIpAddresses) {
			this.publicIpAddresses = publicIpAddresses;
		}

		public List<String> getPrivateIpAddresses() {
			return this.privateIpAddresses;
		}

		public void setPrivateIpAddresses(List<String> privateIpAddresses) {
			this.privateIpAddresses = privateIpAddresses;
		}
	}

	@Override
	public DescribeClientsResponse getInstance(UnmarshallerContext context) {
		return	DescribeClientsResponseUnmarshaller.unmarshall(this, context);
	}
}
