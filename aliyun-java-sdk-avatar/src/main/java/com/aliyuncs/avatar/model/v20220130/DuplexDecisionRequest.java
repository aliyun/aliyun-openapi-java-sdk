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

package com.aliyuncs.avatar.model.v20220130;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DuplexDecisionRequest extends RpcAcsRequest<DuplexDecisionResponse> {
	   

	private Integer interruptType;

	@SerializedName("customKeywords")
	private List<String> customKeywords;

	private String sessionId;

	private String dialogStatus;

	@SerializedName("dialogContext")
	private DialogContext dialogContext;

	private Integer callTime;

	private String appId;

	private Long tenantId;

	private String text;

	private String bizRequestId;
	public DuplexDecisionRequest() {
		super("avatar", "2022-01-30", "DuplexDecision");
		setMethod(MethodType.POST);
	}

	public Integer getInterruptType() {
		return this.interruptType;
	}

	public void setInterruptType(Integer interruptType) {
		this.interruptType = interruptType;
		if(interruptType != null){
			putQueryParameter("InterruptType", interruptType.toString());
		}
	}

	public List<String> getCustomKeywords() {
		return this.customKeywords;
	}

	public void setCustomKeywords(List<String> customKeywords) {
		this.customKeywords = customKeywords;	
		if (customKeywords != null) {
			putQueryParameter("CustomKeywords" , new Gson().toJson(customKeywords));
		}	
	}

	public String getSessionId() {
		return this.sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
		if(sessionId != null){
			putQueryParameter("SessionId", sessionId);
		}
	}

	public String getDialogStatus() {
		return this.dialogStatus;
	}

	public void setDialogStatus(String dialogStatus) {
		this.dialogStatus = dialogStatus;
		if(dialogStatus != null){
			putQueryParameter("DialogStatus", dialogStatus);
		}
	}

	public DialogContext getDialogContext() {
		return this.dialogContext;
	}

	public void setDialogContext(DialogContext dialogContext) {
		this.dialogContext = dialogContext;	
		if (dialogContext != null) {
			putQueryParameter("DialogContext" , new Gson().toJson(dialogContext));
		}	
	}

	public Integer getCallTime() {
		return this.callTime;
	}

	public void setCallTime(Integer callTime) {
		this.callTime = callTime;
		if(callTime != null){
			putQueryParameter("CallTime", callTime.toString());
		}
	}

	public String getAppId() {
		return this.appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
		if(appId != null){
			putQueryParameter("AppId", appId);
		}
	}

	public Long getTenantId() {
		return this.tenantId;
	}

	public void setTenantId(Long tenantId) {
		this.tenantId = tenantId;
		if(tenantId != null){
			putQueryParameter("TenantId", tenantId.toString());
		}
	}

	public String getText() {
		return this.text;
	}

	public void setText(String text) {
		this.text = text;
		if(text != null){
			putQueryParameter("Text", text);
		}
	}

	public String getBizRequestId() {
		return this.bizRequestId;
	}

	public void setBizRequestId(String bizRequestId) {
		this.bizRequestId = bizRequestId;
		if(bizRequestId != null){
			putQueryParameter("BizRequestId", bizRequestId);
		}
	}

	public static class DialogContext {

		@SerializedName("Histories")
		private List<HistoriesItem> histories;

		@SerializedName("CurUtteranceIdx")
		private Integer curUtteranceIdx;

		public List<HistoriesItem> getHistories() {
			return this.histories;
		}

		public void setHistories(List<HistoriesItem> histories) {
			this.histories = histories;
		}

		public Integer getCurUtteranceIdx() {
			return this.curUtteranceIdx;
		}

		public void setCurUtteranceIdx(Integer curUtteranceIdx) {
			this.curUtteranceIdx = curUtteranceIdx;
		}

		public static class HistoriesItem {

			@SerializedName("Robot")
			private String robot;

			@SerializedName("User")
			private String user;

			public String getRobot() {
				return this.robot;
			}

			public void setRobot(String robot) {
				this.robot = robot;
			}

			public String getUser() {
				return this.user;
			}

			public void setUser(String user) {
				this.user = user;
			}
		}
	}

	@Override
	public Class<DuplexDecisionResponse> getResponseClass() {
		return DuplexDecisionResponse.class;
	}

}
