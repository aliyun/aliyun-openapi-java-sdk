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
public class UpdateBlueprintInstanceRequest extends RoaAcsRequest<UpdateBlueprintInstanceResponse> {
	   

	private String executeParameters;

	private Integer executeCapacity;

	private String executeType;

	private Integer executeConcurrency;

	private String id;
	public UpdateBlueprintInstanceRequest() {
		super("DataLake", "2020-07-10", "UpdateBlueprintInstance");
		setUriPattern("/webapi/blueprintinstance/update");
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

	public Integer getExecuteCapacity() {
		return this.executeCapacity;
	}

	public void setExecuteCapacity(Integer executeCapacity) {
		this.executeCapacity = executeCapacity;
		if(executeCapacity != null){
			putBodyParameter("ExecuteCapacity", executeCapacity.toString());
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

	public Integer getExecuteConcurrency() {
		return this.executeConcurrency;
	}

	public void setExecuteConcurrency(Integer executeConcurrency) {
		this.executeConcurrency = executeConcurrency;
		if(executeConcurrency != null){
			putBodyParameter("ExecuteConcurrency", executeConcurrency.toString());
		}
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
		if(id != null){
			putBodyParameter("Id", id);
		}
	}

	@Override
	public Class<UpdateBlueprintInstanceResponse> getResponseClass() {
		return UpdateBlueprintInstanceResponse.class;
	}

}
