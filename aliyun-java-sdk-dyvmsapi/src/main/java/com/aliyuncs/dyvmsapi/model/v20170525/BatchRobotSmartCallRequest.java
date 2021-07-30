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

package com.aliyuncs.dyvmsapi.model.v20170525;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dyvmsapi.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class BatchRobotSmartCallRequest extends RpcAcsRequest<BatchRobotSmartCallResponse> {
	   

	private Long resourceOwnerId;

	private Boolean earlyMediaAsr;

	private String ttsParamHead;

	private String taskName;

	private String ttsParam;

	private String calledNumber;

	private String calledShowNumber;

	private Boolean isSelfLine;

	private String resourceOwnerAccount;

	private Long ownerId;

	private String dialogId;

	private Long scheduleTime;

	private String corpName;

	private Boolean scheduleCall;
	public BatchRobotSmartCallRequest() {
		super("Dyvmsapi", "2017-05-25", "BatchRobotSmartCall", "dyvms");
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

	public Boolean getEarlyMediaAsr() {
		return this.earlyMediaAsr;
	}

	public void setEarlyMediaAsr(Boolean earlyMediaAsr) {
		this.earlyMediaAsr = earlyMediaAsr;
		if(earlyMediaAsr != null){
			putQueryParameter("EarlyMediaAsr", earlyMediaAsr.toString());
		}
	}

	public String getTtsParamHead() {
		return this.ttsParamHead;
	}

	public void setTtsParamHead(String ttsParamHead) {
		this.ttsParamHead = ttsParamHead;
		if(ttsParamHead != null){
			putQueryParameter("TtsParamHead", ttsParamHead);
		}
	}

	public String getTaskName() {
		return this.taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
		if(taskName != null){
			putQueryParameter("TaskName", taskName);
		}
	}

	public String getTtsParam() {
		return this.ttsParam;
	}

	public void setTtsParam(String ttsParam) {
		this.ttsParam = ttsParam;
		if(ttsParam != null){
			putQueryParameter("TtsParam", ttsParam);
		}
	}

	public String getCalledNumber() {
		return this.calledNumber;
	}

	public void setCalledNumber(String calledNumber) {
		this.calledNumber = calledNumber;
		if(calledNumber != null){
			putQueryParameter("CalledNumber", calledNumber);
		}
	}

	public String getCalledShowNumber() {
		return this.calledShowNumber;
	}

	public void setCalledShowNumber(String calledShowNumber) {
		this.calledShowNumber = calledShowNumber;
		if(calledShowNumber != null){
			putQueryParameter("CalledShowNumber", calledShowNumber);
		}
	}

	public Boolean getIsSelfLine() {
		return this.isSelfLine;
	}

	public void setIsSelfLine(Boolean isSelfLine) {
		this.isSelfLine = isSelfLine;
		if(isSelfLine != null){
			putQueryParameter("IsSelfLine", isSelfLine.toString());
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

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public String getDialogId() {
		return this.dialogId;
	}

	public void setDialogId(String dialogId) {
		this.dialogId = dialogId;
		if(dialogId != null){
			putQueryParameter("DialogId", dialogId);
		}
	}

	public Long getScheduleTime() {
		return this.scheduleTime;
	}

	public void setScheduleTime(Long scheduleTime) {
		this.scheduleTime = scheduleTime;
		if(scheduleTime != null){
			putQueryParameter("ScheduleTime", scheduleTime.toString());
		}
	}

	public String getCorpName() {
		return this.corpName;
	}

	public void setCorpName(String corpName) {
		this.corpName = corpName;
		if(corpName != null){
			putQueryParameter("CorpName", corpName);
		}
	}

	public Boolean getScheduleCall() {
		return this.scheduleCall;
	}

	public void setScheduleCall(Boolean scheduleCall) {
		this.scheduleCall = scheduleCall;
		if(scheduleCall != null){
			putQueryParameter("ScheduleCall", scheduleCall.toString());
		}
	}

	@Override
	public Class<BatchRobotSmartCallResponse> getResponseClass() {
		return BatchRobotSmartCallResponse.class;
	}

}
