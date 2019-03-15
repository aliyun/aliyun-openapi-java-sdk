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
public class CreateJobRequest extends RoaAcsRequest<CreateJobResponse> {
	
	public CreateJobRequest() {
		super("Cds", "2017-09-25", "CreateJob", "cds");
		setUriPattern("/v1/job/create");
		setMethod(MethodType.POST);
	}

	private String jsonContent;

	private String jobName;

	private String deployType;

	public String getJsonContent() {
		return this.jsonContent;
	}

	public void setJsonContent(String jsonContent) {
		this.jsonContent = jsonContent;
		if(jsonContent != null){
			putQueryParameter("JsonContent", jsonContent);
		}
	}

	public String getJobName() {
		return this.jobName;
	}

	public void setJobName(String jobName) {
		this.jobName = jobName;
		if(jobName != null){
			putQueryParameter("JobName", jobName);
		}
	}

	public String getDeployType() {
		return this.deployType;
	}

	public void setDeployType(String deployType) {
		this.deployType = deployType;
		if(deployType != null){
			putQueryParameter("DeployType", deployType);
		}
	}

	@Override
	public Class<CreateJobResponse> getResponseClass() {
		return CreateJobResponse.class;
	}

}
