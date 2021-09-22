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

package com.aliyuncs.dypnsapi.model.v20170525;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dypnsapi.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GetSmsCodeRequest extends RpcAcsRequest<GetSmsCodeResponse> {
	   

	private String phoneNumber;

	private String bizToken;

	private String sceneCode;

	private String osType;
	public GetSmsCodeRequest() {
		super("Dypnsapi", "2017-05-25", "GetSmsCode");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
		if(phoneNumber != null){
			putQueryParameter("PhoneNumber", phoneNumber);
		}
	}

	public String getBizToken() {
		return this.bizToken;
	}

	public void setBizToken(String bizToken) {
		this.bizToken = bizToken;
		if(bizToken != null){
			putQueryParameter("BizToken", bizToken);
		}
	}

	public String getSceneCode() {
		return this.sceneCode;
	}

	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
		if(sceneCode != null){
			putQueryParameter("SceneCode", sceneCode);
		}
	}

	public String getOsType() {
		return this.osType;
	}

	public void setOsType(String osType) {
		this.osType = osType;
		if(osType != null){
			putQueryParameter("OsType", osType);
		}
	}

	@Override
	public Class<GetSmsCodeResponse> getResponseClass() {
		return GetSmsCodeResponse.class;
	}

}
