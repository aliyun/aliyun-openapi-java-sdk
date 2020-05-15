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

package com.aliyuncs.iovcc.model.v20180501;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.iovcc.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class SubmitAssistReportRequest extends RpcAcsRequest<SubmitAssistReportResponse> {
	   

	private String assistDescription;

	private String projectId;

	private String deviceModel;

	private String assistResult;

	private String assistTag;

	private String assistReason;

	private String assistId;
	public SubmitAssistReportRequest() {
		super("iovcc", "2018-05-01", "SubmitAssistReport", "iovcc");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getAssistDescription() {
		return this.assistDescription;
	}

	public void setAssistDescription(String assistDescription) {
		this.assistDescription = assistDescription;
		if(assistDescription != null){
			putBodyParameter("AssistDescription", assistDescription);
		}
	}

	public String getProjectId() {
		return this.projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
		if(projectId != null){
			putBodyParameter("ProjectId", projectId);
		}
	}

	public String getDeviceModel() {
		return this.deviceModel;
	}

	public void setDeviceModel(String deviceModel) {
		this.deviceModel = deviceModel;
		if(deviceModel != null){
			putBodyParameter("DeviceModel", deviceModel);
		}
	}

	public String getAssistResult() {
		return this.assistResult;
	}

	public void setAssistResult(String assistResult) {
		this.assistResult = assistResult;
		if(assistResult != null){
			putBodyParameter("AssistResult", assistResult);
		}
	}

	public String getAssistTag() {
		return this.assistTag;
	}

	public void setAssistTag(String assistTag) {
		this.assistTag = assistTag;
		if(assistTag != null){
			putBodyParameter("AssistTag", assistTag);
		}
	}

	public String getAssistReason() {
		return this.assistReason;
	}

	public void setAssistReason(String assistReason) {
		this.assistReason = assistReason;
		if(assistReason != null){
			putBodyParameter("AssistReason", assistReason);
		}
	}

	public String getAssistId() {
		return this.assistId;
	}

	public void setAssistId(String assistId) {
		this.assistId = assistId;
		if(assistId != null){
			putBodyParameter("AssistId", assistId);
		}
	}

	@Override
	public Class<SubmitAssistReportResponse> getResponseClass() {
		return SubmitAssistReportResponse.class;
	}

}
