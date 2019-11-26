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

package com.aliyuncs.dyvms.model.v20170620;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dyvms.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateRobotv2KnowledgeRequest extends RpcAcsRequest<CreateRobotv2KnowledgeResponse> {
	   

	private Long resourceOwnerId;

	private String answerType;

	private String questions;

	private String remark;

	private Long robotId;

	private String dialogJson;

	private String transferNumber;

	private Boolean isBreak;

	private String otherProcessId;

	private String knowledgeName;

	private String exeAction;

	private String resourceOwnerAccount;

	private String prodCode;

	private String ruleContent;

	private String knowledgeType;

	private Long ownerId;

	private String transferType;

	private Long processId;
	public CreateRobotv2KnowledgeRequest() {
		super("Dyvms", "2017-06-20", "CreateRobotv2Knowledge", "dyvms");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getAnswerType() {
		return this.answerType;
	}

	public void setAnswerType(String answerType) {
		this.answerType = answerType;
		if(answerType != null){
			putQueryParameter("AnswerType", answerType);
		}
	}

	public String getQuestions() {
		return this.questions;
	}

	public void setQuestions(String questions) {
		this.questions = questions;
		if(questions != null){
			putQueryParameter("Questions", questions);
		}
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
		if(remark != null){
			putQueryParameter("Remark", remark);
		}
	}

	public Long getRobotId() {
		return this.robotId;
	}

	public void setRobotId(Long robotId) {
		this.robotId = robotId;
		if(robotId != null){
			putQueryParameter("RobotId", robotId.toString());
		}
	}

	public String getDialogJson() {
		return this.dialogJson;
	}

	public void setDialogJson(String dialogJson) {
		this.dialogJson = dialogJson;
		if(dialogJson != null){
			putQueryParameter("DialogJson", dialogJson);
		}
	}

	public String getTransferNumber() {
		return this.transferNumber;
	}

	public void setTransferNumber(String transferNumber) {
		this.transferNumber = transferNumber;
		if(transferNumber != null){
			putQueryParameter("TransferNumber", transferNumber);
		}
	}

	public Boolean getIsBreak() {
		return this.isBreak;
	}

	public void setIsBreak(Boolean isBreak) {
		this.isBreak = isBreak;
		if(isBreak != null){
			putQueryParameter("IsBreak", isBreak.toString());
		}
	}

	public String getOtherProcessId() {
		return this.otherProcessId;
	}

	public void setOtherProcessId(String otherProcessId) {
		this.otherProcessId = otherProcessId;
		if(otherProcessId != null){
			putQueryParameter("OtherProcessId", otherProcessId);
		}
	}

	public String getKnowledgeName() {
		return this.knowledgeName;
	}

	public void setKnowledgeName(String knowledgeName) {
		this.knowledgeName = knowledgeName;
		if(knowledgeName != null){
			putQueryParameter("KnowledgeName", knowledgeName);
		}
	}

	public String getExeAction() {
		return this.exeAction;
	}

	public void setExeAction(String exeAction) {
		this.exeAction = exeAction;
		if(exeAction != null){
			putQueryParameter("ExeAction", exeAction);
		}
	}

	public String getResourceOwnerAccount() {
		return this.resourceOwnerAccount;
	}

	public void setResourceOwnerAccount(String resourceOwnerAccount) {
		this.resourceOwnerAccount = resourceOwnerAccount;
		if(resourceOwnerAccount != null){
			putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
		}
	}

	public String getProdCode() {
		return this.prodCode;
	}

	public void setProdCode(String prodCode) {
		this.prodCode = prodCode;
		if(prodCode != null){
			putQueryParameter("ProdCode", prodCode);
		}
	}

	public String getRuleContent() {
		return this.ruleContent;
	}

	public void setRuleContent(String ruleContent) {
		this.ruleContent = ruleContent;
		if(ruleContent != null){
			putQueryParameter("RuleContent", ruleContent);
		}
	}

	public String getKnowledgeType() {
		return this.knowledgeType;
	}

	public void setKnowledgeType(String knowledgeType) {
		this.knowledgeType = knowledgeType;
		if(knowledgeType != null){
			putQueryParameter("KnowledgeType", knowledgeType);
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public String getTransferType() {
		return this.transferType;
	}

	public void setTransferType(String transferType) {
		this.transferType = transferType;
		if(transferType != null){
			putQueryParameter("TransferType", transferType);
		}
	}

	public Long getProcessId() {
		return this.processId;
	}

	public void setProcessId(Long processId) {
		this.processId = processId;
		if(processId != null){
			putQueryParameter("ProcessId", processId.toString());
		}
	}

	@Override
	public Class<CreateRobotv2KnowledgeResponse> getResponseClass() {
		return CreateRobotv2KnowledgeResponse.class;
	}

}
