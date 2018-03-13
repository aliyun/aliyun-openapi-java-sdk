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
package com.aliyuncs.ram.model.v20150501;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;

/**
 * @author auto create
 * @version 
 */
public class BindMFADeviceRequest extends RpcAcsRequest<BindMFADeviceResponse> {
	
	public BindMFADeviceRequest() {
		super("Ram", "2015-05-01", "BindMFADevice");
		setProtocol(ProtocolType.HTTPS);
	}

	private String serialNumber;

	private String authenticationCode2;

	private String authenticationCode1;

	private String userName;

	public String getSerialNumber() {
		return this.serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
		if(serialNumber != null){
			putQueryParameter("SerialNumber", serialNumber);
		}
	}

	public String getAuthenticationCode2() {
		return this.authenticationCode2;
	}

	public void setAuthenticationCode2(String authenticationCode2) {
		this.authenticationCode2 = authenticationCode2;
		if(authenticationCode2 != null){
			putQueryParameter("AuthenticationCode2", authenticationCode2);
		}
	}

	public String getAuthenticationCode1() {
		return this.authenticationCode1;
	}

	public void setAuthenticationCode1(String authenticationCode1) {
		this.authenticationCode1 = authenticationCode1;
		if(authenticationCode1 != null){
			putQueryParameter("AuthenticationCode1", authenticationCode1);
		}
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
		if(userName != null){
			putQueryParameter("UserName", userName);
		}
	}

	@Override
	public Class<BindMFADeviceResponse> getResponseClass() {
		return BindMFADeviceResponse.class;
	}

}
