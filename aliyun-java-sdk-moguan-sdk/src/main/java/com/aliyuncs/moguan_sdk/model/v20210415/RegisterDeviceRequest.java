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

package com.aliyuncs.moguan_sdk.model.v20210415;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.moguan_sdk.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class RegisterDeviceRequest extends RpcAcsRequest<RegisterDeviceResponse> {
	   

	private String userDeviceId;

	private String extend;

	private String sdkCode;

	private String appKey;

	private String deviceId;
	public RegisterDeviceRequest() {
		super("moguan-sdk", "2021-04-15", "RegisterDevice", "visionai");
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
			putBodyParameter("UserDeviceId", userDeviceId);
		}
	}

	public String getExtend() {
		return this.extend;
	}

	public void setExtend(String extend) {
		this.extend = extend;
		if(extend != null){
			putBodyParameter("Extend", extend);
		}
	}

	public String getSdkCode() {
		return this.sdkCode;
	}

	public void setSdkCode(String sdkCode) {
		this.sdkCode = sdkCode;
		if(sdkCode != null){
			putBodyParameter("SdkCode", sdkCode);
		}
	}

	public String getAppKey() {
		return this.appKey;
	}

	public void setAppKey(String appKey) {
		this.appKey = appKey;
		if(appKey != null){
			putBodyParameter("AppKey", appKey);
		}
	}

	public String getDeviceId() {
		return this.deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
		if(deviceId != null){
			putBodyParameter("DeviceId", deviceId);
		}
	}

	@Override
	public Class<RegisterDeviceResponse> getResponseClass() {
		return RegisterDeviceResponse.class;
	}

}
