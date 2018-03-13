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
package com.aliyuncs.cds.model.v20170925;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class StopBuildRequest extends RoaAcsRequest<StopBuildResponse> {
	
	public StopBuildRequest() {
		super("Cds", "2017-09-25", "StopBuild");
		setUriPattern("/v1/job/[JobName]/build/[BuildNumber]/stop");
		setMethod(MethodType.POST);
	}

	private Integer buildNumber;

	private String jobName;

	public Integer getBuildNumber() {
		return this.buildNumber;
	}

	public void setBuildNumber(Integer buildNumber) {
		this.buildNumber = buildNumber;
		if(buildNumber != null){
			putPathParameter("BuildNumber", buildNumber.toString());
		}
	}

	public String getJobName() {
		return this.jobName;
	}

	public void setJobName(String jobName) {
		this.jobName = jobName;
		if(jobName != null){
			putPathParameter("JobName", jobName);
		}
	}

	@Override
	public Class<StopBuildResponse> getResponseClass() {
		return StopBuildResponse.class;
	}

}
