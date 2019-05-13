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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.domain.transform.v20180129.QueryQualificationDetailResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryQualificationDetailResponse extends AcsResponse {

	private String trackId;

	private Integer auditStatus;

	private String requestId;

	private List<QualificationCredential> credentials;

	public String getTrackId() {
		return this.trackId;
	}

	public void setTrackId(String trackId) {
		this.trackId = trackId;
	}

	public Integer getAuditStatus() {
		return this.auditStatus;
	}

	public void setAuditStatus(Integer auditStatus) {
		this.auditStatus = auditStatus;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<QualificationCredential> getCredentials() {
		return this.credentials;
	}

	public void setCredentials(List<QualificationCredential> credentials) {
		this.credentials = credentials;
	}

	public static class QualificationCredential {

		private String credentialNo;

		private String credentialType;

		private String credentialUrl;

		public String getCredentialNo() {
			return this.credentialNo;
		}

		public void setCredentialNo(String credentialNo) {
			this.credentialNo = credentialNo;
		}

		public String getCredentialType() {
			return this.credentialType;
		}

		public void setCredentialType(String credentialType) {
			this.credentialType = credentialType;
		}

		public String getCredentialUrl() {
			return this.credentialUrl;
		}

		public void setCredentialUrl(String credentialUrl) {
			this.credentialUrl = credentialUrl;
		}
	}

	@Override
	public QueryQualificationDetailResponse getInstance(UnmarshallerContext context) {
		return	QueryQualificationDetailResponseUnmarshaller.unmarshall(this, context);
	}
}
