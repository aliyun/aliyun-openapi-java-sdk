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

package com.aliyuncs.trademark.model.v20190902;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.trademark.transform.v20190902.ListApplicantsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListApplicantsResponse extends AcsResponse {

	private Integer pageNumber;

	private String requestId;

	private Integer pageSize;

	private Integer totalCount;

	private List<Applicant> applicants;

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<Applicant> getApplicants() {
		return this.applicants;
	}

	public void setApplicants(List<Applicant> applicants) {
		this.applicants = applicants;
	}

	public static class Applicant {

		private Long validDate;

		private String cardNumber;

		private String applicantName;

		private Integer authorizationAuditStatus;

		private Integer applicantRegion;

		private Long applicantId;

		private String authorizationUrl;

		private String contactName;

		private Integer principalName;

		private Integer applicantType;

		private Integer auditStatus;

		private String applicantVersion;

		private String systemVersion;

		public Long getValidDate() {
			return this.validDate;
		}

		public void setValidDate(Long validDate) {
			this.validDate = validDate;
		}

		public String getCardNumber() {
			return this.cardNumber;
		}

		public void setCardNumber(String cardNumber) {
			this.cardNumber = cardNumber;
		}

		public String getApplicantName() {
			return this.applicantName;
		}

		public void setApplicantName(String applicantName) {
			this.applicantName = applicantName;
		}

		public Integer getAuthorizationAuditStatus() {
			return this.authorizationAuditStatus;
		}

		public void setAuthorizationAuditStatus(Integer authorizationAuditStatus) {
			this.authorizationAuditStatus = authorizationAuditStatus;
		}

		public Integer getApplicantRegion() {
			return this.applicantRegion;
		}

		public void setApplicantRegion(Integer applicantRegion) {
			this.applicantRegion = applicantRegion;
		}

		public Long getApplicantId() {
			return this.applicantId;
		}

		public void setApplicantId(Long applicantId) {
			this.applicantId = applicantId;
		}

		public String getAuthorizationUrl() {
			return this.authorizationUrl;
		}

		public void setAuthorizationUrl(String authorizationUrl) {
			this.authorizationUrl = authorizationUrl;
		}

		public String getContactName() {
			return this.contactName;
		}

		public void setContactName(String contactName) {
			this.contactName = contactName;
		}

		public Integer getPrincipalName() {
			return this.principalName;
		}

		public void setPrincipalName(Integer principalName) {
			this.principalName = principalName;
		}

		public Integer getApplicantType() {
			return this.applicantType;
		}

		public void setApplicantType(Integer applicantType) {
			this.applicantType = applicantType;
		}

		public Integer getAuditStatus() {
			return this.auditStatus;
		}

		public void setAuditStatus(Integer auditStatus) {
			this.auditStatus = auditStatus;
		}

		public String getApplicantVersion() {
			return this.applicantVersion;
		}

		public void setApplicantVersion(String applicantVersion) {
			this.applicantVersion = applicantVersion;
		}

		public String getSystemVersion() {
			return this.systemVersion;
		}

		public void setSystemVersion(String systemVersion) {
			this.systemVersion = systemVersion;
		}
	}

	@Override
	public ListApplicantsResponse getInstance(UnmarshallerContext context) {
		return	ListApplicantsResponseUnmarshaller.unmarshall(this, context);
	}
}
