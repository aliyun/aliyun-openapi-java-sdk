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

package com.aliyuncs.domain_intl.model.v20171218;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.domain_intl.transform.v20171218.QueryDomainRealNameVerificationInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryDomainRealNameVerificationInfoResponse extends AcsResponse {

	private String requestId;

	private String submissionDate;

	private String identityCredential;

	private String identityCredentialNo;

	private String identityCredentialType;

	private String domainName;

	private String instanceId;

	private String identityCredentialUrl;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getSubmissionDate() {
		return this.submissionDate;
	}

	public void setSubmissionDate(String submissionDate) {
		this.submissionDate = submissionDate;
	}

	public String getIdentityCredential() {
		return this.identityCredential;
	}

	public void setIdentityCredential(String identityCredential) {
		this.identityCredential = identityCredential;
	}

	public String getIdentityCredentialNo() {
		return this.identityCredentialNo;
	}

	public void setIdentityCredentialNo(String identityCredentialNo) {
		this.identityCredentialNo = identityCredentialNo;
	}

	public String getIdentityCredentialType() {
		return this.identityCredentialType;
	}

	public void setIdentityCredentialType(String identityCredentialType) {
		this.identityCredentialType = identityCredentialType;
	}

	public String getDomainName() {
		return this.domainName;
	}

	public void setDomainName(String domainName) {
		this.domainName = domainName;
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
	}

	public String getIdentityCredentialUrl() {
		return this.identityCredentialUrl;
	}

	public void setIdentityCredentialUrl(String identityCredentialUrl) {
		this.identityCredentialUrl = identityCredentialUrl;
	}

	@Override
	public QueryDomainRealNameVerificationInfoResponse getInstance(UnmarshallerContext context) {
		return	QueryDomainRealNameVerificationInfoResponseUnmarshaller.unmarshall(this, context);
	}
}
