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

import com.aliyuncs.RpcAcsRequest;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.hbr.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateRestoreJobRequest extends RpcAcsRequest<CreateRestoreJobResponse> {
	   

	private String targetPrefix;

	private String snapshotId;

	private Long targetCreateTime;

	private String vaultId;

	private String crossAccountType;

	private String crossAccountRoleName;

	private String snapshotHash;

	private Long targetTime;

	private String targetInstanceName;

	private String sourceType;

	private String exclude;

	private String targetContainer;

	private String targetBucket;

	private String targetContainerClusterId;

	private String include;

	private String udmDetail;

	private String targetTableName;

	private Boolean initiatedByAck;

	private String restoreType;

	private String targetInstanceId;

	@SerializedName("otsDetail")
	private OtsDetail otsDetail;

	private String targetFileSystemId;

	private String targetPath;

	private Long crossAccountUserId;

	private String udmRegionId;
	public CreateRestoreJobRequest() {
		super("hbr", "2017-09-08", "CreateRestoreJob", "hbr");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getTargetPrefix() {
		return this.targetPrefix;
	}

	public void setTargetPrefix(String targetPrefix) {
		this.targetPrefix = targetPrefix;
		if(targetPrefix != null){
			putQueryParameter("TargetPrefix", targetPrefix);
		}
	}

	public String getSnapshotId() {
		return this.snapshotId;
	}

	public void setSnapshotId(String snapshotId) {
		this.snapshotId = snapshotId;
		if(snapshotId != null){
			putQueryParameter("SnapshotId", snapshotId);
		}
	}

	public Long getTargetCreateTime() {
		return this.targetCreateTime;
	}

	public void setTargetCreateTime(Long targetCreateTime) {
		this.targetCreateTime = targetCreateTime;
		if(targetCreateTime != null){
			putQueryParameter("TargetCreateTime", targetCreateTime.toString());
		}
	}

	public String getVaultId() {
		return this.vaultId;
	}

	public void setVaultId(String vaultId) {
		this.vaultId = vaultId;
		if(vaultId != null){
			putQueryParameter("VaultId", vaultId);
		}
	}

	public String getCrossAccountType() {
		return this.crossAccountType;
	}

	public void setCrossAccountType(String crossAccountType) {
		this.crossAccountType = crossAccountType;
		if(crossAccountType != null){
			putQueryParameter("CrossAccountType", crossAccountType);
		}
	}

	public String getCrossAccountRoleName() {
		return this.crossAccountRoleName;
	}

	public void setCrossAccountRoleName(String crossAccountRoleName) {
		this.crossAccountRoleName = crossAccountRoleName;
		if(crossAccountRoleName != null){
			putQueryParameter("CrossAccountRoleName", crossAccountRoleName);
		}
	}

	public String getSnapshotHash() {
		return this.snapshotHash;
	}

	public void setSnapshotHash(String snapshotHash) {
		this.snapshotHash = snapshotHash;
		if(snapshotHash != null){
			putQueryParameter("SnapshotHash", snapshotHash);
		}
	}

	public Long getTargetTime() {
		return this.targetTime;
	}

	public void setTargetTime(Long targetTime) {
		this.targetTime = targetTime;
		if(targetTime != null){
			putQueryParameter("TargetTime", targetTime.toString());
		}
	}

	public String getTargetInstanceName() {
		return this.targetInstanceName;
	}

	public void setTargetInstanceName(String targetInstanceName) {
		this.targetInstanceName = targetInstanceName;
		if(targetInstanceName != null){
			putQueryParameter("TargetInstanceName", targetInstanceName);
		}
	}

	public String getSourceType() {
		return this.sourceType;
	}

	public void setSourceType(String sourceType) {
		this.sourceType = sourceType;
		if(sourceType != null){
			putQueryParameter("SourceType", sourceType);
		}
	}

	public String getExclude() {
		return this.exclude;
	}

	public void setExclude(String exclude) {
		this.exclude = exclude;
		if(exclude != null){
			putBodyParameter("Exclude", exclude);
		}
	}

	public String getTargetContainer() {
		return this.targetContainer;
	}

	public void setTargetContainer(String targetContainer) {
		this.targetContainer = targetContainer;
		if(targetContainer != null){
			putQueryParameter("TargetContainer", targetContainer);
		}
	}

	public String getTargetBucket() {
		return this.targetBucket;
	}

	public void setTargetBucket(String targetBucket) {
		this.targetBucket = targetBucket;
		if(targetBucket != null){
			putQueryParameter("TargetBucket", targetBucket);
		}
	}

	public String getTargetContainerClusterId() {
		return this.targetContainerClusterId;
	}

	public void setTargetContainerClusterId(String targetContainerClusterId) {
		this.targetContainerClusterId = targetContainerClusterId;
		if(targetContainerClusterId != null){
			putQueryParameter("TargetContainerClusterId", targetContainerClusterId);
		}
	}

	public String getInclude() {
		return this.include;
	}

	public void setInclude(String include) {
		this.include = include;
		if(include != null){
			putBodyParameter("Include", include);
		}
	}

	public String getUdmDetail() {
		return this.udmDetail;
	}

	public void setUdmDetail(String udmDetail) {
		this.udmDetail = udmDetail;
		if(udmDetail != null){
			putQueryParameter("UdmDetail", udmDetail);
		}
	}

	public String getTargetTableName() {
		return this.targetTableName;
	}

	public void setTargetTableName(String targetTableName) {
		this.targetTableName = targetTableName;
		if(targetTableName != null){
			putQueryParameter("TargetTableName", targetTableName);
		}
	}

	public Boolean getInitiatedByAck() {
		return this.initiatedByAck;
	}

	public void setInitiatedByAck(Boolean initiatedByAck) {
		this.initiatedByAck = initiatedByAck;
		if(initiatedByAck != null){
			putQueryParameter("InitiatedByAck", initiatedByAck.toString());
		}
	}

	public String getRestoreType() {
		return this.restoreType;
	}

	public void setRestoreType(String restoreType) {
		this.restoreType = restoreType;
		if(restoreType != null){
			putQueryParameter("RestoreType", restoreType);
		}
	}

	public String getTargetInstanceId() {
		return this.targetInstanceId;
	}

	public void setTargetInstanceId(String targetInstanceId) {
		this.targetInstanceId = targetInstanceId;
		if(targetInstanceId != null){
			putBodyParameter("TargetInstanceId", targetInstanceId);
		}
	}

	public OtsDetail getOtsDetail() {
		return this.otsDetail;
	}

	public void setOtsDetail(OtsDetail otsDetail) {
		this.otsDetail = otsDetail;	
		if (otsDetail != null) {
			putBodyParameter("OtsDetail" , new Gson().toJson(otsDetail));
		}	
	}

	public String getTargetFileSystemId() {
		return this.targetFileSystemId;
	}

	public void setTargetFileSystemId(String targetFileSystemId) {
		this.targetFileSystemId = targetFileSystemId;
		if(targetFileSystemId != null){
			putQueryParameter("TargetFileSystemId", targetFileSystemId);
		}
	}

	public String getTargetPath() {
		return this.targetPath;
	}

	public void setTargetPath(String targetPath) {
		this.targetPath = targetPath;
		if(targetPath != null){
			putBodyParameter("TargetPath", targetPath);
		}
	}

	public Long getCrossAccountUserId() {
		return this.crossAccountUserId;
	}

	public void setCrossAccountUserId(Long crossAccountUserId) {
		this.crossAccountUserId = crossAccountUserId;
		if(crossAccountUserId != null){
			putQueryParameter("CrossAccountUserId", crossAccountUserId.toString());
		}
	}

	public String getUdmRegionId() {
		return this.udmRegionId;
	}

	public void setUdmRegionId(String udmRegionId) {
		this.udmRegionId = udmRegionId;
		if(udmRegionId != null){
			putQueryParameter("UdmRegionId", udmRegionId);
		}
	}

	public static class OtsDetail {

		@SerializedName("RestoreSearchIndex")
		private Boolean restoreSearchIndex;

		@SerializedName("RestoreIndex")
		private Boolean restoreIndex;

		@SerializedName("SearchIndexNameSuffix")
		private String searchIndexNameSuffix;

		@SerializedName("OverwriteExisting")
		private Boolean overwriteExisting;

		@SerializedName("IndexNameSuffix")
		private String indexNameSuffix;

		@SerializedName("BatchChannelCount")
		private Integer batchChannelCount;

		@SerializedName("ReGenerateAutoIncrementPK")
		private Boolean reGenerateAutoIncrementPK;

		public Boolean getRestoreSearchIndex() {
			return this.restoreSearchIndex;
		}

		public void setRestoreSearchIndex(Boolean restoreSearchIndex) {
			this.restoreSearchIndex = restoreSearchIndex;
		}

		public Boolean getRestoreIndex() {
			return this.restoreIndex;
		}

		public void setRestoreIndex(Boolean restoreIndex) {
			this.restoreIndex = restoreIndex;
		}

		public String getSearchIndexNameSuffix() {
			return this.searchIndexNameSuffix;
		}

		public void setSearchIndexNameSuffix(String searchIndexNameSuffix) {
			this.searchIndexNameSuffix = searchIndexNameSuffix;
		}

		public Boolean getOverwriteExisting() {
			return this.overwriteExisting;
		}

		public void setOverwriteExisting(Boolean overwriteExisting) {
			this.overwriteExisting = overwriteExisting;
		}

		public String getIndexNameSuffix() {
			return this.indexNameSuffix;
		}

		public void setIndexNameSuffix(String indexNameSuffix) {
			this.indexNameSuffix = indexNameSuffix;
		}

		public Integer getBatchChannelCount() {
			return this.batchChannelCount;
		}

		public void setBatchChannelCount(Integer batchChannelCount) {
			this.batchChannelCount = batchChannelCount;
		}

		public Boolean getReGenerateAutoIncrementPK() {
			return this.reGenerateAutoIncrementPK;
		}

		public void setReGenerateAutoIncrementPK(Boolean reGenerateAutoIncrementPK) {
			this.reGenerateAutoIncrementPK = reGenerateAutoIncrementPK;
		}
	}

	@Override
	public Class<CreateRestoreJobResponse> getResponseClass() {
		return CreateRestoreJobResponse.class;
	}

}
