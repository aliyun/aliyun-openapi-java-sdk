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
import java.util.Map;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class SendCommandRequest extends RpcAcsRequest<SendCommandResponse> {
	   

	private Boolean feedback;

	private String code;

	private String uniqueCode;

	private Long tenantId;

	private String sessionId;

	@SerializedName("content")
	private Map<String,String> content;
	public SendCommandRequest() {
		super("avatar", "2022-01-30", "SendCommand");
		setMethod(MethodType.POST);
	}

	public Boolean getFeedback() {
		return this.feedback;
	}

	public void setFeedback(Boolean feedback) {
		this.feedback = feedback;
		if(feedback != null){
			putQueryParameter("Feedback", feedback.toString());
		}
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
		if(code != null){
			putQueryParameter("Code", code);
		}
	}

	public String getUniqueCode() {
		return this.uniqueCode;
	}

	public void setUniqueCode(String uniqueCode) {
		this.uniqueCode = uniqueCode;
		if(uniqueCode != null){
			putQueryParameter("UniqueCode", uniqueCode);
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

	public String getSessionId() {
		return this.sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
		if(sessionId != null){
			putQueryParameter("SessionId", sessionId);
		}
	}

	public Map<String,String> getContent() {
		return this.content;
	}

	public void setContent(Map<String,String> content) {
		this.content = content;	
		if (content != null) {
			putQueryParameter("Content" , new Gson().toJson(content));
		}	
	}

	@Override
	public Class<SendCommandResponse> getResponseClass() {
		return SendCommandResponse.class;
	}

}
