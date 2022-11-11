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
public class AddUserVpcAuthorizationRequest extends RpcAcsRequest<AddUserVpcAuthorizationResponse> {
	   

	private String authType;

	private String authCode;

	private Long authorizedUserId;

	private String authChannel;
	public AddUserVpcAuthorizationRequest() {
		super("pvtz", "2018-01-01", "AddUserVpcAuthorization", "pvtz");
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

	public String getAuthCode() {
		return this.authCode;
	}

	public void setAuthCode(String authCode) {
		this.authCode = authCode;
		if(authCode != null){
			putQueryParameter("AuthCode", authCode);
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

	public String getAuthChannel() {
		return this.authChannel;
	}

	public void setAuthChannel(String authChannel) {
		this.authChannel = authChannel;
		if(authChannel != null){
			putQueryParameter("AuthChannel", authChannel);
		}
	}

	@Override
	public Class<AddUserVpcAuthorizationResponse> getResponseClass() {
		return AddUserVpcAuthorizationResponse.class;
	}

}
