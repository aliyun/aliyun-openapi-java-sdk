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
package com.aliyuncs.cloudapi.model.v20160714;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloudapi.transform.v20160714.DescribeDomainResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDomainResponse extends AcsResponse {

	private String requestId;

	private String groupId;

	private String domainName;

	private String subDomain;

	private String certificateId;

	private String certificateName;

	private String certificateBody;

	private String certificatePrivateKey;

	private String domainBindingStatus;

	private String domainCNAMEStatus;

	private String domainLegalStatus;

	private String domainRemark;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getGroupId() {
		return this.groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public String getDomainName() {
		return this.domainName;
	}

	public void setDomainName(String domainName) {
		this.domainName = domainName;
	}

	public String getSubDomain() {
		return this.subDomain;
	}

	public void setSubDomain(String subDomain) {
		this.subDomain = subDomain;
	}

	public String getCertificateId() {
		return this.certificateId;
	}

	public void setCertificateId(String certificateId) {
		this.certificateId = certificateId;
	}

	public String getCertificateName() {
		return this.certificateName;
	}

	public void setCertificateName(String certificateName) {
		this.certificateName = certificateName;
	}

	public String getCertificateBody() {
		return this.certificateBody;
	}

	public void setCertificateBody(String certificateBody) {
		this.certificateBody = certificateBody;
	}

	public String getCertificatePrivateKey() {
		return this.certificatePrivateKey;
	}

	public void setCertificatePrivateKey(String certificatePrivateKey) {
		this.certificatePrivateKey = certificatePrivateKey;
	}

	public String getDomainBindingStatus() {
		return this.domainBindingStatus;
	}

	public void setDomainBindingStatus(String domainBindingStatus) {
		this.domainBindingStatus = domainBindingStatus;
	}

	public String getDomainCNAMEStatus() {
		return this.domainCNAMEStatus;
	}

	public void setDomainCNAMEStatus(String domainCNAMEStatus) {
		this.domainCNAMEStatus = domainCNAMEStatus;
	}


	public String getDomainRemark() {
		return domainRemark;
	}

	public void setDomainRemark(String domainRemark) {
		this.domainRemark = domainRemark;
	}

	public String getDomainLegalStatus() {
		return domainLegalStatus;
	}

	public void setDomainLegalStatus(String domainLegalStatus) {
		this.domainLegalStatus = domainLegalStatus;
	}

	@Override
	public DescribeDomainResponse getInstance(UnmarshallerContext context) {
		return	DescribeDomainResponseUnmarshaller.unmarshall(this, context);
	}
}
