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

package com.aliyuncs.resourcemanager.model.v20200331;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.resourcemanager.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateAccountRequest extends RpcAcsRequest<UpdateAccountResponse> {
	   

	private String newDisplayName;

	private String newAccountType;

	private String accountId;
	public UpdateAccountRequest() {
		super("ResourceManager", "2020-03-31", "UpdateAccount", "resourcemanager");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getNewDisplayName() {
		return this.newDisplayName;
	}

	public void setNewDisplayName(String newDisplayName) {
		this.newDisplayName = newDisplayName;
		if(newDisplayName != null){
			putQueryParameter("NewDisplayName", newDisplayName);
		}
	}

	public String getNewAccountType() {
		return this.newAccountType;
	}

	public void setNewAccountType(String newAccountType) {
		this.newAccountType = newAccountType;
		if(newAccountType != null){
			putQueryParameter("NewAccountType", newAccountType);
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

	@Override
	public Class<UpdateAccountResponse> getResponseClass() {
		return UpdateAccountResponse.class;
	}

}
