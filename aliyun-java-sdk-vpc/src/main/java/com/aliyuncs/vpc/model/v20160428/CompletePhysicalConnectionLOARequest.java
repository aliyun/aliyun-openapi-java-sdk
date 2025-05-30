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

package com.aliyuncs.vpc.model.v20160428;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.vpc.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CompletePhysicalConnectionLOARequest extends RpcAcsRequest<CompletePhysicalConnectionLOAResponse> {
	   

	private String lineCode;

	private Long resourceOwnerId;

	private String clientToken;

	private String lineSPContactInfo;

	private Boolean finishWork;

	private String lineServiceProvider;

	private String lineLabel;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private Long ownerId;

	private String instanceId;
	public CompletePhysicalConnectionLOARequest() {
		super("Vpc", "2016-04-28", "CompletePhysicalConnectionLOA", "vpc");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getLineCode() {
		return this.lineCode;
	}

	public void setLineCode(String lineCode) {
		this.lineCode = lineCode;
		if(lineCode != null){
			putQueryParameter("LineCode", lineCode);
		}
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

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
		}
	}

	public String getLineSPContactInfo() {
		return this.lineSPContactInfo;
	}

	public void setLineSPContactInfo(String lineSPContactInfo) {
		this.lineSPContactInfo = lineSPContactInfo;
		if(lineSPContactInfo != null){
			putQueryParameter("LineSPContactInfo", lineSPContactInfo);
		}
	}

	public Boolean getFinishWork() {
		return this.finishWork;
	}

	public void setFinishWork(Boolean finishWork) {
		this.finishWork = finishWork;
		if(finishWork != null){
			putQueryParameter("FinishWork", finishWork.toString());
		}
	}

	public String getLineServiceProvider() {
		return this.lineServiceProvider;
	}

	public void setLineServiceProvider(String lineServiceProvider) {
		this.lineServiceProvider = lineServiceProvider;
		if(lineServiceProvider != null){
			putQueryParameter("LineServiceProvider", lineServiceProvider);
		}
	}

	public String getLineLabel() {
		return this.lineLabel;
	}

	public void setLineLabel(String lineLabel) {
		this.lineLabel = lineLabel;
		if(lineLabel != null){
			putQueryParameter("LineLabel", lineLabel);
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

	public String getOwnerAccount() {
		return this.ownerAccount;
	}

	public void setOwnerAccount(String ownerAccount) {
		this.ownerAccount = ownerAccount;
		if(ownerAccount != null){
			putQueryParameter("OwnerAccount", ownerAccount);
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

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	@Override
	public Class<CompletePhysicalConnectionLOAResponse> getResponseClass() {
		return CompletePhysicalConnectionLOAResponse.class;
	}

}
