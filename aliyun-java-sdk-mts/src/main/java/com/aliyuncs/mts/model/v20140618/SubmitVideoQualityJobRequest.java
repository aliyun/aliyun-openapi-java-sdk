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

package com.aliyuncs.mts.model.v20140618;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.mts.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class SubmitVideoQualityJobRequest extends RpcAcsRequest<SubmitVideoQualityJobResponse> {
	   

	private String jobParams;

	private Long userId;

	private String output;

	private String userData;

	private String notifyUrl;

	private String sourceType;

	private String modelId;

	private String pipelineId;

	private String input;

	private String scheduleParams;
	public SubmitVideoQualityJobRequest() {
		super("Mts", "2014-06-18", "SubmitVideoQualityJob", "mts");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getJobParams() {
		return this.jobParams;
	}

	public void setJobParams(String jobParams) {
		this.jobParams = jobParams;
		if(jobParams != null){
			putQueryParameter("JobParams", jobParams);
		}
	}

	public Long getUserId() {
		return this.userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
		if(userId != null){
			putQueryParameter("UserId", userId.toString());
		}
	}

	public String getOutput() {
		return this.output;
	}

	public void setOutput(String output) {
		this.output = output;
		if(output != null){
			putQueryParameter("Output", output);
		}
	}

	public String getUserData() {
		return this.userData;
	}

	public void setUserData(String userData) {
		this.userData = userData;
		if(userData != null){
			putQueryParameter("UserData", userData);
		}
	}

	public String getNotifyUrl() {
		return this.notifyUrl;
	}

	public void setNotifyUrl(String notifyUrl) {
		this.notifyUrl = notifyUrl;
		if(notifyUrl != null){
			putQueryParameter("NotifyUrl", notifyUrl);
		}
	}

	public String getSourceType() {
		return this.sourceType;
	}

	public void setSourceType(String sourceType) {
		this.sourceType = sourceType;
		if(sourceType != null){
			putQueryParameter("SourceType", sourceType);
		}
	}

	public String getModelId() {
		return this.modelId;
	}

	public void setModelId(String modelId) {
		this.modelId = modelId;
		if(modelId != null){
			putQueryParameter("ModelId", modelId);
		}
	}

	public String getPipelineId() {
		return this.pipelineId;
	}

	public void setPipelineId(String pipelineId) {
		this.pipelineId = pipelineId;
		if(pipelineId != null){
			putQueryParameter("PipelineId", pipelineId);
		}
	}

	public String getInput() {
		return this.input;
	}

	public void setInput(String input) {
		this.input = input;
		if(input != null){
			putQueryParameter("Input", input);
		}
	}

	public String getScheduleParams() {
		return this.scheduleParams;
	}

	public void setScheduleParams(String scheduleParams) {
		this.scheduleParams = scheduleParams;
		if(scheduleParams != null){
			putQueryParameter("ScheduleParams", scheduleParams);
		}
	}

	@Override
	public Class<SubmitVideoQualityJobResponse> getResponseClass() {
		return SubmitVideoQualityJobResponse.class;
	}

}
