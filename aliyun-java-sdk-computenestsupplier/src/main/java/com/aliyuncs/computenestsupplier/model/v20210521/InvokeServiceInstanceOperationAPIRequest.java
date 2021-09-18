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
public class InvokeServiceInstanceOperationAPIRequest extends RpcAcsRequest<InvokeServiceInstanceOperationAPIResponse> {
	   

	private String operationProduct;

	private String operationVersion;

	private String serviceInstanceId;

	private String operationParameters;

	private String operationAction;
	public InvokeServiceInstanceOperationAPIRequest() {
		super("ComputeNestSupplier", "2021-05-21", "InvokeServiceInstanceOperationAPI");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getOperationProduct() {
		return this.operationProduct;
	}

	public void setOperationProduct(String operationProduct) {
		this.operationProduct = operationProduct;
		if(operationProduct != null){
			putQueryParameter("OperationProduct", operationProduct);
		}
	}

	public String getOperationVersion() {
		return this.operationVersion;
	}

	public void setOperationVersion(String operationVersion) {
		this.operationVersion = operationVersion;
		if(operationVersion != null){
			putQueryParameter("OperationVersion", operationVersion);
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

	public String getOperationParameters() {
		return this.operationParameters;
	}

	public void setOperationParameters(String operationParameters) {
		this.operationParameters = operationParameters;
		if(operationParameters != null){
			putQueryParameter("OperationParameters", operationParameters);
		}
	}

	public String getOperationAction() {
		return this.operationAction;
	}

	public void setOperationAction(String operationAction) {
		this.operationAction = operationAction;
		if(operationAction != null){
			putQueryParameter("OperationAction", operationAction);
		}
	}

	@Override
	public Class<InvokeServiceInstanceOperationAPIResponse> getResponseClass() {
		return InvokeServiceInstanceOperationAPIResponse.class;
	}

}
