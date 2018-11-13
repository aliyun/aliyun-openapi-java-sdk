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

import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.domain.transform.v20180129.QueryEmailVerificationResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryEmailVerificationResponse extends AcsResponse {

	private String requestId;

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

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

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

	@Override
	public QueryEmailVerificationResponse getInstance(UnmarshallerContext context) {
		return	QueryEmailVerificationResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
