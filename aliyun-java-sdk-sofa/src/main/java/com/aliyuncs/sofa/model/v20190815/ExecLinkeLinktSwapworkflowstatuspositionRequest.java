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
public class ExecLinkeLinktSwapworkflowstatuspositionRequest extends RpcAcsRequest<ExecLinkeLinktSwapworkflowstatuspositionResponse> {
	   

	private String workflowStatusId1;

	private String workflowStatusId2;
	public ExecLinkeLinktSwapworkflowstatuspositionRequest() {
		super("SOFA", "2019-08-15", "ExecLinkeLinktSwapworkflowstatusposition", "sofacafedeps");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getWorkflowStatusId1() {
		return this.workflowStatusId1;
	}

	public void setWorkflowStatusId1(String workflowStatusId1) {
		this.workflowStatusId1 = workflowStatusId1;
		if(workflowStatusId1 != null){
			putBodyParameter("WorkflowStatusId1", workflowStatusId1);
		}
	}

	public String getWorkflowStatusId2() {
		return this.workflowStatusId2;
	}

	public void setWorkflowStatusId2(String workflowStatusId2) {
		this.workflowStatusId2 = workflowStatusId2;
		if(workflowStatusId2 != null){
			putBodyParameter("WorkflowStatusId2", workflowStatusId2);
		}
	}

	@Override
	public Class<ExecLinkeLinktSwapworkflowstatuspositionResponse> getResponseClass() {
		return ExecLinkeLinktSwapworkflowstatuspositionResponse.class;
	}

}
