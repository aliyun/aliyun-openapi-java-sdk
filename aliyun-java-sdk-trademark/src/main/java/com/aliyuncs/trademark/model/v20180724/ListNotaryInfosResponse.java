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

package com.aliyuncs.trademark.model.v20180724;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.trademark.transform.v20180724.ListNotaryInfosResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListNotaryInfosResponse extends AcsResponse {

	private Boolean nextPage;

	private String requestId;

	private Boolean success;

	private String errorCode;

	private Integer totalItemNum;

	private Boolean prePage;

	private Integer currentPageNum;

	private String errorMsg;

	private Integer totalPageNum;

	private Integer pageSize;

	private List<NotaryInfo> data;

	public Boolean getNextPage() {
		return this.nextPage;
	}

	public void setNextPage(Boolean nextPage) {
		this.nextPage = nextPage;
	}

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

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public Integer getTotalItemNum() {
		return this.totalItemNum;
	}

	public void setTotalItemNum(Integer totalItemNum) {
		this.totalItemNum = totalItemNum;
	}

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

	public String getErrorMsg() {
		return this.errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
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

	public List<NotaryInfo> getData() {
		return this.data;
	}

	public void setData(List<NotaryInfo> data) {
		this.data = data;
	}

	public static class NotaryInfo {

		private String token;

		private String tmRegisterNo;

		private String tmClassification;

		private String notaryFailedReason;

		private Long gmtModified;

		private Integer notaryStatus;

		private String bizOrderNo;

		public String getToken() {
			return this.token;
		}

		public void setToken(String token) {
			this.token = token;
		}

		public String getTmRegisterNo() {
			return this.tmRegisterNo;
		}

		public void setTmRegisterNo(String tmRegisterNo) {
			this.tmRegisterNo = tmRegisterNo;
		}

		public String getTmClassification() {
			return this.tmClassification;
		}

		public void setTmClassification(String tmClassification) {
			this.tmClassification = tmClassification;
		}

		public String getNotaryFailedReason() {
			return this.notaryFailedReason;
		}

		public void setNotaryFailedReason(String notaryFailedReason) {
			this.notaryFailedReason = notaryFailedReason;
		}

		public Long getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(Long gmtModified) {
			this.gmtModified = gmtModified;
		}

		public Integer getNotaryStatus() {
			return this.notaryStatus;
		}

		public void setNotaryStatus(Integer notaryStatus) {
			this.notaryStatus = notaryStatus;
		}

		public String getBizOrderNo() {
			return this.bizOrderNo;
		}

		public void setBizOrderNo(String bizOrderNo) {
			this.bizOrderNo = bizOrderNo;
		}
	}

	@Override
	public ListNotaryInfosResponse getInstance(UnmarshallerContext context) {
		return	ListNotaryInfosResponseUnmarshaller.unmarshall(this, context);
	}
}
