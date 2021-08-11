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

package com.aliyuncs.devops_rdc.model.v20200303;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CreatePipelineFromTemplateRequest extends RpcAcsRequest<CreatePipelineFromTemplateResponse> {
	   

	private String pipelineName;

	private String orgId;

	private Long pipelineTemplateId;
	public CreatePipelineFromTemplateRequest() {
		super("devops-rdc", "2020-03-03", "CreatePipelineFromTemplate");
		setMethod(MethodType.POST);
	}

	public String getPipelineName() {
		return this.pipelineName;
	}

	public void setPipelineName(String pipelineName) {
		this.pipelineName = pipelineName;
		if(pipelineName != null){
			putQueryParameter("PipelineName", pipelineName);
		}
	}

	public String getOrgId() {
		return this.orgId;
	}

	public void setOrgId(String orgId) {
		this.orgId = orgId;
		if(orgId != null){
			putQueryParameter("OrgId", orgId);
		}
	}

	public Long getPipelineTemplateId() {
		return this.pipelineTemplateId;
	}

	public void setPipelineTemplateId(Long pipelineTemplateId) {
		this.pipelineTemplateId = pipelineTemplateId;
		if(pipelineTemplateId != null){
			putQueryParameter("PipelineTemplateId", pipelineTemplateId.toString());
		}
	}

	@Override
	public Class<CreatePipelineFromTemplateResponse> getResponseClass() {
		return CreatePipelineFromTemplateResponse.class;
	}

}
