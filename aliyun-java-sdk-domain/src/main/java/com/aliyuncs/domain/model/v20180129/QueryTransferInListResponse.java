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
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.domain.transform.v20180129.QueryTransferInListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryTransferInListResponse extends AcsResponse {

	private String requestId;

	private Integer totalItemNum;

	private Integer currentPageNum;

	private Integer totalPageNum;

	private Integer pageSize;

	private Boolean prePage;

	private Boolean nextPage;

	private List<TransferInInfo> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalItemNum() {
		return this.totalItemNum;
	}

	public void setTotalItemNum(Integer totalItemNum) {
		this.totalItemNum = totalItemNum;
	}

	public Integer getCurrentPageNum() {
		return this.currentPageNum;
	}

	public void setCurrentPageNum(Integer currentPageNum) {
		this.currentPageNum = currentPageNum;
	}

	public Integer getTotalPageNum() {
		return this.totalPageNum;
	}

	public void setTotalPageNum(Integer totalPageNum) {
		this.totalPageNum = totalPageNum;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Boolean getPrePage() {
		return this.prePage;
	}

	public void setPrePage(Boolean prePage) {
		this.prePage = prePage;
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

		private String submissionDate;

		private String modificationDate;

		private String userId;

		private String instanceId;

		private String domainName;

		private Integer status;

		private String simpleTransferInStatus;

		private String resultCode;

		private String resultDate;

		private String resultMsg;

		private String transferAuthorizationCodeSubmissionDate;

		private Boolean needMailCheck;

		private String email;

		private Boolean whoisMailStatus;

		private String expirationDate;

		private Integer progressBarType;

		private Long submissionDateLong;

		private Long modificationDateLong;

		private Long resultDateLong;

		private Long expirationDateLong;

		private Long transferAuthorizationCodeSubmissionDateLong;

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

		public String getUserId() {
			return this.userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
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

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public String getSimpleTransferInStatus() {
			return this.simpleTransferInStatus;
		}

		public void setSimpleTransferInStatus(String simpleTransferInStatus) {
			this.simpleTransferInStatus = simpleTransferInStatus;
		}

		public String getResultCode() {
			return this.resultCode;
		}

		public void setResultCode(String resultCode) {
			this.resultCode = resultCode;
		}

		public String getResultDate() {
			return this.resultDate;
		}

		public void setResultDate(String resultDate) {
			this.resultDate = resultDate;
		}

		public String getResultMsg() {
			return this.resultMsg;
		}

		public void setResultMsg(String resultMsg) {
			this.resultMsg = resultMsg;
		}

		public String getTransferAuthorizationCodeSubmissionDate() {
			return this.transferAuthorizationCodeSubmissionDate;
		}

		public void setTransferAuthorizationCodeSubmissionDate(String transferAuthorizationCodeSubmissionDate) {
			this.transferAuthorizationCodeSubmissionDate = transferAuthorizationCodeSubmissionDate;
		}

		public Boolean getNeedMailCheck() {
			return this.needMailCheck;
		}

		public void setNeedMailCheck(Boolean needMailCheck) {
			this.needMailCheck = needMailCheck;
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

		public String getExpirationDate() {
			return this.expirationDate;
		}

		public void setExpirationDate(String expirationDate) {
			this.expirationDate = expirationDate;
		}

		public Integer getProgressBarType() {
			return this.progressBarType;
		}

		public void setProgressBarType(Integer progressBarType) {
			this.progressBarType = progressBarType;
		}

		public Long getSubmissionDateLong() {
			return this.submissionDateLong;
		}

		public void setSubmissionDateLong(Long submissionDateLong) {
			this.submissionDateLong = submissionDateLong;
		}

		public Long getModificationDateLong() {
			return this.modificationDateLong;
		}

		public void setModificationDateLong(Long modificationDateLong) {
			this.modificationDateLong = modificationDateLong;
		}

		public Long getResultDateLong() {
			return this.resultDateLong;
		}

		public void setResultDateLong(Long resultDateLong) {
			this.resultDateLong = resultDateLong;
		}

		public Long getExpirationDateLong() {
			return this.expirationDateLong;
		}

		public void setExpirationDateLong(Long expirationDateLong) {
			this.expirationDateLong = expirationDateLong;
		}

		public Long getTransferAuthorizationCodeSubmissionDateLong() {
			return this.transferAuthorizationCodeSubmissionDateLong;
		}

		public void setTransferAuthorizationCodeSubmissionDateLong(Long transferAuthorizationCodeSubmissionDateLong) {
			this.transferAuthorizationCodeSubmissionDateLong = transferAuthorizationCodeSubmissionDateLong;
		}
	}

	@Override
	public QueryTransferInListResponse getInstance(UnmarshallerContext context) {
		return	QueryTransferInListResponseUnmarshaller.unmarshall(this, context);
	}
}
