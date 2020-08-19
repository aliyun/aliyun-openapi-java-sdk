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
public class SetLiveDomainCertificateRequest extends RpcAcsRequest<SetLiveDomainCertificateResponse> {
	   

	private String sSLProtocol;

	private String securityToken;

	private String certType;

	private String sSLPri;

	private String forceSet;

	private String certName;

	private String domainName;

	private Long ownerId;

	private String sSLPub;
	public SetLiveDomainCertificateRequest() {
		super("live", "2016-11-01", "SetLiveDomainCertificate");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getSSLProtocol() {
		return this.sSLProtocol;
	}

	public void setSSLProtocol(String sSLProtocol) {
		this.sSLProtocol = sSLProtocol;
		if(sSLProtocol != null){
			putQueryParameter("SSLProtocol", sSLProtocol);
		}
	}

	public String getSecurityToken() {
		return this.securityToken;
	}

	public void setSecurityToken(String securityToken) {
		this.securityToken = securityToken;
		if(securityToken != null){
			putQueryParameter("SecurityToken", securityToken);
		}
	}

	public String getCertType() {
		return this.certType;
	}

	public void setCertType(String certType) {
		this.certType = certType;
		if(certType != null){
			putQueryParameter("CertType", certType);
		}
	}

	public String getSSLPri() {
		return this.sSLPri;
	}

	public void setSSLPri(String sSLPri) {
		this.sSLPri = sSLPri;
		if(sSLPri != null){
			putQueryParameter("SSLPri", sSLPri);
		}
	}

	public String getForceSet() {
		return this.forceSet;
	}

	public void setForceSet(String forceSet) {
		this.forceSet = forceSet;
		if(forceSet != null){
			putQueryParameter("ForceSet", forceSet);
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

	public String getDomainName() {
		return this.domainName;
	}

	public void setDomainName(String domainName) {
		this.domainName = domainName;
		if(domainName != null){
			putQueryParameter("DomainName", domainName);
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

	public String getSSLPub() {
		return this.sSLPub;
	}

	public void setSSLPub(String sSLPub) {
		this.sSLPub = sSLPub;
		if(sSLPub != null){
			putQueryParameter("SSLPub", sSLPub);
		}
	}

	@Override
	public Class<SetLiveDomainCertificateResponse> getResponseClass() {
		return SetLiveDomainCertificateResponse.class;
	}

}
