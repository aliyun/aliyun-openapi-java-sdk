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
import com.aliyuncs.domain.transform.v20180129.ListEmailVerificationResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListEmailVerificationResponse extends AcsResponse {

	private Boolean prePage;

	private Integer currentPageNum;

	private String requestId;

	private Integer pageSize;

	private Integer totalPageNum;

	private Integer totalItemNum;

	private Boolean nextPage;

	private List<EmailVerification> data;

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

	public List<EmailVerification> getData() {
		return this.data;
	}

	public void setData(List<EmailVerification> data) {
		this.data = data;
	}

	public static class EmailVerification {

		private String verificationTime;

		private String email;

		private String emailVerificationNo;

		private String userId;

		private String gmtCreate;

		private Integer verificationStatus;

		private String tokenSendTime;

		private String sendIp;

		private String gmtModified;

		private String confirmIp;

		public String getVerificationTime() {
			return this.verificationTime;
		}

		public void setVerificationTime(String verificationTime) {
			this.verificationTime = verificationTime;
		}

		public String getEmail() {
			return this.email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getEmailVerificationNo() {
			return this.emailVerificationNo;
		}

		public void setEmailVerificationNo(String emailVerificationNo) {
			this.emailVerificationNo = emailVerificationNo;
		}

		public String getUserId() {
			return this.userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}

		public String getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(String gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public Integer getVerificationStatus() {
			return this.verificationStatus;
		}

		public void setVerificationStatus(Integer verificationStatus) {
			this.verificationStatus = verificationStatus;
		}

		public String getTokenSendTime() {
			return this.tokenSendTime;
		}

		public void setTokenSendTime(String tokenSendTime) {
			this.tokenSendTime = tokenSendTime;
		}

		public String getSendIp() {
			return this.sendIp;
		}

		public void setSendIp(String sendIp) {
			this.sendIp = sendIp;
		}

		public String getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(String gmtModified) {
			this.gmtModified = gmtModified;
		}

		public String getConfirmIp() {
			return this.confirmIp;
		}

		public void setConfirmIp(String confirmIp) {
			this.confirmIp = confirmIp;
		}
	}

	@Override
	public ListEmailVerificationResponse getInstance(UnmarshallerContext context) {
		return	ListEmailVerificationResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
