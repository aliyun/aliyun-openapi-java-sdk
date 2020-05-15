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
public class DeleteLinkeLinktWorkflowstatusRequest extends RpcAcsRequest<DeleteLinkeLinktWorkflowstatusResponse> {
	   

	private Long statusId;

	private Long id;

	private Long workflowId;

	private Boolean asDefault;

	private Long convertStatusId;
	public DeleteLinkeLinktWorkflowstatusRequest() {
		super("SOFA", "2019-08-15", "DeleteLinkeLinktWorkflowstatus", "ApplySidecarCert");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getStatusId() {
		return this.statusId;
	}

	public void setStatusId(Long statusId) {
		this.statusId = statusId;
		if(statusId != null){
			putBodyParameter("StatusId", statusId.toString());
		}
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
		if(id != null){
			putBodyParameter("Id", id.toString());
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

	public Boolean getAsDefault() {
		return this.asDefault;
	}

	public void setAsDefault(Boolean asDefault) {
		this.asDefault = asDefault;
		if(asDefault != null){
			putBodyParameter("AsDefault", asDefault.toString());
		}
	}

	public Long getConvertStatusId() {
		return this.convertStatusId;
	}

	public void setConvertStatusId(Long convertStatusId) {
		this.convertStatusId = convertStatusId;
		if(convertStatusId != null){
			putBodyParameter("ConvertStatusId", convertStatusId.toString());
		}
	}

	@Override
	public Class<DeleteLinkeLinktWorkflowstatusResponse> getResponseClass() {
		return DeleteLinkeLinktWorkflowstatusResponse.class;
	}

}
