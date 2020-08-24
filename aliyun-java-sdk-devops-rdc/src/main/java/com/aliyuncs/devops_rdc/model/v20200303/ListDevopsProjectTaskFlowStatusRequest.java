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
public class ListDevopsProjectTaskFlowStatusRequest extends RpcAcsRequest<ListDevopsProjectTaskFlowStatusResponse> {
	   

	private String taskFlowId;

	private String orgId;
	public ListDevopsProjectTaskFlowStatusRequest() {
		super("devops-rdc", "2020-03-03", "ListDevopsProjectTaskFlowStatus");
		setMethod(MethodType.POST);
	}

	public String getTaskFlowId() {
		return this.taskFlowId;
	}

	public void setTaskFlowId(String taskFlowId) {
		this.taskFlowId = taskFlowId;
		if(taskFlowId != null){
			putBodyParameter("TaskFlowId", taskFlowId);
		}
	}

	public String getOrgId() {
		return this.orgId;
	}

	public void setOrgId(String orgId) {
		this.orgId = orgId;
		if(orgId != null){
			putBodyParameter("OrgId", orgId);
		}
	}

	@Override
	public Class<ListDevopsProjectTaskFlowStatusResponse> getResponseClass() {
		return ListDevopsProjectTaskFlowStatusResponse.class;
	}

}
