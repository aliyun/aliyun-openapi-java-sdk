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

package com.aliyuncs.aliyuncvc.model.v20191030;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.aliyuncvc.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class RegisterDeviceRequest extends RpcAcsRequest<RegisterDeviceResponse> {
	   

	private String iP;

	private String mac;

	private String token;

	private String deviceVersion;

	private String sN;
	public RegisterDeviceRequest() {
		super("aliyuncvc", "2019-10-30", "RegisterDevice", "aliyuncvc");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getIP() {
		return this.iP;
	}

	public void setIP(String iP) {
		this.iP = iP;
		if(iP != null){
			putQueryParameter("IP", iP);
		}
	}

	public String getMac() {
		return this.mac;
	}

	public void setMac(String mac) {
		this.mac = mac;
		if(mac != null){
			putQueryParameter("Mac", mac);
		}
	}

	public String getToken() {
		return this.token;
	}

	public void setToken(String token) {
		this.token = token;
		if(token != null){
			putQueryParameter("Token", token);
		}
	}

	public String getDeviceVersion() {
		return this.deviceVersion;
	}

	public void setDeviceVersion(String deviceVersion) {
		this.deviceVersion = deviceVersion;
		if(deviceVersion != null){
			putQueryParameter("DeviceVersion", deviceVersion);
		}
	}

	public String getSN() {
		return this.sN;
	}

	public void setSN(String sN) {
		this.sN = sN;
		if(sN != null){
			putQueryParameter("SN", sN);
		}
	}

	@Override
	public Class<RegisterDeviceResponse> getResponseClass() {
		return RegisterDeviceResponse.class;
	}

}
