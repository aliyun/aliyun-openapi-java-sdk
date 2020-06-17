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

package com.aliyuncs.smartag.model.v20180313;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.smartag.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DeleteSagExpressConnectInterfaceRequest extends RpcAcsRequest<DeleteSagExpressConnectInterfaceResponse> {
	   

	private Long resourceOwnerId;

	private String vlan;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private Long ownerId;

	private String smartAGId;

	private String smartAGSn;

	private String portName;
	public DeleteSagExpressConnectInterfaceRequest() {
		super("Smartag", "2018-03-13", "DeleteSagExpressConnectInterface", "smartag");
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

	public String getVlan() {
		return this.vlan;
	}

	public void setVlan(String vlan) {
		this.vlan = vlan;
		if(vlan != null){
			putQueryParameter("Vlan", vlan);
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

	public String getSmartAGId() {
		return this.smartAGId;
	}

	public void setSmartAGId(String smartAGId) {
		this.smartAGId = smartAGId;
		if(smartAGId != null){
			putQueryParameter("SmartAGId", smartAGId);
		}
	}

	public String getSmartAGSn() {
		return this.smartAGSn;
	}

	public void setSmartAGSn(String smartAGSn) {
		this.smartAGSn = smartAGSn;
		if(smartAGSn != null){
			putQueryParameter("SmartAGSn", smartAGSn);
		}
	}

	public String getPortName() {
		return this.portName;
	}

	public void setPortName(String portName) {
		this.portName = portName;
		if(portName != null){
			putQueryParameter("PortName", portName);
		}
	}

	@Override
	public Class<DeleteSagExpressConnectInterfaceResponse> getResponseClass() {
		return DeleteSagExpressConnectInterfaceResponse.class;
	}

}
