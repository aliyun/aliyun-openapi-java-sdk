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

package com.aliyuncs.ccc.model.v20200701;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ccc.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class LaunchSurveyRequest extends RpcAcsRequest<LaunchSurveyResponse> {
	   

	private String contactFlowId;

	private String surveyTemplateVariables;

	private String contactFlowVariables;

	private String userId;

	private String deviceId;

	private String surveyTemplateId;

	private String jobId;

	private String instanceId;

	private String smsMetadataId;

	private String surveyChannel;
	public LaunchSurveyRequest() {
		super("CCC", "2020-07-01", "LaunchSurvey", "CCC");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getContactFlowId() {
		return this.contactFlowId;
	}

	public void setContactFlowId(String contactFlowId) {
		this.contactFlowId = contactFlowId;
		if(contactFlowId != null){
			putQueryParameter("ContactFlowId", contactFlowId);
		}
	}

	public String getSurveyTemplateVariables() {
		return this.surveyTemplateVariables;
	}

	public void setSurveyTemplateVariables(String surveyTemplateVariables) {
		this.surveyTemplateVariables = surveyTemplateVariables;
		if(surveyTemplateVariables != null){
			putQueryParameter("SurveyTemplateVariables", surveyTemplateVariables);
		}
	}

	public String getContactFlowVariables() {
		return this.contactFlowVariables;
	}

	public void setContactFlowVariables(String contactFlowVariables) {
		this.contactFlowVariables = contactFlowVariables;
		if(contactFlowVariables != null){
			putQueryParameter("ContactFlowVariables", contactFlowVariables);
		}
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
		if(userId != null){
			putQueryParameter("UserId", userId);
		}
	}

	public String getDeviceId() {
		return this.deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
		if(deviceId != null){
			putQueryParameter("DeviceId", deviceId);
		}
	}

	public String getSurveyTemplateId() {
		return this.surveyTemplateId;
	}

	public void setSurveyTemplateId(String surveyTemplateId) {
		this.surveyTemplateId = surveyTemplateId;
		if(surveyTemplateId != null){
			putQueryParameter("SurveyTemplateId", surveyTemplateId);
		}
	}

	public String getJobId() {
		return this.jobId;
	}

	public void setJobId(String jobId) {
		this.jobId = jobId;
		if(jobId != null){
			putQueryParameter("JobId", jobId);
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

	public String getSmsMetadataId() {
		return this.smsMetadataId;
	}

	public void setSmsMetadataId(String smsMetadataId) {
		this.smsMetadataId = smsMetadataId;
		if(smsMetadataId != null){
			putQueryParameter("SmsMetadataId", smsMetadataId);
		}
	}

	public String getSurveyChannel() {
		return this.surveyChannel;
	}

	public void setSurveyChannel(String surveyChannel) {
		this.surveyChannel = surveyChannel;
		if(surveyChannel != null){
			putQueryParameter("SurveyChannel", surveyChannel);
		}
	}

	@Override
	public Class<LaunchSurveyResponse> getResponseClass() {
		return LaunchSurveyResponse.class;
	}

}
