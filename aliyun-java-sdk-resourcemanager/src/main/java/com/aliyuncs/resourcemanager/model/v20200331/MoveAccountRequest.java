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
public class MoveAccountRequest extends RpcAcsRequest<MoveAccountResponse> {
	   

	private String accountId;

	private String destinationFolderId;
	public MoveAccountRequest() {
		super("ResourceManager", "2020-03-31", "MoveAccount", "resourcemanager");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public String getDestinationFolderId() {
		return this.destinationFolderId;
	}

	public void setDestinationFolderId(String destinationFolderId) {
		this.destinationFolderId = destinationFolderId;
		if(destinationFolderId != null){
			putQueryParameter("DestinationFolderId", destinationFolderId);
		}
	}

	@Override
	public Class<MoveAccountResponse> getResponseClass() {
		return MoveAccountResponse.class;
	}

}
