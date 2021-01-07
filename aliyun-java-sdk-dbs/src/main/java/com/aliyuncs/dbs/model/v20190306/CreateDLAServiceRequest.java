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
public class CreateDLAServiceRequest extends RpcAcsRequest<CreateDLAServiceResponse> {
	   

	private String clientToken;

	private Boolean autoAdd;

	private String backupSetIds;

	private String backupPlanId;

	private String ownerId;
	public CreateDLAServiceRequest() {
		super("Dbs", "2019-03-06", "CreateDLAService", "cbs");
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

	public Boolean getAutoAdd() {
		return this.autoAdd;
	}

	public void setAutoAdd(Boolean autoAdd) {
		this.autoAdd = autoAdd;
		if(autoAdd != null){
			putQueryParameter("AutoAdd", autoAdd.toString());
		}
	}

	public String getBackupSetIds() {
		return this.backupSetIds;
	}

	public void setBackupSetIds(String backupSetIds) {
		this.backupSetIds = backupSetIds;
		if(backupSetIds != null){
			putQueryParameter("BackupSetIds", backupSetIds);
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

	@Override
	public Class<CreateDLAServiceResponse> getResponseClass() {
		return CreateDLAServiceResponse.class;
	}

}
