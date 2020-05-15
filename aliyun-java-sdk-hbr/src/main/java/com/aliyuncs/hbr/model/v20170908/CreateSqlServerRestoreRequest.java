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
public class CreateSqlServerRestoreRequest extends RpcAcsRequest<CreateSqlServerRestoreResponse> {
	   

	private String snapshotId;

	private String vaultId;

	private String clusterId;

	private String token;

	private String targetDatabaseName;

	private String fileDestination;

	private String sourceDatabaseName;

	private String sourceClusterId;

	private Boolean replaceDatabase;

	private Long pointInTime;
	public CreateSqlServerRestoreRequest() {
		super("hbr", "2017-09-08", "CreateSqlServerRestore", "hbr");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public String getVaultId() {
		return this.vaultId;
	}

	public void setVaultId(String vaultId) {
		this.vaultId = vaultId;
		if(vaultId != null){
			putQueryParameter("VaultId", vaultId);
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

	public String getTargetDatabaseName() {
		return this.targetDatabaseName;
	}

	public void setTargetDatabaseName(String targetDatabaseName) {
		this.targetDatabaseName = targetDatabaseName;
		if(targetDatabaseName != null){
			putQueryParameter("TargetDatabaseName", targetDatabaseName);
		}
	}

	public String getFileDestination() {
		return this.fileDestination;
	}

	public void setFileDestination(String fileDestination) {
		this.fileDestination = fileDestination;
		if(fileDestination != null){
			putQueryParameter("FileDestination", fileDestination);
		}
	}

	public String getSourceDatabaseName() {
		return this.sourceDatabaseName;
	}

	public void setSourceDatabaseName(String sourceDatabaseName) {
		this.sourceDatabaseName = sourceDatabaseName;
		if(sourceDatabaseName != null){
			putQueryParameter("SourceDatabaseName", sourceDatabaseName);
		}
	}

	public String getSourceClusterId() {
		return this.sourceClusterId;
	}

	public void setSourceClusterId(String sourceClusterId) {
		this.sourceClusterId = sourceClusterId;
		if(sourceClusterId != null){
			putQueryParameter("SourceClusterId", sourceClusterId);
		}
	}

	public Boolean getReplaceDatabase() {
		return this.replaceDatabase;
	}

	public void setReplaceDatabase(Boolean replaceDatabase) {
		this.replaceDatabase = replaceDatabase;
		if(replaceDatabase != null){
			putQueryParameter("ReplaceDatabase", replaceDatabase.toString());
		}
	}

	public Long getPointInTime() {
		return this.pointInTime;
	}

	public void setPointInTime(Long pointInTime) {
		this.pointInTime = pointInTime;
		if(pointInTime != null){
			putQueryParameter("PointInTime", pointInTime.toString());
		}
	}

	@Override
	public Class<CreateSqlServerRestoreResponse> getResponseClass() {
		return CreateSqlServerRestoreResponse.class;
	}

}
