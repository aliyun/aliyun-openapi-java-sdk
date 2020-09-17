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
public class RetryAKSOpsTaskRequest extends RpcAcsRequest<RetryAKSOpsTaskResponse> {
	   

	private String workspace;

	private String targetId;

	private String baseControlOperationRequestJsonStr;

	private String controlType;

	private String scopeJsonStr;

	private String targetName;
	public RetryAKSOpsTaskRequest() {
		super("SOFA", "2019-08-15", "RetryAKSOpsTask", "sofacafedeps");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getWorkspace() {
		return this.workspace;
	}

	public void setWorkspace(String workspace) {
		this.workspace = workspace;
		if(workspace != null){
			putBodyParameter("Workspace", workspace);
		}
	}

	public String getTargetId() {
		return this.targetId;
	}

	public void setTargetId(String targetId) {
		this.targetId = targetId;
		if(targetId != null){
			putBodyParameter("TargetId", targetId);
		}
	}

	public String getBaseControlOperationRequestJsonStr() {
		return this.baseControlOperationRequestJsonStr;
	}

	public void setBaseControlOperationRequestJsonStr(String baseControlOperationRequestJsonStr) {
		this.baseControlOperationRequestJsonStr = baseControlOperationRequestJsonStr;
		if(baseControlOperationRequestJsonStr != null){
			putBodyParameter("BaseControlOperationRequestJsonStr", baseControlOperationRequestJsonStr);
		}
	}

	public String getControlType() {
		return this.controlType;
	}

	public void setControlType(String controlType) {
		this.controlType = controlType;
		if(controlType != null){
			putBodyParameter("ControlType", controlType);
		}
	}

	public String getScopeJsonStr() {
		return this.scopeJsonStr;
	}

	public void setScopeJsonStr(String scopeJsonStr) {
		this.scopeJsonStr = scopeJsonStr;
		if(scopeJsonStr != null){
			putBodyParameter("ScopeJsonStr", scopeJsonStr);
		}
	}

	public String getTargetName() {
		return this.targetName;
	}

	public void setTargetName(String targetName) {
		this.targetName = targetName;
		if(targetName != null){
			putBodyParameter("TargetName", targetName);
		}
	}

	@Override
	public Class<RetryAKSOpsTaskResponse> getResponseClass() {
		return RetryAKSOpsTaskResponse.class;
	}

}
