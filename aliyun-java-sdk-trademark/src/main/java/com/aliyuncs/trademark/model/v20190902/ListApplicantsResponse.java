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

	private String requestId;

	private Integer totalCount;

	private Integer pageSize;

	private Integer pageNumber;

	private List<Applicant> applicants;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public List<Applicant> getApplicants() {
		return this.applicants;
	}

	public void setApplicants(List<Applicant> applicants) {
		this.applicants = applicants;
	}

	public static class Applicant {

		private Long applicantId;

		private String applicantName;

		private Integer applicantType;

		private Integer applicantRegion;

		private String contactName;

		private Integer auditStatus;

		private String authorizationUrl;

		private Integer authorizationAuditStatus;

		private String cardNumber;

		public Long getApplicantId() {
			return this.applicantId;
		}

		public void setApplicantId(Long applicantId) {
			this.applicantId = applicantId;
		}

		public String getApplicantName() {
			return this.applicantName;
		}

		public void setApplicantName(String applicantName) {
			this.applicantName = applicantName;
		}

		public Integer getApplicantType() {
			return this.applicantType;
		}

		public void setApplicantType(Integer applicantType) {
			this.applicantType = applicantType;
		}

		public Integer getApplicantRegion() {
			return this.applicantRegion;
		}

		public void setApplicantRegion(Integer applicantRegion) {
			this.applicantRegion = applicantRegion;
		}

		public String getContactName() {
			return this.contactName;
		}

		public void setContactName(String contactName) {
			this.contactName = contactName;
		}

		public Integer getAuditStatus() {
			return this.auditStatus;
		}

		public void setAuditStatus(Integer auditStatus) {
			this.auditStatus = auditStatus;
		}

		public String getAuthorizationUrl() {
			return this.authorizationUrl;
		}

		public void setAuthorizationUrl(String authorizationUrl) {
			this.authorizationUrl = authorizationUrl;
		}

		public Integer getAuthorizationAuditStatus() {
			return this.authorizationAuditStatus;
		}

		public void setAuthorizationAuditStatus(Integer authorizationAuditStatus) {
			this.authorizationAuditStatus = authorizationAuditStatus;
		}

		public String getCardNumber() {
			return this.cardNumber;
		}

		public void setCardNumber(String cardNumber) {
			this.cardNumber = cardNumber;
		}
	}

	@Override
	public ListApplicantsResponse getInstance(UnmarshallerContext context) {
		return	ListApplicantsResponseUnmarshaller.unmarshall(this, context);
	}
}
