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

package com.aliyuncs.domain_intl.model.v20171218;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.domain_intl.transform.v20171218.ListEmailVerificationResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListEmailVerificationResponse extends AcsResponse {

	private String requestId;

	private Integer totalItemNum;

	private Integer currentPageNum;

	private Integer totalPageNum;

	private Integer pageSize;

	private Boolean prePage;

	private Boolean nextPage;

	private List<EmailVerification> data;

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

	public List<EmailVerification> getData() {
		return this.data;
	}

	public void setData(List<EmailVerification> data) {
		this.data = data;
	}

	public static class EmailVerification {

		private String gmtCreate;

		private String gmtModified;

		private String email;

		private String userId;

		private String emailVerificationNo;

		private String tokenSendTime;

		private Integer verificationStatus;

		private String verificationTime;

		private String sendIp;

		private String confirmIp;

		public String getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(String gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public String getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(String gmtModified) {
			this.gmtModified = gmtModified;
		}

		public String getEmail() {
			return this.email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getUserId() {
			return this.userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}

		public String getEmailVerificationNo() {
			return this.emailVerificationNo;
		}

		public void setEmailVerificationNo(String emailVerificationNo) {
			this.emailVerificationNo = emailVerificationNo;
		}

		public String getTokenSendTime() {
			return this.tokenSendTime;
		}

		public void setTokenSendTime(String tokenSendTime) {
			this.tokenSendTime = tokenSendTime;
		}

		public Integer getVerificationStatus() {
			return this.verificationStatus;
		}

		public void setVerificationStatus(Integer verificationStatus) {
			this.verificationStatus = verificationStatus;
		}

		public String getVerificationTime() {
			return this.verificationTime;
		}

		public void setVerificationTime(String verificationTime) {
			this.verificationTime = verificationTime;
		}

		public String getSendIp() {
			return this.sendIp;
		}

		public void setSendIp(String sendIp) {
			this.sendIp = sendIp;
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
