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

package com.aliyuncs.cloudapi.model.v20160714;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.cloudapi.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class SetDomainCertificateRequest extends RpcAcsRequest<SetDomainCertificateResponse> {
	
	public SetDomainCertificateRequest() {
		super("CloudAPI", "2016-07-14", "SetDomainCertificate", "apigateway");
		setSysMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	private String certificatePrivateKey;

	private String groupId;

	private String domainName;

	private String certificateBody;

	private String securityToken;

	private String certificateName;

	public String getCertificatePrivateKey() {
		return this.certificatePrivateKey;
	}

	public void setCertificatePrivateKey(String certificatePrivateKey) {
		this.certificatePrivateKey = certificatePrivateKey;
		if(certificatePrivateKey != null){
			putQueryParameter("CertificatePrivateKey", certificatePrivateKey);
		}
	}

	public String getGroupId() {
		return this.groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
		if(groupId != null){
			putQueryParameter("GroupId", groupId);
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

	public String getCertificateBody() {
		return this.certificateBody;
	}

	public void setCertificateBody(String certificateBody) {
		this.certificateBody = certificateBody;
		if(certificateBody != null){
			putQueryParameter("CertificateBody", certificateBody);
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

	public String getCertificateName() {
		return this.certificateName;
	}

	public void setCertificateName(String certificateName) {
		this.certificateName = certificateName;
		if(certificateName != null){
			putQueryParameter("CertificateName", certificateName);
		}
	}

	@Override
	public Class<SetDomainCertificateResponse> getResponseClass() {
		return SetDomainCertificateResponse.class;
	}

}
