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
public class CreateResourceAccountRequest extends RpcAcsRequest<CreateResourceAccountResponse> {
	   

	private String parentFolderId;

	private String displayName;

	private String payerAccountId;
	public CreateResourceAccountRequest() {
		super("ResourceManager", "2020-03-31", "CreateResourceAccount", "resourcemanager");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getParentFolderId() {
		return this.parentFolderId;
	}

	public void setParentFolderId(String parentFolderId) {
		this.parentFolderId = parentFolderId;
		if(parentFolderId != null){
			putQueryParameter("ParentFolderId", parentFolderId);
		}
	}

	public String getDisplayName() {
		return this.displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
		if(displayName != null){
			putQueryParameter("DisplayName", displayName);
		}
	}

	public String getPayerAccountId() {
		return this.payerAccountId;
	}

	public void setPayerAccountId(String payerAccountId) {
		this.payerAccountId = payerAccountId;
		if(payerAccountId != null){
			putQueryParameter("PayerAccountId", payerAccountId);
		}
	}

	@Override
	public Class<CreateResourceAccountResponse> getResponseClass() {
		return CreateResourceAccountResponse.class;
	}

}
