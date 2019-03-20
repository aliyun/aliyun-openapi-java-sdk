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

package com.aliyuncs.alidns.model.v20150109;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.alidns.transform.v20150109.DescribeBatchResultDetailResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeBatchResultDetailResponse extends AcsResponse {

	private String requestId;

	private Long totalCount;

	private Long pageNumber;

	private Long pageSize;

	private List<BatchResultDetail> batchResultDetails;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public Long getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Long pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public List<BatchResultDetail> getBatchResultDetails() {
		return this.batchResultDetails;
	}

	public void setBatchResultDetails(List<BatchResultDetail> batchResultDetails) {
		this.batchResultDetails = batchResultDetails;
	}

	public static class BatchResultDetail {

		private String domain;

		private String type;

		private String rr;

		private String value;

		private Boolean status;

		private String reason;

		private String newRr;

		private String newValue;

		private String batchType;

		private String operateDateStr;

		private String line;

		private Integer priority;

		private Integer ttl;

		private String recordId;

		private String remark;

		private String rrStatus;

		public String getBizDomain() {
			return this.domain;
		}

		public void setBizDomain(String domain) {
			this.domain = domain;
		}

		/**
		 * @deprecated use getBizDomain instead of this.
		 */
		@Deprecated
		public String getDomain() {
			return this.domain;
		}

		/**
		 * @deprecated use setBizDomain instead of this.
		 */
		@Deprecated
		public void setDomain(String domain) {
			this.domain = domain;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getRr() {
			return this.rr;
		}

		public void setRr(String rr) {
			this.rr = rr;
		}

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public Boolean getStatus() {
			return this.status;
		}

		public void setStatus(Boolean status) {
			this.status = status;
		}

		public String getReason() {
			return this.reason;
		}

		public void setReason(String reason) {
			this.reason = reason;
		}

		public String getNewRr() {
			return this.newRr;
		}

		public void setNewRr(String newRr) {
			this.newRr = newRr;
		}

		public String getNewValue() {
			return this.newValue;
		}

		public void setNewValue(String newValue) {
			this.newValue = newValue;
		}

		public String getBatchType() {
			return this.batchType;
		}

		public void setBatchType(String batchType) {
			this.batchType = batchType;
		}

		public String getOperateDateStr() {
			return this.operateDateStr;
		}

		public void setOperateDateStr(String operateDateStr) {
			this.operateDateStr = operateDateStr;
		}

		public String getLine() {
			return this.line;
		}

		public void setLine(String line) {
			this.line = line;
		}

		public Integer getPriority() {
			return this.priority;
		}

		public void setPriority(Integer priority) {
			this.priority = priority;
		}

		public Integer getTtl() {
			return this.ttl;
		}

		public void setTtl(Integer ttl) {
			this.ttl = ttl;
		}

		public String getRecordId() {
			return this.recordId;
		}

		public void setRecordId(String recordId) {
			this.recordId = recordId;
		}

		public String getRemark() {
			return this.remark;
		}

		public void setRemark(String remark) {
			this.remark = remark;
		}

		public String getRrStatus() {
			return this.rrStatus;
		}

		public void setRrStatus(String rrStatus) {
			this.rrStatus = rrStatus;
		}
	}

	@Override
	public DescribeBatchResultDetailResponse getInstance(UnmarshallerContext context) {
		return	DescribeBatchResultDetailResponseUnmarshaller.unmarshall(this, context);
	}
}
