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

package com.aliyuncs.domain.model.v20180129;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.domain.transform.v20180129.QueryRegistrantProfileRealNameVerificationInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryRegistrantProfileRealNameVerificationInfoResponse extends AcsResponse {

	private String requestId;

	private String submissionDate;

	private String modificationDate;

	private String identityCredential;

	private Long registrantProfileId;

	private String identityCredentialNo;

	private String identityCredentialType;

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

	public String getModificationDate() {
		return this.modificationDate;
	}

	public void setModificationDate(String modificationDate) {
		this.modificationDate = modificationDate;
	}

	public String getIdentityCredential() {
		return this.identityCredential;
	}

	public void setIdentityCredential(String identityCredential) {
		this.identityCredential = identityCredential;
	}

	public Long getRegistrantProfileId() {
		return this.registrantProfileId;
	}

	public void setRegistrantProfileId(Long registrantProfileId) {
		this.registrantProfileId = registrantProfileId;
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

	@Override
	public QueryRegistrantProfileRealNameVerificationInfoResponse getInstance(UnmarshallerContext context) {
		return	QueryRegistrantProfileRealNameVerificationInfoResponseUnmarshaller.unmarshall(this, context);
	}
}
