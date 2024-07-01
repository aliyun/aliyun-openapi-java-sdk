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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.domain_intl.transform.v20171218.QueryTransferInByInstanceIdResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryTransferInByInstanceIdResponse extends AcsResponse {

	private Integer status;

	private String transferAuthorizationCodeSubmissionDate;

	private String email;

	private Integer progressBarType;

	private String requestId;

	private String instanceId;

	private String domainName;

	private Long submissionDateLong;

	private String submissionDate;

	private String simpleTransferInStatus;

	private Long transferAuthorizationCodeSubmissionDateLong;

	private Long expirationDateLong;

	private String expirationDate;

	private Boolean needMailCheck;

	private String userId;

	private String modificationDate;

	private Long resultDateLong;

	private String resultMsg;

	private Boolean whoisMailStatus;

	private Long modificationDateLong;

	private String resultCode;

	private String resultDate;

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getTransferAuthorizationCodeSubmissionDate() {
		return this.transferAuthorizationCodeSubmissionDate;
	}

	public void setTransferAuthorizationCodeSubmissionDate(String transferAuthorizationCodeSubmissionDate) {
		this.transferAuthorizationCodeSubmissionDate = transferAuthorizationCodeSubmissionDate;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getProgressBarType() {
		return this.progressBarType;
	}

	public void setProgressBarType(Integer progressBarType) {
		this.progressBarType = progressBarType;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
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

	public Long getSubmissionDateLong() {
		return this.submissionDateLong;
	}

	public void setSubmissionDateLong(Long submissionDateLong) {
		this.submissionDateLong = submissionDateLong;
	}

	public String getSubmissionDate() {
		return this.submissionDate;
	}

	public void setSubmissionDate(String submissionDate) {
		this.submissionDate = submissionDate;
	}

	public String getSimpleTransferInStatus() {
		return this.simpleTransferInStatus;
	}

	public void setSimpleTransferInStatus(String simpleTransferInStatus) {
		this.simpleTransferInStatus = simpleTransferInStatus;
	}

	public Long getTransferAuthorizationCodeSubmissionDateLong() {
		return this.transferAuthorizationCodeSubmissionDateLong;
	}

	public void setTransferAuthorizationCodeSubmissionDateLong(Long transferAuthorizationCodeSubmissionDateLong) {
		this.transferAuthorizationCodeSubmissionDateLong = transferAuthorizationCodeSubmissionDateLong;
	}

	public Long getExpirationDateLong() {
		return this.expirationDateLong;
	}

	public void setExpirationDateLong(Long expirationDateLong) {
		this.expirationDateLong = expirationDateLong;
	}

	public String getExpirationDate() {
		return this.expirationDate;
	}

	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}

	public Boolean getNeedMailCheck() {
		return this.needMailCheck;
	}

	public void setNeedMailCheck(Boolean needMailCheck) {
		this.needMailCheck = needMailCheck;
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

	public Long getResultDateLong() {
		return this.resultDateLong;
	}

	public void setResultDateLong(Long resultDateLong) {
		this.resultDateLong = resultDateLong;
	}

	public String getResultMsg() {
		return this.resultMsg;
	}

	public void setResultMsg(String resultMsg) {
		this.resultMsg = resultMsg;
	}

	public Boolean getWhoisMailStatus() {
		return this.whoisMailStatus;
	}

	public void setWhoisMailStatus(Boolean whoisMailStatus) {
		this.whoisMailStatus = whoisMailStatus;
	}

	public Long getModificationDateLong() {
		return this.modificationDateLong;
	}

	public void setModificationDateLong(Long modificationDateLong) {
		this.modificationDateLong = modificationDateLong;
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

	@Override
	public QueryTransferInByInstanceIdResponse getInstance(UnmarshallerContext context) {
		return	QueryTransferInByInstanceIdResponseUnmarshaller.unmarshall(this, context);
	}
}
