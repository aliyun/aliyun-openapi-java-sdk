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

package com.aliyuncs.gts_smart_call.model.v20201021;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class InteractVoiceCallBackRequest extends RpcAcsRequest<InteractVoiceCallBackResponse> {
	   

	private String callId;

	private Long currentTime;

	private String secretKey;

	private String content;

	private String contentType;
	public InteractVoiceCallBackRequest() {
		super("gts-smart-call", "2020-10-21", "InteractVoiceCallBack");
		setMethod(MethodType.POST);
	}

	public String getCallId() {
		return this.callId;
	}

	public void setCallId(String callId) {
		this.callId = callId;
		if(callId != null){
			putBodyParameter("CallId", callId);
		}
	}

	public Long getCurrentTime() {
		return this.currentTime;
	}

	public void setCurrentTime(Long currentTime) {
		this.currentTime = currentTime;
		if(currentTime != null){
			putBodyParameter("CurrentTime", currentTime.toString());
		}
	}

	public String getSecretKey() {
		return this.secretKey;
	}

	public void setSecretKey(String secretKey) {
		this.secretKey = secretKey;
		if(secretKey != null){
			putBodyParameter("SecretKey", secretKey);
		}
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
		if(content != null){
			putBodyParameter("Content", content);
		}
	}

	public String getContentType() {
		return this.contentType;
	}

	public void setContentType(String contentType) {
		this.contentType = contentType;
		if(contentType != null){
			putBodyParameter("ContentType", contentType);
		}
	}

	@Override
	public Class<InteractVoiceCallBackResponse> getResponseClass() {
		return InteractVoiceCallBackResponse.class;
	}

}
