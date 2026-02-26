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

package com.aliyuncs.ims.model.v20190815;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ims.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateAccessKeyRequest extends RpcAcsRequest<UpdateAccessKeyResponse> {
	   

	private String userAccessKeyId;

	private String userPrincipalName;

	private String status;
	public UpdateAccessKeyRequest() {
		super("Ims", "2019-08-15", "UpdateAccessKey", "ims");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getUserAccessKeyId() {
		return this.userAccessKeyId;
	}

	public void setUserAccessKeyId(String userAccessKeyId) {
		this.userAccessKeyId = userAccessKeyId;
		if(userAccessKeyId != null){
			putQueryParameter("UserAccessKeyId", userAccessKeyId);
		}
	}

	public String getUserPrincipalName() {
		return this.userPrincipalName;
	}

	public void setUserPrincipalName(String userPrincipalName) {
		this.userPrincipalName = userPrincipalName;
		if(userPrincipalName != null){
			putQueryParameter("UserPrincipalName", userPrincipalName);
		}
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
		if(status != null){
			putQueryParameter("Status", status);
		}
	}

	@Override
	public Class<UpdateAccessKeyResponse> getResponseClass() {
		return UpdateAccessKeyResponse.class;
	}

}
