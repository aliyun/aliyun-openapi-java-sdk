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

package com.aliyuncs.scdn.model.v20171115;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.scdn.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class SetScdnDomainCertificateRequest extends RpcAcsRequest<SetScdnDomainCertificateResponse> {
	   

	private String sSLProtocol;

	private String securityToken;

	private String certType;

	private String sSLPri;

	private String forceSet;

	private String certName;

	private String domainName;

	private Long ownerId;

	private String sSLPub;

	private String region;
	public SetScdnDomainCertificateRequest() {
		super("scdn", "2017-11-15", "SetScdnDomainCertificate");
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

	public String getRegion() {
		return this.region;
	}

	public void setRegion(String region) {
		this.region = region;
		if(region != null){
			putQueryParameter("Region", region);
		}
	}

	@Override
	public Class<SetScdnDomainCertificateResponse> getResponseClass() {
		return SetScdnDomainCertificateResponse.class;
	}

}
