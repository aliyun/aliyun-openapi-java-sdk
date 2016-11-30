/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.cdn.model.v20141111;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class SetDomainServerCertificateRequest extends RpcAcsRequest<SetDomainServerCertificateResponse> {
	
	public SetDomainServerCertificateRequest() {
		super("Cdn", "2014-11-11", "SetDomainServerCertificate");
	}

	private Long ownerId;

	private String securityToken;

	private String domainName;

	private String certName;

	private String serverCertificateStatus;

	private String serverCertificate;

	private String privateKey;

	private String region;

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		putQueryParameter("OwnerId", ownerId);
	}

	public String getSecurityToken() {
		return this.securityToken;
	}

	public void setSecurityToken(String securityToken) {
		this.securityToken = securityToken;
		putQueryParameter("SecurityToken", securityToken);
	}

	public String getDomainName() {
		return this.domainName;
	}

	public void setDomainName(String domainName) {
		this.domainName = domainName;
		putQueryParameter("DomainName", domainName);
	}

	public String getCertName() {
		return this.certName;
	}

	public void setCertName(String certName) {
		this.certName = certName;
		putQueryParameter("CertName", certName);
	}

	public String getServerCertificateStatus() {
		return this.serverCertificateStatus;
	}

	public void setServerCertificateStatus(String serverCertificateStatus) {
		this.serverCertificateStatus = serverCertificateStatus;
		putQueryParameter("ServerCertificateStatus", serverCertificateStatus);
	}

	public String getServerCertificate() {
		return this.serverCertificate;
	}

	public void setServerCertificate(String serverCertificate) {
		this.serverCertificate = serverCertificate;
		putQueryParameter("ServerCertificate", serverCertificate);
	}

	public String getPrivateKey() {
		return this.privateKey;
	}

	public void setPrivateKey(String privateKey) {
		this.privateKey = privateKey;
		putQueryParameter("PrivateKey", privateKey);
	}

	public String getRegion() {
		return this.region;
	}

	public void setRegion(String region) {
		this.region = region;
		putQueryParameter("Region", region);
	}

	@Override
	public Class<SetDomainServerCertificateResponse> getResponseClass() {
		return SetDomainServerCertificateResponse.class;
	}

}
