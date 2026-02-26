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

package com.aliyuncs.dataworks_public.model.v20200518;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dataworks_public.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class SaveDataServiceApiTestResultRequest extends RpcAcsRequest<SaveDataServiceApiTestResultResponse> {
	   

	private String failResultSample;

	private String resultSample;

	private Boolean autoGenerate;

	private Long projectId;

	private Long apiId;
	public SaveDataServiceApiTestResultRequest() {
		super("dataworks-public", "2020-05-18", "SaveDataServiceApiTestResult");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getFailResultSample() {
		return this.failResultSample;
	}

	public void setFailResultSample(String failResultSample) {
		this.failResultSample = failResultSample;
		if(failResultSample != null){
			putBodyParameter("FailResultSample", failResultSample);
		}
	}

	public String getResultSample() {
		return this.resultSample;
	}

	public void setResultSample(String resultSample) {
		this.resultSample = resultSample;
		if(resultSample != null){
			putBodyParameter("ResultSample", resultSample);
		}
	}

	public Boolean getAutoGenerate() {
		return this.autoGenerate;
	}

	public void setAutoGenerate(Boolean autoGenerate) {
		this.autoGenerate = autoGenerate;
		if(autoGenerate != null){
			putBodyParameter("AutoGenerate", autoGenerate.toString());
		}
	}

	public Long getProjectId() {
		return this.projectId;
	}

	public void setProjectId(Long projectId) {
		this.projectId = projectId;
		if(projectId != null){
			putBodyParameter("ProjectId", projectId.toString());
		}
	}

	public Long getApiId() {
		return this.apiId;
	}

	public void setApiId(Long apiId) {
		this.apiId = apiId;
		if(apiId != null){
			putBodyParameter("ApiId", apiId.toString());
		}
	}

	@Override
	public Class<SaveDataServiceApiTestResultResponse> getResponseClass() {
		return SaveDataServiceApiTestResultResponse.class;
	}

}
