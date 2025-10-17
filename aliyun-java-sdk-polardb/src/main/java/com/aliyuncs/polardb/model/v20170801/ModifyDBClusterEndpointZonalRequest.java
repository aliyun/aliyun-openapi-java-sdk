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

package com.aliyuncs.polardb.model.v20170801;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.polardb.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyDBClusterEndpointZonalRequest extends RpcAcsRequest<ModifyDBClusterEndpointZonalResponse> {
	   

	private String autoAddNewNodes;

	private Long resourceOwnerId;

	private String clientToken;

	private String dBEndpointId;

	private String polarSccWaitTimeout;

	private String readWriteMode;

	private String polarSccTimeoutAction;

	private String resourceOwnerAccount;

	private String dBClusterId;

	private String ownerAccount;

	private String endpointConfig;

	private String dBEndpointDescription;

	private Long ownerId;

	private String nodes;

	private String sccMode;
	public ModifyDBClusterEndpointZonalRequest() {
		super("polardb", "2017-08-01", "ModifyDBClusterEndpointZonal", "polardb");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getAutoAddNewNodes() {
		return this.autoAddNewNodes;
	}

	public void setAutoAddNewNodes(String autoAddNewNodes) {
		this.autoAddNewNodes = autoAddNewNodes;
		if(autoAddNewNodes != null){
			putQueryParameter("AutoAddNewNodes", autoAddNewNodes);
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

	public String getDBEndpointId() {
		return this.dBEndpointId;
	}

	public void setDBEndpointId(String dBEndpointId) {
		this.dBEndpointId = dBEndpointId;
		if(dBEndpointId != null){
			putQueryParameter("DBEndpointId", dBEndpointId);
		}
	}

	public String getPolarSccWaitTimeout() {
		return this.polarSccWaitTimeout;
	}

	public void setPolarSccWaitTimeout(String polarSccWaitTimeout) {
		this.polarSccWaitTimeout = polarSccWaitTimeout;
		if(polarSccWaitTimeout != null){
			putQueryParameter("PolarSccWaitTimeout", polarSccWaitTimeout);
		}
	}

	public String getReadWriteMode() {
		return this.readWriteMode;
	}

	public void setReadWriteMode(String readWriteMode) {
		this.readWriteMode = readWriteMode;
		if(readWriteMode != null){
			putQueryParameter("ReadWriteMode", readWriteMode);
		}
	}

	public String getPolarSccTimeoutAction() {
		return this.polarSccTimeoutAction;
	}

	public void setPolarSccTimeoutAction(String polarSccTimeoutAction) {
		this.polarSccTimeoutAction = polarSccTimeoutAction;
		if(polarSccTimeoutAction != null){
			putQueryParameter("PolarSccTimeoutAction", polarSccTimeoutAction);
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

	public String getDBClusterId() {
		return this.dBClusterId;
	}

	public void setDBClusterId(String dBClusterId) {
		this.dBClusterId = dBClusterId;
		if(dBClusterId != null){
			putQueryParameter("DBClusterId", dBClusterId);
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

	public String getEndpointConfig() {
		return this.endpointConfig;
	}

	public void setEndpointConfig(String endpointConfig) {
		this.endpointConfig = endpointConfig;
		if(endpointConfig != null){
			putQueryParameter("EndpointConfig", endpointConfig);
		}
	}

	public String getDBEndpointDescription() {
		return this.dBEndpointDescription;
	}

	public void setDBEndpointDescription(String dBEndpointDescription) {
		this.dBEndpointDescription = dBEndpointDescription;
		if(dBEndpointDescription != null){
			putQueryParameter("DBEndpointDescription", dBEndpointDescription);
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

	public String getNodes() {
		return this.nodes;
	}

	public void setNodes(String nodes) {
		this.nodes = nodes;
		if(nodes != null){
			putQueryParameter("Nodes", nodes);
		}
	}

	public String getSccMode() {
		return this.sccMode;
	}

	public void setSccMode(String sccMode) {
		this.sccMode = sccMode;
		if(sccMode != null){
			putQueryParameter("SccMode", sccMode);
		}
	}

	@Override
	public Class<ModifyDBClusterEndpointZonalResponse> getResponseClass() {
		return ModifyDBClusterEndpointZonalResponse.class;
	}

}
