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

package com.aliyuncs.foas.model.v20181111;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.foas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GetRawPlanJsonRequest extends RoaAcsRequest<GetRawPlanJsonResponse> {
	   

	private String projectName;

	private Float expectedGB;

	private Float expectedCore;

	private String jobName;

	private Boolean autoconfEnable;
	public GetRawPlanJsonRequest() {
		super("foas", "2018-11-11", "GetRawPlanJson", "foas");
		setProtocol(ProtocolType.HTTPS);
		setUriPattern("/api/v2/projects/[projectName]/jobs/[jobName]/planjson");
		setMethod(MethodType.GET);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getProjectName() {
		return this.projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
		if(projectName != null){
			putPathParameter("projectName", projectName);
		}
	}

	public Float getExpectedGB() {
		return this.expectedGB;
	}

	public void setExpectedGB(Float expectedGB) {
		this.expectedGB = expectedGB;
		if(expectedGB != null){
			putQueryParameter("expectedGB", expectedGB.toString());
		}
	}

	public Float getExpectedCore() {
		return this.expectedCore;
	}

	public void setExpectedCore(Float expectedCore) {
		this.expectedCore = expectedCore;
		if(expectedCore != null){
			putQueryParameter("expectedCore", expectedCore.toString());
		}
	}

	public String getJobName() {
		return this.jobName;
	}

	public void setJobName(String jobName) {
		this.jobName = jobName;
		if(jobName != null){
			putPathParameter("jobName", jobName);
		}
	}

	public Boolean getAutoconfEnable() {
		return this.autoconfEnable;
	}

	public void setAutoconfEnable(Boolean autoconfEnable) {
		this.autoconfEnable = autoconfEnable;
		if(autoconfEnable != null){
			putQueryParameter("autoconfEnable", autoconfEnable.toString());
		}
	}

	@Override
	public Class<GetRawPlanJsonResponse> getResponseClass() {
		return GetRawPlanJsonResponse.class;
	}

}
