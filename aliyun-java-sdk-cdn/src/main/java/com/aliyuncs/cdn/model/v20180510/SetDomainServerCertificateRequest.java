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

package com.aliyuncs.cdn.model.v20180510;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.cdn.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class SetDomainServerCertificateRequest extends RpcAcsRequest<SetDomainServerCertificateResponse> {
	   

	private String serverCertificate;

	private String privateKey;

	private String serverCertificateStatus;

	private String securityToken;

	private String certType;

	private String forceSet;

	private String certName;

	private String domainName;

	private Long ownerId;
	public SetDomainServerCertificateRequest() {
		super("Cdn", "2018-05-10", "SetDomainServerCertificate");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getServerCertificate() {
		return this.serverCertificate;
	}

	public void setServerCertificate(String serverCertificate) {
		this.serverCertificate = serverCertificate;
		if(serverCertificate != null){
			putQueryParameter("ServerCertificate", serverCertificate);
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

	public String getServerCertificateStatus() {
		return this.serverCertificateStatus;
	}

	public void setServerCertificateStatus(String serverCertificateStatus) {
		this.serverCertificateStatus = serverCertificateStatus;
		if(serverCertificateStatus != null){
			putQueryParameter("ServerCertificateStatus", serverCertificateStatus);
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

	@Override
	public Class<SetDomainServerCertificateResponse> getResponseClass() {
		return SetDomainServerCertificateResponse.class;
	}

}
