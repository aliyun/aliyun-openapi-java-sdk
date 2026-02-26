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

	private Long totalCount;

	private Long pageSize;

	private String requestId;

	private Long pageNumber;

	private List<BatchResultDetail> batchResultDetails;

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Long pageNumber) {
		this.pageNumber = pageNumber;
	}

	public List<BatchResultDetail> getBatchResultDetails() {
		return this.batchResultDetails;
	}

	public void setBatchResultDetails(List<BatchResultDetail> batchResultDetails) {
		this.batchResultDetails = batchResultDetails;
	}

	public static class BatchResultDetail {

		private Boolean status;

		private String type;

		private String domain;

		private String remark;

		private String recordId;

		private String rr;

		private String priority;

		private String rrStatus;

		private String operateDateStr;

		private String newValue;

		private String value;

		private String ttl;

		private String batchType;

		private String line;

		private String newRr;

		private String reason;

		public Boolean getStatus() {
			return this.status;
		}

		public void setStatus(Boolean status) {
			this.status = status;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getDomain() {
			return this.domain;
		}

		public void setDomain(String domain) {
			this.domain = domain;
		}

		public String getRemark() {
			return this.remark;
		}

		public void setRemark(String remark) {
			this.remark = remark;
		}

		public String getRecordId() {
			return this.recordId;
		}

		public void setRecordId(String recordId) {
			this.recordId = recordId;
		}

		public String getRr() {
			return this.rr;
		}

		public void setRr(String rr) {
			this.rr = rr;
		}

		public String getPriority() {
			return this.priority;
		}

		public void setPriority(String priority) {
			this.priority = priority;
		}

		public String getRrStatus() {
			return this.rrStatus;
		}

		public void setRrStatus(String rrStatus) {
			this.rrStatus = rrStatus;
		}

		public String getOperateDateStr() {
			return this.operateDateStr;
		}

		public void setOperateDateStr(String operateDateStr) {
			this.operateDateStr = operateDateStr;
		}

		public String getNewValue() {
			return this.newValue;
		}

		public void setNewValue(String newValue) {
			this.newValue = newValue;
		}

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public String getTtl() {
			return this.ttl;
		}

		public void setTtl(String ttl) {
			this.ttl = ttl;
		}

		public String getBatchType() {
			return this.batchType;
		}

		public void setBatchType(String batchType) {
			this.batchType = batchType;
		}

		public String getLine() {
			return this.line;
		}

		public void setLine(String line) {
			this.line = line;
		}

		public String getNewRr() {
			return this.newRr;
		}

		public void setNewRr(String newRr) {
			this.newRr = newRr;
		}

		public String getReason() {
			return this.reason;
		}

		public void setReason(String reason) {
			this.reason = reason;
		}
	}

	@Override
	public DescribeBatchResultDetailResponse getInstance(UnmarshallerContext context) {
		return	DescribeBatchResultDetailResponseUnmarshaller.unmarshall(this, context);
	}
}
