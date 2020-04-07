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
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.hbr.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateHanaBackupSettingRequest extends RpcAcsRequest<UpdateHanaBackupSettingResponse> {
	   

	private String logBackupParameterFile;

	private String vaultId;

	private Long logBackupTimeout;

	private String dataBackupParameterFile;

	private String clusterId;

	private Boolean enableAutoLogBackup;

	private String token;

	private Boolean logBackupUsingBackint;

	private Boolean catalogBackupUsingBackint;

	private String databaseName;

	private String catalogBackupParameterFile;
	public UpdateHanaBackupSettingRequest() {
		super("hbr", "2017-09-08", "UpdateHanaBackupSetting", "hbr");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getLogBackupParameterFile() {
		return this.logBackupParameterFile;
	}

	public void setLogBackupParameterFile(String logBackupParameterFile) {
		this.logBackupParameterFile = logBackupParameterFile;
		if(logBackupParameterFile != null){
			putQueryParameter("LogBackupParameterFile", logBackupParameterFile);
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

	public Long getLogBackupTimeout() {
		return this.logBackupTimeout;
	}

	public void setLogBackupTimeout(Long logBackupTimeout) {
		this.logBackupTimeout = logBackupTimeout;
		if(logBackupTimeout != null){
			putQueryParameter("LogBackupTimeout", logBackupTimeout.toString());
		}
	}

	public String getDataBackupParameterFile() {
		return this.dataBackupParameterFile;
	}

	public void setDataBackupParameterFile(String dataBackupParameterFile) {
		this.dataBackupParameterFile = dataBackupParameterFile;
		if(dataBackupParameterFile != null){
			putQueryParameter("DataBackupParameterFile", dataBackupParameterFile);
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

	public Boolean getEnableAutoLogBackup() {
		return this.enableAutoLogBackup;
	}

	public void setEnableAutoLogBackup(Boolean enableAutoLogBackup) {
		this.enableAutoLogBackup = enableAutoLogBackup;
		if(enableAutoLogBackup != null){
			putQueryParameter("EnableAutoLogBackup", enableAutoLogBackup.toString());
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

	public Boolean getLogBackupUsingBackint() {
		return this.logBackupUsingBackint;
	}

	public void setLogBackupUsingBackint(Boolean logBackupUsingBackint) {
		this.logBackupUsingBackint = logBackupUsingBackint;
		if(logBackupUsingBackint != null){
			putQueryParameter("LogBackupUsingBackint", logBackupUsingBackint.toString());
		}
	}

	public Boolean getCatalogBackupUsingBackint() {
		return this.catalogBackupUsingBackint;
	}

	public void setCatalogBackupUsingBackint(Boolean catalogBackupUsingBackint) {
		this.catalogBackupUsingBackint = catalogBackupUsingBackint;
		if(catalogBackupUsingBackint != null){
			putQueryParameter("CatalogBackupUsingBackint", catalogBackupUsingBackint.toString());
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

	public String getCatalogBackupParameterFile() {
		return this.catalogBackupParameterFile;
	}

	public void setCatalogBackupParameterFile(String catalogBackupParameterFile) {
		this.catalogBackupParameterFile = catalogBackupParameterFile;
		if(catalogBackupParameterFile != null){
			putQueryParameter("CatalogBackupParameterFile", catalogBackupParameterFile);
		}
	}

	@Override
	public Class<UpdateHanaBackupSettingResponse> getResponseClass() {
		return UpdateHanaBackupSettingResponse.class;
	}

}
