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

	private String requestId;

	private Integer totalItemNum;

	private Integer currentPageNum;

	private Integer pageSize;

	private Integer totalPageNum;

	private Boolean prePage;

	private Boolean nextPage;

	private Boolean success;

	private String errorMsg;

	private String errorCode;

	private List<NotaryInfo> data;

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

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getErrorMsg() {
		return this.errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public List<NotaryInfo> getData() {
		return this.data;
	}

	public void setData(List<NotaryInfo> data) {
		this.data = data;
	}

	public static class NotaryInfo {

		private String bizOrderNo;

		private String token;

		private Integer notaryStatus;

		private String tmRegisterNo;

		private String tmClassification;

		private Long gmtModified;

		private String notaryFailedReason;

		public String getBizOrderNo() {
			return this.bizOrderNo;
		}

		public void setBizOrderNo(String bizOrderNo) {
			this.bizOrderNo = bizOrderNo;
		}

		public String getToken() {
			return this.token;
		}

		public void setToken(String token) {
			this.token = token;
		}

		public Integer getNotaryStatus() {
			return this.notaryStatus;
		}

		public void setNotaryStatus(Integer notaryStatus) {
			this.notaryStatus = notaryStatus;
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

		public Long getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(Long gmtModified) {
			this.gmtModified = gmtModified;
		}

		public String getNotaryFailedReason() {
			return this.notaryFailedReason;
		}

		public void setNotaryFailedReason(String notaryFailedReason) {
			this.notaryFailedReason = notaryFailedReason;
		}
	}

	@Override
	public ListNotaryInfosResponse getInstance(UnmarshallerContext context) {
		return	ListNotaryInfosResponseUnmarshaller.unmarshall(this, context);
	}
}
