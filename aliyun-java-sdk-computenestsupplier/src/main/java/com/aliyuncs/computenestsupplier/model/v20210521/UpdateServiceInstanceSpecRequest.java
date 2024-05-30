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

package com.aliyuncs.computenestsupplier.model.v20210521;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.computenestsupplier.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateServiceInstanceSpecRequest extends RpcAcsRequest<UpdateServiceInstanceSpecResponse> {
	   

	private String clientToken;

	private String predefinedParametersName;

	private String serviceInstanceId;

	private Boolean enableUserPrometheus;

	private String operationName;

	private String parameters;
	public UpdateServiceInstanceSpecRequest() {
		super("ComputeNestSupplier", "2021-05-21", "UpdateServiceInstanceSpec");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
		}
	}

	public String getPredefinedParametersName() {
		return this.predefinedParametersName;
	}

	public void setPredefinedParametersName(String predefinedParametersName) {
		this.predefinedParametersName = predefinedParametersName;
		if(predefinedParametersName != null){
			putQueryParameter("PredefinedParametersName", predefinedParametersName);
		}
	}

	public String getServiceInstanceId() {
		return this.serviceInstanceId;
	}

	public void setServiceInstanceId(String serviceInstanceId) {
		this.serviceInstanceId = serviceInstanceId;
		if(serviceInstanceId != null){
			putQueryParameter("ServiceInstanceId", serviceInstanceId);
		}
	}

	public Boolean getEnableUserPrometheus() {
		return this.enableUserPrometheus;
	}

	public void setEnableUserPrometheus(Boolean enableUserPrometheus) {
		this.enableUserPrometheus = enableUserPrometheus;
		if(enableUserPrometheus != null){
			putQueryParameter("EnableUserPrometheus", enableUserPrometheus.toString());
		}
	}

	public String getOperationName() {
		return this.operationName;
	}

	public void setOperationName(String operationName) {
		this.operationName = operationName;
		if(operationName != null){
			putQueryParameter("OperationName", operationName);
		}
	}

	public String getParameters() {
		return this.parameters;
	}

	public void setParameters(String parameters) {
		this.parameters = parameters;
		if(parameters != null){
			putQueryParameter("Parameters", parameters);
		}
	}

	@Override
	public Class<UpdateServiceInstanceSpecResponse> getResponseClass() {
		return UpdateServiceInstanceSpecResponse.class;
	}

}
