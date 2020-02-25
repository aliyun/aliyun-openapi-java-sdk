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

package com.aliyuncs.dbs.model.v20190306;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dbs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyBackupSetDownloadRulesRequest extends RpcAcsRequest<ModifyBackupSetDownloadRulesResponse> {
	   

	private String fullDataFormat;

	private Long backupGatewayId;

	private String clientToken;

	private String backupSetDownloadTargetType;

	private String backupPlanId;

	private String ownerId;

	private Boolean openAutoDownload;

	private String incrementDataFormat;

	private String backupSetDownloadDir;
	public ModifyBackupSetDownloadRulesRequest() {
		super("Dbs", "2019-03-06", "ModifyBackupSetDownloadRules");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getFullDataFormat() {
		return this.fullDataFormat;
	}

	public void setFullDataFormat(String fullDataFormat) {
		this.fullDataFormat = fullDataFormat;
		if(fullDataFormat != null){
			putQueryParameter("FullDataFormat", fullDataFormat);
		}
	}

	public Long getBackupGatewayId() {
		return this.backupGatewayId;
	}

	public void setBackupGatewayId(Long backupGatewayId) {
		this.backupGatewayId = backupGatewayId;
		if(backupGatewayId != null){
			putQueryParameter("BackupGatewayId", backupGatewayId.toString());
		}
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
		}
	}

	public String getBackupSetDownloadTargetType() {
		return this.backupSetDownloadTargetType;
	}

	public void setBackupSetDownloadTargetType(String backupSetDownloadTargetType) {
		this.backupSetDownloadTargetType = backupSetDownloadTargetType;
		if(backupSetDownloadTargetType != null){
			putQueryParameter("BackupSetDownloadTargetType", backupSetDownloadTargetType);
		}
	}

	public String getBackupPlanId() {
		return this.backupPlanId;
	}

	public void setBackupPlanId(String backupPlanId) {
		this.backupPlanId = backupPlanId;
		if(backupPlanId != null){
			putQueryParameter("BackupPlanId", backupPlanId);
		}
	}

	public String getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId);
		}
	}

	public Boolean getOpenAutoDownload() {
		return this.openAutoDownload;
	}

	public void setOpenAutoDownload(Boolean openAutoDownload) {
		this.openAutoDownload = openAutoDownload;
		if(openAutoDownload != null){
			putQueryParameter("OpenAutoDownload", openAutoDownload.toString());
		}
	}

	public String getIncrementDataFormat() {
		return this.incrementDataFormat;
	}

	public void setIncrementDataFormat(String incrementDataFormat) {
		this.incrementDataFormat = incrementDataFormat;
		if(incrementDataFormat != null){
			putQueryParameter("IncrementDataFormat", incrementDataFormat);
		}
	}

	public String getBackupSetDownloadDir() {
		return this.backupSetDownloadDir;
	}

	public void setBackupSetDownloadDir(String backupSetDownloadDir) {
		this.backupSetDownloadDir = backupSetDownloadDir;
		if(backupSetDownloadDir != null){
			putQueryParameter("BackupSetDownloadDir", backupSetDownloadDir);
		}
	}

	@Override
	public Class<ModifyBackupSetDownloadRulesResponse> getResponseClass() {
		return ModifyBackupSetDownloadRulesResponse.class;
	}

}
