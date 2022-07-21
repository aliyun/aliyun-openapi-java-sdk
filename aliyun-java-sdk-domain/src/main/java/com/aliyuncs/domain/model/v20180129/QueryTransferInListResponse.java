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
import com.aliyuncs.domain.transform.v20180129.QueryTransferInListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryTransferInListResponse extends AcsResponse {

	private Boolean prePage;

	private Integer currentPageNum;

	private String requestId;

	private Integer pageSize;

	private Integer totalPageNum;

	private Integer totalItemNum;

	private Boolean nextPage;

	private List<TransferInInfo> data;

	public Boolean getPrePage() {
		return this.prePage;
	}

	public void setPrePage(Boolean prePage) {
		this.prePage = prePage;
	}

	public Integer getCurrentPageNum() {
		return this.currentPageNum;
	}

	public void setCurrentPageNum(Integer currentPageNum) {
		this.currentPageNum = currentPageNum;
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

	public Integer getTotalPageNum() {
		return this.totalPageNum;
	}

	public void setTotalPageNum(Integer totalPageNum) {
		this.totalPageNum = totalPageNum;
	}

	public Integer getTotalItemNum() {
		return this.totalItemNum;
	}

	public void setTotalItemNum(Integer totalItemNum) {
		this.totalItemNum = totalItemNum;
	}

	public Boolean getNextPage() {
		return this.nextPage;
	}

	public void setNextPage(Boolean nextPage) {
		this.nextPage = nextPage;
	}

	public List<TransferInInfo> getData() {
		return this.data;
	}

	public void setData(List<TransferInInfo> data) {
		this.data = data;
	}

	public static class TransferInInfo {

		private Integer status;

		private String userId;

		private String modificationDate;

		private Long transferAuthorizationCodeSubmissionDateLong;

		private Long submissionDateLong;

		private String resultCode;

		private Boolean needMailCheck;

		private Long modificationDateLong;

		private String instanceId;

		private String domainName;

		private Integer progressBarType;

		private String resultMsg;

		private Long resultDateLong;

		private String expirationDate;

		private String email;

		private Boolean whoisMailStatus;

		private String transferAuthorizationCodeSubmissionDate;

		private String submissionDate;

		private Long expirationDateLong;

		private String simpleTransferInStatus;

		private String resultDate;

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public String getUserId() {
			return this.userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}

		public String getModificationDate() {
			return this.modificationDate;
		}

		public void setModificationDate(String modificationDate) {
			this.modificationDate = modificationDate;
		}

		public Long getTransferAuthorizationCodeSubmissionDateLong() {
			return this.transferAuthorizationCodeSubmissionDateLong;
		}

		public void setTransferAuthorizationCodeSubmissionDateLong(Long transferAuthorizationCodeSubmissionDateLong) {
			this.transferAuthorizationCodeSubmissionDateLong = transferAuthorizationCodeSubmissionDateLong;
		}

		public Long getSubmissionDateLong() {
			return this.submissionDateLong;
		}

		public void setSubmissionDateLong(Long submissionDateLong) {
			this.submissionDateLong = submissionDateLong;
		}

		public String getResultCode() {
			return this.resultCode;
		}

		public void setResultCode(String resultCode) {
			this.resultCode = resultCode;
		}

		public Boolean getNeedMailCheck() {
			return this.needMailCheck;
		}

		public void setNeedMailCheck(Boolean needMailCheck) {
			this.needMailCheck = needMailCheck;
		}

		public Long getModificationDateLong() {
			return this.modificationDateLong;
		}

		public void setModificationDateLong(Long modificationDateLong) {
			this.modificationDateLong = modificationDateLong;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getDomainName() {
			return this.domainName;
		}

		public void setDomainName(String domainName) {
			this.domainName = domainName;
		}

		public Integer getProgressBarType() {
			return this.progressBarType;
		}

		public void setProgressBarType(Integer progressBarType) {
			this.progressBarType = progressBarType;
		}

		public String getResultMsg() {
			return this.resultMsg;
		}

		public void setResultMsg(String resultMsg) {
			this.resultMsg = resultMsg;
		}

		public Long getResultDateLong() {
			return this.resultDateLong;
		}

		public void setResultDateLong(Long resultDateLong) {
			this.resultDateLong = resultDateLong;
		}

		public String getExpirationDate() {
			return this.expirationDate;
		}

		public void setExpirationDate(String expirationDate) {
			this.expirationDate = expirationDate;
		}

		public String getEmail() {
			return this.email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public Boolean getWhoisMailStatus() {
			return this.whoisMailStatus;
		}

		public void setWhoisMailStatus(Boolean whoisMailStatus) {
			this.whoisMailStatus = whoisMailStatus;
		}

		public String getTransferAuthorizationCodeSubmissionDate() {
			return this.transferAuthorizationCodeSubmissionDate;
		}

		public void setTransferAuthorizationCodeSubmissionDate(String transferAuthorizationCodeSubmissionDate) {
			this.transferAuthorizationCodeSubmissionDate = transferAuthorizationCodeSubmissionDate;
		}

		public String getSubmissionDate() {
			return this.submissionDate;
		}

		public void setSubmissionDate(String submissionDate) {
			this.submissionDate = submissionDate;
		}

		public Long getExpirationDateLong() {
			return this.expirationDateLong;
		}

		public void setExpirationDateLong(Long expirationDateLong) {
			this.expirationDateLong = expirationDateLong;
		}

		public String getSimpleTransferInStatus() {
			return this.simpleTransferInStatus;
		}

		public void setSimpleTransferInStatus(String simpleTransferInStatus) {
			this.simpleTransferInStatus = simpleTransferInStatus;
		}

		public String getResultDate() {
			return this.resultDate;
		}

		public void setResultDate(String resultDate) {
			this.resultDate = resultDate;
		}
	}

	@Override
	public QueryTransferInListResponse getInstance(UnmarshallerContext context) {
		return	QueryTransferInListResponseUnmarshaller.unmarshall(this, context);
	}
}
