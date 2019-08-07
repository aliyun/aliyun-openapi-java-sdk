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

package com.aliyuncs.hdr.model.v20170925;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.hdr.transform.v20170925.DescribeServersResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeServersResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Integer totalCount;

	private Integer pageNumber;

	private Integer pageSize;

	private List<Server> servers;

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

	public List<Server> getServers() {
		return this.servers;
	}

	public void setServers(List<Server> servers) {
		this.servers = servers;
	}

	public static class Server {

		private String serverId;

		private String originalInstanceId;

		private String hostname;

		private String alias;

		private String ipAddress;

		private String osType;

		private String osDetail;

		private Integer cpu;

		private Long memory;

		private String agentVersion;

		private String connectionStatus;

		private String upgradeStatus;

		private String status;

		private String primarySiteId;

		private String secondarySiteId;

		private Boolean replicationUseOriginalInstance;

		private String replicationInfrastructureId;

		private String replicationInfrastructureType;

		private String replicationLocation;

		private String replicationComputeResource;

		private String replicationDatastore;

		private Boolean replicationUseSsd;

		private String replicationNetwork;

		private Boolean replicationUseDhcp;

		private String replicationIpAddress;

		private String replicationNetMask;

		private String replicationDns;

		private String replicationGateway;

		private String crashConsistentPointPolicy;

		private String appConsistentPointPolicy;

		private Integer rpo;

		private Integer fullSyncProgress;

		private Long fullSyncTotalSize;

		private Long fullSyncCurrentSize;

		private Long fullSyncStartTime;

		private Long incrementalSyncStartTime;

		private String errno;

		private String recoveryInfrastructureId;

		private String recoveryInfrastructureType;

		private String recoveryInstanceName;

		private Integer recoveryCpu;

		private Long recoveryMemory;

		private Boolean recoveryUseSsd;

		private String recoveryNetwork;

		private Boolean recoveryReserveIp;

		private Boolean recoveryUseDhcp;

		private String recoveryIpAddress;

		private String recoveryPostScriptType;

		private String recoveryPostScriptContent;

		private String testRecoveredInstanceName;

		private String testRecoveredInstanceId;

		private String testRecoveredIpAddress;

		private String testFailoverStatus;

		private String recoveredInstanceName;

		private String recoveredInstanceId;

		private String recoveredIpAddress;

		private String taskId;

		private String operations;

		private String sourceGatewayVersion;

		private String targetGatewayVersion;

		public String getServerId() {
			return this.serverId;
		}

		public void setServerId(String serverId) {
			this.serverId = serverId;
		}

		public String getOriginalInstanceId() {
			return this.originalInstanceId;
		}

		public void setOriginalInstanceId(String originalInstanceId) {
			this.originalInstanceId = originalInstanceId;
		}

		public String getHostname() {
			return this.hostname;
		}

		public void setHostname(String hostname) {
			this.hostname = hostname;
		}

		public String getAlias() {
			return this.alias;
		}

		public void setAlias(String alias) {
			this.alias = alias;
		}

		public String getIpAddress() {
			return this.ipAddress;
		}

		public void setIpAddress(String ipAddress) {
			this.ipAddress = ipAddress;
		}

		public String getOsType() {
			return this.osType;
		}

		public void setOsType(String osType) {
			this.osType = osType;
		}

		public String getOsDetail() {
			return this.osDetail;
		}

		public void setOsDetail(String osDetail) {
			this.osDetail = osDetail;
		}

		public Integer getCpu() {
			return this.cpu;
		}

		public void setCpu(Integer cpu) {
			this.cpu = cpu;
		}

		public Long getMemory() {
			return this.memory;
		}

		public void setMemory(Long memory) {
			this.memory = memory;
		}

		public String getAgentVersion() {
			return this.agentVersion;
		}

		public void setAgentVersion(String agentVersion) {
			this.agentVersion = agentVersion;
		}

		public String getConnectionStatus() {
			return this.connectionStatus;
		}

		public void setConnectionStatus(String connectionStatus) {
			this.connectionStatus = connectionStatus;
		}

		public String getUpgradeStatus() {
			return this.upgradeStatus;
		}

		public void setUpgradeStatus(String upgradeStatus) {
			this.upgradeStatus = upgradeStatus;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getPrimarySiteId() {
			return this.primarySiteId;
		}

		public void setPrimarySiteId(String primarySiteId) {
			this.primarySiteId = primarySiteId;
		}

		public String getSecondarySiteId() {
			return this.secondarySiteId;
		}

		public void setSecondarySiteId(String secondarySiteId) {
			this.secondarySiteId = secondarySiteId;
		}

		public Boolean getReplicationUseOriginalInstance() {
			return this.replicationUseOriginalInstance;
		}

		public void setReplicationUseOriginalInstance(Boolean replicationUseOriginalInstance) {
			this.replicationUseOriginalInstance = replicationUseOriginalInstance;
		}

		public String getReplicationInfrastructureId() {
			return this.replicationInfrastructureId;
		}

		public void setReplicationInfrastructureId(String replicationInfrastructureId) {
			this.replicationInfrastructureId = replicationInfrastructureId;
		}

		public String getReplicationInfrastructureType() {
			return this.replicationInfrastructureType;
		}

		public void setReplicationInfrastructureType(String replicationInfrastructureType) {
			this.replicationInfrastructureType = replicationInfrastructureType;
		}

		public String getReplicationLocation() {
			return this.replicationLocation;
		}

		public void setReplicationLocation(String replicationLocation) {
			this.replicationLocation = replicationLocation;
		}

		public String getReplicationComputeResource() {
			return this.replicationComputeResource;
		}

		public void setReplicationComputeResource(String replicationComputeResource) {
			this.replicationComputeResource = replicationComputeResource;
		}

		public String getReplicationDatastore() {
			return this.replicationDatastore;
		}

		public void setReplicationDatastore(String replicationDatastore) {
			this.replicationDatastore = replicationDatastore;
		}

		public Boolean getReplicationUseSsd() {
			return this.replicationUseSsd;
		}

		public void setReplicationUseSsd(Boolean replicationUseSsd) {
			this.replicationUseSsd = replicationUseSsd;
		}

		public String getReplicationNetwork() {
			return this.replicationNetwork;
		}

		public void setReplicationNetwork(String replicationNetwork) {
			this.replicationNetwork = replicationNetwork;
		}

		public Boolean getReplicationUseDhcp() {
			return this.replicationUseDhcp;
		}

		public void setReplicationUseDhcp(Boolean replicationUseDhcp) {
			this.replicationUseDhcp = replicationUseDhcp;
		}

		public String getReplicationIpAddress() {
			return this.replicationIpAddress;
		}

		public void setReplicationIpAddress(String replicationIpAddress) {
			this.replicationIpAddress = replicationIpAddress;
		}

		public String getReplicationNetMask() {
			return this.replicationNetMask;
		}

		public void setReplicationNetMask(String replicationNetMask) {
			this.replicationNetMask = replicationNetMask;
		}

		public String getReplicationDns() {
			return this.replicationDns;
		}

		public void setReplicationDns(String replicationDns) {
			this.replicationDns = replicationDns;
		}

		public String getReplicationGateway() {
			return this.replicationGateway;
		}

		public void setReplicationGateway(String replicationGateway) {
			this.replicationGateway = replicationGateway;
		}

		public String getCrashConsistentPointPolicy() {
			return this.crashConsistentPointPolicy;
		}

		public void setCrashConsistentPointPolicy(String crashConsistentPointPolicy) {
			this.crashConsistentPointPolicy = crashConsistentPointPolicy;
		}

		public String getAppConsistentPointPolicy() {
			return this.appConsistentPointPolicy;
		}

		public void setAppConsistentPointPolicy(String appConsistentPointPolicy) {
			this.appConsistentPointPolicy = appConsistentPointPolicy;
		}

		public Integer getRpo() {
			return this.rpo;
		}

		public void setRpo(Integer rpo) {
			this.rpo = rpo;
		}

		public Integer getFullSyncProgress() {
			return this.fullSyncProgress;
		}

		public void setFullSyncProgress(Integer fullSyncProgress) {
			this.fullSyncProgress = fullSyncProgress;
		}

		public Long getFullSyncTotalSize() {
			return this.fullSyncTotalSize;
		}

		public void setFullSyncTotalSize(Long fullSyncTotalSize) {
			this.fullSyncTotalSize = fullSyncTotalSize;
		}

		public Long getFullSyncCurrentSize() {
			return this.fullSyncCurrentSize;
		}

		public void setFullSyncCurrentSize(Long fullSyncCurrentSize) {
			this.fullSyncCurrentSize = fullSyncCurrentSize;
		}

		public Long getFullSyncStartTime() {
			return this.fullSyncStartTime;
		}

		public void setFullSyncStartTime(Long fullSyncStartTime) {
			this.fullSyncStartTime = fullSyncStartTime;
		}

		public Long getIncrementalSyncStartTime() {
			return this.incrementalSyncStartTime;
		}

		public void setIncrementalSyncStartTime(Long incrementalSyncStartTime) {
			this.incrementalSyncStartTime = incrementalSyncStartTime;
		}

		public String getErrno() {
			return this.errno;
		}

		public void setErrno(String errno) {
			this.errno = errno;
		}

		public String getRecoveryInfrastructureId() {
			return this.recoveryInfrastructureId;
		}

		public void setRecoveryInfrastructureId(String recoveryInfrastructureId) {
			this.recoveryInfrastructureId = recoveryInfrastructureId;
		}

		public String getRecoveryInfrastructureType() {
			return this.recoveryInfrastructureType;
		}

		public void setRecoveryInfrastructureType(String recoveryInfrastructureType) {
			this.recoveryInfrastructureType = recoveryInfrastructureType;
		}

		public String getRecoveryInstanceName() {
			return this.recoveryInstanceName;
		}

		public void setRecoveryInstanceName(String recoveryInstanceName) {
			this.recoveryInstanceName = recoveryInstanceName;
		}

		public Integer getRecoveryCpu() {
			return this.recoveryCpu;
		}

		public void setRecoveryCpu(Integer recoveryCpu) {
			this.recoveryCpu = recoveryCpu;
		}

		public Long getRecoveryMemory() {
			return this.recoveryMemory;
		}

		public void setRecoveryMemory(Long recoveryMemory) {
			this.recoveryMemory = recoveryMemory;
		}

		public Boolean getRecoveryUseSsd() {
			return this.recoveryUseSsd;
		}

		public void setRecoveryUseSsd(Boolean recoveryUseSsd) {
			this.recoveryUseSsd = recoveryUseSsd;
		}

		public String getRecoveryNetwork() {
			return this.recoveryNetwork;
		}

		public void setRecoveryNetwork(String recoveryNetwork) {
			this.recoveryNetwork = recoveryNetwork;
		}

		public Boolean getRecoveryReserveIp() {
			return this.recoveryReserveIp;
		}

		public void setRecoveryReserveIp(Boolean recoveryReserveIp) {
			this.recoveryReserveIp = recoveryReserveIp;
		}

		public Boolean getRecoveryUseDhcp() {
			return this.recoveryUseDhcp;
		}

		public void setRecoveryUseDhcp(Boolean recoveryUseDhcp) {
			this.recoveryUseDhcp = recoveryUseDhcp;
		}

		public String getRecoveryIpAddress() {
			return this.recoveryIpAddress;
		}

		public void setRecoveryIpAddress(String recoveryIpAddress) {
			this.recoveryIpAddress = recoveryIpAddress;
		}

		public String getRecoveryPostScriptType() {
			return this.recoveryPostScriptType;
		}

		public void setRecoveryPostScriptType(String recoveryPostScriptType) {
			this.recoveryPostScriptType = recoveryPostScriptType;
		}

		public String getRecoveryPostScriptContent() {
			return this.recoveryPostScriptContent;
		}

		public void setRecoveryPostScriptContent(String recoveryPostScriptContent) {
			this.recoveryPostScriptContent = recoveryPostScriptContent;
		}

		public String getTestRecoveredInstanceName() {
			return this.testRecoveredInstanceName;
		}

		public void setTestRecoveredInstanceName(String testRecoveredInstanceName) {
			this.testRecoveredInstanceName = testRecoveredInstanceName;
		}

		public String getTestRecoveredInstanceId() {
			return this.testRecoveredInstanceId;
		}

		public void setTestRecoveredInstanceId(String testRecoveredInstanceId) {
			this.testRecoveredInstanceId = testRecoveredInstanceId;
		}

		public String getTestRecoveredIpAddress() {
			return this.testRecoveredIpAddress;
		}

		public void setTestRecoveredIpAddress(String testRecoveredIpAddress) {
			this.testRecoveredIpAddress = testRecoveredIpAddress;
		}

		public String getTestFailoverStatus() {
			return this.testFailoverStatus;
		}

		public void setTestFailoverStatus(String testFailoverStatus) {
			this.testFailoverStatus = testFailoverStatus;
		}

		public String getRecoveredInstanceName() {
			return this.recoveredInstanceName;
		}

		public void setRecoveredInstanceName(String recoveredInstanceName) {
			this.recoveredInstanceName = recoveredInstanceName;
		}

		public String getRecoveredInstanceId() {
			return this.recoveredInstanceId;
		}

		public void setRecoveredInstanceId(String recoveredInstanceId) {
			this.recoveredInstanceId = recoveredInstanceId;
		}

		public String getRecoveredIpAddress() {
			return this.recoveredIpAddress;
		}

		public void setRecoveredIpAddress(String recoveredIpAddress) {
			this.recoveredIpAddress = recoveredIpAddress;
		}

		public String getTaskId() {
			return this.taskId;
		}

		public void setTaskId(String taskId) {
			this.taskId = taskId;
		}

		public String getOperations() {
			return this.operations;
		}

		public void setOperations(String operations) {
			this.operations = operations;
		}

		public String getSourceGatewayVersion() {
			return this.sourceGatewayVersion;
		}

		public void setSourceGatewayVersion(String sourceGatewayVersion) {
			this.sourceGatewayVersion = sourceGatewayVersion;
		}

		public String getTargetGatewayVersion() {
			return this.targetGatewayVersion;
		}

		public void setTargetGatewayVersion(String targetGatewayVersion) {
			this.targetGatewayVersion = targetGatewayVersion;
		}
	}

	@Override
	public DescribeServersResponse getInstance(UnmarshallerContext context) {
		return	DescribeServersResponseUnmarshaller.unmarshall(this, context);
	}
}
