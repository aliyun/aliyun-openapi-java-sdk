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

package com.aliyuncs.pvtz.model.v20180101;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.pvtz.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DeleteUserVpcAuthorizationRequest extends RpcAcsRequest<DeleteUserVpcAuthorizationResponse> {
	   

	private String authType;

	private Long authorizedUserId;
	public DeleteUserVpcAuthorizationRequest() {
		super("pvtz", "2018-01-01", "DeleteUserVpcAuthorization", "pvtz");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getAuthType() {
		return this.authType;
	}

	public void setAuthType(String authType) {
		this.authType = authType;
		if(authType != null){
			putQueryParameter("AuthType", authType);
		}
	}

	public Long getAuthorizedUserId() {
		return this.authorizedUserId;
	}

	public void setAuthorizedUserId(Long authorizedUserId) {
		this.authorizedUserId = authorizedUserId;
		if(authorizedUserId != null){
			putQueryParameter("AuthorizedUserId", authorizedUserId.toString());
		}
	}

	@Override
	public Class<DeleteUserVpcAuthorizationResponse> getResponseClass() {
		return DeleteUserVpcAuthorizationResponse.class;
	}

}
