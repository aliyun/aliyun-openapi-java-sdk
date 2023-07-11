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
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class SendTextRequest extends RpcAcsRequest<SendTextResponse> {
	   

	private Boolean feedback;

	private String uniqueCode;

	@SerializedName("streamExtension")
	private StreamExtension streamExtension;

	private Long tenantId;

	private Boolean interrupt;

	private String sessionId;

	private String text;
	public SendTextRequest() {
		super("avatar", "2022-01-30", "SendText");
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

	public String getUniqueCode() {
		return this.uniqueCode;
	}

	public void setUniqueCode(String uniqueCode) {
		this.uniqueCode = uniqueCode;
		if(uniqueCode != null){
			putQueryParameter("UniqueCode", uniqueCode);
		}
	}

	public StreamExtension getStreamExtension() {
		return this.streamExtension;
	}

	public void setStreamExtension(StreamExtension streamExtension) {
		this.streamExtension = streamExtension;	
		if (streamExtension != null) {
			putQueryParameter("StreamExtension" , new Gson().toJson(streamExtension));
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

	public Boolean getInterrupt() {
		return this.interrupt;
	}

	public void setInterrupt(Boolean interrupt) {
		this.interrupt = interrupt;
		if(interrupt != null){
			putQueryParameter("Interrupt", interrupt.toString());
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

	public String getText() {
		return this.text;
	}

	public void setText(String text) {
		this.text = text;
		if(text != null){
			putQueryParameter("Text", text);
		}
	}

	public static class StreamExtension {

		@SerializedName("IsStream")
		private Boolean isStream;

		@SerializedName("Index")
		private Integer index;

		@SerializedName("Position")
		private String position;

		public Boolean getIsStream() {
			return this.isStream;
		}

		public void setIsStream(Boolean isStream) {
			this.isStream = isStream;
		}

		public Integer getIndex() {
			return this.index;
		}

		public void setIndex(Integer index) {
			this.index = index;
		}

		public String getPosition() {
			return this.position;
		}

		public void setPosition(String position) {
			this.position = position;
		}
	}

	@Override
	public Class<SendTextResponse> getResponseClass() {
		return SendTextResponse.class;
	}

}
