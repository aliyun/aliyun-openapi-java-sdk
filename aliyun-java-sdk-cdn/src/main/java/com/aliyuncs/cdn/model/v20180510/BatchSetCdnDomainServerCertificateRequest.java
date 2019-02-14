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

/**
 * @author auto create
 * @version 
 */
public class BatchSetCdnDomainServerCertificateRequest extends RpcAcsRequest<BatchSetCdnDomainServerCertificateResponse> {
	
	public BatchSetCdnDomainServerCertificateRequest() {
		super("Cdn", "2018-05-10", "BatchSetCdnDomainServerCertificate");
	}

	private String forceSet;

	private String securityToken;

	private String certType;

	private String sSLPub;

	private String certName;

	private String sSLProtocol;

	private String domainName;

	private Long ownerId;

	private String region;

	private String sSLPri;

	public String getForceSet() {
		return this.forceSet;
	}

	public void setForceSet(String forceSet) {
		this.forceSet = forceSet;
		if(forceSet != null){
			putQueryParameter("ForceSet", forceSet);
		}
	}

	public String getBizSecurityToken() {
		return this.securityToken;
	}

	public void setBizSecurityToken(String securityToken) {
		this.securityToken = securityToken;
		if(securityToken != null){
			putQueryParameter("SecurityToken", securityToken);
		}
	}

	/**
	 * @deprecated use getBizSecurityToken instead of this.
	 */
	@Deprecated
	public String getSecurityToken() {
		return this.securityToken;
	}

	/**
	 * @deprecated use setBizSecurityToken instead of this.
	 */
	@Deprecated
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

	public String getSSLPub() {
		return this.sSLPub;
	}

	public void setSSLPub(String sSLPub) {
		this.sSLPub = sSLPub;
		if(sSLPub != null){
			putQueryParameter("SSLPub", sSLPub);
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

	public String getSSLProtocol() {
		return this.sSLProtocol;
	}

	public void setSSLProtocol(String sSLProtocol) {
		this.sSLProtocol = sSLProtocol;
		if(sSLProtocol != null){
			putQueryParameter("SSLProtocol", sSLProtocol);
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

	public String getRegion() {
		return this.region;
	}

	public void setRegion(String region) {
		this.region = region;
		if(region != null){
			putQueryParameter("Region", region);
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

	@Override
	public Class<BatchSetCdnDomainServerCertificateResponse> getResponseClass() {
		return BatchSetCdnDomainServerCertificateResponse.class;
	}

}
