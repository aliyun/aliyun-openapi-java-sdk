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

package com.aliyuncs.kms.model.v20160120;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.kms.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateClientKeyRequest extends RpcAcsRequest<CreateClientKeyResponse> {
	   

	private String notBefore;

	private String notAfter;

	private String password;

	private String aapName;
	public CreateClientKeyRequest() {
		super("Kms", "2016-01-20", "CreateClientKey", "kms");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getNotBefore() {
		return this.notBefore;
	}

	public void setNotBefore(String notBefore) {
		this.notBefore = notBefore;
		if(notBefore != null){
			putQueryParameter("NotBefore", notBefore);
		}
	}

	public String getNotAfter() {
		return this.notAfter;
	}

	public void setNotAfter(String notAfter) {
		this.notAfter = notAfter;
		if(notAfter != null){
			putQueryParameter("NotAfter", notAfter);
		}
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
		if(password != null){
			putQueryParameter("Password", password);
		}
	}

	public String getAapName() {
		return this.aapName;
	}

	public void setAapName(String aapName) {
		this.aapName = aapName;
		if(aapName != null){
			putQueryParameter("AapName", aapName);
		}
	}

	@Override
	public Class<CreateClientKeyResponse> getResponseClass() {
		return CreateClientKeyResponse.class;
	}

}
