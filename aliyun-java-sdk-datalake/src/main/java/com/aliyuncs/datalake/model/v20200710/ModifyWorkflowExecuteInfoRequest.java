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

package com.aliyuncs.datalake.model.v20200710;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.datalake.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyWorkflowExecuteInfoRequest extends RoaAcsRequest<ModifyWorkflowExecuteInfoResponse> {
	   

	private String executeParameters;

	private String executeCapacity;

	private String executeType;

	private String blueprintInstanceId;
	public ModifyWorkflowExecuteInfoRequest() {
		super("DataLake", "2020-07-10", "ModifyWorkflowExecuteInfo");
		setUriPattern("/webapi/blueprintinstance/modifyWorkflowExecuteInfo");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getExecuteParameters() {
		return this.executeParameters;
	}

	public void setExecuteParameters(String executeParameters) {
		this.executeParameters = executeParameters;
		if(executeParameters != null){
			putBodyParameter("ExecuteParameters", executeParameters);
		}
	}

	public String getExecuteCapacity() {
		return this.executeCapacity;
	}

	public void setExecuteCapacity(String executeCapacity) {
		this.executeCapacity = executeCapacity;
		if(executeCapacity != null){
			putBodyParameter("ExecuteCapacity", executeCapacity);
		}
	}

	public String getExecuteType() {
		return this.executeType;
	}

	public void setExecuteType(String executeType) {
		this.executeType = executeType;
		if(executeType != null){
			putBodyParameter("ExecuteType", executeType);
		}
	}

	public String getBlueprintInstanceId() {
		return this.blueprintInstanceId;
	}

	public void setBlueprintInstanceId(String blueprintInstanceId) {
		this.blueprintInstanceId = blueprintInstanceId;
		if(blueprintInstanceId != null){
			putBodyParameter("BlueprintInstanceId", blueprintInstanceId);
		}
	}

	@Override
	public Class<ModifyWorkflowExecuteInfoResponse> getResponseClass() {
		return ModifyWorkflowExecuteInfoResponse.class;
	}

}
