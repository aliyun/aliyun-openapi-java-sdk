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

package com.aliyuncs.uis.model.v20180821;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class CreateDnatEntryRequest extends RpcAcsRequest<CreateDnatEntryResponse> {
	
	public CreateDnatEntryRequest() {
		super("Uis", "2018-08-21", "CreateDnatEntry", "uis");
	}

	private String destinationIp;

	private Integer destinationPort;

	private Long resourceOwnerId;

	private String uisNodeId;

	private String resourceOwnerAccount;

	private String ipProtocol;

	private String ownerAccount;

	private String name;

	private Integer originalPort;

	private Long ownerId;

	private String originalIp;

	public String getDestinationIp() {
		return this.destinationIp;
	}

	public void setDestinationIp(String destinationIp) {
		this.destinationIp = destinationIp;
		if(destinationIp != null){
			putQueryParameter("DestinationIp", destinationIp);
		}
	}

	public Integer getDestinationPort() {
		return this.destinationPort;
	}

	public void setDestinationPort(Integer destinationPort) {
		this.destinationPort = destinationPort;
		if(destinationPort != null){
			putQueryParameter("DestinationPort", destinationPort.toString());
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

	public String getUisNodeId() {
		return this.uisNodeId;
	}

	public void setUisNodeId(String uisNodeId) {
		this.uisNodeId = uisNodeId;
		if(uisNodeId != null){
			putQueryParameter("UisNodeId", uisNodeId);
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

	public String getIpProtocol() {
		return this.ipProtocol;
	}

	public void setIpProtocol(String ipProtocol) {
		this.ipProtocol = ipProtocol;
		if(ipProtocol != null){
			putQueryParameter("IpProtocol", ipProtocol);
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

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
		}
	}

	public Integer getOriginalPort() {
		return this.originalPort;
	}

	public void setOriginalPort(Integer originalPort) {
		this.originalPort = originalPort;
		if(originalPort != null){
			putQueryParameter("OriginalPort", originalPort.toString());
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

	public String getOriginalIp() {
		return this.originalIp;
	}

	public void setOriginalIp(String originalIp) {
		this.originalIp = originalIp;
		if(originalIp != null){
			putQueryParameter("OriginalIp", originalIp);
		}
	}

	@Override
	public Class<CreateDnatEntryResponse> getResponseClass() {
		return CreateDnatEntryResponse.class;
	}

}
