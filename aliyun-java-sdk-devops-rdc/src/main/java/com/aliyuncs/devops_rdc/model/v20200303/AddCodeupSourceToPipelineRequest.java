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
public class AddCodeupSourceToPipelineRequest extends RpcAcsRequest<AddCodeupSourceToPipelineResponse> {
	   

	private String codePath;

	private String codeBranch;

	private String orgId;

	private Long pipelineId;
	public AddCodeupSourceToPipelineRequest() {
		super("devops-rdc", "2020-03-03", "AddCodeupSourceToPipeline");
		setMethod(MethodType.POST);
	}

	public String getCodePath() {
		return this.codePath;
	}

	public void setCodePath(String codePath) {
		this.codePath = codePath;
		if(codePath != null){
			putQueryParameter("CodePath", codePath);
		}
	}

	public String getCodeBranch() {
		return this.codeBranch;
	}

	public void setCodeBranch(String codeBranch) {
		this.codeBranch = codeBranch;
		if(codeBranch != null){
			putQueryParameter("CodeBranch", codeBranch);
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

	public Long getPipelineId() {
		return this.pipelineId;
	}

	public void setPipelineId(Long pipelineId) {
		this.pipelineId = pipelineId;
		if(pipelineId != null){
			putQueryParameter("PipelineId", pipelineId.toString());
		}
	}

	@Override
	public Class<AddCodeupSourceToPipelineResponse> getResponseClass() {
		return AddCodeupSourceToPipelineResponse.class;
	}

}
