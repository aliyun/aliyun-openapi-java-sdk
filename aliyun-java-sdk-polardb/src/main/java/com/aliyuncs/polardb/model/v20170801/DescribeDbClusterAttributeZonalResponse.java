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

package com.aliyuncs.polardb.model.v20170801;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.polardb.transform.v20170801.DescribeDbClusterAttributeZonalResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDbClusterAttributeZonalResponse extends AcsResponse {

	private Integer deletionLock;

	private String category;

	private String resourceGroupId;

	private Long dataLevel1BackupChainSize;

	private String dBClusterId;

	private String dBType;

	private String dBClusterNetworkType;

	private Boolean isLatestVersion;

	private Boolean hasCompleteStandbyRes;

	private String hotStandbyClusterStatus;

	private String hotStandbyCluster;

	private String dataSyncMode;

	private String standbyHAMode;

	private String compressStorageMode;

	private Long storageMax;

	private String dBVersion;

	private String zoneIds;

	private String maintainTime;

	private String engine;

	private String requestId;

	private String vPCId;

	private String dBClusterStatus;

	private String vSwitchId;

	private String dBClusterDescription;

	private String expired;

	private String payType;

	private String storagePayType;

	private String lockMode;

	private Long storageUsed;

	private Long compressStorageUsed;

	private Long storageSpace;

	private String dBVersionStatus;

	private String creationTime;

	private Long sQLSize;

	private Long inodeTotal;

	private Long inodeUsed;

	private Long blktagTotal;

	private Long blktagUsed;

	private String regionId;

	private String expireTime;

	private String subCategory;

	private String deployUnit;

	private Boolean isProxyLatestVersion;

	private String storageType;

	private String serverlessType;

	private String strictConsistency;

	private String proxyCpuCores;

	private String proxyStandardCpuCores;

	private String proxyType;

	private String proxyStatus;

	private String featureHTAPSupported;

	private String proxyServerlessType;

	private String architecture;

	private String aiType;

	private String provisionedIops;

	private Boolean hotStandbyHealthy;

	private Boolean hotStandbyWhiteListSwitch;

	private Boolean storageTypeWhiteListSwitch;

	private String aiFreeMode;

	private String aiCreatingTime;

	private String supportInstantSwitchWithImci;

	private String orca;

	private String sourceDBCluster;

	private String restoreType;

	private String restoreDataPoint;

	private String sourceRegionId;

	private String imciAutoIndex;

	private String osVersion;

	private String autoUpgradeMinorVersion;

	private String burstingEnabled;

	private String rowCompression;

	private String imperceptibleSwitch;

	private Integer cnNodeCount;

	private Integer dnNodeCount;

	private String documentDB;

	private String backupDowngradeLevel;

	private String relativeAICluster;

	private String dynamoDB;

	private String dBClusterClass;

	private List<DBNode> dBNodes;

	private List<Tag> tags;

	private RelatedAPInstance relatedAPInstance;

	public Integer getDeletionLock() {
		return this.deletionLock;
	}

	public void setDeletionLock(Integer deletionLock) {
		this.deletionLock = deletionLock;
	}

	public String getCategory() {
		return this.category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getResourceGroupId() {
		return this.resourceGroupId;
	}

	public void setResourceGroupId(String resourceGroupId) {
		this.resourceGroupId = resourceGroupId;
	}

	public Long getDataLevel1BackupChainSize() {
		return this.dataLevel1BackupChainSize;
	}

	public void setDataLevel1BackupChainSize(Long dataLevel1BackupChainSize) {
		this.dataLevel1BackupChainSize = dataLevel1BackupChainSize;
	}

	public String getDBClusterId() {
		return this.dBClusterId;
	}

	public void setDBClusterId(String dBClusterId) {
		this.dBClusterId = dBClusterId;
	}

	public String getDBType() {
		return this.dBType;
	}

	public void setDBType(String dBType) {
		this.dBType = dBType;
	}

	public String getDBClusterNetworkType() {
		return this.dBClusterNetworkType;
	}

	public void setDBClusterNetworkType(String dBClusterNetworkType) {
		this.dBClusterNetworkType = dBClusterNetworkType;
	}

	public Boolean getIsLatestVersion() {
		return this.isLatestVersion;
	}

	public void setIsLatestVersion(Boolean isLatestVersion) {
		this.isLatestVersion = isLatestVersion;
	}

	public Boolean getHasCompleteStandbyRes() {
		return this.hasCompleteStandbyRes;
	}

	public void setHasCompleteStandbyRes(Boolean hasCompleteStandbyRes) {
		this.hasCompleteStandbyRes = hasCompleteStandbyRes;
	}

	public String getHotStandbyClusterStatus() {
		return this.hotStandbyClusterStatus;
	}

	public void setHotStandbyClusterStatus(String hotStandbyClusterStatus) {
		this.hotStandbyClusterStatus = hotStandbyClusterStatus;
	}

	public String getHotStandbyCluster() {
		return this.hotStandbyCluster;
	}

	public void setHotStandbyCluster(String hotStandbyCluster) {
		this.hotStandbyCluster = hotStandbyCluster;
	}

	public String getDataSyncMode() {
		return this.dataSyncMode;
	}

	public void setDataSyncMode(String dataSyncMode) {
		this.dataSyncMode = dataSyncMode;
	}

	public String getStandbyHAMode() {
		return this.standbyHAMode;
	}

	public void setStandbyHAMode(String standbyHAMode) {
		this.standbyHAMode = standbyHAMode;
	}

	public String getCompressStorageMode() {
		return this.compressStorageMode;
	}

	public void setCompressStorageMode(String compressStorageMode) {
		this.compressStorageMode = compressStorageMode;
	}

	public Long getStorageMax() {
		return this.storageMax;
	}

	public void setStorageMax(Long storageMax) {
		this.storageMax = storageMax;
	}

	public String getDBVersion() {
		return this.dBVersion;
	}

	public void setDBVersion(String dBVersion) {
		this.dBVersion = dBVersion;
	}

	public String getZoneIds() {
		return this.zoneIds;
	}

	public void setZoneIds(String zoneIds) {
		this.zoneIds = zoneIds;
	}

	public String getMaintainTime() {
		return this.maintainTime;
	}

	public void setMaintainTime(String maintainTime) {
		this.maintainTime = maintainTime;
	}

	public String getEngine() {
		return this.engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getVPCId() {
		return this.vPCId;
	}

	public void setVPCId(String vPCId) {
		this.vPCId = vPCId;
	}

	public String getDBClusterStatus() {
		return this.dBClusterStatus;
	}

	public void setDBClusterStatus(String dBClusterStatus) {
		this.dBClusterStatus = dBClusterStatus;
	}

	public String getVSwitchId() {
		return this.vSwitchId;
	}

	public void setVSwitchId(String vSwitchId) {
		this.vSwitchId = vSwitchId;
	}

	public String getDBClusterDescription() {
		return this.dBClusterDescription;
	}

	public void setDBClusterDescription(String dBClusterDescription) {
		this.dBClusterDescription = dBClusterDescription;
	}

	public String getExpired() {
		return this.expired;
	}

	public void setExpired(String expired) {
		this.expired = expired;
	}

	public String getPayType() {
		return this.payType;
	}

	public void setPayType(String payType) {
		this.payType = payType;
	}

	public String getStoragePayType() {
		return this.storagePayType;
	}

	public void setStoragePayType(String storagePayType) {
		this.storagePayType = storagePayType;
	}

	public String getLockMode() {
		return this.lockMode;
	}

	public void setLockMode(String lockMode) {
		this.lockMode = lockMode;
	}

	public Long getStorageUsed() {
		return this.storageUsed;
	}

	public void setStorageUsed(Long storageUsed) {
		this.storageUsed = storageUsed;
	}

	public Long getCompressStorageUsed() {
		return this.compressStorageUsed;
	}

	public void setCompressStorageUsed(Long compressStorageUsed) {
		this.compressStorageUsed = compressStorageUsed;
	}

	public Long getStorageSpace() {
		return this.storageSpace;
	}

	public void setStorageSpace(Long storageSpace) {
		this.storageSpace = storageSpace;
	}

	public String getDBVersionStatus() {
		return this.dBVersionStatus;
	}

	public void setDBVersionStatus(String dBVersionStatus) {
		this.dBVersionStatus = dBVersionStatus;
	}

	public String getCreationTime() {
		return this.creationTime;
	}

	public void setCreationTime(String creationTime) {
		this.creationTime = creationTime;
	}

	public Long getSQLSize() {
		return this.sQLSize;
	}

	public void setSQLSize(Long sQLSize) {
		this.sQLSize = sQLSize;
	}

	public Long getInodeTotal() {
		return this.inodeTotal;
	}

	public void setInodeTotal(Long inodeTotal) {
		this.inodeTotal = inodeTotal;
	}

	public Long getInodeUsed() {
		return this.inodeUsed;
	}

	public void setInodeUsed(Long inodeUsed) {
		this.inodeUsed = inodeUsed;
	}

	public Long getBlktagTotal() {
		return this.blktagTotal;
	}

	public void setBlktagTotal(Long blktagTotal) {
		this.blktagTotal = blktagTotal;
	}

	public Long getBlktagUsed() {
		return this.blktagUsed;
	}

	public void setBlktagUsed(Long blktagUsed) {
		this.blktagUsed = blktagUsed;
	}

	public String getRegionId() {
		return this.regionId;
	}

	public void setRegionId(String regionId) {
		this.regionId = regionId;
	}

	public String getExpireTime() {
		return this.expireTime;
	}

	public void setExpireTime(String expireTime) {
		this.expireTime = expireTime;
	}

	public String getSubCategory() {
		return this.subCategory;
	}

	public void setSubCategory(String subCategory) {
		this.subCategory = subCategory;
	}

	public String getDeployUnit() {
		return this.deployUnit;
	}

	public void setDeployUnit(String deployUnit) {
		this.deployUnit = deployUnit;
	}

	public Boolean getIsProxyLatestVersion() {
		return this.isProxyLatestVersion;
	}

	public void setIsProxyLatestVersion(Boolean isProxyLatestVersion) {
		this.isProxyLatestVersion = isProxyLatestVersion;
	}

	public String getStorageType() {
		return this.storageType;
	}

	public void setStorageType(String storageType) {
		this.storageType = storageType;
	}

	public String getServerlessType() {
		return this.serverlessType;
	}

	public void setServerlessType(String serverlessType) {
		this.serverlessType = serverlessType;
	}

	public String getStrictConsistency() {
		return this.strictConsistency;
	}

	public void setStrictConsistency(String strictConsistency) {
		this.strictConsistency = strictConsistency;
	}

	public String getProxyCpuCores() {
		return this.proxyCpuCores;
	}

	public void setProxyCpuCores(String proxyCpuCores) {
		this.proxyCpuCores = proxyCpuCores;
	}

	public String getProxyStandardCpuCores() {
		return this.proxyStandardCpuCores;
	}

	public void setProxyStandardCpuCores(String proxyStandardCpuCores) {
		this.proxyStandardCpuCores = proxyStandardCpuCores;
	}

	public String getProxyType() {
		return this.proxyType;
	}

	public void setProxyType(String proxyType) {
		this.proxyType = proxyType;
	}

	public String getProxyStatus() {
		return this.proxyStatus;
	}

	public void setProxyStatus(String proxyStatus) {
		this.proxyStatus = proxyStatus;
	}

	public String getFeatureHTAPSupported() {
		return this.featureHTAPSupported;
	}

	public void setFeatureHTAPSupported(String featureHTAPSupported) {
		this.featureHTAPSupported = featureHTAPSupported;
	}

	public String getProxyServerlessType() {
		return this.proxyServerlessType;
	}

	public void setProxyServerlessType(String proxyServerlessType) {
		this.proxyServerlessType = proxyServerlessType;
	}

	public String getArchitecture() {
		return this.architecture;
	}

	public void setArchitecture(String architecture) {
		this.architecture = architecture;
	}

	public String getAiType() {
		return this.aiType;
	}

	public void setAiType(String aiType) {
		this.aiType = aiType;
	}

	public String getProvisionedIops() {
		return this.provisionedIops;
	}

	public void setProvisionedIops(String provisionedIops) {
		this.provisionedIops = provisionedIops;
	}

	public Boolean getHotStandbyHealthy() {
		return this.hotStandbyHealthy;
	}

	public void setHotStandbyHealthy(Boolean hotStandbyHealthy) {
		this.hotStandbyHealthy = hotStandbyHealthy;
	}

	public Boolean getHotStandbyWhiteListSwitch() {
		return this.hotStandbyWhiteListSwitch;
	}

	public void setHotStandbyWhiteListSwitch(Boolean hotStandbyWhiteListSwitch) {
		this.hotStandbyWhiteListSwitch = hotStandbyWhiteListSwitch;
	}

	public Boolean getStorageTypeWhiteListSwitch() {
		return this.storageTypeWhiteListSwitch;
	}

	public void setStorageTypeWhiteListSwitch(Boolean storageTypeWhiteListSwitch) {
		this.storageTypeWhiteListSwitch = storageTypeWhiteListSwitch;
	}

	public String getAiFreeMode() {
		return this.aiFreeMode;
	}

	public void setAiFreeMode(String aiFreeMode) {
		this.aiFreeMode = aiFreeMode;
	}

	public String getAiCreatingTime() {
		return this.aiCreatingTime;
	}

	public void setAiCreatingTime(String aiCreatingTime) {
		this.aiCreatingTime = aiCreatingTime;
	}

	public String getSupportInstantSwitchWithImci() {
		return this.supportInstantSwitchWithImci;
	}

	public void setSupportInstantSwitchWithImci(String supportInstantSwitchWithImci) {
		this.supportInstantSwitchWithImci = supportInstantSwitchWithImci;
	}

	public String getOrca() {
		return this.orca;
	}

	public void setOrca(String orca) {
		this.orca = orca;
	}

	public String getSourceDBCluster() {
		return this.sourceDBCluster;
	}

	public void setSourceDBCluster(String sourceDBCluster) {
		this.sourceDBCluster = sourceDBCluster;
	}

	public String getRestoreType() {
		return this.restoreType;
	}

	public void setRestoreType(String restoreType) {
		this.restoreType = restoreType;
	}

	public String getRestoreDataPoint() {
		return this.restoreDataPoint;
	}

	public void setRestoreDataPoint(String restoreDataPoint) {
		this.restoreDataPoint = restoreDataPoint;
	}

	public String getSourceRegionId() {
		return this.sourceRegionId;
	}

	public void setSourceRegionId(String sourceRegionId) {
		this.sourceRegionId = sourceRegionId;
	}

	public String getImciAutoIndex() {
		return this.imciAutoIndex;
	}

	public void setImciAutoIndex(String imciAutoIndex) {
		this.imciAutoIndex = imciAutoIndex;
	}

	public String getOsVersion() {
		return this.osVersion;
	}

	public void setOsVersion(String osVersion) {
		this.osVersion = osVersion;
	}

	public String getAutoUpgradeMinorVersion() {
		return this.autoUpgradeMinorVersion;
	}

	public void setAutoUpgradeMinorVersion(String autoUpgradeMinorVersion) {
		this.autoUpgradeMinorVersion = autoUpgradeMinorVersion;
	}

	public String getBurstingEnabled() {
		return this.burstingEnabled;
	}

	public void setBurstingEnabled(String burstingEnabled) {
		this.burstingEnabled = burstingEnabled;
	}

	public String getRowCompression() {
		return this.rowCompression;
	}

	public void setRowCompression(String rowCompression) {
		this.rowCompression = rowCompression;
	}

	public String getImperceptibleSwitch() {
		return this.imperceptibleSwitch;
	}

	public void setImperceptibleSwitch(String imperceptibleSwitch) {
		this.imperceptibleSwitch = imperceptibleSwitch;
	}

	public Integer getCnNodeCount() {
		return this.cnNodeCount;
	}

	public void setCnNodeCount(Integer cnNodeCount) {
		this.cnNodeCount = cnNodeCount;
	}

	public Integer getDnNodeCount() {
		return this.dnNodeCount;
	}

	public void setDnNodeCount(Integer dnNodeCount) {
		this.dnNodeCount = dnNodeCount;
	}

	public String getDocumentDB() {
		return this.documentDB;
	}

	public void setDocumentDB(String documentDB) {
		this.documentDB = documentDB;
	}

	public String getBackupDowngradeLevel() {
		return this.backupDowngradeLevel;
	}

	public void setBackupDowngradeLevel(String backupDowngradeLevel) {
		this.backupDowngradeLevel = backupDowngradeLevel;
	}

	public String getRelativeAICluster() {
		return this.relativeAICluster;
	}

	public void setRelativeAICluster(String relativeAICluster) {
		this.relativeAICluster = relativeAICluster;
	}

	public String getDynamoDB() {
		return this.dynamoDB;
	}

	public void setDynamoDB(String dynamoDB) {
		this.dynamoDB = dynamoDB;
	}

	public String getDBClusterClass() {
		return this.dBClusterClass;
	}

	public void setDBClusterClass(String dBClusterClass) {
		this.dBClusterClass = dBClusterClass;
	}

	public List<DBNode> getDBNodes() {
		return this.dBNodes;
	}

	public void setDBNodes(List<DBNode> dBNodes) {
		this.dBNodes = dBNodes;
	}

	public List<Tag> getTags() {
		return this.tags;
	}

	public void setTags(List<Tag> tags) {
		this.tags = tags;
	}

	public RelatedAPInstance getRelatedAPInstance() {
		return this.relatedAPInstance;
	}

	public void setRelatedAPInstance(RelatedAPInstance relatedAPInstance) {
		this.relatedAPInstance = relatedAPInstance;
	}

	public static class DBNode {

		private String dBNodeStatus;

		private String subGroupDescription;

		private String addedCpuCores;

		private String orca;

		private String dBNodeRole;

		private String subCluster;

		private String osVersion;

		private String supportMemPool;

		private String imciSwitch;

		private String dBNodeId;

		private String remoteMemorySize;

		private Long blktagUsed;

		private String subGroupType;

		private String tair;

		private Long storageMax;

		private String multiMasterLocalStandby;

		private String multiMasterPrimaryNode;

		private String sccMode;

		private Boolean isPrimaryCN;

		private String standbyZoneIds;

		private Long inodeUsed;

		private Integer failoverPriority;

		private String serverWeight;

		private String dBNodeDescription;

		private String memorySize;

		private Long blktagTotal;

		private String mirrorInsName;

		private String zoneId;

		private Integer maxConnections;

		private String architecture;

		private String subGroupName;

		private Integer maxIOPS;

		private String dBNodeClass;

		private Long storageUsed;

		private Long inodeTotal;

		private String serverlessType;

		private String creationTime;

		private String cpuCores;

		private String masterId;

		private String hotReplicaMode;

		public String getDBNodeStatus() {
			return this.dBNodeStatus;
		}

		public void setDBNodeStatus(String dBNodeStatus) {
			this.dBNodeStatus = dBNodeStatus;
		}

		public String getSubGroupDescription() {
			return this.subGroupDescription;
		}

		public void setSubGroupDescription(String subGroupDescription) {
			this.subGroupDescription = subGroupDescription;
		}

		public String getAddedCpuCores() {
			return this.addedCpuCores;
		}

		public void setAddedCpuCores(String addedCpuCores) {
			this.addedCpuCores = addedCpuCores;
		}

		public String getOrca() {
			return this.orca;
		}

		public void setOrca(String orca) {
			this.orca = orca;
		}

		public String getDBNodeRole() {
			return this.dBNodeRole;
		}

		public void setDBNodeRole(String dBNodeRole) {
			this.dBNodeRole = dBNodeRole;
		}

		public String getSubCluster() {
			return this.subCluster;
		}

		public void setSubCluster(String subCluster) {
			this.subCluster = subCluster;
		}

		public String getOsVersion() {
			return this.osVersion;
		}

		public void setOsVersion(String osVersion) {
			this.osVersion = osVersion;
		}

		public String getSupportMemPool() {
			return this.supportMemPool;
		}

		public void setSupportMemPool(String supportMemPool) {
			this.supportMemPool = supportMemPool;
		}

		public String getImciSwitch() {
			return this.imciSwitch;
		}

		public void setImciSwitch(String imciSwitch) {
			this.imciSwitch = imciSwitch;
		}

		public String getDBNodeId() {
			return this.dBNodeId;
		}

		public void setDBNodeId(String dBNodeId) {
			this.dBNodeId = dBNodeId;
		}

		public String getRemoteMemorySize() {
			return this.remoteMemorySize;
		}

		public void setRemoteMemorySize(String remoteMemorySize) {
			this.remoteMemorySize = remoteMemorySize;
		}

		public Long getBlktagUsed() {
			return this.blktagUsed;
		}

		public void setBlktagUsed(Long blktagUsed) {
			this.blktagUsed = blktagUsed;
		}

		public String getSubGroupType() {
			return this.subGroupType;
		}

		public void setSubGroupType(String subGroupType) {
			this.subGroupType = subGroupType;
		}

		public String getTair() {
			return this.tair;
		}

		public void setTair(String tair) {
			this.tair = tair;
		}

		public Long getStorageMax() {
			return this.storageMax;
		}

		public void setStorageMax(Long storageMax) {
			this.storageMax = storageMax;
		}

		public String getMultiMasterLocalStandby() {
			return this.multiMasterLocalStandby;
		}

		public void setMultiMasterLocalStandby(String multiMasterLocalStandby) {
			this.multiMasterLocalStandby = multiMasterLocalStandby;
		}

		public String getMultiMasterPrimaryNode() {
			return this.multiMasterPrimaryNode;
		}

		public void setMultiMasterPrimaryNode(String multiMasterPrimaryNode) {
			this.multiMasterPrimaryNode = multiMasterPrimaryNode;
		}

		public String getSccMode() {
			return this.sccMode;
		}

		public void setSccMode(String sccMode) {
			this.sccMode = sccMode;
		}

		public Boolean getIsPrimaryCN() {
			return this.isPrimaryCN;
		}

		public void setIsPrimaryCN(Boolean isPrimaryCN) {
			this.isPrimaryCN = isPrimaryCN;
		}

		public String getStandbyZoneIds() {
			return this.standbyZoneIds;
		}

		public void setStandbyZoneIds(String standbyZoneIds) {
			this.standbyZoneIds = standbyZoneIds;
		}

		public Long getInodeUsed() {
			return this.inodeUsed;
		}

		public void setInodeUsed(Long inodeUsed) {
			this.inodeUsed = inodeUsed;
		}

		public Integer getFailoverPriority() {
			return this.failoverPriority;
		}

		public void setFailoverPriority(Integer failoverPriority) {
			this.failoverPriority = failoverPriority;
		}

		public String getServerWeight() {
			return this.serverWeight;
		}

		public void setServerWeight(String serverWeight) {
			this.serverWeight = serverWeight;
		}

		public String getDBNodeDescription() {
			return this.dBNodeDescription;
		}

		public void setDBNodeDescription(String dBNodeDescription) {
			this.dBNodeDescription = dBNodeDescription;
		}

		public String getMemorySize() {
			return this.memorySize;
		}

		public void setMemorySize(String memorySize) {
			this.memorySize = memorySize;
		}

		public Long getBlktagTotal() {
			return this.blktagTotal;
		}

		public void setBlktagTotal(Long blktagTotal) {
			this.blktagTotal = blktagTotal;
		}

		public String getMirrorInsName() {
			return this.mirrorInsName;
		}

		public void setMirrorInsName(String mirrorInsName) {
			this.mirrorInsName = mirrorInsName;
		}

		public String getZoneId() {
			return this.zoneId;
		}

		public void setZoneId(String zoneId) {
			this.zoneId = zoneId;
		}

		public Integer getMaxConnections() {
			return this.maxConnections;
		}

		public void setMaxConnections(Integer maxConnections) {
			this.maxConnections = maxConnections;
		}

		public String getArchitecture() {
			return this.architecture;
		}

		public void setArchitecture(String architecture) {
			this.architecture = architecture;
		}

		public String getSubGroupName() {
			return this.subGroupName;
		}

		public void setSubGroupName(String subGroupName) {
			this.subGroupName = subGroupName;
		}

		public Integer getMaxIOPS() {
			return this.maxIOPS;
		}

		public void setMaxIOPS(Integer maxIOPS) {
			this.maxIOPS = maxIOPS;
		}

		public String getDBNodeClass() {
			return this.dBNodeClass;
		}

		public void setDBNodeClass(String dBNodeClass) {
			this.dBNodeClass = dBNodeClass;
		}

		public Long getStorageUsed() {
			return this.storageUsed;
		}

		public void setStorageUsed(Long storageUsed) {
			this.storageUsed = storageUsed;
		}

		public Long getInodeTotal() {
			return this.inodeTotal;
		}

		public void setInodeTotal(Long inodeTotal) {
			this.inodeTotal = inodeTotal;
		}

		public String getServerlessType() {
			return this.serverlessType;
		}

		public void setServerlessType(String serverlessType) {
			this.serverlessType = serverlessType;
		}

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public String getCpuCores() {
			return this.cpuCores;
		}

		public void setCpuCores(String cpuCores) {
			this.cpuCores = cpuCores;
		}

		public String getMasterId() {
			return this.masterId;
		}

		public void setMasterId(String masterId) {
			this.masterId = masterId;
		}

		public String getHotReplicaMode() {
			return this.hotReplicaMode;
		}

		public void setHotReplicaMode(String hotReplicaMode) {
			this.hotReplicaMode = hotReplicaMode;
		}
	}

	public static class Tag {

		private String value;

		private String key;

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public String getKey() {
			return this.key;
		}

		public void setKey(String key) {
			this.key = key;
		}
	}

	public static class RelatedAPInstance {

		private String name;

		private String classCode;

		private String ossStorageUsed;

		private String totalAPNodes;

		private Float storageUsedMB;

		private String aPNodeStatus;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getClassCode() {
			return this.classCode;
		}

		public void setClassCode(String classCode) {
			this.classCode = classCode;
		}

		public String getOssStorageUsed() {
			return this.ossStorageUsed;
		}

		public void setOssStorageUsed(String ossStorageUsed) {
			this.ossStorageUsed = ossStorageUsed;
		}

		public String getTotalAPNodes() {
			return this.totalAPNodes;
		}

		public void setTotalAPNodes(String totalAPNodes) {
			this.totalAPNodes = totalAPNodes;
		}

		public Float getStorageUsedMB() {
			return this.storageUsedMB;
		}

		public void setStorageUsedMB(Float storageUsedMB) {
			this.storageUsedMB = storageUsedMB;
		}

		public String getAPNodeStatus() {
			return this.aPNodeStatus;
		}

		public void setAPNodeStatus(String aPNodeStatus) {
			this.aPNodeStatus = aPNodeStatus;
		}
	}

	@Override
	public DescribeDbClusterAttributeZonalResponse getInstance(UnmarshallerContext context) {
		return	DescribeDbClusterAttributeZonalResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
