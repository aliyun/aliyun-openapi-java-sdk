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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.polardb.transform.v20170801.DescribePolarFsAttributeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribePolarFsAttributeResponse extends AcsResponse {

	private String requestId;

	private String relativeDbClusterId;

	private String polarFsInstanceId;

	private String polarFsStatus;

	private String polarFsVersion;

	private String payType;

	private String dBType;

	private String polarFsInstanceDescription;

	private String regionId;

	private String zoneId;

	private String vPCId;

	private String vSwitchId;

	private String securityGroupId;

	private String createTime;

	private String expireTime;

	private String expired;

	private String polarFsType;

	private Double storageSpace;

	private Double storageUsed;

	private Double bandwidth;

	private Double bandwidthBaseLine;

	private String category;

	private String lockMode;

	private String storageType;

	private String acceleratingEnable;

	private Double acceleratedStorageSpace;

	private String minorVersion;

	private String clientDownloadPath;

	private String metaUrl;

	private String relativePfsClusterId;

	private String bucketId;

	private String fileSystemId;

	private String customBucketPath;

	private MountInfo mountInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getRelativeDbClusterId() {
		return this.relativeDbClusterId;
	}

	public void setRelativeDbClusterId(String relativeDbClusterId) {
		this.relativeDbClusterId = relativeDbClusterId;
	}

	public String getPolarFsInstanceId() {
		return this.polarFsInstanceId;
	}

	public void setPolarFsInstanceId(String polarFsInstanceId) {
		this.polarFsInstanceId = polarFsInstanceId;
	}

	public String getPolarFsStatus() {
		return this.polarFsStatus;
	}

	public void setPolarFsStatus(String polarFsStatus) {
		this.polarFsStatus = polarFsStatus;
	}

	public String getPolarFsVersion() {
		return this.polarFsVersion;
	}

	public void setPolarFsVersion(String polarFsVersion) {
		this.polarFsVersion = polarFsVersion;
	}

	public String getPayType() {
		return this.payType;
	}

	public void setPayType(String payType) {
		this.payType = payType;
	}

	public String getDBType() {
		return this.dBType;
	}

	public void setDBType(String dBType) {
		this.dBType = dBType;
	}

	public String getPolarFsInstanceDescription() {
		return this.polarFsInstanceDescription;
	}

	public void setPolarFsInstanceDescription(String polarFsInstanceDescription) {
		this.polarFsInstanceDescription = polarFsInstanceDescription;
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

	public String getVPCId() {
		return this.vPCId;
	}

	public void setVPCId(String vPCId) {
		this.vPCId = vPCId;
	}

	public String getVSwitchId() {
		return this.vSwitchId;
	}

	public void setVSwitchId(String vSwitchId) {
		this.vSwitchId = vSwitchId;
	}

	public String getSecurityGroupId() {
		return this.securityGroupId;
	}

	public void setSecurityGroupId(String securityGroupId) {
		this.securityGroupId = securityGroupId;
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

	public String getExpired() {
		return this.expired;
	}

	public void setExpired(String expired) {
		this.expired = expired;
	}

	public String getPolarFsType() {
		return this.polarFsType;
	}

	public void setPolarFsType(String polarFsType) {
		this.polarFsType = polarFsType;
	}

	public Double getStorageSpace() {
		return this.storageSpace;
	}

	public void setStorageSpace(Double storageSpace) {
		this.storageSpace = storageSpace;
	}

	public Double getStorageUsed() {
		return this.storageUsed;
	}

	public void setStorageUsed(Double storageUsed) {
		this.storageUsed = storageUsed;
	}

	public Double getBandwidth() {
		return this.bandwidth;
	}

	public void setBandwidth(Double bandwidth) {
		this.bandwidth = bandwidth;
	}

	public Double getBandwidthBaseLine() {
		return this.bandwidthBaseLine;
	}

	public void setBandwidthBaseLine(Double bandwidthBaseLine) {
		this.bandwidthBaseLine = bandwidthBaseLine;
	}

	public String getCategory() {
		return this.category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getLockMode() {
		return this.lockMode;
	}

	public void setLockMode(String lockMode) {
		this.lockMode = lockMode;
	}

	public String getStorageType() {
		return this.storageType;
	}

	public void setStorageType(String storageType) {
		this.storageType = storageType;
	}

	public String getAcceleratingEnable() {
		return this.acceleratingEnable;
	}

	public void setAcceleratingEnable(String acceleratingEnable) {
		this.acceleratingEnable = acceleratingEnable;
	}

	public Double getAcceleratedStorageSpace() {
		return this.acceleratedStorageSpace;
	}

	public void setAcceleratedStorageSpace(Double acceleratedStorageSpace) {
		this.acceleratedStorageSpace = acceleratedStorageSpace;
	}

	public String getMinorVersion() {
		return this.minorVersion;
	}

	public void setMinorVersion(String minorVersion) {
		this.minorVersion = minorVersion;
	}

	public String getClientDownloadPath() {
		return this.clientDownloadPath;
	}

	public void setClientDownloadPath(String clientDownloadPath) {
		this.clientDownloadPath = clientDownloadPath;
	}

	public String getMetaUrl() {
		return this.metaUrl;
	}

	public void setMetaUrl(String metaUrl) {
		this.metaUrl = metaUrl;
	}

	public String getRelativePfsClusterId() {
		return this.relativePfsClusterId;
	}

	public void setRelativePfsClusterId(String relativePfsClusterId) {
		this.relativePfsClusterId = relativePfsClusterId;
	}

	public String getBucketId() {
		return this.bucketId;
	}

	public void setBucketId(String bucketId) {
		this.bucketId = bucketId;
	}

	public String getFileSystemId() {
		return this.fileSystemId;
	}

	public void setFileSystemId(String fileSystemId) {
		this.fileSystemId = fileSystemId;
	}

	public String getCustomBucketPath() {
		return this.customBucketPath;
	}

	public void setCustomBucketPath(String customBucketPath) {
		this.customBucketPath = customBucketPath;
	}

	public MountInfo getMountInfo() {
		return this.mountInfo;
	}

	public void setMountInfo(MountInfo mountInfo) {
		this.mountInfo = mountInfo;
	}

	public static class MountInfo {

		private String polarFsCluster;

		private String token;

		private String polarDbProxy;

		public String getPolarFsCluster() {
			return this.polarFsCluster;
		}

		public void setPolarFsCluster(String polarFsCluster) {
			this.polarFsCluster = polarFsCluster;
		}

		public String getToken() {
			return this.token;
		}

		public void setToken(String token) {
			this.token = token;
		}

		public String getPolarDbProxy() {
			return this.polarDbProxy;
		}

		public void setPolarDbProxy(String polarDbProxy) {
			this.polarDbProxy = polarDbProxy;
		}
	}

	@Override
	public DescribePolarFsAttributeResponse getInstance(UnmarshallerContext context) {
		return	DescribePolarFsAttributeResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
