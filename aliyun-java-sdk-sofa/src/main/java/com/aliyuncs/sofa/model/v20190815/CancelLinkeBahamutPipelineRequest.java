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

package com.aliyuncs.sofa.model.v20190815;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sofa.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CancelLinkeBahamutPipelineRequest extends RpcAcsRequest<CancelLinkeBahamutPipelineResponse> {
	   

	private String pipelineGroupId;

	private Long executionId;

	private String tenantId;

	private String pipelineGroupType;

	private Boolean skipGetLatestContext;

	private String iterationId;

	private String iterationUnitId;

	private String stageId;
	public CancelLinkeBahamutPipelineRequest() {
		super("SOFA", "2019-08-15", "CancelLinkeBahamutPipeline", "ApplySidecarCert");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getPipelineGroupId() {
		return this.pipelineGroupId;
	}

	public void setPipelineGroupId(String pipelineGroupId) {
		this.pipelineGroupId = pipelineGroupId;
		if(pipelineGroupId != null){
			putBodyParameter("PipelineGroupId", pipelineGroupId);
		}
	}

	public Long getExecutionId() {
		return this.executionId;
	}

	public void setExecutionId(Long executionId) {
		this.executionId = executionId;
		if(executionId != null){
			putBodyParameter("ExecutionId", executionId.toString());
		}
	}

	public String getTenantId() {
		return this.tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
		if(tenantId != null){
			putBodyParameter("TenantId", tenantId);
		}
	}

	public String getPipelineGroupType() {
		return this.pipelineGroupType;
	}

	public void setPipelineGroupType(String pipelineGroupType) {
		this.pipelineGroupType = pipelineGroupType;
		if(pipelineGroupType != null){
			putBodyParameter("PipelineGroupType", pipelineGroupType);
		}
	}

	public Boolean getSkipGetLatestContext() {
		return this.skipGetLatestContext;
	}

	public void setSkipGetLatestContext(Boolean skipGetLatestContext) {
		this.skipGetLatestContext = skipGetLatestContext;
		if(skipGetLatestContext != null){
			putBodyParameter("SkipGetLatestContext", skipGetLatestContext.toString());
		}
	}

	public String getIterationId() {
		return this.iterationId;
	}

	public void setIterationId(String iterationId) {
		this.iterationId = iterationId;
		if(iterationId != null){
			putBodyParameter("IterationId", iterationId);
		}
	}

	public String getIterationUnitId() {
		return this.iterationUnitId;
	}

	public void setIterationUnitId(String iterationUnitId) {
		this.iterationUnitId = iterationUnitId;
		if(iterationUnitId != null){
			putBodyParameter("IterationUnitId", iterationUnitId);
		}
	}

	public String getStageId() {
		return this.stageId;
	}

	public void setStageId(String stageId) {
		this.stageId = stageId;
		if(stageId != null){
			putBodyParameter("StageId", stageId);
		}
	}

	@Override
	public Class<CancelLinkeBahamutPipelineResponse> getResponseClass() {
		return CancelLinkeBahamutPipelineResponse.class;
	}

}
