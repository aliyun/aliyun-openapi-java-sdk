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

	private String restoreType;

	private String snapshotHash;

	private String options;

	private String sourceType;

	private String targetFileSystemId;

	private String targetPath;

	private String targetBucket;
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

	public String getRestoreType() {
		return this.restoreType;
	}

	public void setRestoreType(String restoreType) {
		this.restoreType = restoreType;
		if(restoreType != null){
			putQueryParameter("RestoreType", restoreType);
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
			putQueryParameter("TargetPath", targetPath);
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

	@Override
	public Class<CreateRestoreJobResponse> getResponseClass() {
		return CreateRestoreJobResponse.class;
	}

}
