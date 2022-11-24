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

package com.aliyuncs.cas.model.v20200407;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.cas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UploadUserCertificateRequest extends RpcAcsRequest<UploadUserCertificateResponse> {
	   

	private String encryptCert;

	private String cert;

	private String key;

	private String encryptPrivateKey;

	private String signPrivateKey;

	private String signCert;

	private String name;
	public UploadUserCertificateRequest() {
		super("cas", "2020-04-07", "UploadUserCertificate");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getEncryptCert() {
		return this.encryptCert;
	}

	public void setEncryptCert(String encryptCert) {
		this.encryptCert = encryptCert;
		if(encryptCert != null){
			putQueryParameter("EncryptCert", encryptCert);
		}
	}

	public String getCert() {
		return this.cert;
	}

	public void setCert(String cert) {
		this.cert = cert;
		if(cert != null){
			putQueryParameter("Cert", cert);
		}
	}

	public String getKey() {
		return this.key;
	}

	public void setKey(String key) {
		this.key = key;
		if(key != null){
			putQueryParameter("Key", key);
		}
	}

	public String getEncryptPrivateKey() {
		return this.encryptPrivateKey;
	}

	public void setEncryptPrivateKey(String encryptPrivateKey) {
		this.encryptPrivateKey = encryptPrivateKey;
		if(encryptPrivateKey != null){
			putQueryParameter("EncryptPrivateKey", encryptPrivateKey);
		}
	}

	public String getSignPrivateKey() {
		return this.signPrivateKey;
	}

	public void setSignPrivateKey(String signPrivateKey) {
		this.signPrivateKey = signPrivateKey;
		if(signPrivateKey != null){
			putQueryParameter("SignPrivateKey", signPrivateKey);
		}
	}

	public String getSignCert() {
		return this.signCert;
	}

	public void setSignCert(String signCert) {
		this.signCert = signCert;
		if(signCert != null){
			putQueryParameter("SignCert", signCert);
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
		}
	}

	@Override
	public Class<UploadUserCertificateResponse> getResponseClass() {
		return UploadUserCertificateResponse.class;
	}

}
