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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.sofa.transform.v20190815.GetClriskIssueResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetClriskIssueResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private String closeTime;

	private Boolean currentUserOwner;

	private Long dataSize;

	private Boolean falseAlarm;

	private Boolean fundLoss;

	private String gmtCreate;

	private String gmtModified;

	private String issueCode;

	private Long issueId;

	private String memo;

	private String modelCode;

	private String modelName;

	private String processor;

	private String processDuration;

	private Long productId;

	private String productName;

	private String ruleCode;

	private String ruleName;

	private String status;

	private String triggerMode;

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

	public String getCloseTime() {
		return this.closeTime;
	}

	public void setCloseTime(String closeTime) {
		this.closeTime = closeTime;
	}

	public Boolean getCurrentUserOwner() {
		return this.currentUserOwner;
	}

	public void setCurrentUserOwner(Boolean currentUserOwner) {
		this.currentUserOwner = currentUserOwner;
	}

	public Long getDataSize() {
		return this.dataSize;
	}

	public void setDataSize(Long dataSize) {
		this.dataSize = dataSize;
	}

	public Boolean getFalseAlarm() {
		return this.falseAlarm;
	}

	public void setFalseAlarm(Boolean falseAlarm) {
		this.falseAlarm = falseAlarm;
	}

	public Boolean getFundLoss() {
		return this.fundLoss;
	}

	public void setFundLoss(Boolean fundLoss) {
		this.fundLoss = fundLoss;
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

	public String getIssueCode() {
		return this.issueCode;
	}

	public void setIssueCode(String issueCode) {
		this.issueCode = issueCode;
	}

	public Long getIssueId() {
		return this.issueId;
	}

	public void setIssueId(Long issueId) {
		this.issueId = issueId;
	}

	public String getMemo() {
		return this.memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getModelCode() {
		return this.modelCode;
	}

	public void setModelCode(String modelCode) {
		this.modelCode = modelCode;
	}

	public String getModelName() {
		return this.modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public String getProcessor() {
		return this.processor;
	}

	public void setProcessor(String processor) {
		this.processor = processor;
	}

	public String getProcessDuration() {
		return this.processDuration;
	}

	public void setProcessDuration(String processDuration) {
		this.processDuration = processDuration;
	}

	public Long getProductId() {
		return this.productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return this.productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getRuleCode() {
		return this.ruleCode;
	}

	public void setRuleCode(String ruleCode) {
		this.ruleCode = ruleCode;
	}

	public String getRuleName() {
		return this.ruleName;
	}

	public void setRuleName(String ruleName) {
		this.ruleName = ruleName;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTriggerMode() {
		return this.triggerMode;
	}

	public void setTriggerMode(String triggerMode) {
		this.triggerMode = triggerMode;
	}

	@Override
	public GetClriskIssueResponse getInstance(UnmarshallerContext context) {
		return	GetClriskIssueResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
