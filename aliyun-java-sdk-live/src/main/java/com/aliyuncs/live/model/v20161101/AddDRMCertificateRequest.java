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

package com.aliyuncs.live.model.v20161101;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.live.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class AddDRMCertificateRequest extends RpcAcsRequest<AddDRMCertificateResponse> {
	   

	private String servCert;

	private String description;

	private String privateKey;

	private String certName;

	private Long ownerId;

	private String ask;

	private String passphrase;
	public AddDRMCertificateRequest() {
		super("live", "2016-11-01", "AddDRMCertificate", "live");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getServCert() {
		return this.servCert;
	}

	public void setServCert(String servCert) {
		this.servCert = servCert;
		if(servCert != null){
			putQueryParameter("ServCert", servCert);
		}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
		}
	}

	public String getPrivateKey() {
		return this.privateKey;
	}

	public void setPrivateKey(String privateKey) {
		this.privateKey = privateKey;
		if(privateKey != null){
			putQueryParameter("PrivateKey", privateKey);
		}
	}

	public String getCertName() {
		return this.certName;
	}

	public void setCertName(String certName) {
		this.certName = certName;
		if(certName != null){
			putQueryParameter("CertName", certName);
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public String getAsk() {
		return this.ask;
	}

	public void setAsk(String ask) {
		this.ask = ask;
		if(ask != null){
			putQueryParameter("Ask", ask);
		}
	}

	public String getPassphrase() {
		return this.passphrase;
	}

	public void setPassphrase(String passphrase) {
		this.passphrase = passphrase;
		if(passphrase != null){
			putQueryParameter("Passphrase", passphrase);
		}
	}

	@Override
	public Class<AddDRMCertificateResponse> getResponseClass() {
		return AddDRMCertificateResponse.class;
	}

}
