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

package com.aliyuncs.dts.model.v20200101;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dts.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ConfigureSubscriptionInstanceRequest extends RpcAcsRequest<ConfigureSubscriptionInstanceResponse> {
	   

	private String sourceEndpointInstanceID;

	private String sourceEndpointOracleSID;

	private String sourceEndpointIP;

	private Boolean subscriptionDataTypeDML;

	private String sourceEndpointInstanceType;

	private String accountId;

	private String subscriptionObject;

	private String subscriptionInstanceVSwitchId;

	private String sourceEndpointUserName;

	private String sourceEndpointDatabaseName;

	private String sourceEndpointPort;

	private String sourceEndpointOwnerID;

	private String subscriptionInstanceVPCId;

	private String subscriptionInstanceNetworkType;

	private String subscriptionInstanceId;

	private String sourceEndpointRole;

	private String ownerId;

	private Boolean subscriptionDataTypeDDL;

	private String sourceEndpointPassword;

	private String subscriptionInstanceName;
	public ConfigureSubscriptionInstanceRequest() {
		super("Dts", "2020-01-01", "ConfigureSubscriptionInstance", "dts");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getSourceEndpointInstanceID() {
		return this.sourceEndpointInstanceID;
	}

	public void setSourceEndpointInstanceID(String sourceEndpointInstanceID) {
		this.sourceEndpointInstanceID = sourceEndpointInstanceID;
		if(sourceEndpointInstanceID != null){
			putQueryParameter("SourceEndpoint.InstanceID", sourceEndpointInstanceID);
		}
	}

	public String getSourceEndpointOracleSID() {
		return this.sourceEndpointOracleSID;
	}

	public void setSourceEndpointOracleSID(String sourceEndpointOracleSID) {
		this.sourceEndpointOracleSID = sourceEndpointOracleSID;
		if(sourceEndpointOracleSID != null){
			putQueryParameter("SourceEndpoint.OracleSID", sourceEndpointOracleSID);
		}
	}

	public String getSourceEndpointIP() {
		return this.sourceEndpointIP;
	}

	public void setSourceEndpointIP(String sourceEndpointIP) {
		this.sourceEndpointIP = sourceEndpointIP;
		if(sourceEndpointIP != null){
			putQueryParameter("SourceEndpoint.IP", sourceEndpointIP);
		}
	}

	public Boolean getSubscriptionDataTypeDML() {
		return this.subscriptionDataTypeDML;
	}

	public void setSubscriptionDataTypeDML(Boolean subscriptionDataTypeDML) {
		this.subscriptionDataTypeDML = subscriptionDataTypeDML;
		if(subscriptionDataTypeDML != null){
			putQueryParameter("SubscriptionDataType.DML", subscriptionDataTypeDML.toString());
		}
	}

	public String getSourceEndpointInstanceType() {
		return this.sourceEndpointInstanceType;
	}

	public void setSourceEndpointInstanceType(String sourceEndpointInstanceType) {
		this.sourceEndpointInstanceType = sourceEndpointInstanceType;
		if(sourceEndpointInstanceType != null){
			putQueryParameter("SourceEndpoint.InstanceType", sourceEndpointInstanceType);
		}
	}

	public String getAccountId() {
		return this.accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
		if(accountId != null){
			putQueryParameter("AccountId", accountId);
		}
	}

	public String getSubscriptionObject() {
		return this.subscriptionObject;
	}

	public void setSubscriptionObject(String subscriptionObject) {
		this.subscriptionObject = subscriptionObject;
		if(subscriptionObject != null){
			putBodyParameter("SubscriptionObject", subscriptionObject);
		}
	}

	public String getSubscriptionInstanceVSwitchId() {
		return this.subscriptionInstanceVSwitchId;
	}

	public void setSubscriptionInstanceVSwitchId(String subscriptionInstanceVSwitchId) {
		this.subscriptionInstanceVSwitchId = subscriptionInstanceVSwitchId;
		if(subscriptionInstanceVSwitchId != null){
			putQueryParameter("SubscriptionInstance.VSwitchId", subscriptionInstanceVSwitchId);
		}
	}

	public String getSourceEndpointUserName() {
		return this.sourceEndpointUserName;
	}

	public void setSourceEndpointUserName(String sourceEndpointUserName) {
		this.sourceEndpointUserName = sourceEndpointUserName;
		if(sourceEndpointUserName != null){
			putQueryParameter("SourceEndpoint.UserName", sourceEndpointUserName);
		}
	}

	public String getSourceEndpointDatabaseName() {
		return this.sourceEndpointDatabaseName;
	}

	public void setSourceEndpointDatabaseName(String sourceEndpointDatabaseName) {
		this.sourceEndpointDatabaseName = sourceEndpointDatabaseName;
		if(sourceEndpointDatabaseName != null){
			putQueryParameter("SourceEndpoint.DatabaseName", sourceEndpointDatabaseName);
		}
	}

	public String getSourceEndpointPort() {
		return this.sourceEndpointPort;
	}

	public void setSourceEndpointPort(String sourceEndpointPort) {
		this.sourceEndpointPort = sourceEndpointPort;
		if(sourceEndpointPort != null){
			putQueryParameter("SourceEndpoint.Port", sourceEndpointPort);
		}
	}

	public String getSourceEndpointOwnerID() {
		return this.sourceEndpointOwnerID;
	}

	public void setSourceEndpointOwnerID(String sourceEndpointOwnerID) {
		this.sourceEndpointOwnerID = sourceEndpointOwnerID;
		if(sourceEndpointOwnerID != null){
			putQueryParameter("SourceEndpoint.OwnerID", sourceEndpointOwnerID);
		}
	}

	public String getSubscriptionInstanceVPCId() {
		return this.subscriptionInstanceVPCId;
	}

	public void setSubscriptionInstanceVPCId(String subscriptionInstanceVPCId) {
		this.subscriptionInstanceVPCId = subscriptionInstanceVPCId;
		if(subscriptionInstanceVPCId != null){
			putQueryParameter("SubscriptionInstance.VPCId", subscriptionInstanceVPCId);
		}
	}

	public String getSubscriptionInstanceNetworkType() {
		return this.subscriptionInstanceNetworkType;
	}

	public void setSubscriptionInstanceNetworkType(String subscriptionInstanceNetworkType) {
		this.subscriptionInstanceNetworkType = subscriptionInstanceNetworkType;
		if(subscriptionInstanceNetworkType != null){
			putQueryParameter("SubscriptionInstanceNetworkType", subscriptionInstanceNetworkType);
		}
	}

	public String getSubscriptionInstanceId() {
		return this.subscriptionInstanceId;
	}

	public void setSubscriptionInstanceId(String subscriptionInstanceId) {
		this.subscriptionInstanceId = subscriptionInstanceId;
		if(subscriptionInstanceId != null){
			putQueryParameter("SubscriptionInstanceId", subscriptionInstanceId);
		}
	}

	public String getSourceEndpointRole() {
		return this.sourceEndpointRole;
	}

	public void setSourceEndpointRole(String sourceEndpointRole) {
		this.sourceEndpointRole = sourceEndpointRole;
		if(sourceEndpointRole != null){
			putQueryParameter("SourceEndpoint.Role", sourceEndpointRole);
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

	public Boolean getSubscriptionDataTypeDDL() {
		return this.subscriptionDataTypeDDL;
	}

	public void setSubscriptionDataTypeDDL(Boolean subscriptionDataTypeDDL) {
		this.subscriptionDataTypeDDL = subscriptionDataTypeDDL;
		if(subscriptionDataTypeDDL != null){
			putQueryParameter("SubscriptionDataType.DDL", subscriptionDataTypeDDL.toString());
		}
	}

	public String getSourceEndpointPassword() {
		return this.sourceEndpointPassword;
	}

	public void setSourceEndpointPassword(String sourceEndpointPassword) {
		this.sourceEndpointPassword = sourceEndpointPassword;
		if(sourceEndpointPassword != null){
			putQueryParameter("SourceEndpoint.Password", sourceEndpointPassword);
		}
	}

	public String getSubscriptionInstanceName() {
		return this.subscriptionInstanceName;
	}

	public void setSubscriptionInstanceName(String subscriptionInstanceName) {
		this.subscriptionInstanceName = subscriptionInstanceName;
		if(subscriptionInstanceName != null){
			putQueryParameter("SubscriptionInstanceName", subscriptionInstanceName);
		}
	}

	@Override
	public Class<ConfigureSubscriptionInstanceResponse> getResponseClass() {
		return ConfigureSubscriptionInstanceResponse.class;
	}

}
