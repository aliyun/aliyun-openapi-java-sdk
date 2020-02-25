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
public class ModifyBackupStrategyRequest extends RpcAcsRequest<ModifyBackupStrategyResponse> {
	   

	private String clientToken;

	private String backupPlanId;

	private String ownerId;

	private String backupPeriod;

	private String backupStartTime;
	public ModifyBackupStrategyRequest() {
		super("Dbs", "2019-03-06", "ModifyBackupStrategy");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public String getBackupPeriod() {
		return this.backupPeriod;
	}

	public void setBackupPeriod(String backupPeriod) {
		this.backupPeriod = backupPeriod;
		if(backupPeriod != null){
			putQueryParameter("BackupPeriod", backupPeriod);
		}
	}

	public String getBackupStartTime() {
		return this.backupStartTime;
	}

	public void setBackupStartTime(String backupStartTime) {
		this.backupStartTime = backupStartTime;
		if(backupStartTime != null){
			putQueryParameter("BackupStartTime", backupStartTime);
		}
	}

	@Override
	public Class<ModifyBackupStrategyResponse> getResponseClass() {
		return ModifyBackupStrategyResponse.class;
	}

}
