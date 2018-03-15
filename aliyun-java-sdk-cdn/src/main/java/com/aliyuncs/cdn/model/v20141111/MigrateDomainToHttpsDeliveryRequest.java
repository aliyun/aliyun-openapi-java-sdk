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

package com.aliyuncs.cdn.model.v20141111;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class MigrateDomainToHttpsDeliveryRequest extends RpcAcsRequest<MigrateDomainToHttpsDeliveryResponse> {
	
	public MigrateDomainToHttpsDeliveryRequest() {
		super("Cdn", "2014-11-11", "MigrateDomainToHttpsDelivery");
	}

	private String privateKey;

	private String serverCertificate;

	private String securityToken;

	private String ownerAccount;

	private String domainName;

	private Long ownerId;

	public String getPrivateKey() {
		return this.privateKey;
	}

	public void setPrivateKey(String privateKey) {
		this.privateKey = privateKey;
		if(privateKey != null){
			putQueryParameter("PrivateKey", privateKey);
		}
	}

	public String getServerCertificate() {
		return this.serverCertificate;
	}

	public void setServerCertificate(String serverCertificate) {
		this.serverCertificate = serverCertificate;
		if(serverCertificate != null){
			putQueryParameter("ServerCertificate", serverCertificate);
		}
	}

	public String getSecurityToken() {
		return this.securityToken;
	}

	public void setSecurityToken(String securityToken) {
		this.securityToken = securityToken;
		if(securityToken != null){
			putQueryParameter("SecurityToken", securityToken);
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

	public String getDomainName() {
		return this.domainName;
	}

	public void setDomainName(String domainName) {
		this.domainName = domainName;
		if(domainName != null){
			putQueryParameter("DomainName", domainName);
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

	@Override
	public Class<MigrateDomainToHttpsDeliveryResponse> getResponseClass() {
		return MigrateDomainToHttpsDeliveryResponse.class;
	}

}
