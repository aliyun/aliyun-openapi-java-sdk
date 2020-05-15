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
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sofa.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class RetryLinkeBahamutComponentRequest extends RpcAcsRequest<RetryLinkeBahamutComponentResponse> {
	   

	private String componentExecutionId;

	private List<String> reRunTestCaseClassesRepeatLists;

	private Long pipelineInstanceId;

	private Long pipelineExecutionId;

	private Long jobExecutionId;

	private String iterationUnitId;

	private String stageId;
	public RetryLinkeBahamutComponentRequest() {
		super("SOFA", "2019-08-15", "RetryLinkeBahamutComponent", "ApplySidecarCert");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getComponentExecutionId() {
		return this.componentExecutionId;
	}

	public void setComponentExecutionId(String componentExecutionId) {
		this.componentExecutionId = componentExecutionId;
		if(componentExecutionId != null){
			putBodyParameter("ComponentExecutionId", componentExecutionId);
		}
	}

	public List<String> getReRunTestCaseClassesRepeatLists() {
		return this.reRunTestCaseClassesRepeatLists;
	}

	public void setReRunTestCaseClassesRepeatLists(List<String> reRunTestCaseClassesRepeatLists) {
		this.reRunTestCaseClassesRepeatLists = reRunTestCaseClassesRepeatLists;	
		if (reRunTestCaseClassesRepeatLists != null) {
			for (int i = 0; i < reRunTestCaseClassesRepeatLists.size(); i++) {
				putBodyParameter("ReRunTestCaseClassesRepeatList." + (i + 1) , reRunTestCaseClassesRepeatLists.get(i));
			}
		}	
	}

	public Long getPipelineInstanceId() {
		return this.pipelineInstanceId;
	}

	public void setPipelineInstanceId(Long pipelineInstanceId) {
		this.pipelineInstanceId = pipelineInstanceId;
		if(pipelineInstanceId != null){
			putBodyParameter("PipelineInstanceId", pipelineInstanceId.toString());
		}
	}

	public Long getPipelineExecutionId() {
		return this.pipelineExecutionId;
	}

	public void setPipelineExecutionId(Long pipelineExecutionId) {
		this.pipelineExecutionId = pipelineExecutionId;
		if(pipelineExecutionId != null){
			putBodyParameter("PipelineExecutionId", pipelineExecutionId.toString());
		}
	}

	public Long getJobExecutionId() {
		return this.jobExecutionId;
	}

	public void setJobExecutionId(Long jobExecutionId) {
		this.jobExecutionId = jobExecutionId;
		if(jobExecutionId != null){
			putBodyParameter("JobExecutionId", jobExecutionId.toString());
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
	public Class<RetryLinkeBahamutComponentResponse> getResponseClass() {
		return RetryLinkeBahamutComponentResponse.class;
	}

}
