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

package com.aliyuncs.cloudcallcenter.model.v20170705;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class InvokeFunctionComputeRequest extends RpcAcsRequest<InvokeFunctionComputeResponse> {
	
	public InvokeFunctionComputeRequest() {
		super("CloudCallCenter", "2017-07-05", "InvokeFunctionCompute", "CloudCallCenter", "innerAPI");
	}

	private String functionId;

	private String parameter;

	private String tenantId;

	public String getFunctionId() {
		return this.functionId;
	}

	public void setFunctionId(String functionId) {
		this.functionId = functionId;
		if(functionId != null){
			putQueryParameter("FunctionId", functionId);
		}
	}

	public String getParameter() {
		return this.parameter;
	}

	public void setParameter(String parameter) {
		this.parameter = parameter;
		if(parameter != null){
			putQueryParameter("Parameter", parameter);
		}
	}

	public String getTenantId() {
		return this.tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
		if(tenantId != null){
			putQueryParameter("TenantId", tenantId);
		}
	}

	@Override
	public Class<InvokeFunctionComputeResponse> getResponseClass() {
		return InvokeFunctionComputeResponse.class;
	}

}
