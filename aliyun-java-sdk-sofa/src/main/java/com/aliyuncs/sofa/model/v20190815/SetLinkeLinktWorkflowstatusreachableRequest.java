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
public class SetLinkeLinktWorkflowstatusreachableRequest extends RpcAcsRequest<SetLinkeLinktWorkflowstatusreachableResponse> {
	   

	private Long fromStatusId;

	private Long toStatusId;

	private Long workflowId;

	private Boolean reachable;
	public SetLinkeLinktWorkflowstatusreachableRequest() {
		super("SOFA", "2019-08-15", "SetLinkeLinktWorkflowstatusreachable", "ApplySidecarCert");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getFromStatusId() {
		return this.fromStatusId;
	}

	public void setFromStatusId(Long fromStatusId) {
		this.fromStatusId = fromStatusId;
		if(fromStatusId != null){
			putBodyParameter("FromStatusId", fromStatusId.toString());
		}
	}

	public Long getToStatusId() {
		return this.toStatusId;
	}

	public void setToStatusId(Long toStatusId) {
		this.toStatusId = toStatusId;
		if(toStatusId != null){
			putBodyParameter("ToStatusId", toStatusId.toString());
		}
	}

	public Long getWorkflowId() {
		return this.workflowId;
	}

	public void setWorkflowId(Long workflowId) {
		this.workflowId = workflowId;
		if(workflowId != null){
			putBodyParameter("WorkflowId", workflowId.toString());
		}
	}

	public Boolean getReachable() {
		return this.reachable;
	}

	public void setReachable(Boolean reachable) {
		this.reachable = reachable;
		if(reachable != null){
			putBodyParameter("Reachable", reachable.toString());
		}
	}

	@Override
	public Class<SetLinkeLinktWorkflowstatusreachableResponse> getResponseClass() {
		return SetLinkeLinktWorkflowstatusreachableResponse.class;
	}

}
