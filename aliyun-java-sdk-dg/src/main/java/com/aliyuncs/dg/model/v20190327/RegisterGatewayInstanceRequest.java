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

package com.aliyuncs.dg.model.v20190327;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;

/**
 * @author auto create
 * @version 
 */
public class RegisterGatewayInstanceRequest extends RpcAcsRequest<RegisterGatewayInstanceResponse> {
	
	public RegisterGatewayInstanceRequest() {
		super("dg", "2019-03-27", "RegisterGatewayInstance", "dg");
		setProtocol(ProtocolType.HTTPS);
	}

	private String localIP;

	private String verificationCode;

	public String getLocalIP() {
		return this.localIP;
	}

	public void setLocalIP(String localIP) {
		this.localIP = localIP;
		if(localIP != null){
			putBodyParameter("LocalIP", localIP);
		}
	}

	public String getVerificationCode() {
		return this.verificationCode;
	}

	public void setVerificationCode(String verificationCode) {
		this.verificationCode = verificationCode;
		if(verificationCode != null){
			putBodyParameter("VerificationCode", verificationCode);
		}
	}

	@Override
	public Class<RegisterGatewayInstanceResponse> getResponseClass() {
		return RegisterGatewayInstanceResponse.class;
	}

}
