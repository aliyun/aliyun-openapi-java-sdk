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
public class CreateSqlServerSnapshotRequest extends RpcAcsRequest<CreateSqlServerSnapshotResponse> {
	   

	private String vaultId;

	private String snapshotName;

	private Long startTime;

	private String snapshotHash;

	private Long completeTime;

	private String parentSnapshotHash;

	private String backupType;

	private Long bytesTotal;

	private Long expireTime;

	private String clusterId;

	private String token;

	private String databaseName;

	private String planId;

	private String databaseId;

	private String status;
	public CreateSqlServerSnapshotRequest() {
		super("hbr", "2017-09-08", "CreateSqlServerSnapshot", "hbr");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public String getSnapshotName() {
		return this.snapshotName;
	}

	public void setSnapshotName(String snapshotName) {
		this.snapshotName = snapshotName;
		if(snapshotName != null){
			putQueryParameter("SnapshotName", snapshotName);
		}
	}

	public Long getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Long startTime) {
		this.startTime = startTime;
		if(startTime != null){
			putQueryParameter("StartTime", startTime.toString());
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

	public Long getCompleteTime() {
		return this.completeTime;
	}

	public void setCompleteTime(Long completeTime) {
		this.completeTime = completeTime;
		if(completeTime != null){
			putQueryParameter("CompleteTime", completeTime.toString());
		}
	}

	public String getParentSnapshotHash() {
		return this.parentSnapshotHash;
	}

	public void setParentSnapshotHash(String parentSnapshotHash) {
		this.parentSnapshotHash = parentSnapshotHash;
		if(parentSnapshotHash != null){
			putQueryParameter("ParentSnapshotHash", parentSnapshotHash);
		}
	}

	public String getBackupType() {
		return this.backupType;
	}

	public void setBackupType(String backupType) {
		this.backupType = backupType;
		if(backupType != null){
			putQueryParameter("BackupType", backupType);
		}
	}

	public Long getBytesTotal() {
		return this.bytesTotal;
	}

	public void setBytesTotal(Long bytesTotal) {
		this.bytesTotal = bytesTotal;
		if(bytesTotal != null){
			putQueryParameter("BytesTotal", bytesTotal.toString());
		}
	}

	public Long getExpireTime() {
		return this.expireTime;
	}

	public void setExpireTime(Long expireTime) {
		this.expireTime = expireTime;
		if(expireTime != null){
			putQueryParameter("ExpireTime", expireTime.toString());
		}
	}

	public String getClusterId() {
		return this.clusterId;
	}

	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
		if(clusterId != null){
			putQueryParameter("ClusterId", clusterId);
		}
	}

	public String getToken() {
		return this.token;
	}

	public void setToken(String token) {
		this.token = token;
		if(token != null){
			putQueryParameter("Token", token);
		}
	}

	public String getDatabaseName() {
		return this.databaseName;
	}

	public void setDatabaseName(String databaseName) {
		this.databaseName = databaseName;
		if(databaseName != null){
			putQueryParameter("DatabaseName", databaseName);
		}
	}

	public String getPlanId() {
		return this.planId;
	}

	public void setPlanId(String planId) {
		this.planId = planId;
		if(planId != null){
			putQueryParameter("PlanId", planId);
		}
	}

	public String getDatabaseId() {
		return this.databaseId;
	}

	public void setDatabaseId(String databaseId) {
		this.databaseId = databaseId;
		if(databaseId != null){
			putQueryParameter("DatabaseId", databaseId);
		}
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
		if(status != null){
			putQueryParameter("Status", status);
		}
	}

	@Override
	public Class<CreateSqlServerSnapshotResponse> getResponseClass() {
		return CreateSqlServerSnapshotResponse.class;
	}

}
