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

package com.aliyuncs.quickbi_public.model.v20220101;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DataInterpretationRequest extends RpcAcsRequest<DataInterpretationResponse> {
	   

	private Boolean promptForceOverride;

	private String data;

	private String userQuestion;

	private String userPrompt;

	private String modelCode;
	public DataInterpretationRequest() {
		super("quickbi-public", "2022-01-01", "DataInterpretation", "2.2.0");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public Boolean getPromptForceOverride() {
		return this.promptForceOverride;
	}

	public void setPromptForceOverride(Boolean promptForceOverride) {
		this.promptForceOverride = promptForceOverride;
		if(promptForceOverride != null){
			putQueryParameter("PromptForceOverride", promptForceOverride.toString());
		}
	}

	public String getData() {
		return this.data;
	}

	public void setData(String data) {
		this.data = data;
		if(data != null){
			putQueryParameter("Data", data);
		}
	}

	public String getUserQuestion() {
		return this.userQuestion;
	}

	public void setUserQuestion(String userQuestion) {
		this.userQuestion = userQuestion;
		if(userQuestion != null){
			putQueryParameter("UserQuestion", userQuestion);
		}
	}

	public String getUserPrompt() {
		return this.userPrompt;
	}

	public void setUserPrompt(String userPrompt) {
		this.userPrompt = userPrompt;
		if(userPrompt != null){
			putQueryParameter("UserPrompt", userPrompt);
		}
	}

	public String getModelCode() {
		return this.modelCode;
	}

	public void setModelCode(String modelCode) {
		this.modelCode = modelCode;
		if(modelCode != null){
			putQueryParameter("ModelCode", modelCode);
		}
	}

	@Override
	public Class<DataInterpretationResponse> getResponseClass() {
		return DataInterpretationResponse.class;
	}

}
