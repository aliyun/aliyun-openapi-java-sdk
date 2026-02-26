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

package com.aliyuncs.devops.model.v20210625;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class PassPipelineValidateRequest extends RoaAcsRequest<PassPipelineValidateResponse> {
	   

	private Long pipelineId;

	private String organizationId;

	private Long pipelineRunId;

	private String jobId;
	public PassPipelineValidateRequest() {
		super("devops", "2021-06-25", "PassPipelineValidate");
		setUriPattern("/organization/[organizationId]/pipelines/[pipelineId]/pipelineRuns/[pipelineRunId]/jobs/[jobId]/pass");
		setMethod(MethodType.POST);
	}

	public Long getPipelineId() {
		return this.pipelineId;
	}

	public void setPipelineId(Long pipelineId) {
		this.pipelineId = pipelineId;
		if(pipelineId != null){
			putPathParameter("pipelineId", pipelineId.toString());
		}
	}

	public String getOrganizationId() {
		return this.organizationId;
	}

	public void setOrganizationId(String organizationId) {
		this.organizationId = organizationId;
		if(organizationId != null){
			putPathParameter("organizationId", organizationId);
		}
	}

	public Long getPipelineRunId() {
		return this.pipelineRunId;
	}

	public void setPipelineRunId(Long pipelineRunId) {
		this.pipelineRunId = pipelineRunId;
		if(pipelineRunId != null){
			putPathParameter("pipelineRunId", pipelineRunId.toString());
		}
	}

	public String getJobId() {
		return this.jobId;
	}

	public void setJobId(String jobId) {
		this.jobId = jobId;
		if(jobId != null){
			putPathParameter("jobId", jobId);
		}
	}

	@Override
	public Class<PassPipelineValidateResponse> getResponseClass() {
		return PassPipelineValidateResponse.class;
	}

}
