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
public class CommitJobRequest extends RoaAcsRequest<CommitJobResponse> {
	   

	private String projectName;

	private Float maxCU;

	private String configure;

	private Boolean isOnOff;

	private String jobName;
	public CommitJobRequest() {
		super("foas", "2018-11-11", "CommitJob", "foas");
		setProtocol(ProtocolType.HTTPS);
		setUriPattern("/api/v2/projects/[projectName]/jobs/[jobName]/commit");
		setMethod(MethodType.PUT);
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

	public Float getMaxCU() {
		return this.maxCU;
	}

	public void setMaxCU(Float maxCU) {
		this.maxCU = maxCU;
		if(maxCU != null){
			putBodyParameter("maxCU", maxCU.toString());
		}
	}

	public String getConfigure() {
		return this.configure;
	}

	public void setConfigure(String configure) {
		this.configure = configure;
		if(configure != null){
			putBodyParameter("configure", configure);
		}
	}

	public Boolean getIsOnOff() {
		return this.isOnOff;
	}

	public void setIsOnOff(Boolean isOnOff) {
		this.isOnOff = isOnOff;
		if(isOnOff != null){
			putBodyParameter("isOnOff", isOnOff.toString());
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

	@Override
	public Class<CommitJobResponse> getResponseClass() {
		return CommitJobResponse.class;
	}

}
