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
public class CreateHanaRestoreRequest extends RpcAcsRequest<CreateHanaRestoreResponse> {
	   

	private String sidAdmin;

	private Long recoveryPointInTime;

	private Long logPosition;

	private String vaultId;

	private String logPaths;

	private String source;

	private Boolean clearLog;

	private String mode;

	private Boolean checkAccess;

	private String masterClientId;

	private Long backupId;

	private String clusterId;

	private String extraOptions;

	private String token;

	private Boolean useDelta;

	private Boolean useCatalog;

	private String backupPrefix;

	private String databaseName;

	private Integer volumeId;

	private String sourceClusterId;

	private Boolean systemCopy;
	public CreateHanaRestoreRequest() {
		super("hbr", "2017-09-08", "CreateHanaRestore", "hbr");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getSidAdmin() {
		return this.sidAdmin;
	}

	public void setSidAdmin(String sidAdmin) {
		this.sidAdmin = sidAdmin;
		if(sidAdmin != null){
			putQueryParameter("SidAdmin", sidAdmin);
		}
	}

	public Long getRecoveryPointInTime() {
		return this.recoveryPointInTime;
	}

	public void setRecoveryPointInTime(Long recoveryPointInTime) {
		this.recoveryPointInTime = recoveryPointInTime;
		if(recoveryPointInTime != null){
			putQueryParameter("RecoveryPointInTime", recoveryPointInTime.toString());
		}
	}

	public Long getLogPosition() {
		return this.logPosition;
	}

	public void setLogPosition(Long logPosition) {
		this.logPosition = logPosition;
		if(logPosition != null){
			putQueryParameter("LogPosition", logPosition.toString());
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

	public String getLogPaths() {
		return this.logPaths;
	}

	public void setLogPaths(String logPaths) {
		this.logPaths = logPaths;
		if(logPaths != null){
			putQueryParameter("LogPaths", logPaths);
		}
	}

	public String getSource() {
		return this.source;
	}

	public void setSource(String source) {
		this.source = source;
		if(source != null){
			putQueryParameter("Source", source);
		}
	}

	public Boolean getClearLog() {
		return this.clearLog;
	}

	public void setClearLog(Boolean clearLog) {
		this.clearLog = clearLog;
		if(clearLog != null){
			putQueryParameter("ClearLog", clearLog.toString());
		}
	}

	public String getMode() {
		return this.mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
		if(mode != null){
			putQueryParameter("Mode", mode);
		}
	}

	public Boolean getCheckAccess() {
		return this.checkAccess;
	}

	public void setCheckAccess(Boolean checkAccess) {
		this.checkAccess = checkAccess;
		if(checkAccess != null){
			putQueryParameter("CheckAccess", checkAccess.toString());
		}
	}

	public String getMasterClientId() {
		return this.masterClientId;
	}

	public void setMasterClientId(String masterClientId) {
		this.masterClientId = masterClientId;
		if(masterClientId != null){
			putQueryParameter("MasterClientId", masterClientId);
		}
	}

	public Long getBackupId() {
		return this.backupId;
	}

	public void setBackupId(Long backupId) {
		this.backupId = backupId;
		if(backupId != null){
			putQueryParameter("BackupId", backupId.toString());
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

	public String getExtraOptions() {
		return this.extraOptions;
	}

	public void setExtraOptions(String extraOptions) {
		this.extraOptions = extraOptions;
		if(extraOptions != null){
			putQueryParameter("ExtraOptions", extraOptions);
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

	public Boolean getUseDelta() {
		return this.useDelta;
	}

	public void setUseDelta(Boolean useDelta) {
		this.useDelta = useDelta;
		if(useDelta != null){
			putQueryParameter("UseDelta", useDelta.toString());
		}
	}

	public Boolean getUseCatalog() {
		return this.useCatalog;
	}

	public void setUseCatalog(Boolean useCatalog) {
		this.useCatalog = useCatalog;
		if(useCatalog != null){
			putQueryParameter("UseCatalog", useCatalog.toString());
		}
	}

	public String getBackupPrefix() {
		return this.backupPrefix;
	}

	public void setBackupPrefix(String backupPrefix) {
		this.backupPrefix = backupPrefix;
		if(backupPrefix != null){
			putQueryParameter("BackupPrefix", backupPrefix);
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

	public Integer getVolumeId() {
		return this.volumeId;
	}

	public void setVolumeId(Integer volumeId) {
		this.volumeId = volumeId;
		if(volumeId != null){
			putQueryParameter("VolumeId", volumeId.toString());
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

	public Boolean getSystemCopy() {
		return this.systemCopy;
	}

	public void setSystemCopy(Boolean systemCopy) {
		this.systemCopy = systemCopy;
		if(systemCopy != null){
			putQueryParameter("SystemCopy", systemCopy.toString());
		}
	}

	@Override
	public Class<CreateHanaRestoreResponse> getResponseClass() {
		return CreateHanaRestoreResponse.class;
	}

}
