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

package com.aliyuncs.cloudcallcenter.model.v20170705;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class ModifySurveyRequest extends RpcAcsRequest<ModifySurveyResponse> {
	
	public ModifySurveyRequest() {
		super("CloudCallCenter", "2017-07-05", "ModifySurvey", "CloudCallCenter", "innerAPI");
	}

	private String surveyId;

	private String role;

	private String flowJsonOssKey;

	private String description;

	private String speechOptimizationParam;

	private String instanceId;

	private Integer round;

	private String flowJson;

	private String name;

	private String globalQuestions;

	private String corpora;

	private String beebotId;

	private String scenarioId;

	private String flowId;

	public String getSurveyId() {
		return this.surveyId;
	}

	public void setSurveyId(String surveyId) {
		this.surveyId = surveyId;
		if(surveyId != null){
			putQueryParameter("SurveyId", surveyId);
		}
	}

	public String getRole() {
		return this.role;
	}

	public void setRole(String role) {
		this.role = role;
		if(role != null){
			putQueryParameter("Role", role);
		}
	}

	public String getFlowJsonOssKey() {
		return this.flowJsonOssKey;
	}

	public void setFlowJsonOssKey(String flowJsonOssKey) {
		this.flowJsonOssKey = flowJsonOssKey;
		if(flowJsonOssKey != null){
			putQueryParameter("FlowJsonOssKey", flowJsonOssKey);
		}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
		}
	}

	public String getSpeechOptimizationParam() {
		return this.speechOptimizationParam;
	}

	public void setSpeechOptimizationParam(String speechOptimizationParam) {
		this.speechOptimizationParam = speechOptimizationParam;
		if(speechOptimizationParam != null){
			putQueryParameter("SpeechOptimizationParam", speechOptimizationParam);
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

	public Integer getRound() {
		return this.round;
	}

	public void setRound(Integer round) {
		this.round = round;
		if(round != null){
			putQueryParameter("Round", round.toString());
		}
	}

	public String getFlowJson() {
		return this.flowJson;
	}

	public void setFlowJson(String flowJson) {
		this.flowJson = flowJson;
		if(flowJson != null){
			putQueryParameter("FlowJson", flowJson);
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
		}
	}

	public String getGlobalQuestions() {
		return this.globalQuestions;
	}

	public void setGlobalQuestions(String globalQuestions) {
		this.globalQuestions = globalQuestions;
		if(globalQuestions != null){
			putQueryParameter("GlobalQuestions", globalQuestions);
		}
	}

	public String getCorpora() {
		return this.corpora;
	}

	public void setCorpora(String corpora) {
		this.corpora = corpora;
		if(corpora != null){
			putQueryParameter("Corpora", corpora);
		}
	}

	public String getBeebotId() {
		return this.beebotId;
	}

	public void setBeebotId(String beebotId) {
		this.beebotId = beebotId;
		if(beebotId != null){
			putQueryParameter("BeebotId", beebotId);
		}
	}

	public String getScenarioId() {
		return this.scenarioId;
	}

	public void setScenarioId(String scenarioId) {
		this.scenarioId = scenarioId;
		if(scenarioId != null){
			putQueryParameter("ScenarioId", scenarioId);
		}
	}

	public String getFlowId() {
		return this.flowId;
	}

	public void setFlowId(String flowId) {
		this.flowId = flowId;
		if(flowId != null){
			putQueryParameter("FlowId", flowId);
		}
	}

	@Override
	public Class<ModifySurveyResponse> getResponseClass() {
		return ModifySurveyResponse.class;
	}

}
