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

package com.aliyuncs.sofa.model.v20190815;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sofa.transform.v20190815.QueryDTXTransactionsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryDTXTransactionsResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private Long currentPage;

	private Long pageSize;

	private Boolean success;

	private Long total;

	private List<DataItem> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultMessage() {
		return this.resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	public Long getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Long currentPage) {
		this.currentPage = currentPage;
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Long getTotal() {
		return this.total;
	}

	public void setTotal(Long total) {
		this.total = total;
	}

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private String bizType;

		private String businessId;

		private String endTime;

		private String initiatorIp;

		private String initiatorName;

		private String modifyTime;

		private String startTime;

		private String status;

		private String txId;

		private List<String> participatorIds;

		public String getBizType() {
			return this.bizType;
		}

		public void setBizType(String bizType) {
			this.bizType = bizType;
		}

		public String getBusinessId() {
			return this.businessId;
		}

		public void setBusinessId(String businessId) {
			this.businessId = businessId;
		}

		public String getEndTime() {
			return this.endTime;
		}

		public void setEndTime(String endTime) {
			this.endTime = endTime;
		}

		public String getInitiatorIp() {
			return this.initiatorIp;
		}

		public void setInitiatorIp(String initiatorIp) {
			this.initiatorIp = initiatorIp;
		}

		public String getInitiatorName() {
			return this.initiatorName;
		}

		public void setInitiatorName(String initiatorName) {
			this.initiatorName = initiatorName;
		}

		public String getModifyTime() {
			return this.modifyTime;
		}

		public void setModifyTime(String modifyTime) {
			this.modifyTime = modifyTime;
		}

		public String getStartTime() {
			return this.startTime;
		}

		public void setStartTime(String startTime) {
			this.startTime = startTime;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getTxId() {
			return this.txId;
		}

		public void setTxId(String txId) {
			this.txId = txId;
		}

		public List<String> getParticipatorIds() {
			return this.participatorIds;
		}

		public void setParticipatorIds(List<String> participatorIds) {
			this.participatorIds = participatorIds;
		}
	}

	@Override
	public QueryDTXTransactionsResponse getInstance(UnmarshallerContext context) {
		return	QueryDTXTransactionsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
