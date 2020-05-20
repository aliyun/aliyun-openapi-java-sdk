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
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.slb.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateTLSCipherPolicyRequest extends RpcAcsRequest<CreateTLSCipherPolicyResponse> {
	   

	private String access_key_id;

	private Long resourceOwnerId;

	private List<String> cipherss;

	private List<String> tLSVersionss;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private Long ownerId;

	private String name;
	public CreateTLSCipherPolicyRequest() {
		super("Slb", "2014-05-15", "CreateTLSCipherPolicy", "slb");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getAccess_key_id() {
		return this.access_key_id;
	}

	public void setAccess_key_id(String access_key_id) {
		this.access_key_id = access_key_id;
		if(access_key_id != null){
			putQueryParameter("access_key_id", access_key_id);
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

	public List<String> getCipherss() {
		return this.cipherss;
	}

	public void setCipherss(List<String> cipherss) {
		this.cipherss = cipherss;	
		if (cipherss != null) {
			for (int i = 0; i < cipherss.size(); i++) {
				putQueryParameter("Ciphers." + (i + 1) , cipherss.get(i));
			}
		}	
	}

	public List<String> getTLSVersionss() {
		return this.tLSVersionss;
	}

	public void setTLSVersionss(List<String> tLSVersionss) {
		this.tLSVersionss = tLSVersionss;	
		if (tLSVersionss != null) {
			for (int i = 0; i < tLSVersionss.size(); i++) {
				putQueryParameter("TLSVersions." + (i + 1) , tLSVersionss.get(i));
			}
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

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
		}
	}

	@Override
	public Class<CreateTLSCipherPolicyResponse> getResponseClass() {
		return CreateTLSCipherPolicyResponse.class;
	}

}
