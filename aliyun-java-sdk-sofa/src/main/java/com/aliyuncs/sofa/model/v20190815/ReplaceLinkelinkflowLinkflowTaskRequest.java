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
public class ReplaceLinkelinkflowLinkflowTaskRequest extends RpcAcsRequest<ReplaceLinkelinkflowLinkflowTaskResponse> {
	   

	private String taskId;

	private List<String> reAssignUserIdsRepeatLists;

	private String operatorId;
	public ReplaceLinkelinkflowLinkflowTaskRequest() {
		super("SOFA", "2019-08-15", "ReplaceLinkelinkflowLinkflowTask", "sofacafedeps");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public List<String> getReAssignUserIdsRepeatLists() {
		return this.reAssignUserIdsRepeatLists;
	}

	public void setReAssignUserIdsRepeatLists(List<String> reAssignUserIdsRepeatLists) {
		this.reAssignUserIdsRepeatLists = reAssignUserIdsRepeatLists;	
		if (reAssignUserIdsRepeatLists != null) {
			for (int i = 0; i < reAssignUserIdsRepeatLists.size(); i++) {
				putBodyParameter("ReAssignUserIdsRepeatList." + (i + 1) , reAssignUserIdsRepeatLists.get(i));
			}
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
	public Class<ReplaceLinkelinkflowLinkflowTaskResponse> getResponseClass() {
		return ReplaceLinkelinkflowLinkflowTaskResponse.class;
	}

}
