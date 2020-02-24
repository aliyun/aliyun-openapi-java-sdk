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

package com.aliyuncs.outboundbot.model.v20191226;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.outboundbot.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyGlobalQuestionRequest extends RpcAcsRequest<ModifyGlobalQuestionResponse> {
	   

	private String globalQuestionId;

	private String globalQuestionName;

	private String questions;

	private String answers;

	private String scriptId;

	private String instanceId;

	private String globalQuestionType;
	public ModifyGlobalQuestionRequest() {
		super("OutboundBot", "2019-12-26", "ModifyGlobalQuestion", "outboundbot");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getGlobalQuestionId() {
		return this.globalQuestionId;
	}

	public void setGlobalQuestionId(String globalQuestionId) {
		this.globalQuestionId = globalQuestionId;
		if(globalQuestionId != null){
			putQueryParameter("GlobalQuestionId", globalQuestionId);
		}
	}

	public String getGlobalQuestionName() {
		return this.globalQuestionName;
	}

	public void setGlobalQuestionName(String globalQuestionName) {
		this.globalQuestionName = globalQuestionName;
		if(globalQuestionName != null){
			putQueryParameter("GlobalQuestionName", globalQuestionName);
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

	public String getAnswers() {
		return this.answers;
	}

	public void setAnswers(String answers) {
		this.answers = answers;
		if(answers != null){
			putQueryParameter("Answers", answers);
		}
	}

	public String getScriptId() {
		return this.scriptId;
	}

	public void setScriptId(String scriptId) {
		this.scriptId = scriptId;
		if(scriptId != null){
			putQueryParameter("ScriptId", scriptId);
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	public String getGlobalQuestionType() {
		return this.globalQuestionType;
	}

	public void setGlobalQuestionType(String globalQuestionType) {
		this.globalQuestionType = globalQuestionType;
		if(globalQuestionType != null){
			putQueryParameter("GlobalQuestionType", globalQuestionType);
		}
	}

	@Override
	public Class<ModifyGlobalQuestionResponse> getResponseClass() {
		return ModifyGlobalQuestionResponse.class;
	}

}
