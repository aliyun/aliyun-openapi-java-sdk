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

package com.aliyuncs.nlb.model.v20220430;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.nlb.transform.v20220430.ListListenerCertificatesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListListenerCertificatesResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Integer httpStatusCode;

	private String dynamicCode;

	private String dynamicMessage;

	private Integer totalCount;

	private String nextToken;

	private Integer maxResults;

	private List<Certificate> certificates;

	private List<String> certificateIds;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public String getDynamicCode() {
		return this.dynamicCode;
	}

	public void setDynamicCode(String dynamicCode) {
		this.dynamicCode = dynamicCode;
	}

	public String getDynamicMessage() {
		return this.dynamicMessage;
	}

	public void setDynamicMessage(String dynamicMessage) {
		this.dynamicMessage = dynamicMessage;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public Integer getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
	}

	public List<Certificate> getCertificates() {
		return this.certificates;
	}

	public void setCertificates(List<Certificate> certificates) {
		this.certificates = certificates;
	}

	public List<String> getCertificateIds() {
		return this.certificateIds;
	}

	public void setCertificateIds(List<String> certificateIds) {
		this.certificateIds = certificateIds;
	}

	public static class Certificate {

		private String certificateId;

		private Boolean isDefault;

		private String status;

		private String certificateType;

		public String getCertificateId() {
			return this.certificateId;
		}

		public void setCertificateId(String certificateId) {
			this.certificateId = certificateId;
		}

		public Boolean getIsDefault() {
			return this.isDefault;
		}

		public void setIsDefault(Boolean isDefault) {
			this.isDefault = isDefault;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getCertificateType() {
			return this.certificateType;
		}

		public void setCertificateType(String certificateType) {
			this.certificateType = certificateType;
		}
	}

	@Override
	public ListListenerCertificatesResponse getInstance(UnmarshallerContext context) {
		return	ListListenerCertificatesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
