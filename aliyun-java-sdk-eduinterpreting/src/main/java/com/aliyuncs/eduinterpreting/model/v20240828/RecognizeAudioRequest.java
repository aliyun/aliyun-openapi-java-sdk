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

package com.aliyuncs.eduinterpreting.model.v20240828;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class RecognizeAudioRequest extends RpcAcsRequest<RecognizeAudioResponse> {
	   

	private String outerBizId;

	private Boolean enableCallBack;

	private String callbackUrl;

	private String audioFileUrl;
	public RecognizeAudioRequest() {
		super("EduInterpreting", "2024-08-28", "RecognizeAudio");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public String getOuterBizId() {
		return this.outerBizId;
	}

	public void setOuterBizId(String outerBizId) {
		this.outerBizId = outerBizId;
		if(outerBizId != null){
			putBodyParameter("OuterBizId", outerBizId);
		}
	}

	public Boolean getEnableCallBack() {
		return this.enableCallBack;
	}

	public void setEnableCallBack(Boolean enableCallBack) {
		this.enableCallBack = enableCallBack;
		if(enableCallBack != null){
			putQueryParameter("EnableCallBack", enableCallBack.toString());
		}
	}

	public String getCallbackUrl() {
		return this.callbackUrl;
	}

	public void setCallbackUrl(String callbackUrl) {
		this.callbackUrl = callbackUrl;
		if(callbackUrl != null){
			putBodyParameter("CallbackUrl", callbackUrl);
		}
	}

	public String getAudioFileUrl() {
		return this.audioFileUrl;
	}

	public void setAudioFileUrl(String audioFileUrl) {
		this.audioFileUrl = audioFileUrl;
		if(audioFileUrl != null){
			putBodyParameter("AudioFileUrl", audioFileUrl);
		}
	}

	@Override
	public Class<RecognizeAudioResponse> getResponseClass() {
		return RecognizeAudioResponse.class;
	}

}
