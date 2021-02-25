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

	private String snapshotHash;

	private String targetClientId;

	private String options;

	private String sourceType;

	private String exclude;

	private String targetBucket;

	private String targetDataSourceId;

	private String include;

	private String udmDetail;

	private String clusterId;

	private String restoreType;

	private String targetInstanceId;

	private String targetFileSystemId;

	private String targetPath;

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

	public String getSnapshotHash() {
		return this.snapshotHash;
	}

	public void setSnapshotHash(String snapshotHash) {
		this.snapshotHash = snapshotHash;
		if(snapshotHash != null){
			putQueryParameter("SnapshotHash", snapshotHash);
		}
	}

	public String getTargetClientId() {
		return this.targetClientId;
	}

	public void setTargetClientId(String targetClientId) {
		this.targetClientId = targetClientId;
		if(targetClientId != null){
			putBodyParameter("TargetClientId", targetClientId);
		}
	}

	public String getOptions() {
		return this.options;
	}

	public void setOptions(String options) {
		this.options = options;
		if(options != null){
			putQueryParameter("Options", options);
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

	public String getTargetBucket() {
		return this.targetBucket;
	}

	public void setTargetBucket(String targetBucket) {
		this.targetBucket = targetBucket;
		if(targetBucket != null){
			putQueryParameter("TargetBucket", targetBucket);
		}
	}

	public String getTargetDataSourceId() {
		return this.targetDataSourceId;
	}

	public void setTargetDataSourceId(String targetDataSourceId) {
		this.targetDataSourceId = targetDataSourceId;
		if(targetDataSourceId != null){
			putBodyParameter("TargetDataSourceId", targetDataSourceId);
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

	public String getClusterId() {
		return this.clusterId;
	}

	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
		if(clusterId != null){
			putBodyParameter("ClusterId", clusterId);
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

	public String getUdmRegionId() {
		return this.udmRegionId;
	}

	public void setUdmRegionId(String udmRegionId) {
		this.udmRegionId = udmRegionId;
		if(udmRegionId != null){
			putQueryParameter("UdmRegionId", udmRegionId);
		}
	}

	@Override
	public Class<CreateRestoreJobResponse> getResponseClass() {
		return CreateRestoreJobResponse.class;
	}

}
