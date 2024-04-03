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

package com.aliyuncs.cloudauth.model.v20190307;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.cloudauth.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateAuthKeyRequest extends RpcAcsRequest<CreateAuthKeyResponse> {
	   

	private String userDeviceId;

	private Boolean test;

	private String bizType;

	private Integer authYears;
	public CreateAuthKeyRequest() {
		super("Cloudauth", "2019-03-07", "CreateAuthKey", "cloudauth");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getUserDeviceId() {
		return this.userDeviceId;
	}

	public void setUserDeviceId(String userDeviceId) {
		this.userDeviceId = userDeviceId;
		if(userDeviceId != null){
			putQueryParameter("UserDeviceId", userDeviceId);
		}
	}

	public Boolean getTest() {
		return this.test;
	}

	public void setTest(Boolean test) {
		this.test = test;
		if(test != null){
			putQueryParameter("Test", test.toString());
		}
	}

	public String getBizType() {
		return this.bizType;
	}

	public void setBizType(String bizType) {
		this.bizType = bizType;
		if(bizType != null){
			putQueryParameter("BizType", bizType);
		}
	}

	public Integer getAuthYears() {
		return this.authYears;
	}

	public void setAuthYears(Integer authYears) {
		this.authYears = authYears;
		if(authYears != null){
			putQueryParameter("AuthYears", authYears.toString());
		}
	}

	@Override
	public Class<CreateAuthKeyResponse> getResponseClass() {
		return CreateAuthKeyResponse.class;
	}

}
