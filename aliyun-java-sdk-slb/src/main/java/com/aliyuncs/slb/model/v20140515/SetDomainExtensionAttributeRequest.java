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

package com.aliyuncs.slb.model.v20140515;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class SetDomainExtensionAttributeRequest extends RpcAcsRequest<SetDomainExtensionAttributeResponse> {
	
	public SetDomainExtensionAttributeRequest() {
		super("Slb", "2014-05-15", "SetDomainExtensionAttribute", "slb");
	}

	private Long resourceOwnerId;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private Long ownerId;

	private String serverCertificateId;

	private String domainExtensionId;

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
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

	public String getServerCertificateId() {
		return this.serverCertificateId;
	}

	public void setServerCertificateId(String serverCertificateId) {
		this.serverCertificateId = serverCertificateId;
		if(serverCertificateId != null){
			putQueryParameter("ServerCertificateId", serverCertificateId);
		}
	}

	public String getDomainExtensionId() {
		return this.domainExtensionId;
	}

	public void setDomainExtensionId(String domainExtensionId) {
		this.domainExtensionId = domainExtensionId;
		if(domainExtensionId != null){
			putQueryParameter("DomainExtensionId", domainExtensionId);
		}
	}

	@Override
	public Class<SetDomainExtensionAttributeResponse> getResponseClass() {
		return SetDomainExtensionAttributeResponse.class;
	}

}
