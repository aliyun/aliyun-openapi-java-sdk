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

package com.aliyuncs.sgw.model.v20180511;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sgw.transform.v20180511.DescribeGatewayFileSharesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeGatewayFileSharesResponse extends AcsResponse {

	private String message;

	private String requestId;

	private String code;

	private Boolean success;

	private List<FileShare> fileShares;

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<FileShare> getFileShares() {
		return this.fileShares;
	}

	public void setFileShares(List<FileShare> fileShares) {
		this.fileShares = fileShares;
	}

	public static class FileShare {

		private String serialNumber;

		private String clientSideCmk;

		private String partialSyncPaths;

		private String pathPrefix;

		private Boolean bucketsStub;

		private Long uploadQueue;

		private String diskId;

		private Long ossUsed;

		private Long downloadQueue;

		private Long activeMessages;

		private String indexId;

		private String mnsHealth;

		private Boolean accessBasedEnumeration;

		private Long downloadRate;

		private Integer feLimit;

		private Boolean supportArchive;

		private String ossEndpoint;

		private String ossHealth;

		private Long outRate;

		private String serverSideCmk;

		private String rwClientList;

		private String state;

		private String protocol;

		private Boolean ossBucketSsl;

		private Integer downloadLimit;

		private Boolean inPlace;

		private Boolean remoteSync;

		private Long fileNumLimit;

		private String squash;

		private String nfsFullPath;

		private Long remainingMetaSpace;

		private Boolean transferAcceleration;

		private Long size;

		private Boolean serverSideEncryption;

		private Boolean windowsAcl;

		private Boolean remoteSyncDownload;

		private Boolean clientSideEncryption;

		private String bucketInfos;

		private Boolean nfsV4Optimization;

		private Long totalUpload;

		private String diskType;

		private Long used;

		private Boolean ignoreDelete;

		private String roUserList;

		private Long fsSizeLimit;

		private Long totalDownload;

		private Boolean enabled;

		private Integer highWatermark;

		private String kmsRotatePeriod;

		private String address;

		private Integer pollingInterval;

		private String name;

		private String ossBucketName;

		private String expressSyncId;

		private Long lagPeriod;

		private Boolean directIO;

		private String cacheMode;

		private Long inRate;

		private Integer lowWatermark;

		private Integer syncProgress;

		private String serverSideAlgorithm;

		private String obsoleteBuckets;

		private Integer beLimit;

		private String localPath;

		private String roClientList;

		private String rwUserList;

		private Boolean fastReclaim;

		private Boolean browsable;

		private Boolean throttling;

		private Boolean bypassCacheRead;

		public String getSerialNumber() {
			return this.serialNumber;
		}

		public void setSerialNumber(String serialNumber) {
			this.serialNumber = serialNumber;
		}

		public String getClientSideCmk() {
			return this.clientSideCmk;
		}

		public void setClientSideCmk(String clientSideCmk) {
			this.clientSideCmk = clientSideCmk;
		}

		public String getPartialSyncPaths() {
			return this.partialSyncPaths;
		}

		public void setPartialSyncPaths(String partialSyncPaths) {
			this.partialSyncPaths = partialSyncPaths;
		}

		public String getPathPrefix() {
			return this.pathPrefix;
		}

		public void setPathPrefix(String pathPrefix) {
			this.pathPrefix = pathPrefix;
		}

		public Boolean getBucketsStub() {
			return this.bucketsStub;
		}

		public void setBucketsStub(Boolean bucketsStub) {
			this.bucketsStub = bucketsStub;
		}

		public Long getUploadQueue() {
			return this.uploadQueue;
		}

		public void setUploadQueue(Long uploadQueue) {
			this.uploadQueue = uploadQueue;
		}

		public String getDiskId() {
			return this.diskId;
		}

		public void setDiskId(String diskId) {
			this.diskId = diskId;
		}

		public Long getOssUsed() {
			return this.ossUsed;
		}

		public void setOssUsed(Long ossUsed) {
			this.ossUsed = ossUsed;
		}

		public Long getDownloadQueue() {
			return this.downloadQueue;
		}

		public void setDownloadQueue(Long downloadQueue) {
			this.downloadQueue = downloadQueue;
		}

		public Long getActiveMessages() {
			return this.activeMessages;
		}

		public void setActiveMessages(Long activeMessages) {
			this.activeMessages = activeMessages;
		}

		public String getIndexId() {
			return this.indexId;
		}

		public void setIndexId(String indexId) {
			this.indexId = indexId;
		}

		public String getMnsHealth() {
			return this.mnsHealth;
		}

		public void setMnsHealth(String mnsHealth) {
			this.mnsHealth = mnsHealth;
		}

		public Boolean getAccessBasedEnumeration() {
			return this.accessBasedEnumeration;
		}

		public void setAccessBasedEnumeration(Boolean accessBasedEnumeration) {
			this.accessBasedEnumeration = accessBasedEnumeration;
		}

		public Long getDownloadRate() {
			return this.downloadRate;
		}

		public void setDownloadRate(Long downloadRate) {
			this.downloadRate = downloadRate;
		}

		public Integer getFeLimit() {
			return this.feLimit;
		}

		public void setFeLimit(Integer feLimit) {
			this.feLimit = feLimit;
		}

		public Boolean getSupportArchive() {
			return this.supportArchive;
		}

		public void setSupportArchive(Boolean supportArchive) {
			this.supportArchive = supportArchive;
		}

		public String getOssEndpoint() {
			return this.ossEndpoint;
		}

		public void setOssEndpoint(String ossEndpoint) {
			this.ossEndpoint = ossEndpoint;
		}

		public String getOssHealth() {
			return this.ossHealth;
		}

		public void setOssHealth(String ossHealth) {
			this.ossHealth = ossHealth;
		}

		public Long getOutRate() {
			return this.outRate;
		}

		public void setOutRate(Long outRate) {
			this.outRate = outRate;
		}

		public String getServerSideCmk() {
			return this.serverSideCmk;
		}

		public void setServerSideCmk(String serverSideCmk) {
			this.serverSideCmk = serverSideCmk;
		}

		public String getRwClientList() {
			return this.rwClientList;
		}

		public void setRwClientList(String rwClientList) {
			this.rwClientList = rwClientList;
		}

		public String getState() {
			return this.state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public String getBizProtocol() {
			return this.protocol;
		}

		public void setBizProtocol(String protocol) {
			this.protocol = protocol;
		}

		public Boolean getOssBucketSsl() {
			return this.ossBucketSsl;
		}

		public void setOssBucketSsl(Boolean ossBucketSsl) {
			this.ossBucketSsl = ossBucketSsl;
		}

		public Integer getDownloadLimit() {
			return this.downloadLimit;
		}

		public void setDownloadLimit(Integer downloadLimit) {
			this.downloadLimit = downloadLimit;
		}

		public Boolean getInPlace() {
			return this.inPlace;
		}

		public void setInPlace(Boolean inPlace) {
			this.inPlace = inPlace;
		}

		public Boolean getRemoteSync() {
			return this.remoteSync;
		}

		public void setRemoteSync(Boolean remoteSync) {
			this.remoteSync = remoteSync;
		}

		public Long getFileNumLimit() {
			return this.fileNumLimit;
		}

		public void setFileNumLimit(Long fileNumLimit) {
			this.fileNumLimit = fileNumLimit;
		}

		public String getSquash() {
			return this.squash;
		}

		public void setSquash(String squash) {
			this.squash = squash;
		}

		public String getNfsFullPath() {
			return this.nfsFullPath;
		}

		public void setNfsFullPath(String nfsFullPath) {
			this.nfsFullPath = nfsFullPath;
		}

		public Long getRemainingMetaSpace() {
			return this.remainingMetaSpace;
		}

		public void setRemainingMetaSpace(Long remainingMetaSpace) {
			this.remainingMetaSpace = remainingMetaSpace;
		}

		public Boolean getTransferAcceleration() {
			return this.transferAcceleration;
		}

		public void setTransferAcceleration(Boolean transferAcceleration) {
			this.transferAcceleration = transferAcceleration;
		}

		public Long getSize() {
			return this.size;
		}

		public void setSize(Long size) {
			this.size = size;
		}

		public Boolean getServerSideEncryption() {
			return this.serverSideEncryption;
		}

		public void setServerSideEncryption(Boolean serverSideEncryption) {
			this.serverSideEncryption = serverSideEncryption;
		}

		public Boolean getWindowsAcl() {
			return this.windowsAcl;
		}

		public void setWindowsAcl(Boolean windowsAcl) {
			this.windowsAcl = windowsAcl;
		}

		public Boolean getRemoteSyncDownload() {
			return this.remoteSyncDownload;
		}

		public void setRemoteSyncDownload(Boolean remoteSyncDownload) {
			this.remoteSyncDownload = remoteSyncDownload;
		}

		public Boolean getClientSideEncryption() {
			return this.clientSideEncryption;
		}

		public void setClientSideEncryption(Boolean clientSideEncryption) {
			this.clientSideEncryption = clientSideEncryption;
		}

		public String getBucketInfos() {
			return this.bucketInfos;
		}

		public void setBucketInfos(String bucketInfos) {
			this.bucketInfos = bucketInfos;
		}

		public Boolean getNfsV4Optimization() {
			return this.nfsV4Optimization;
		}

		public void setNfsV4Optimization(Boolean nfsV4Optimization) {
			this.nfsV4Optimization = nfsV4Optimization;
		}

		public Long getTotalUpload() {
			return this.totalUpload;
		}

		public void setTotalUpload(Long totalUpload) {
			this.totalUpload = totalUpload;
		}

		public String getDiskType() {
			return this.diskType;
		}

		public void setDiskType(String diskType) {
			this.diskType = diskType;
		}

		public Long getUsed() {
			return this.used;
		}

		public void setUsed(Long used) {
			this.used = used;
		}

		public Boolean getIgnoreDelete() {
			return this.ignoreDelete;
		}

		public void setIgnoreDelete(Boolean ignoreDelete) {
			this.ignoreDelete = ignoreDelete;
		}

		public String getRoUserList() {
			return this.roUserList;
		}

		public void setRoUserList(String roUserList) {
			this.roUserList = roUserList;
		}

		public Long getFsSizeLimit() {
			return this.fsSizeLimit;
		}

		public void setFsSizeLimit(Long fsSizeLimit) {
			this.fsSizeLimit = fsSizeLimit;
		}

		public Long getTotalDownload() {
			return this.totalDownload;
		}

		public void setTotalDownload(Long totalDownload) {
			this.totalDownload = totalDownload;
		}

		public Boolean getEnabled() {
			return this.enabled;
		}

		public void setEnabled(Boolean enabled) {
			this.enabled = enabled;
		}

		public Integer getHighWatermark() {
			return this.highWatermark;
		}

		public void setHighWatermark(Integer highWatermark) {
			this.highWatermark = highWatermark;
		}

		public String getKmsRotatePeriod() {
			return this.kmsRotatePeriod;
		}

		public void setKmsRotatePeriod(String kmsRotatePeriod) {
			this.kmsRotatePeriod = kmsRotatePeriod;
		}

		public String getAddress() {
			return this.address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public Integer getPollingInterval() {
			return this.pollingInterval;
		}

		public void setPollingInterval(Integer pollingInterval) {
			this.pollingInterval = pollingInterval;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getOssBucketName() {
			return this.ossBucketName;
		}

		public void setOssBucketName(String ossBucketName) {
			this.ossBucketName = ossBucketName;
		}

		public String getExpressSyncId() {
			return this.expressSyncId;
		}

		public void setExpressSyncId(String expressSyncId) {
			this.expressSyncId = expressSyncId;
		}

		public Long getLagPeriod() {
			return this.lagPeriod;
		}

		public void setLagPeriod(Long lagPeriod) {
			this.lagPeriod = lagPeriod;
		}

		public Boolean getDirectIO() {
			return this.directIO;
		}

		public void setDirectIO(Boolean directIO) {
			this.directIO = directIO;
		}

		public String getCacheMode() {
			return this.cacheMode;
		}

		public void setCacheMode(String cacheMode) {
			this.cacheMode = cacheMode;
		}

		public Long getInRate() {
			return this.inRate;
		}

		public void setInRate(Long inRate) {
			this.inRate = inRate;
		}

		public Integer getLowWatermark() {
			return this.lowWatermark;
		}

		public void setLowWatermark(Integer lowWatermark) {
			this.lowWatermark = lowWatermark;
		}

		public Integer getSyncProgress() {
			return this.syncProgress;
		}

		public void setSyncProgress(Integer syncProgress) {
			this.syncProgress = syncProgress;
		}

		public String getServerSideAlgorithm() {
			return this.serverSideAlgorithm;
		}

		public void setServerSideAlgorithm(String serverSideAlgorithm) {
			this.serverSideAlgorithm = serverSideAlgorithm;
		}

		public String getObsoleteBuckets() {
			return this.obsoleteBuckets;
		}

		public void setObsoleteBuckets(String obsoleteBuckets) {
			this.obsoleteBuckets = obsoleteBuckets;
		}

		public Integer getBeLimit() {
			return this.beLimit;
		}

		public void setBeLimit(Integer beLimit) {
			this.beLimit = beLimit;
		}

		public String getLocalPath() {
			return this.localPath;
		}

		public void setLocalPath(String localPath) {
			this.localPath = localPath;
		}

		public String getRoClientList() {
			return this.roClientList;
		}

		public void setRoClientList(String roClientList) {
			this.roClientList = roClientList;
		}

		public String getRwUserList() {
			return this.rwUserList;
		}

		public void setRwUserList(String rwUserList) {
			this.rwUserList = rwUserList;
		}

		public Boolean getFastReclaim() {
			return this.fastReclaim;
		}

		public void setFastReclaim(Boolean fastReclaim) {
			this.fastReclaim = fastReclaim;
		}

		public Boolean getBrowsable() {
			return this.browsable;
		}

		public void setBrowsable(Boolean browsable) {
			this.browsable = browsable;
		}

		public Boolean getThrottling() {
			return this.throttling;
		}

		public void setThrottling(Boolean throttling) {
			this.throttling = throttling;
		}

		public Boolean getBypassCacheRead() {
			return this.bypassCacheRead;
		}

		public void setBypassCacheRead(Boolean bypassCacheRead) {
			this.bypassCacheRead = bypassCacheRead;
		}
	}

	@Override
	public DescribeGatewayFileSharesResponse getInstance(UnmarshallerContext context) {
		return	DescribeGatewayFileSharesResponseUnmarshaller.unmarshall(this, context);
	}
}
