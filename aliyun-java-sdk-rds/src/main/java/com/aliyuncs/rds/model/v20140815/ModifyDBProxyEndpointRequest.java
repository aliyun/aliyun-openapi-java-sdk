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
public class ModifyDBProxyEndpointRequest extends RpcAcsRequest<ModifyDBProxyEndpointResponse> {
	   

	private Long resourceOwnerId;

	private String configDBProxyFeatures;

	private String dBInstanceId;

	private String readOnlyInstanceWeight;

	private String readOnlyInstanceMaxDelayTime;

	private String resourceOwnerAccount;

	private String dbEndpointAliases;

	private String dbEndpointOperator;

	private String dbEndpointType;

	private Long ownerId;

	private String dbEndpointReadWriteMode;

	private String dBProxyEndpointId;

	private String readOnlyInstanceDistributionType;
	public ModifyDBProxyEndpointRequest() {
		super("Rds", "2014-08-15", "ModifyDBProxyEndpoint", "rds");
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

	public String getConfigDBProxyFeatures() {
		return this.configDBProxyFeatures;
	}

	public void setConfigDBProxyFeatures(String configDBProxyFeatures) {
		this.configDBProxyFeatures = configDBProxyFeatures;
		if(configDBProxyFeatures != null){
			putQueryParameter("ConfigDBProxyFeatures", configDBProxyFeatures);
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

	public String getReadOnlyInstanceWeight() {
		return this.readOnlyInstanceWeight;
	}

	public void setReadOnlyInstanceWeight(String readOnlyInstanceWeight) {
		this.readOnlyInstanceWeight = readOnlyInstanceWeight;
		if(readOnlyInstanceWeight != null){
			putQueryParameter("ReadOnlyInstanceWeight", readOnlyInstanceWeight);
		}
	}

	public String getReadOnlyInstanceMaxDelayTime() {
		return this.readOnlyInstanceMaxDelayTime;
	}

	public void setReadOnlyInstanceMaxDelayTime(String readOnlyInstanceMaxDelayTime) {
		this.readOnlyInstanceMaxDelayTime = readOnlyInstanceMaxDelayTime;
		if(readOnlyInstanceMaxDelayTime != null){
			putQueryParameter("ReadOnlyInstanceMaxDelayTime", readOnlyInstanceMaxDelayTime);
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

	public String getDbEndpointAliases() {
		return this.dbEndpointAliases;
	}

	public void setDbEndpointAliases(String dbEndpointAliases) {
		this.dbEndpointAliases = dbEndpointAliases;
		if(dbEndpointAliases != null){
			putQueryParameter("DbEndpointAliases", dbEndpointAliases);
		}
	}

	public String getDbEndpointOperator() {
		return this.dbEndpointOperator;
	}

	public void setDbEndpointOperator(String dbEndpointOperator) {
		this.dbEndpointOperator = dbEndpointOperator;
		if(dbEndpointOperator != null){
			putQueryParameter("DbEndpointOperator", dbEndpointOperator);
		}
	}

	public String getDbEndpointType() {
		return this.dbEndpointType;
	}

	public void setDbEndpointType(String dbEndpointType) {
		this.dbEndpointType = dbEndpointType;
		if(dbEndpointType != null){
			putQueryParameter("DbEndpointType", dbEndpointType);
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

	public String getDbEndpointReadWriteMode() {
		return this.dbEndpointReadWriteMode;
	}

	public void setDbEndpointReadWriteMode(String dbEndpointReadWriteMode) {
		this.dbEndpointReadWriteMode = dbEndpointReadWriteMode;
		if(dbEndpointReadWriteMode != null){
			putQueryParameter("DbEndpointReadWriteMode", dbEndpointReadWriteMode);
		}
	}

	public String getDBProxyEndpointId() {
		return this.dBProxyEndpointId;
	}

	public void setDBProxyEndpointId(String dBProxyEndpointId) {
		this.dBProxyEndpointId = dBProxyEndpointId;
		if(dBProxyEndpointId != null){
			putQueryParameter("DBProxyEndpointId", dBProxyEndpointId);
		}
	}

	public String getReadOnlyInstanceDistributionType() {
		return this.readOnlyInstanceDistributionType;
	}

	public void setReadOnlyInstanceDistributionType(String readOnlyInstanceDistributionType) {
		this.readOnlyInstanceDistributionType = readOnlyInstanceDistributionType;
		if(readOnlyInstanceDistributionType != null){
			putQueryParameter("ReadOnlyInstanceDistributionType", readOnlyInstanceDistributionType);
		}
	}

	@Override
	public Class<ModifyDBProxyEndpointResponse> getResponseClass() {
		return ModifyDBProxyEndpointResponse.class;
	}

}
