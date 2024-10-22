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
public class SubmitEvaluationTaskRequest extends RpcAcsRequest<SubmitEvaluationTaskResponse> {
	   

	private String materialText;

	private String suggestedAnswer;

	private String outerBizId;

	private String type;

	private String audioUrl;

	private String text;

	private String callbackUrl;
	public SubmitEvaluationTaskRequest() {
		super("EduInterpreting", "2024-08-28", "SubmitEvaluationTask");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public String getMaterialText() {
		return this.materialText;
	}

	public void setMaterialText(String materialText) {
		this.materialText = materialText;
		if(materialText != null){
			putBodyParameter("MaterialText", materialText);
		}
	}

	public String getSuggestedAnswer() {
		return this.suggestedAnswer;
	}

	public void setSuggestedAnswer(String suggestedAnswer) {
		this.suggestedAnswer = suggestedAnswer;
		if(suggestedAnswer != null){
			putBodyParameter("SuggestedAnswer", suggestedAnswer);
		}
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

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
		if(type != null){
			putBodyParameter("Type", type);
		}
	}

	public String getAudioUrl() {
		return this.audioUrl;
	}

	public void setAudioUrl(String audioUrl) {
		this.audioUrl = audioUrl;
		if(audioUrl != null){
			putBodyParameter("AudioUrl", audioUrl);
		}
	}

	public String getText() {
		return this.text;
	}

	public void setText(String text) {
		this.text = text;
		if(text != null){
			putBodyParameter("Text", text);
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

	@Override
	public Class<SubmitEvaluationTaskResponse> getResponseClass() {
		return SubmitEvaluationTaskResponse.class;
	}

}
