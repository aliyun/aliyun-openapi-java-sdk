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

package com.aliyuncs.clickhouse.model.v20191111;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.clickhouse.transform.v20191111.DescribeDBClusterAttributeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDBClusterAttributeResponse extends AcsResponse {

	private String requestId;

	private DBCluster dBCluster;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public DBCluster getDBCluster() {
		return this.dBCluster;
	}

	public void setDBCluster(DBCluster dBCluster) {
		this.dBCluster = dBCluster;
	}

	public static class DBCluster {

		private String vpcId;

		private Integer supportBackup;

		private Integer supportOss;

		private String encryptionType;

		private Long dBNodeCount;

		private String maintainTime;

		private String createTime;

		private String payType;

		private String publicConnectionString;

		private String storageType;

		private Integer port;

		private String lockMode;

		private String bid;

		private String engineVersion;

		private String isExpired;

		private String vpcCloudInstanceId;

		private String dBClusterId;

		private String connectionString;

		private String encryptionKey;

		private String dBClusterType;

		private String commodityCode;

		private String expireTime;

		private Long dBNodeStorage;

		private String dBNodeClass;

		private String aliUid;

		private String lockReason;

		private String regionId;

		private String publicPort;

		private String vSwitchId;

		private String dBClusterStatus;

		private String dBClusterNetworkType;

		private String dBClusterDescription;

		private String zoneId;

		private String category;

		private String engine;

		private Boolean supportMysqlPort;

		private Boolean supportHttpsPort;

		private String controlVersion;

		private String publicIpAddr;

		private String vpcIpAddr;

		private String engineMinorVersion;

		private String engineLatestMinorVersion;

		private Boolean maintainAutoType;

		private String extStorageType;

		private Integer extStorageSize;

		private String resourceGroupId;

		private String zookeeperClass;

		private String appointmentRestartTime;

		private Map<Object,Object> zoneIdVswitchMap;

		private Map<Object,Object> availableUpgradeMajorVersion;

		private String appointmentRestartNodeTime;

		private String appointmentRestartNodeList;

		private String appointmentElectZookeeperTime;

		private Boolean appointmentElectZookeeperDisableWrite;

		private List<Tag> tags;

		private ScaleOutStatus scaleOutStatus;

		public String getVpcId() {
			return this.vpcId;
		}

		public void setVpcId(String vpcId) {
			this.vpcId = vpcId;
		}

		public Integer getSupportBackup() {
			return this.supportBackup;
		}

		public void setSupportBackup(Integer supportBackup) {
			this.supportBackup = supportBackup;
		}

		public Integer getSupportOss() {
			return this.supportOss;
		}

		public void setSupportOss(Integer supportOss) {
			this.supportOss = supportOss;
		}

		public String getEncryptionType() {
			return this.encryptionType;
		}

		public void setEncryptionType(String encryptionType) {
			this.encryptionType = encryptionType;
		}

		public Long getDBNodeCount() {
			return this.dBNodeCount;
		}

		public void setDBNodeCount(Long dBNodeCount) {
			this.dBNodeCount = dBNodeCount;
		}

		public String getMaintainTime() {
			return this.maintainTime;
		}

		public void setMaintainTime(String maintainTime) {
			this.maintainTime = maintainTime;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getPayType() {
			return this.payType;
		}

		public void setPayType(String payType) {
			this.payType = payType;
		}

		public String getPublicConnectionString() {
			return this.publicConnectionString;
		}

		public void setPublicConnectionString(String publicConnectionString) {
			this.publicConnectionString = publicConnectionString;
		}

		public String getStorageType() {
			return this.storageType;
		}

		public void setStorageType(String storageType) {
			this.storageType = storageType;
		}

		public Integer getPort() {
			return this.port;
		}

		public void setPort(Integer port) {
			this.port = port;
		}

		public String getLockMode() {
			return this.lockMode;
		}

		public void setLockMode(String lockMode) {
			this.lockMode = lockMode;
		}

		public String getBid() {
			return this.bid;
		}

		public void setBid(String bid) {
			this.bid = bid;
		}

		public String getEngineVersion() {
			return this.engineVersion;
		}

		public void setEngineVersion(String engineVersion) {
			this.engineVersion = engineVersion;
		}

		public String getIsExpired() {
			return this.isExpired;
		}

		public void setIsExpired(String isExpired) {
			this.isExpired = isExpired;
		}

		public String getVpcCloudInstanceId() {
			return this.vpcCloudInstanceId;
		}

		public void setVpcCloudInstanceId(String vpcCloudInstanceId) {
			this.vpcCloudInstanceId = vpcCloudInstanceId;
		}

		public String getDBClusterId() {
			return this.dBClusterId;
		}

		public void setDBClusterId(String dBClusterId) {
			this.dBClusterId = dBClusterId;
		}

		public String getConnectionString() {
			return this.connectionString;
		}

		public void setConnectionString(String connectionString) {
			this.connectionString = connectionString;
		}

		public String getEncryptionKey() {
			return this.encryptionKey;
		}

		public void setEncryptionKey(String encryptionKey) {
			this.encryptionKey = encryptionKey;
		}

		public String getDBClusterType() {
			return this.dBClusterType;
		}

		public void setDBClusterType(String dBClusterType) {
			this.dBClusterType = dBClusterType;
		}

		public String getCommodityCode() {
			return this.commodityCode;
		}

		public void setCommodityCode(String commodityCode) {
			this.commodityCode = commodityCode;
		}

		public String getExpireTime() {
			return this.expireTime;
		}

		public void setExpireTime(String expireTime) {
			this.expireTime = expireTime;
		}

		public Long getDBNodeStorage() {
			return this.dBNodeStorage;
		}

		public void setDBNodeStorage(Long dBNodeStorage) {
			this.dBNodeStorage = dBNodeStorage;
		}

		public String getDBNodeClass() {
			return this.dBNodeClass;
		}

		public void setDBNodeClass(String dBNodeClass) {
			this.dBNodeClass = dBNodeClass;
		}

		public String getAliUid() {
			return this.aliUid;
		}

		public void setAliUid(String aliUid) {
			this.aliUid = aliUid;
		}

		public String getLockReason() {
			return this.lockReason;
		}

		public void setLockReason(String lockReason) {
			this.lockReason = lockReason;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getPublicPort() {
			return this.publicPort;
		}

		public void setPublicPort(String publicPort) {
			this.publicPort = publicPort;
		}

		public String getVSwitchId() {
			return this.vSwitchId;
		}

		public void setVSwitchId(String vSwitchId) {
			this.vSwitchId = vSwitchId;
		}

		public String getDBClusterStatus() {
			return this.dBClusterStatus;
		}

		public void setDBClusterStatus(String dBClusterStatus) {
			this.dBClusterStatus = dBClusterStatus;
		}

		public String getDBClusterNetworkType() {
			return this.dBClusterNetworkType;
		}

		public void setDBClusterNetworkType(String dBClusterNetworkType) {
			this.dBClusterNetworkType = dBClusterNetworkType;
		}

		public String getDBClusterDescription() {
			return this.dBClusterDescription;
		}

		public void setDBClusterDescription(String dBClusterDescription) {
			this.dBClusterDescription = dBClusterDescription;
		}

		public String getZoneId() {
			return this.zoneId;
		}

		public void setZoneId(String zoneId) {
			this.zoneId = zoneId;
		}

		public String getCategory() {
			return this.category;
		}

		public void setCategory(String category) {
			this.category = category;
		}

		public String getEngine() {
			return this.engine;
		}

		public void setEngine(String engine) {
			this.engine = engine;
		}

		public Boolean getSupportMysqlPort() {
			return this.supportMysqlPort;
		}

		public void setSupportMysqlPort(Boolean supportMysqlPort) {
			this.supportMysqlPort = supportMysqlPort;
		}

		public Boolean getSupportHttpsPort() {
			return this.supportHttpsPort;
		}

		public void setSupportHttpsPort(Boolean supportHttpsPort) {
			this.supportHttpsPort = supportHttpsPort;
		}

		public String getControlVersion() {
			return this.controlVersion;
		}

		public void setControlVersion(String controlVersion) {
			this.controlVersion = controlVersion;
		}

		public String getPublicIpAddr() {
			return this.publicIpAddr;
		}

		public void setPublicIpAddr(String publicIpAddr) {
			this.publicIpAddr = publicIpAddr;
		}

		public String getVpcIpAddr() {
			return this.vpcIpAddr;
		}

		public void setVpcIpAddr(String vpcIpAddr) {
			this.vpcIpAddr = vpcIpAddr;
		}

		public String getEngineMinorVersion() {
			return this.engineMinorVersion;
		}

		public void setEngineMinorVersion(String engineMinorVersion) {
			this.engineMinorVersion = engineMinorVersion;
		}

		public String getEngineLatestMinorVersion() {
			return this.engineLatestMinorVersion;
		}

		public void setEngineLatestMinorVersion(String engineLatestMinorVersion) {
			this.engineLatestMinorVersion = engineLatestMinorVersion;
		}

		public Boolean getMaintainAutoType() {
			return this.maintainAutoType;
		}

		public void setMaintainAutoType(Boolean maintainAutoType) {
			this.maintainAutoType = maintainAutoType;
		}

		public String getExtStorageType() {
			return this.extStorageType;
		}

		public void setExtStorageType(String extStorageType) {
			this.extStorageType = extStorageType;
		}

		public Integer getExtStorageSize() {
			return this.extStorageSize;
		}

		public void setExtStorageSize(Integer extStorageSize) {
			this.extStorageSize = extStorageSize;
		}

		public String getResourceGroupId() {
			return this.resourceGroupId;
		}

		public void setResourceGroupId(String resourceGroupId) {
			this.resourceGroupId = resourceGroupId;
		}

		public String getZookeeperClass() {
			return this.zookeeperClass;
		}

		public void setZookeeperClass(String zookeeperClass) {
			this.zookeeperClass = zookeeperClass;
		}

		public String getAppointmentRestartTime() {
			return this.appointmentRestartTime;
		}

		public void setAppointmentRestartTime(String appointmentRestartTime) {
			this.appointmentRestartTime = appointmentRestartTime;
		}

		public Map<Object,Object> getZoneIdVswitchMap() {
			return this.zoneIdVswitchMap;
		}

		public void setZoneIdVswitchMap(Map<Object,Object> zoneIdVswitchMap) {
			this.zoneIdVswitchMap = zoneIdVswitchMap;
		}

		public Map<Object,Object> getAvailableUpgradeMajorVersion() {
			return this.availableUpgradeMajorVersion;
		}

		public void setAvailableUpgradeMajorVersion(Map<Object,Object> availableUpgradeMajorVersion) {
			this.availableUpgradeMajorVersion = availableUpgradeMajorVersion;
		}

		public String getAppointmentRestartNodeTime() {
			return this.appointmentRestartNodeTime;
		}

		public void setAppointmentRestartNodeTime(String appointmentRestartNodeTime) {
			this.appointmentRestartNodeTime = appointmentRestartNodeTime;
		}

		public String getAppointmentRestartNodeList() {
			return this.appointmentRestartNodeList;
		}

		public void setAppointmentRestartNodeList(String appointmentRestartNodeList) {
			this.appointmentRestartNodeList = appointmentRestartNodeList;
		}

		public String getAppointmentElectZookeeperTime() {
			return this.appointmentElectZookeeperTime;
		}

		public void setAppointmentElectZookeeperTime(String appointmentElectZookeeperTime) {
			this.appointmentElectZookeeperTime = appointmentElectZookeeperTime;
		}

		public Boolean getAppointmentElectZookeeperDisableWrite() {
			return this.appointmentElectZookeeperDisableWrite;
		}

		public void setAppointmentElectZookeeperDisableWrite(Boolean appointmentElectZookeeperDisableWrite) {
			this.appointmentElectZookeeperDisableWrite = appointmentElectZookeeperDisableWrite;
		}

		public List<Tag> getTags() {
			return this.tags;
		}

		public void setTags(List<Tag> tags) {
			this.tags = tags;
		}

		public ScaleOutStatus getScaleOutStatus() {
			return this.scaleOutStatus;
		}

		public void setScaleOutStatus(ScaleOutStatus scaleOutStatus) {
			this.scaleOutStatus = scaleOutStatus;
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

		public static class ScaleOutStatus {

			private String progress;

			private String ratio;

			public String getProgress() {
				return this.progress;
			}

			public void setProgress(String progress) {
				this.progress = progress;
			}

			public String getRatio() {
				return this.ratio;
			}

			public void setRatio(String ratio) {
				this.ratio = ratio;
			}
		}
	}

	@Override
	public DescribeDBClusterAttributeResponse getInstance(UnmarshallerContext context) {
		return	DescribeDBClusterAttributeResponseUnmarshaller.unmarshall(this, context);
	}
}
