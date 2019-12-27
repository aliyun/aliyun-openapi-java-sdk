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

package com.aliyuncs.rds.model.v20140815;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.rds.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyDBProxyInstanceRequest extends RpcAcsRequest<ModifyDBProxyInstanceResponse> {
	   

	private Long resourceOwnerId;

	private String effectiveTime;

	private String effectiveSpecificTime;

	private String dBInstanceId;

	private String resourceOwnerAccount;

	private Long ownerId;

	private String dBProxyInstanceNum;

	private String dBProxyInstanceType;
	public ModifyDBProxyInstanceRequest() {
		super("Rds", "2014-08-15", "ModifyDBProxyInstance", "rds");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getEffectiveTime() {
		return this.effectiveTime;
	}

	public void setEffectiveTime(String effectiveTime) {
		this.effectiveTime = effectiveTime;
		if(effectiveTime != null){
			putQueryParameter("EffectiveTime", effectiveTime);
		}
	}

	public String getEffectiveSpecificTime() {
		return this.effectiveSpecificTime;
	}

	public void setEffectiveSpecificTime(String effectiveSpecificTime) {
		this.effectiveSpecificTime = effectiveSpecificTime;
		if(effectiveSpecificTime != null){
			putQueryParameter("EffectiveSpecificTime", effectiveSpecificTime);
		}
	}

	public String getDBInstanceId() {
		return this.dBInstanceId;
	}

	public void setDBInstanceId(String dBInstanceId) {
		this.dBInstanceId = dBInstanceId;
		if(dBInstanceId != null){
			putQueryParameter("DBInstanceId", dBInstanceId);
		}
	}

	public String getResourceOwnerAccount() {
		return this.resourceOwnerAccount;
	}

	public void setResourceOwnerAccount(String resourceOwnerAccount) {
		this.resourceOwnerAccount = resourceOwnerAccount;
		if(resourceOwnerAccount != null){
			putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public String getDBProxyInstanceNum() {
		return this.dBProxyInstanceNum;
	}

	public void setDBProxyInstanceNum(String dBProxyInstanceNum) {
		this.dBProxyInstanceNum = dBProxyInstanceNum;
		if(dBProxyInstanceNum != null){
			putQueryParameter("DBProxyInstanceNum", dBProxyInstanceNum);
		}
	}

	public String getDBProxyInstanceType() {
		return this.dBProxyInstanceType;
	}

	public void setDBProxyInstanceType(String dBProxyInstanceType) {
		this.dBProxyInstanceType = dBProxyInstanceType;
		if(dBProxyInstanceType != null){
			putQueryParameter("DBProxyInstanceType", dBProxyInstanceType);
		}
	}

	@Override
	public Class<ModifyDBProxyInstanceResponse> getResponseClass() {
		return ModifyDBProxyInstanceResponse.class;
	}

}
