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

package com.aliyuncs.eds_user.model.v20210308;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.eds_user.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class LockMfaDeviceRequest extends RpcAcsRequest<LockMfaDeviceResponse> {
	   

	private String serialNumber;

	private String adDomain;
	public LockMfaDeviceRequest() {
		super("eds-user", "2021-03-08", "LockMfaDevice", "eds-user");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getSerialNumber() {
		return this.serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
		if(serialNumber != null){
			putQueryParameter("SerialNumber", serialNumber);
		}
	}

	public String getAdDomain() {
		return this.adDomain;
	}

	public void setAdDomain(String adDomain) {
		this.adDomain = adDomain;
		if(adDomain != null){
			putQueryParameter("AdDomain", adDomain);
		}
	}

	@Override
	public Class<LockMfaDeviceResponse> getResponseClass() {
		return LockMfaDeviceResponse.class;
	}

}
