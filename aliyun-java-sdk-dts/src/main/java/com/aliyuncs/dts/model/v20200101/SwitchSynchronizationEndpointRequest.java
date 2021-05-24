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
public class SwitchSynchronizationEndpointRequest extends RpcAcsRequest<SwitchSynchronizationEndpointResponse> {
	   

	private String synchronizationJobId;

	private String endpointType;

	private String accountId;

	private String endpointPort;

	private String endpointInstanceType;

	private String sourceEndpointOwnerID;

	private String sourceEndpointRole;

	private String endpointIP;

	private String ownerId;

	private String endpointInstanceId;

	private String synchronizationDirection;
	public SwitchSynchronizationEndpointRequest() {
		super("Dts", "2020-01-01", "SwitchSynchronizationEndpoint", "dts");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getSynchronizationJobId() {
		return this.synchronizationJobId;
	}

	public void setSynchronizationJobId(String synchronizationJobId) {
		this.synchronizationJobId = synchronizationJobId;
		if(synchronizationJobId != null){
			putQueryParameter("SynchronizationJobId", synchronizationJobId);
		}
	}

	public String getEndpointType() {
		return this.endpointType;
	}

	public void setEndpointType(String endpointType) {
		this.endpointType = endpointType;
		if(endpointType != null){
			putQueryParameter("Endpoint.Type", endpointType);
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

	public String getEndpointPort() {
		return this.endpointPort;
	}

	public void setEndpointPort(String endpointPort) {
		this.endpointPort = endpointPort;
		if(endpointPort != null){
			putQueryParameter("Endpoint.Port", endpointPort);
		}
	}

	public String getEndpointInstanceType() {
		return this.endpointInstanceType;
	}

	public void setEndpointInstanceType(String endpointInstanceType) {
		this.endpointInstanceType = endpointInstanceType;
		if(endpointInstanceType != null){
			putQueryParameter("Endpoint.InstanceType", endpointInstanceType);
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

	public String getSourceEndpointRole() {
		return this.sourceEndpointRole;
	}

	public void setSourceEndpointRole(String sourceEndpointRole) {
		this.sourceEndpointRole = sourceEndpointRole;
		if(sourceEndpointRole != null){
			putQueryParameter("SourceEndpoint.Role", sourceEndpointRole);
		}
	}

	public String getEndpointIP() {
		return this.endpointIP;
	}

	public void setEndpointIP(String endpointIP) {
		this.endpointIP = endpointIP;
		if(endpointIP != null){
			putQueryParameter("Endpoint.IP", endpointIP);
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

	public String getEndpointInstanceId() {
		return this.endpointInstanceId;
	}

	public void setEndpointInstanceId(String endpointInstanceId) {
		this.endpointInstanceId = endpointInstanceId;
		if(endpointInstanceId != null){
			putQueryParameter("Endpoint.InstanceId", endpointInstanceId);
		}
	}

	public String getSynchronizationDirection() {
		return this.synchronizationDirection;
	}

	public void setSynchronizationDirection(String synchronizationDirection) {
		this.synchronizationDirection = synchronizationDirection;
		if(synchronizationDirection != null){
			putQueryParameter("SynchronizationDirection", synchronizationDirection);
		}
	}

	@Override
	public Class<SwitchSynchronizationEndpointResponse> getResponseClass() {
		return SwitchSynchronizationEndpointResponse.class;
	}

}
