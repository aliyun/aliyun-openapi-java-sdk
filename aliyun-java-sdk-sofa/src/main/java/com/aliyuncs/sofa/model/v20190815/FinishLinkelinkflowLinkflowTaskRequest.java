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
public class FinishLinkelinkflowLinkflowTaskRequest extends RpcAcsRequest<FinishLinkelinkflowLinkflowTaskResponse> {
	   

	private String formDefinitionId;

	private String outcome;

	private String taskId;

	private String variables;

	private String comment;

	private String operatorId;
	public FinishLinkelinkflowLinkflowTaskRequest() {
		super("SOFA", "2019-08-15", "FinishLinkelinkflowLinkflowTask", "sofa");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getFormDefinitionId() {
		return this.formDefinitionId;
	}

	public void setFormDefinitionId(String formDefinitionId) {
		this.formDefinitionId = formDefinitionId;
		if(formDefinitionId != null){
			putBodyParameter("FormDefinitionId", formDefinitionId);
		}
	}

	public String getOutcome() {
		return this.outcome;
	}

	public void setOutcome(String outcome) {
		this.outcome = outcome;
		if(outcome != null){
			putBodyParameter("Outcome", outcome);
		}
	}

	public String getTaskId() {
		return this.taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
		if(taskId != null){
			putBodyParameter("TaskId", taskId);
		}
	}

	public String getVariables() {
		return this.variables;
	}

	public void setVariables(String variables) {
		this.variables = variables;
		if(variables != null){
			putBodyParameter("Variables", variables);
		}
	}

	public String getComment() {
		return this.comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
		if(comment != null){
			putBodyParameter("Comment", comment);
		}
	}

	public String getOperatorId() {
		return this.operatorId;
	}

	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
		if(operatorId != null){
			putBodyParameter("OperatorId", operatorId);
		}
	}

	@Override
	public Class<FinishLinkelinkflowLinkflowTaskResponse> getResponseClass() {
		return FinishLinkelinkflowLinkflowTaskResponse.class;
	}

}
