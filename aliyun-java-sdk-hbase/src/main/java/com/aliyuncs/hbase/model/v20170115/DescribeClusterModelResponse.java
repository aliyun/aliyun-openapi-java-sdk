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

package com.aliyuncs.hbase.model.v20170115;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.hbase.transform.v20170115.DescribeClusterModelResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeClusterModelResponse extends AcsResponse {

	private String requestId;

	private String coreDiskType;

	private String coreDiskSize;

	private String clusterId;

	private String clusterName;

	private String mainVersion;

	private String status;

	private String clusterType;

	private String dbType;

	private String isMultimod;

	private String backupStatus;

	private String hasUser;

	private String lockMode;

	private String haType;

	private String masterInstanceType;

	private String masterDiskType;

	private Integer masterDiskSize;

	private String coreInstanceType;

	private Integer coreInstanceQuantity;

	private Integer coreDiskQuantity;

	private String payType;

	private String autoRenew;

	private String createTime;

	private String expireTime;

	private String regionId;

	private String zoneId;

	private String updateStatus;

	private String coldStorageStatus;

	private String minorVersion;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getCoreDiskType() {
		return this.coreDiskType;
	}

	public void setCoreDiskType(String coreDiskType) {
		this.coreDiskType = coreDiskType;
	}

	public String getCoreDiskSize() {
		return this.coreDiskSize;
	}

	public void setCoreDiskSize(String coreDiskSize) {
		this.coreDiskSize = coreDiskSize;
	}

	public String getClusterId() {
		return this.clusterId;
	}

	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
	}

	public String getClusterName() {
		return this.clusterName;
	}

	public void setClusterName(String clusterName) {
		this.clusterName = clusterName;
	}

	public String getMainVersion() {
		return this.mainVersion;
	}

	public void setMainVersion(String mainVersion) {
		this.mainVersion = mainVersion;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getClusterType() {
		return this.clusterType;
	}

	public void setClusterType(String clusterType) {
		this.clusterType = clusterType;
	}

	public String getDbType() {
		return this.dbType;
	}

	public void setDbType(String dbType) {
		this.dbType = dbType;
	}

	public String getIsMultimod() {
		return this.isMultimod;
	}

	public void setIsMultimod(String isMultimod) {
		this.isMultimod = isMultimod;
	}

	public String getBackupStatus() {
		return this.backupStatus;
	}

	public void setBackupStatus(String backupStatus) {
		this.backupStatus = backupStatus;
	}

	public String getHasUser() {
		return this.hasUser;
	}

	public void setHasUser(String hasUser) {
		this.hasUser = hasUser;
	}

	public String getLockMode() {
		return this.lockMode;
	}

	public void setLockMode(String lockMode) {
		this.lockMode = lockMode;
	}

	public String getHaType() {
		return this.haType;
	}

	public void setHaType(String haType) {
		this.haType = haType;
	}

	public String getMasterInstanceType() {
		return this.masterInstanceType;
	}

	public void setMasterInstanceType(String masterInstanceType) {
		this.masterInstanceType = masterInstanceType;
	}

	public String getMasterDiskType() {
		return this.masterDiskType;
	}

	public void setMasterDiskType(String masterDiskType) {
		this.masterDiskType = masterDiskType;
	}

	public Integer getMasterDiskSize() {
		return this.masterDiskSize;
	}

	public void setMasterDiskSize(Integer masterDiskSize) {
		this.masterDiskSize = masterDiskSize;
	}

	public String getCoreInstanceType() {
		return this.coreInstanceType;
	}

	public void setCoreInstanceType(String coreInstanceType) {
		this.coreInstanceType = coreInstanceType;
	}

	public Integer getCoreInstanceQuantity() {
		return this.coreInstanceQuantity;
	}

	public void setCoreInstanceQuantity(Integer coreInstanceQuantity) {
		this.coreInstanceQuantity = coreInstanceQuantity;
	}

	public Integer getCoreDiskQuantity() {
		return this.coreDiskQuantity;
	}

	public void setCoreDiskQuantity(Integer coreDiskQuantity) {
		this.coreDiskQuantity = coreDiskQuantity;
	}

	public String getPayType() {
		return this.payType;
	}

	public void setPayType(String payType) {
		this.payType = payType;
	}

	public String getAutoRenew() {
		return this.autoRenew;
	}

	public void setAutoRenew(String autoRenew) {
		this.autoRenew = autoRenew;
	}

	public String getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getExpireTime() {
		return this.expireTime;
	}

	public void setExpireTime(String expireTime) {
		this.expireTime = expireTime;
	}

	public String getBizRegionId() {
		return this.regionId;
	}

	public void setBizRegionId(String regionId) {
		this.regionId = regionId;
	}

	/**
	 * @deprecated use getBizRegionId instead of this.
	 */
	@Deprecated
	public String getRegionId() {
		return this.regionId;
	}

	/**
	 * @deprecated use setBizRegionId instead of this.
	 */
	@Deprecated
	public void setRegionId(String regionId) {
		this.regionId = regionId;
	}

	public String getZoneId() {
		return this.zoneId;
	}

	public void setZoneId(String zoneId) {
		this.zoneId = zoneId;
	}

	public String getUpdateStatus() {
		return this.updateStatus;
	}

	public void setUpdateStatus(String updateStatus) {
		this.updateStatus = updateStatus;
	}

	public String getColdStorageStatus() {
		return this.coldStorageStatus;
	}

	public void setColdStorageStatus(String coldStorageStatus) {
		this.coldStorageStatus = coldStorageStatus;
	}

	public String getMinorVersion() {
		return this.minorVersion;
	}

	public void setMinorVersion(String minorVersion) {
		this.minorVersion = minorVersion;
	}

	@Override
	public DescribeClusterModelResponse getInstance(UnmarshallerContext context) {
		return	DescribeClusterModelResponseUnmarshaller.unmarshall(this, context);
	}
}
